fun main() {
    var health = 100
    while (health > 0) {
        println("\n=== Ваше здоровье: $health ===")
        println("1. Пойти в лес (найти зелье)")
        println("2. Пойти в пещеру (сразиться с монстром)")
        println("0 -> Выйти из игры")
        println("Введите ваш выбор: ")

        val choice = readlnOrNull()?.toIntOrNull()
        when (choice) {
            1 -> {
                println("Вы нашли зелье! Здоровье: + 20")
                health = (health + 20).coerceAtMost(100)
            }

            2 -> {
                println("Монстр ударил вас! Здоровье: - 30")
                health -= 30
            }

            0 -> {
                println("Вы вышли из игры.")
                break
            }

            else -> {
                println("Неверный выбор, введите 1,2 или 0")
            }
        }
    }
    if (health <= 0) {
        println("Вы проиграли. Game over.")
    }
}