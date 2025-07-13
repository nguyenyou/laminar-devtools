// Copyright (C) 2014-2025 Anduin Transactions Inc.

package www.locator

import com.raquo.laminar.api.L.*

trait UILayoutComponent extends Locator {
  def render(children: HtmlElement*): HtmlElement

  def apply(children: HtmlElement*): HtmlElement = {
    locatorModifiers(render(children*))
  }

}
