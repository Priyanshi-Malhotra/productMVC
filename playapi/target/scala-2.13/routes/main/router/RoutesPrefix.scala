// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/priyanshi/Desktop/playAPI/playapi/conf/routes
// @DATE:Thu Apr 01 15:53:52 IST 2021


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
