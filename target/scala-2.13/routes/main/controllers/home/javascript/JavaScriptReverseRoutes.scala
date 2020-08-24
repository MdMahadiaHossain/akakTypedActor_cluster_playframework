// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/storage/Lab/tutorial/playwithreactivemongo/conf/home.routes
// @DATE:Mon Aug 24 16:28:16 BDT 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.home.javascript {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def go: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.home.HomeController.go",
      """
        function(place0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "xyz/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("place", place0)})
        }
      """
    )
  
    // @LINE:9
    def hi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.home.HomeController.hi",
      """
        function(food0,drink1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hi/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("food", food0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("drink", drink1)) + "/is/good"})
        }
      """
    )
  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.home.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:4
    def hello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.home.HomeController.hello",
      """
        function(name0,age1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("age", age1)])})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHome2Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def hello2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.home.Home2Controller.hello2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello2"})
        }
      """
    )
  
  }


}
