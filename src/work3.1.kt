fun main() {
    println("Введите сумму в рублях (RUB): ")
    /*val input = readlnOrNull()
    val rubles = input?.toIntOrNull()
    if (rubles != null) {
        // Если rubles не null, программа выполнит этот код
        val dollars = rubles / 90.0
        println("Это $dollars долларов.")
    } else {
        // Если rubles оказался null
        println("Ошибка: вы ввели пустую строку или не число!")
    }
}*/
    val input = readlnOrNull()
    val rubles = input?.toIntOrNull()
    rubles?.let {
        val dollars = it / 90
        println("Это $dollars долларов")
    } ?: println("Вы ввели пустую строку или не число!")
}