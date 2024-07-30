package second.module


import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var cities = mutableListOf<String>()

    while (true) {
        println("Выберите действие:")
        println("1. Добавить город")
        println("2. Показать все города")
        println("3. Показать уникальные города")
        println("4. Выход из программы")

        val action = scanner.nextInt()

        when (action) {
            1 -> {
                println("Введите название города:")
                val city = scanner.next()
                cities.add(city)
            }
            2 -> {
                for (city in cities) {
                    println(city)
                }
            }
            3 -> {
                val uniqueCities = cities.toSet()
                for (uniqueCity in uniqueCities) {
                    println(uniqueCity)
                }
            }
            4 -> break
            else -> println("Неизвестное действие")
        }
    }
}