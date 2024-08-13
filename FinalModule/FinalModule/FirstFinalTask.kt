package FinalModule

class Boeing747Cargo(aircraftNumber: String, maxFlightRange: Int, tankCapacity: Int, override val cargoCapacity: Int) : AircraftFirst(aircraftNumber, maxFlightRange, tankCapacity), LoadCapacity

// Другой класс самолета
class AirbusA380(aircraftNumber: String, maxFlightRange: Int, tankCapacity: Int) : AircraftFirst(aircraftNumber, maxFlightRange, tankCapacity)