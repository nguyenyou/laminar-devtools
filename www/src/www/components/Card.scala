package www.components

import www.locator.UILayoutComponent

import com.raquo.laminar.api.L.*

case class Card(title: String) extends UILayoutComponent {
  def render(children: HtmlElement*) = {
    div(
      border("1px solid #ccc"),
      borderRadius.px(8),
      padding.px(16),
      margin.px(8),
      h3(title),
      div(children*)
    )
  }
}
