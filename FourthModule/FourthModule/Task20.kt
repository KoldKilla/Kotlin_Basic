package FourthModule

class Boeing747Interface(number: String, maxRange: Int, tankCapacity: Int) : AircraftFirst(number, maxRange, tankCapacity), Passenger {
    override val passengerCapacity: Int = 600
}