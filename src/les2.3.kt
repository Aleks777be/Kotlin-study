fun main() {

    var count = 1

    while (count <= 5) {
        println("Счетчик: $count")
        count = count + 1 // или count++
    }

    println("Таблица умножения на 5:")

    for (i in 1..10) {
        println("5 * $i = ${5 * i}")
    }

}