fun main(){
    println("Enter any number:")
    var num:Int = readLine()!!.toInt()
    if(num%2==0)
    {
        println("$num is a even number.")
    }
    else
    {
        println("$num is odd number.")
    }
}