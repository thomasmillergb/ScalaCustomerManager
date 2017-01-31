package customer

import cart.Cart

/**
  * Created by Thomas on 30/01/2017.
  */
trait CustomerTrait {
  val cart : Cart = new Cart()
  def applyDiscount(amount: Double): Double = {
    amount
  }

  def total : Double = {
    applyDiscount(cart.total)
  }
}
