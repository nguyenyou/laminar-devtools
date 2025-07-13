package www.components

import www.locator.UIComponent

import com.raquo.laminar.api.L.*

case class Button() extends UIComponent {
  def render() = {
    button("Click me")
  }
}
