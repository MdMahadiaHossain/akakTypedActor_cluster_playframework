// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/storage/Lab/tutorial/playframework/playwithreactivemongo/conf/routes
// @DATE:Mon Aug 24 16:58:46 BDT 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
