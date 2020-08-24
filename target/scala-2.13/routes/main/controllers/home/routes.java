// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/storage/Lab/tutorial/playwithreactivemongo/conf/home.routes
// @DATE:Mon Aug 24 16:28:16 BDT 2020

package controllers.home;

import home.RoutesPrefix;

public class routes {
  
  public static final controllers.home.ReverseHomeController HomeController = new controllers.home.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.home.ReverseHome2Controller Home2Controller = new controllers.home.ReverseHome2Controller(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.home.javascript.ReverseHomeController HomeController = new controllers.home.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.home.javascript.ReverseHome2Controller Home2Controller = new controllers.home.javascript.ReverseHome2Controller(RoutesPrefix.byNamePrefix());
  }

}
