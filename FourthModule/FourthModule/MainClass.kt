package FourthModule

fun main() {
    println("// Задание 17")
    val aircraft17 = AircraftFirst("A317", 6000, 25000)
    println(aircraft17.fuelConsumption)

    println("\n// Задание 18")
    val aircraft18 = AircraftSecond("A318", 6500, 22000)
    println(aircraft18.fuelConsumption)  // 15

    println("\n// Задание 19")
    val aircraft19 = Boeing747("B719", 30090, 10000)
    println(aircraft19.fuelConsumption)  // 30
    println(aircraft19.passengerCapacity) // 500

    println("\n// Задание 20")

    val aircraft20 = Boeing747Interface("B720", 1000, 30500)
    println(aircraft20.fuelConsumption)  // 30
    println(aircraft20.passengerCapacity) // 600

    println("\n// Задание 21")
    val aircraft21 = Boeing747Abstract("B747", 10030, 30070)
    aircraft21.printInfo()

    println("\n// Задание 22")
    val aircraft22 = Boeing747Task22("AC456", 12000.0, 1200.0)

    println()
    aircraft22.printInfo()

println("\n// Задание 23")
    val car1 = Car("Toyota", "Красный", "123-ABC")
    val car2 = Car("BMW", "Чёрный", "456-DEF")

    println(car1)
    println(car2)
}