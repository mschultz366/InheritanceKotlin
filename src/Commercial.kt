class Commercial(var propertyName: String,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double) :
    Customer(customerName, customerPhone, customerAddress, squareFootage) {

    init {
        this.propertyName = propertyName
    }

    var multiProperty : Boolean = false
    var rate : Int = 5

    fun billing() {
        val total = if (multiProperty) {
            (rate * squareFootage * .9).toInt()
        } else {
            (rate * squareFootage).toInt()
        }

        println("\n\nProperty name: $propertyName")
        println("Customer name: $customerName")
        println("Customer phone: $customerPhone")
        println("Customer address: $customerAddress")
        println("Square Footage: $squareFootage")
        println("\n\n")
        println("Weekly Total:\t\t$$total")
    }
}