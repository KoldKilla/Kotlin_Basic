package FourthModule


open class AircraftFirst(val number: String, val maxRange: Int, val tankCapacity: Int) {
    val fuelConsumption: Float
        get() = maxRange / 100f * tankCapacity
}


