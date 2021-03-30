
package views.html.productview

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*4.1*/("""<html>
  <head>
      <title>Products</title>
  </head>
  <body>
       <h1>All Products</h1><br><br>

  </body>
</html>"""))
      }
    }
  }

  def render(products:List[Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-29T15:45:57.296684
                  SOURCE: /Users/priyanshi/Desktop/playAPI/playapi/app/views/productview/products.scala.html
                  HASH: 69c4916d75f66f6445eda54e95404c691759d86d
                  MATRIX: 929->1|1048->27|1076->29
                  LINES: 27->1|32->2|34->4
                  -- GENERATED --
              */
          