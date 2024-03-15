fun main(args: Array<String>) {
    val car1 = car("Vitz", "Toyota", 2020)
    println(car1.brand)
    val car2 = car("demio","mazda",2024)
    println(car2.model)
//    val car1 = car()
//    car1.brand = "Vitz"
//    car1.model = "Toyota"
//    car1.year = 2010
//    println(car1.brand)
//    val car2 = car()
//    car2.brand = "Ford"
//    car2.model = "Mustang"
//    car2.year = 1920
//    println(car2.model)
    //lamp
    val lamp1 = lamp()
    println(lamp1.turnoff())
    lamp1.turnon()
    println(lamp1.displaylightstatus("lamp1"))
    val person1 = person("Alex",23)
    person1.canvote(23)
    val person2 = person("Ann",14)
    person2.canvote(14)
}
class car(var brand:String,var model: String,var year:Int){
    //body
    //data variable
//    var brand = ""
//    var model = ""
//    var year = 0//convert to integer
    //member functions(methods)
}

class lamp{
    var isOn:Boolean = true

    fun turnoff(){
         isOn = false
    }
    fun turnon(){
        isOn = true
    }
    fun displaylightstatus(lamp: String){
        if (isOn==true){
            println("$lamp is on")
        }
        else{
            println("$lamp is off")
        }
    }
}
class person(var name: String, var age: Int){
    fun canvote(age: Int){
        if (age<18){
            println("Can not vote")
        }
        else{
            println("Can vote")
        }
    }
}