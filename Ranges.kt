fun main(args: Array<String>) {
    println("Number Range:")

    for (num in 1..5){
        println(num)
    }
    println("Character Range:")

    for (char in 'A'..'E')
        println(char)

    var num1 = 1.rangeTo(10)
    var oddnumber = num1.step(3)
    for(n in oddnumber){
        println(n)
    }

    //#downTo 10 to 1

    //checking values in a range
    val OneToSix = 1..6
    println("3 in OneToSix:${3 in OneToSix}")
    println("7 in OneToSix:${7 in OneToSix}")

}
