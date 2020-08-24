// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/storage/Lab/tutorial/playframework/playwithreactivemongo/conf/home.routes
// @DATE:Tue Aug 25 01:16:17 BDT 2020

package controllers.home;

import home.RoutesPrefix;

public class routes {
  
  public static final controllers.home.ReverseHomeController HomeController = new controllers.home.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.home.javascript.ReverseHomeController HomeController = new controllers.home.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
