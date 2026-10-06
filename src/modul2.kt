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
}