package second.module

import java.util.*

fun main(args: Array<String>) {
    var workplaces = mutableMapOf<Int, String>()

    while (true) {
        println("Выберите действие:")
        println("1. Добавить сотрудника")
        println("2. Показать всех сотрудников")
        println("3. Узнать кто занимает рабочее место по его номеру")
        println("4. Выход из программы")

        val action = readln().toInt()

        when (action) {
            1 -> {
                println("Введите номер рабочего места:")
                val workplace = readln().toInt()
                println("Введите ФИО сотрудника:")
                val employee: String = readln()

                workplaces[workplace] = employee
            }
            2 -> {
                for ((key, value) in workplaces) {
                    println("$key: $value")
                }
            }
            3 -> {
                println("Введите номер рабочего места:")
                val workplace = readln().toInt()

                if (workplaces.containsKey(workplace)) {
                    val employee = workplaces[workplace]!!
                    println("Рабочее место $workplace занимает: $employee")
                } else {
                    println("Рабочего места с номером $workplace не существует")
                }
            }
            4 -> break
            else -> println("Неизвестное действие")
        }
    }
}