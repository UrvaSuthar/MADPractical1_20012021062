fun main(){
    println("Enter Number 1:")
    var x:Int= readLine()!!.toInt()
    println("Enter Number 2:")
    var y:Int= readLine()!!.toInt()
    add(x,y)
    sub(x,y)
    multi(x,y)
    div(x,y)
}
fun add(n1: Int, n2: Int)
{
    println("Addiition of $n1 ,$n2 is ${n1 + n2}")
}
fun sub(n1: Int, n2: Int)
{
    println("Subtraction of $n1 ,$n2 is ${n1 - n2}")
}
fun multi(n1: Int, n2: Int)
{
    println("Multiplication of $n1 ,$n2 is ${n1 * n2}")
}
fun div(n1:Int,n2:Int)
{
    println("Division of $n1 ,$n2  is ${n2 / n1}")
}