package FinalModule

fun main() {
    println("\n Задание 1 - Грузоподъёмность")
    val aircraftLoad = Boeing747Cargo("TestLoad", 30, 40, 50)

    println("\n Задание 2 - Коллекции")
    val aircraftList = mutableListOf<AircraftFirst>()

    // Добавим несколько самолетов в коллекцию
    aircraftList.add(Boeing747("AC123", 10000, 1000))
    aircraftList.add(Boeing747Cargo("AC456", 12000, 1200, 100000))
    aircraftList.add(AirbusA380("AC789", 15000, 1500))

    println("\n Задание 3 - Интерфейс пользователя")
// Создадим интерфейс для пользователя
    while (true) {
        println("Выберите команду:")
        println("1. Вывести список самолетов")
        println("2. Получить информацию о самолете")
        println("3. Выход")

        val command = readLine()!!.toInt()

        when (command) {
            1 -> printAircraftList(aircraftList)
            2 -> getAircraftInfo(aircraftList)
            3 -> break
            else -> println("Неверная команда")
        }
    }
}

// Функция для вывода списка самолетов
fun printAircraftList(aircraftList: List<AircraftFirst>) {
    println("Список самолетов:")
    for (aircraft in aircraftList) {
        println("${aircraft.number} ${aircraft.javaClass.simpleName}")
    }
}



// Функция для получения информации о самолете
fun getAircraftInfo(aircraftList: List<AircraftFirst>) {
    println("Введите номер самолета:")
    val aircraftNumber = readLine()!!

    val aircraft = aircraftList.find { it.number == aircraftNumber }

    if (aircraft != null) {
        println("Номер самолёта: ${aircraft.number}")
        println("Вместимость бака: ${aircraft.tankCapacity}")
        if (aircraft is LoadCapacity){
            println("Грузоподъемность: ${aircraft.cargoCapacity}")
        }
    } else {
        println("Самолет не найден")
    }

}
