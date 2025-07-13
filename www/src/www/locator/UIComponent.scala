// Copyright (C) 2014-2025 Anduin Transactions Inc.

package www.locator

import com.raquo.laminar.api.L.*

trait UIComponent extends Locator {
  def render(): HtmlElement

  def apply(): HtmlElement = {
    locatorModifiers(render())
  }

}
