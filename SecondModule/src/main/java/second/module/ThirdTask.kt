package second.module

fun main(args: Array<String>) {
    val countries = arrayOf(arrayOf("Россия", "Москва" ,"Рубль"),
                            arrayOf("Великобритания", "Лондон" ,"Фунт"),
                            arrayOf("Казахстан", "Астана" ,"Тенге"),
            )

    for (country in countries) {
        println("${country[0]} ${country[1]} ${country[2]}")
    }
}