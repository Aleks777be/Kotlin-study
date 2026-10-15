fun main() {
    for (i in 1..20) {
        when {
            (i % 3 == 0) && (i % 5 == 0) -> println("FizzBuzz") // Самое строгое условие - наверх!
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i) // Все остальное
        }
    }
}