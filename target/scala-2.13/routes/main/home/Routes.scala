// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/storage/Lab/tutorial/playwithreactivemongo/conf/home.routes
// @DATE:Mon Aug 24 16:28:16 BDT 2020

package home

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_1: controllers.home.HomeController,
  // @LINE:7
  Home2Controller_0: controllers.home.Home2Controller,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_1: controllers.home.HomeController,
    // @LINE:7
    Home2Controller_0: controllers.home.Home2Controller
  ) = this(errorHandler, HomeController_1, Home2Controller_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    home.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Home2Controller_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.home.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello""", """controllers.home.HomeController.hello(name:String, age:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello2""", """controllers.home.Home2Controller.hello2()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hi/""" + "$" + """food<[^/]+>/""" + "$" + """drink<[^/]+>/is/good""", """controllers.home.HomeController.hi(food:Int, drink:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """xyz/""" + "$" + """place<.+>""", """controllers.home.HomeController.go(place:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_home_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_home_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "home",
      "controllers.home.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_home_HomeController_hello1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello")))
  )
  private[this] lazy val controllers_home_HomeController_hello1_invoker = createInvoker(
    HomeController_1.hello(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "home",
      "controllers.home.HomeController",
      "hello",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """hello""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_home_Home2Controller_hello22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello2")))
  )
  private[this] lazy val controllers_home_Home2Controller_hello22_invoker = createInvoker(
    Home2Controller_0.hello2(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "home",
      "controllers.home.Home2Controller",
      "hello2",
      Nil,
      "GET",
      this.prefix + """hello2""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_home_HomeController_hi3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hi/"), DynamicPart("food", """[^/]+""",true), StaticPart("/"), DynamicPart("drink", """[^/]+""",true), StaticPart("/is/good")))
  )
  private[this] lazy val controllers_home_HomeController_hi3_invoker = createInvoker(
    HomeController_1.hi(fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "home",
      "controllers.home.HomeController",
      "hi",
      Seq(classOf[Int], classOf[String]),
      "GET",
      this.prefix + """hi/""" + "$" + """food<[^/]+>/""" + "$" + """drink<[^/]+>/is/good""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_home_HomeController_go4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("xyz/"), DynamicPart("place", """.+""",false)))
  )
  private[this] lazy val controllers_home_HomeController_go4_invoker = createInvoker(
    HomeController_1.go(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "home",
      "controllers.home.HomeController",
      "go",
      Seq(classOf[String]),
      "GET",
      this.prefix + """xyz/""" + "$" + """place<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_home_HomeController_index0_route(params@_) =>
      call { 
        controllers_home_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:4
    case controllers_home_HomeController_hello1_route(params@_) =>
      call(params.fromQuery[String]("name", None), params.fromQuery[Int]("age", None)) { (name, age) =>
        controllers_home_HomeController_hello1_invoker.call(HomeController_1.hello(name, age))
      }
  
    // @LINE:7
    case controllers_home_Home2Controller_hello22_route(params@_) =>
      call { 
        controllers_home_Home2Controller_hello22_invoker.call(Home2Controller_0.hello2())
      }
  
    // @LINE:9
    case controllers_home_HomeController_hi3_route(params@_) =>
      call(params.fromPath[Int]("food", None), params.fromPath[String]("drink", None)) { (food, drink) =>
        controllers_home_HomeController_hi3_invoker.call(HomeController_1.hi(food, drink))
      }
  
    // @LINE:12
    case controllers_home_HomeController_go4_route(params@_) =>
      call(params.fromPath[String]("place", None)) { (place) =>
        controllers_home_HomeController_go4_invoker.call(HomeController_1.go(place))
      }
  }
}
