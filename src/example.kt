fun calculate(a: Double, b: Double, operation: String): Double {
    when (operation) {
        "+" -> return a + b
        "-" -> return a - b
        "*" -> return a * b
        "/" -> return a / b
        else -> return 0.0
    }
}

fun main() {
    println("Введите первое число: ")
    var firstNumber: Double
    try {
        firstNumber = readln().toDouble()
    } catch (e: Exception) {
        println("Ошибка: введите корректное число!")
        return
    }
    println("Введите второе число: ")
    var secondNumber: Double
    try {
        secondNumber = readln().toDouble()
    } catch (e: Exception) {
        println("Ошибка: введите корректное число!")
        return
    }
    println("Введите операцию (+, -, *, /: ")
    val resOper = readln()
    val result = calculate(firstNumber, secondNumber, resOper)
    println("$result")
}