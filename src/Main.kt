//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //if - else (5)

    val userInput = readLine()?.toIntOrNull()

    if (userInput!= null){
        if (userInput % 2 == 0){
            println("Even number")
        } else{
            println("Odd number")
        }
    }

    val input = readLine()?.toIntOrNull()?.let{if (it % 2 == 0) "Even number" else "Odd number" }
    println(input)

    //when (5)

    //for (5)

    //while (5)

    // fib

    val n = 4
    var prev = 0
    var next = 1
    var fib = 0

    for (i in 2.. n) { // Start from 0
        fib = prev + next
        prev = next
        next = fib
    }

    println(fib) // Output will still be 3 for n = 4

    var limit = 2
    var previous = 0
    var following = 1
    var fibonacci = 0

    while (limit <= 4){
        fibonacci = previous + following
        previous = following
        following = fibonacci
        limit++
    }
    println(fibonacci)



}