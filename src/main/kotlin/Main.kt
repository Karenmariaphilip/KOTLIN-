fun main() {
println("humble")
    sumFun(12, 12, 3, 7)
    divideFun(12, 5)
}
// Create and invoke a function that given 2 numbers returns the remainder of their division (3 points)
fun divideFun(num1:Int, num2:Int):Int{
    var a =num1
    var ab=num2
    var divide= num1 / num2
    println(divide)
    return divide
}

//Create and invoke  function that returns the sum of any given 4 numbers (3 points)
fun sumFun(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var a= num1
    var b= num2
    var c= num3
    var d= num4
    var sum = num1 + num2 + num3 + num4
    println(sum)
    return sum

}

//Create and invoke a function that prints out an interesting fact about yourself (2 points)
fun factAbt(fact:String){
    var fact = "fact about"
    println(fact)

}