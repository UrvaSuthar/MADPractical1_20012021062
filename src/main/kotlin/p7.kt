fun main (){
    print("Enter Number: ")
    var number = readLine()!!.toInt()
    var factorial: Int = 1
    for (i in 1..number) {
        factorial *= i.toInt()
    }
    println("Factorial of $number = $factorial")
    val tailrecfact = fact(number)
    println("By TailRec Keyword, Factorial of $number = $tailrecfact")
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}