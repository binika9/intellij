import java.util.*

fun main(args: Array<String>) {
    print("Please type a word here:")
    var enteredString = readLine()//string output
    println("You have typed:$enteredString")

    print("Please write any number:")
    var anyNumber = Integer.valueOf(readLine())//integer input allows summation
    println("You have entered number $anyNumber")

    var read = Scanner(System.`in`)
    println("Please enter an Integer")
    var integernumber = read.nextInt()//nextFloat
    println("this is the number entered:$integernumber")

    println("Enter a float number:")
    var floatnumber = read.nextFloat()
    println("This is the float number entered:$floatnumber")

}