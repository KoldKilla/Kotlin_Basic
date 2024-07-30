package second.module

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Введите сумму вклада: ")
    var sum = scanner.nextDouble()

    println("Введите длительность вклада (количество месяцев):")
    var duration = scanner.nextInt()

    println("Введите ежемесячный процент по вкладу:")
    var percent = scanner.nextFloat() / 100

    for (i in 1..duration) {
        var increase = sum * percent
        sum += increase

        println("$i месяц: сумма вклада увеличится на ${increase.toInt()} рублей, итоговая сумма составит ${sum.toInt()}")
    }
}