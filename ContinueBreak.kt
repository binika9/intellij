fun main(args: Array<String>) {

    for(n in 1..10){
        println("before continue, loop:$n")

        if(n==2||n==5)
            continue
        println("after continue, loop:$n")
    }
    //Break
    for(m in 1..5) {
        println("before break,loop:$m")
        if (m == 5) {
            println("I am terminating the loop...")
            break
        }
    }
    //terminate loop around an alphabet at p



}
