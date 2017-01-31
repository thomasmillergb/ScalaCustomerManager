package customer

import java.time.LocalDate


/**
  * Created by Thomas on 29/01/2017.
  */
class Customer(val name: String, val surname: String) extends CustomerTrait{
  private val id = Customer.nextId()
  private val createdDate : LocalDate=  { LocalDate.now()}



}

object Customer {

  private var seqId = 0

  private def nextId() = {
    seqId += 1
    seqId
  }


}
