package cart

/**
  * Created by Thomas on 31/01/2017.
  */
class Cart() {
  private var items : List[Double] = List()

  def addItem(amount: Double) : Unit = {
    items = amount :: items
  }
  def total : Double = {
    items.sum
  }
}
