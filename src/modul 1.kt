fun main() {
    // 1. Работа с Char
    val letter: Char = 'A'
    val text: String = "A"
    println("Символ: $letter, а это строка: $text")

    // 2. Переполнение Int
    val maxInt = Int.MAX_VALUE // Это константа, хранящая максимум Int
    println("Максимум Int: $maxInt")
    val overflowed = maxInt + 1 // Прибавляем 1 к максимуму
    println("Произошло переполнение: $overflowed") // Увидим огромное отрицательное число!

    // 3. Инкременты (Префикс и Постфикс)
    var a = 10
    println("Значение a до: $a")
    val resultPostfix = a++
    println("Постфикс (a++): result = $resultPostfix, новое a = $a")

    var b = 10
    val resultPrefix = ++b
    println("Префикс (++b): result = $resultPrefix, новое b = $b")
}