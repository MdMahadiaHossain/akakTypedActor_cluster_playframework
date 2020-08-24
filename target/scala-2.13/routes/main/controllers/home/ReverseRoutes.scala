// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/storage/Lab/tutorial/playwithreactivemongo/conf/home.routes
// @DATE:Mon Aug 24 16:28:16 BDT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.home {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def go(place:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "xyz/" + implicitly[play.api.mvc.PathBindable[String]].unbind("place", place))
    }
  
    // @LINE:9
    def hi(food:Int, drink:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hi/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("food", food)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("drink", drink)) + "/is/good")
    }
  
    // @LINE:2
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:4
    def hello(name:String, age:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("age", age)))))
    }
  
  }

  // @LINE:7
  class ReverseHome2Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def hello2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello2")
    }
  
  }


}
