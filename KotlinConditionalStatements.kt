fun main(args: Array<String>) {
    var age:Int
    age = 17
    if (age<20) {
        println("Sorry, $age is below the target range")
    }
    else{
        println("Your $age is above the target range and you qualify")
    }
    var number:Int
    number = 0
    if(number==1){
        println("Oops, you lost the guess")
    }
    else if(number==2){
        println("Oops, you almost got it right")
    }
    else if(number==3){
        println("Wow, Congratulations you won!")
    }
    else{
        println("$number is not valid.Please enter again")
    }

    //WHEN STATEMENT
//    var y:Int
//    y = 0
//    when(y){
//        1 -> println("Oops, you lost the game")
//        2 -> println("Oops, you almost got it right")
//        3 -> println("Wow, Congratulations")
//        else -> println("$y is not valid. please try again")
//    }
//    var h:Double
//    var w:Double
//    var bmi = w/h**2
//    if (bmi < 18.5) {
//        return "Underweight";
//    }
//    else if (bmi < 25) {
//        return "Normal";
//    }
//    else if (bmi < 30) {
//        return "Overweight";
//    }
//    else {
//        return "Obese";
//    }
}

//Declare a height and weight variable. Perform the BMI using above variables. Using BMI perform
//below output;BMI<16 UNDERWEIGHT, 18-25 AVERAGE,25-30 OVERWIGHT, Above 30 OBESE
