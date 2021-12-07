class Residential(customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double) :
    Customer(customerName, customerPhone, customerAddress, squareFootage) {

    var isSenior : Boolean = false
    var rate : Int = 6

    fun billing() {
        val total = if (isSenior) {
            (rate * squareFootage * .85).toInt()
        } else {
            (rate * squareFootage).toInt()
        }

        println("\n\nCustomer name: $customerName")
        println("Customer phone: $customerPhone")
        println("Customer address: $customerAddress")
        println("Square Footage: $squareFootage")
        println("\n\n")
        println("Weekly Total:\t\t$$total")
    }
}