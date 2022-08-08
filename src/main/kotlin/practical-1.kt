fun main() {
//    print("Hello World")
    val integer: Int = 8
    println("Integer : $integer")
    val float = 1.8F
    println("Float : $float")
    val character: Char = 'a'
    println("Character : $character")
    val string: String = "Hello"
    println("String : $string")
    val bool: Boolean = true
    println("Boolean : $bool")
    val double: Double = 89.3425
    println("Double : $double")
    val long: Long = 20012021062
    println("Long  : $long")
    val short: Short = -2
    println("Short : $short")
    val byte: Byte = 127
    println("Byte : $byte")
    p2()
}
fun p2(){
    println("========================Type Conversion========================")

    val x = 5
    println("Integer : $x")
    x.toDouble()
    println("Integer to Double : $x ")

    val string = "10"
    println("String : $string")
    string.toInt()
    println("String To Integer : $string")

    val string2 = "10.5"
    string2.toDouble()
    println("String To Double : $string2 ")
}