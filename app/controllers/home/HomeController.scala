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

  /**
    * Create an Action to render an HTML page.
    *
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index() =
    Action { implicit request: Request[AnyContent] =>
     
      Ok(views.html.index())
    }

  def hello(name: String, age: Int) =
    Action { request =>
      Ok(s"Hi, $name, your age is $age")
    }

  def hi(food: Int, drink: String) =
    Action {
      Ok(s"Hi, you love $food, $drink")
    }

  def go(place: String) =
    Action.async { request =>
      ws.url("https://stackoverflow.com/")
        .withHttpHeaders()
        .get()
        .map { response =>
          val x = response.body
          import scala.concurrent.duration._
          Ok
        }(ex)

    }

}
