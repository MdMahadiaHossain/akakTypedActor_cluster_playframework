// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/storage/Lab/tutorial/playframework/playwithreactivemongo/conf/home.routes
// @DATE:Tue Aug 25 01:16:17 BDT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.home {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
