// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/storage/Lab/tutorial/playframework/playwithreactivemongo/conf/routes
// @DATE:Mon Aug 24 16:58:46 BDT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
