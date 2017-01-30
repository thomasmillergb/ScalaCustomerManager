package customer

/**
  * Created by Thomas on 30/01/2017.
  */
class DiscountedCustomer (name: String, surname: String) extends Customer(name,surname){
  override def applyDiscount(amount: Double): Double = {
    amount * 0.8
  }
}
