package customer

/**
  * Created by Thomas on 30/01/2017.
  */
class CustomerManager() {
  private var customerList: List[CustomerTrait] = List()

  def addCustomer(customer: CustomerTrait): List[CustomerTrait] = {
    customerList = customer :: customerList
    customerList
  }

  //  def customerList : List[CustomerTrait] = customerList
}

object CustomerManager {
  def main(args: Array[String]): Unit = {
    val customerManager = new CustomerManager()
    val customer1 = new Customer("Norm1","Norm2")
    customer1.cart.addItem(10)
    customer1.cart.addItem(20)
    customer1.cart.addItem(30)
    customer1.cart.addItem(40)
    customerManager.addCustomer(customer1)
    val customer2 = new DiscountedCustomer("Norm1","Norm2")
    customer2.cart.addItem(10)
    customer2.cart.addItem(20)
    customer2.cart.addItem(30)
    customer2.cart.addItem(40)
    customerManager.addCustomer(customer2)
    customerManager.customerList.foreach(customerF =>println("balance: " + customerF.total)    )
    print(customerManager.customerList)

  }
}
