package www

import org.scalajs.dom
import com.raquo.laminar.api.L.*

@main
def run(): Unit = {
  render(dom.document.getElementById("app"), App()())
}
