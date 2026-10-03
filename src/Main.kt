fun main() {
    println("Hello, my name Aleks")
    println("Я начинаю учить Kotlin")
    println("Это очень круто!")

    val myName = "Алекс" // Создали коробочку
    var learningDays = 1 // Создали коробочку с числом

    println("Меня зовут $myName, я учу Kotlin уже $learningDays день.")

    learningDays = 2 // Так как это var, мы можем поменять значение!
    println("А теперь я учу Kotlin уже $learningDays дня.")

    val a = 5
    val b = 10

    println("Сумма a и b равна ${a + b}")

    val eurRate: Double = 99.5
    val amount: Int = 100
    val result = (amount * eurRate)

    println("$amount евро по курсу $eurRate = $result рублей")

    val second = 3661
    val minute = second / 60
    val leftoverSecond = second % 60

    println("в $second секундах: $minute минут и $leftoverSecond секунд")

    val isAdult: Boolean = true
    val hasTicket: Boolean = false

    println("Можно ли войти: ${"isAdult $$ hasTiket"}")
    }