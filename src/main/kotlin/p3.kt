fun main(){
    print("Enter student erollmentnumber:")
    val enrollmentNo= readLine()!!.toBigInteger()
    print("Enter student name:")
    val name= readLine()!!.toString()
    print("Enter student branch:")
    val branch= readLine()!!.toString()
    print("Enter student class:")
    val className= readLine()!!.toString()
    print("Enter student batch:")
    val batch= readLine()!!.toString()
    print("Enter student college name:")
    val collegeName= readLine()!!.toString()
    print("Enter student university name:")
    val uni= readLine()!!.toString()
    print("Enter student age:")
    val age= readLine()!!.toBigInteger()

    print("***********************************\n")
    println("Student Info:")
    println()
    println("Enrollment No. : $enrollmentNo")
    println("Name : $name")
    println("Branch : $branch")
    println("Class : $className")
    println("Batch : $batch")
    println("College Name : $collegeName")
    println("University Name : $uni")
    println("Age : $age")
}