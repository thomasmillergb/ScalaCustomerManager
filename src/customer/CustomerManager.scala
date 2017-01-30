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
    customerManager.addCustomer(new Customer("Norm1","Norm2"))
    customerManager.addCustomer(new Customer("Norm3","Norm6"))
    customerManager.addCustomer(new Customer("Norm4","Norm7"))
    customerManager.addCustomer(new Customer("Norm5","Norm8"))
    customerManager.addCustomer(new DiscountedCustomer("Norm1","Norm2"))
    customerManager.addCustomer(new DiscountedCustomer("Norm3","Norm6"))
    customerManager.addCustomer(new DiscountedCustomer("Norm4","Norm7"))
    customerManager.addCustomer(new DiscountedCustomer("Norm5","Norm8"))
    print(customerManager.customerList)

  }
}
