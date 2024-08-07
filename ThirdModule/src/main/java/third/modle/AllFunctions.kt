package third.modle

import java.util.*

fun main(args: Array<String>) {

    fun isLeapYear(year: Int): Boolean {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
    }

    fun sqrt(num: Double): Double {
        return Math.sqrt(num.toDouble())
    }

    fun countEmployees(vararg employees: String): Int {
        return employees.size
    }

    val printArray = { array: Array<String> ->
        array.forEach { item -> println(item) }
    }

    class Employee(
            val name: String,
            val age: Int = 0,
            val position: String,
            val maritalStatus: String = ""
    )

    fun printEmployeeInfo(employee: Employee) {
        println("ФИО: ${employee.name}")
        println("Возраст: ${employee.age}")
        println("Должность: ${employee.position}")
        println("Семейное положение: ${employee.maritalStatus}")
    }

    fun printEmployeeInfo(name: String, position: String) {
        val employee = Employee(name, 0, position, "")
        printEmployeeInfo(employee)
    }

    fun printEmployeeInfo(name: String, age: Int, position: String) {
        val employee = Employee(name, age, position, "")
        printEmployeeInfo(employee)
    }

    fun printEmployeeInfo(name: String, maritalStatus: String, position: String) {
        val employee = Employee(name, 0, position, maritalStatus)
        printEmployeeInfo(employee)
    }

    fun printEmployeeInfo(
            name: String,
            age: Int,
            maritalStatus: String,
            position: String
    ) {
        val employee = Employee(name, age, position, maritalStatus)
        printEmployeeInfo(employee)
    }

    println("Введите число для задания 12 - Високосный год")
    val scanner = Scanner(System.`in`)

    val year = scanner.nextInt()

    val resultFirstTask = isLeapYear(year)

    println("Задание 12: Високосный год")

    println(resultFirstTask)

    println("Задание 13: Количество сотрудников")

    val arrSecondTask = countEmployees("Иван", "Олег", "Дмитрий")

    println(arrSecondTask)

    println("Задание 14 - Информация сотрудника")

    printEmployeeInfo("Иван Иванович Иванов", "Программист") // Вывод ФИО + должность
    printEmployeeInfo("Пётр Сергеевич Сергеев", 35, "Менеджер") // Вывод ФИО + должность + возраст
    printEmployeeInfo("Сергей Анатольевич Сергеев", "Холост", "Руководитель отдела") // Вывод ФИО + должность + семейное положение
    printEmployeeInfo("Мария Владимирована Васильева", 28, "Не замужем", "Бухгалтер") // Вывод ФИО + должность + возраст + семейное положение

    println("Задание 15 - Лямбда-выражения")

    val array = arrayOf("Кот", "Бегемот", "Мышь")

    printArray(array)

    println("Введите число для задания 16 - Корень числа")

    val num = scanner.nextDouble()

    val resultSqrt = sqrt(num)

    println("Задание 16: Корень числа")

    println(resultSqrt)

}

