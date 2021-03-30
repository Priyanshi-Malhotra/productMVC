// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/priyanshi/Desktop/playAPI/playapi/conf/routes
// @DATE:Tue Mar 30 13:28:56 IST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Assets_0: controllers.Assets,
  // @LINE:11
  HomeController_1: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Assets_0: controllers.Assets,
    // @LINE:11
    HomeController_1: controllers.HomeController
  ) = this(errorHandler, Assets_0, HomeController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, HomeController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/add/""" + "$" + """id<[^/]+>/""" + "$" + """productName<[^/]+>/""" + "$" + """category<[^/]+>/""" + "$" + """productCity<[^/]+>/""" + "$" + """productState<[^/]+>/""" + "$" + """ownerName<[^/]+>""", """controllers.HomeController.post(id:Integer, productName:String, category:String, productCity:String, productState:String, ownerName:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/""" + "$" + """id<[^/]+>""", """controllers.HomeController.delete(id:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static sresources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_post2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/add/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("productName", """[^/]+""",true), StaticPart("/"), DynamicPart("category", """[^/]+""",true), StaticPart("/"), DynamicPart("productCity", """[^/]+""",true), StaticPart("/"), DynamicPart("productState", """[^/]+""",true), StaticPart("/"), DynamicPart("ownerName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_post2_invoker = createInvoker(
    HomeController_1.post(fakeValue[Integer], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "post",
      Seq(classOf[Integer], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """product/add/""" + "$" + """id<[^/]+>/""" + "$" + """productName<[^/]+>/""" + "$" + """category<[^/]+>/""" + "$" + """productCity<[^/]+>/""" + "$" + """productState<[^/]+>/""" + "$" + """ownerName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_delete3_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delete3_invoker = createInvoker(
    HomeController_1.delete(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_1.index())
      }
  
    // @LINE:13
    case controllers_HomeController_post2_route(params@_) =>
      call(params.fromPath[Integer]("id", None), params.fromPath[String]("productName", None), params.fromPath[String]("category", None), params.fromPath[String]("productCity", None), params.fromPath[String]("productState", None), params.fromPath[String]("ownerName", None)) { (id, productName, category, productCity, productState, ownerName) =>
        controllers_HomeController_post2_invoker.call(HomeController_1.post(id, productName, category, productCity, productState, ownerName))
      }
  
    // @LINE:15
    case controllers_HomeController_delete3_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_delete3_invoker.call(HomeController_1.delete(id))
      }
  }
}
