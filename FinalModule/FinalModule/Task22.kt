package FinalModule

abstract class AircraftTask22(private var number: String, private val maxRange: Double, private val tankCapacity: Double) {
    private val fuelConsumptionPer100km = tankCapacity / maxRange

    open fun printInfo() {
        println("Номер воздушного судна: $number")
        println("Максимальная дальность полёта: $maxRange ")
        println("Вместимость бака: $tankCapacity ")
        println("Расход топлива на 100 км: ${fuelConsumptionPer100km} ")
    }
}

class Boeing747Task22(number: String, maxFlightRange: Double, tankCapacity: Double) : AircraftTask22(number, maxFlightRange, tankCapacity) {
    private var passengerCapacity: Int = 400

    // Переопределим функцию printInfo() для вывода информации о пассажирах
    override fun printInfo() {
        super.printInfo()
        println("Ввместимость пассажиров: $passengerCapacity")
    }
}