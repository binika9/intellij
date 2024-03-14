fun main(args: Array<String>) {
    birthdaygreeting()
    val greeting=birthday()
        println(greeting)
    println(wewe("utopia", 55))
    println(wewe("travis", 16))
    println(wewe("ron", 40))
    calculatedarea(12.4,45.5)
    println(calculatedarea(12.4,45.5))
    println(calculatedArea())
    println(calculatedArea(7.9))
    println(calculateCircleArea(10.0))
}
fun birthdaygreeting(){
    println("Happy Birthday Rolex")
    println("You are 18 years old")
}
fun birthday(): String {
    val a ="Happy Birthday Rolex"
    val b ="You are 18 years old"
    val c ="You are celebrated"
    return "$a\n$b\n$c"
}
fun wewe(name: String, age: Int): String {
    val a ="Niaje $name"
    val b ="you are $age years old"
    val d = "Regards from Felix"
    return "$a\n$b\n$d"
}
//write a kot fn that calculates and returns
//the area of a rectangle. it should take
//'length' and 'width' as arguments

fun calculatedarea(length: Double,width: Double): Double{
    return length*width
}
//INSERTING DEFAULT VALUES
fun calculatedArea(length: Double=10.2,width: Double=5.3): Double{
    return length*width
}
fun calculateCircleArea(radius: Double, pi: Double=3.14): Double{
    return pi*radius*radius
}
//write a kot fn that calculates the BMI
//of a person. The fn should take height
//(in metres) and weight(kg) as arguments
//Use default arguments height=2m and weight=60kgs