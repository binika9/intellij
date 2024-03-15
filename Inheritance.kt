fun main(args: Array<String>) {
    val child1 = Child()
    child1.myfunction()

    val dog1 = Dog("black",5)
    dog1.woof()
}

open class Parent{//open makes it parent/super
    val x = 5
}
class Child:Parent() {
    fun myfunction() {
        println(x)
    }
}
open class Animal(var color:String, var age:Int) {
    init {
        println("Colour is:$color")
        println("Age is:$age")
    }
}
class Dog(color: String,age: Int):Animal(color, age){
    fun woof(){
        println("Dog makes woof sound")
    }
}


