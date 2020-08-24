package models

import com.google.inject.Inject
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.api.bson.BSONObjectID
import java.{util => ju}
//import reactivemongo.api.collections.bson.BSONCollection
import scala.concurrent.ExecutionContext
import reactivemongo.api.bson.collection.BSONCollection // this is necessary
import reactivemongo.api.bson.BSONValue
import scala.util.Try
import scala.util.Success
import scala.concurrent.Future
import reactivemongo.api.bson.BSONDocument
import reactivemongo.api.Cursor
import reactivemongo.api.bson.BSONReader
import reactivemongo.api.bson.BSONWriter
import reactivemongo.api.bson.BSONDateTime
import scala.reflect.runtime.Macros

class  x5[T]( doc:BSONDocument){
  def as[T](implicit reader: BSONReader[T]) = doc.asTry[T].get
}
object BSONDocX {
  implicit def ex[T](doc:BSONDocument)(implicit reader: BSONReader[T]) = new x5[T](doc)
}
case class Man(
    _id: BSONObjectID,
    age: ju.Date,
    amount:BigDecimal,
    name:String="Jack"
)

trait DateAndTime {
  implicit object ISODateReader extends BSONReader[ju.Date] {

    override def readTry(bson: BSONValue): Try[ju.Date] =
      Success.apply(new ju.Date())

  }
  implicit object ISODateWrite extends BSONWriter[ju.Date] {

    override def writeTry(t: ju.Date): Try[BSONValue] =
      Success.apply(BSONDateTime(t.getTime()))

  }
}

object ManBSONFormat extends DateAndTime {
  import reactivemongo.api.bson._ // this is necessary

  
  implicit val m = Macros.handler[Man]
 

  

}

class TestDAO @Inject() (reactiveMongoApi: ReactiveMongoApi)(implicit
    executionContext: ExecutionContext
) {

  private def collection =
    reactiveMongoApi.database.map(_.collection[BSONCollection]("test"))

  import ManBSONFormat._
  
  def insertMan(man: Man) = collection.map(_.insert(true).one[Man](man)).flatten

  def getTransactionsOfAccount(
      dateFrom: ju.Date,
      dateTo: ju.Date
  ): Future[List[BSONDocument]] =
    collection
      .map(_.aggregateWith[BSONDocument]() { aggregatorFramework =>
        val obj = BSONDocument
        import aggregatorFramework.PipelineOperator
        PipelineOperator(
          obj(
            "$match" -> obj(
              "date" -> obj(
                "$gte" -> dateFrom,
                "$lte" -> dateTo
              ) // for date in bson document will need explicit reader and writter
            )
          )
        ) -> List(
          PipelineOperator(
            obj(
              "$limit" -> 6
            )
          )
        )

      }.collect[List](1, Cursor.FailOnError())(List, executionContext))
      .flatten

}
