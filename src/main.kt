fun main() {

    var choice = 0

    println(" -- Customer Portal -- ")
    println("1.\tCommercial")
    println("2.\tResidential")
    println("3.\tExit...")

    while ( choice != 3) {
        print("Option: ")
        choice = readLine()!!.toInt()
        when (choice) {
            1 -> getCommercial()
            2 -> getResidential()
            3 -> println("Have a nice day!")
            !in 1..3 -> println("Bad Option...")
            else -> println("Error on entry of.. \"$choice\"")
        }
    }
}

fun getCommercial() {
    print("Enter Property Name: ")
    val property = readLine()!!.toString()
    print("Enter name: ")
    val name = readLine()!!.toString()
    print("Enter phone: ")
    val phone = readLine()!!.toString()
    print("Enter Address: ")
    val address = readLine()!!.toString()
    print("Enter Sq Footage: ")
    val sqFootage = readLine()!!.toDouble()

    val you = Commercial(property, name, phone, address, sqFootage)

    print("Is this a multi-property (yes / no)? ")
    val multi = readLine()!!.toString()

    when (multi.lowercase()) {
        "yes" -> you.multiProperty = true
        "no"  -> you.multiProperty = false
        else -> print("Bad Entry...")
    }

    you.billing()

}

fun getResidential() {
    print("Enter name: ")
    val name = readLine()!!.toString()
    print("Enter phone: ")
    val phone = readLine()!!.toString()
    print("Enter Address: ")
    val address = readLine()!!.toString()
    print("Enter Sq Footage: ")
    val sqFootage = readLine()!!.toDouble()

    val you = Residential(name, phone, address, sqFootage)

    print("Are you a senior (yes / no)? ")
    val multi = readLine()!!.toString()

    when (multi.lowercase()) {
        "yes" -> you.isSenior = true
        "no"  -> you.isSenior = false
        else -> print("Bad Entry")
    }

    you.billing()

}