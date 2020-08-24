package controllers.home

import play.api.mvc.BaseController
import play.api.mvc.ControllerComponents
import javax.inject.Singleton
import com.google.inject.Inject
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import play.api.mvc.RequestHeader
import play.api.mvc.AnyContent
import play.api.mvc.Request
import play.api.mvc.MessagesAbstractController
import play.api.mvc.MessagesControllerComponents
import play.api.mvc.MessagesRequest
import play.api.mvc.Action
import play.api.libs.json.JsValue
import play.api.libs.json.JsObject
import play.modules.reactivemongo.ReactiveMongoApi

import models.TestDAO
import reactivemongo.api.bson.BSONObjectID // this is necessary
import java.{util => ju}
import models.Man
import reactivemongo.api.bson.BSONDocument
import play.api.libs.json.Json
import play.api.libs.json.Json.JsValueWrapper
import reactivemongo.api.bson.BSONLong
import akka.actor.typed.Scheduler

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.ActorRef
import akka.actor.typed.scaladsl.AskPattern._


@Singleton
class Home2Controller @Inject() (
    controllerComponents: MessagesControllerComponents,
    testDAO: TestDAO,
    
)(implicit executionContext: ExecutionContext)
    extends MessagesAbstractController(controllerComponents) {

  def hello2(): Action[AnyContent] =
    Action.async { request: MessagesRequest[AnyContent] =>
     Future{
          
         

          Ok
        
     }

    

     
    }

    
  

}



