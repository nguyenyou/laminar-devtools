package www

import www.components.{Button, Card}
import www.locator.UIComponent
import www.locator.Locator.withLocator

import com.raquo.laminar.api.L.*

case class App() extends UIComponent {
  def render() = {
    div(
      width.px(600),
      height.px(400),
      border("1px solid black"),
      display.flex,
      flexDirection.column,
      padding.px(12),
      alignItems.start,
      Button()(),
      Button()(),
      Card("Example Card")(
        p("This is some content inside the card."),
        Button()(),
        p("More content here.")
        // Demonstrate the @uicomponent annotation usage
      )
    )
  }
}
