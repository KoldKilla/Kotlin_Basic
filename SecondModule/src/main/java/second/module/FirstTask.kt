package second.module

import java.util.*

fun main(args: Array<String>){
    var sum: Int = 0

    println("Ответьте на вопросы: В каком году произошло крещение Руси?\nа) 988 г.\n" +
            "б) 1054 г.\n" +
            "в) 862 г.\n" +
            "г) 1237 г.\n" +
            "д) 1380 г.")
    val firstAnswer: String? = readlnOrNull()

    when (firstAnswer.toString().lowercase(Locale.getDefault())) {
        "а" -> { (println("Ответ правильный!"))
            (sum++)
        }
        "б", "в", "г" -> (println("Неправильный ответ"))
        else -> (println("Неопределённое значение"))
    }


    println("Кто был первым русским царём?\n" +
            "а) Иван III\n" +
            "б) Василий III\n" +
            "в) Иван IV Грозный\n" +
            "г) Борис Годунов\n" +
            "д) Михаил Романов")
    val secondAnswer: String? = readlnOrNull()

    when (secondAnswer.toString().lowercase(Locale.getDefault())) {
        "а", "б", "г" -> (println("Неправильный ответ"))
        "в" -> { (println("Ответ правильный!"))
            (sum++)
        }
        else -> (println("Неопределённое значение"))
    }

    println("Какой город стал центром объединения русских земель в XIV–XV веках?\n" +
            "а) Москва\n" +
            "б) Новгород\n" +
            "в) Киев\n" +
            "г) Тверь\n" +
            "д) Владимир")
    val thirdAnswer: String? = readlnOrNull()

    when (thirdAnswer.toString().lowercase(Locale.getDefault())) {
        "а" -> { (println("Ответ правильный!"))
            (sum++)
        }
        "б", "в", "г" -> (println("Неправильный ответ"))
        else -> (println("Неопределённое значение"))
    }

    println("Какое событие произошло в 1812 году?\n" +
            "а) Отечественная война\n" +
            "б) Крымская война\n" +
            "в) Первая мировая война\n" +
            "г) Октябрьская революция\n" +
            "д) Великая Отечественная война")

    val fourthAnswer: String? = readlnOrNull()

    when (fourthAnswer.toString().lowercase(Locale.getDefault())) {
        "а" -> { (println("Ответ правильный!"))
            (sum++)
        }
        "б", "в", "г" -> (println("Неправильный ответ"))
        else -> (println("Неопределённое значение"))
    }

    println("Когда произошла Февральская революция?\n" +
            "а) в 1905 г.\n" +
            "б) в 1917 г.\n" +
            "в) в 1922 г.\n" +
            "г) в 1941 г.\n" +
            "д) в 1991 г.")

    val fifthAnswer: String? = readlnOrNull()

    when (fifthAnswer.toString().lowercase(Locale.getDefault())) {
        "а", "в", "г" -> (println("Неправильный ответ"))
        "б" -> { (println("Ответ правильный!"))
            (sum++)
        }
        else -> (println("Неопределённое значение"))
    }

    when (sum){
        in 0..2 -> (println("Перепройдите тест, вы не набрали минимальный проходной балл!"))
        3 -> (println("Ваши знания истории на три, необходимо изучить ещё материал"))
        4 -> (println("Ваши знания истории на крепкую четверку"))
        5 -> (println("Вы набрали максимальный балл! Ваши знания истории на пятёрку!"))
    }
}