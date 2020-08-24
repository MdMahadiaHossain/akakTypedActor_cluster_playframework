package controllers.home

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.ws._
import scala.concurrent.ExecutionContext
import play.twirl.api.Html
import scala.xml.Elem
import play.api.http.HttpEntity
import akka.stream.scaladsl.Source
import akka.http.scaladsl.model.ContentType
import akka.http.scaladsl.model.ContentTypes
import akka.util.ByteString
import play.api.http.HttpChunk
import akka.actor.ActorRef

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject() (
    val controllerComponents: ControllerComponents,
    
    ws: WSClient,
    ex: ExecutionContext
) extends BaseController {

  
  def index() =
    Action { implicit request: Request[AnyContent] =>
     
      Ok(views.html.index())
    }



}
