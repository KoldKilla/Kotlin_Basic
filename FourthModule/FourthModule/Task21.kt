package FourthModule

abstract class AircraftAbstract(val number: String, val maxRange: Int, val tankCapacity: Int) {
    val fuelConsumption: Float
        get() = maxRange / 100f * tankCapacity

    abstract fun printInfo()
}

class Boeing747Abstract(number: String, maxRange: Int, tankCapacity: Int) : AircraftAbstract(number, maxRange, tankCapacity){
    val passengerCapacity: Int = 700

    override fun printInfo() {
        println("Номер воздушного судна: $number")
        println("Максимальная дальность полёта: $maxRange")
        println("Вместимость бака: $tankCapacity")
        println("Расход топлива на 100 км: $fuelConsumption")
    }
}


