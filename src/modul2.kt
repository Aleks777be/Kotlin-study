fun main() {
    println("Введите ваш возраст: ")
    val age = readln(). toInt()
    if (age < 18) {
        println("Извините, вам рано в клуб.")
    } else if (age in 18..25) {
        println("Добро пожаловать! Вам положен скидочный билет.")
    } else if (age > 25) {
        println("Добро пожаловать! Вам положен VIP-билет.")
    }

    val dayNumber = 3

    when (dayNumber) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        else -> println("Неизвестный день")
    }

    println("Введите номер вашего отдела (1 - бухгалтерия, 2 - IT, 3 - кадры, 4 - охрана): ")
    val department = readln().toInt()

    when (department) {
        1 -> println("Вам на первый этаж, кабинет 101")
        2 -> println("Вам в подвал, серверная")
        3 -> println("Вам на 2-й этаж, кабинет 205")
        4 -> println("Вы на входе, выходите на улицу")
        else -> println("Такого отдела не существует, вы ошиблись")
    }
}