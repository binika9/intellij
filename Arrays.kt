fun main(args: Array<String>) {
    //containers that hold data sets
    var arr = arrayOf(10,"Faith",23.4,'A')//all data
    var arr1 = arrayOf<Int>(12,232,343,545)
    var arr2 = arrayOf<String>("John","Kube","Esther")

    println(arr[1])
    println(arr2[2])

    //modify array using set function
    var fruits = arrayOf("banana","oranges","apples")
    fruits.set(1,"Pineapple")//replace oranges with pineapple
    fruits[0]= "Tomato"
    for(fruit in fruits){
        println(fruit)
    }
    //using get function to fetch value from array
    var car = arrayOf("toyota","honda","peugeot")
    println(car.get(0))
}