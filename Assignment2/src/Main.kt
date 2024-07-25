// Zabihullah Najeeb
// Kotlin Assignment-2

fun main() {
    // Create an instance of Car
    val car = Car("Red", "Toyota", "Corolla", 4)
    println(car.toString())
    car.accelerate()
    car.stop()
    car.parallelPark()
    println(redText(carIcon())) // Corolla icon in red

    // Create an instance of Bus
    val bus = Bus("Blue", "Mercedes", "Sprinter", 30)
    println(bus.toString())
    bus.accelerate()
    bus.stop()
    bus.openRearDoor()
    println(blueText(busIcon())) // Bus icon in blue
}

// Define a base class Vehicle with properties color, make, and model
open class Vehicle(
    val color: String,
    val make: String,
    val model: String
) {
    // Method to simulate acceleration
    open fun accelerate() {
        println(greenText("The $make $model is accelerating."))
    }

    // Method to simulate stopping
    open fun stop() {
        println(greenText("The $make $model has stopped."))
    }

    // Override toString method to display vehicle details
    override fun toString(): String {
        return greenText("Vehicle: Color: $color, Make: $make, Model: $model")
    }
}

// Define a Car class that inherits from Vehicle
class Car(
    color: String,
    make: String,
    model: String,
    val numberOfDoors: Int
) : Vehicle(color, make, model) {
    // Override accelerate method
    override fun accelerate() {
        println(greenText("The $make $model car is accelerating quickly."))
    }

    // Override stop method
    override fun stop() {
        println(greenText("The $make $model car has stopped."))
    }

    // Method to simulate parallel parking
    fun parallelPark() {
        println(greenText("The $make $model car is parallel parking."))
    }

    // Override toString method to include number of doors
    override fun toString(): String {
        return greenText(super.toString() + ", Number of Doors: $numberOfDoors")
    }
}

// Define a Bus class that inherits from Vehicle
class Bus(
    color: String,
    make: String,
    model: String,
    val passengerCapacity: Int
) : Vehicle(color, make, model) {
    // Override accelerate method
    override fun accelerate() {
        println(greenText("The $make $model bus is accelerating slowly."))
    }

    // Override stop method
    override fun stop() {
        println(greenText("The $make $model bus has stopped."))
    }

    // Method to simulate opening the rear door
    fun openRearDoor() {
        println(greenText("The $make $model bus rear door is opening."))
    }

    // Override toString method to include passenger capacity
    override fun toString(): String {
        return greenText(super.toString() + ", Passenger Capacity: $passengerCapacity")
    }
}

// Helper function to wrap text with ANSI escape code for red color
fun redText(text: String): String {
    return "\u001B[31m$text\u001B[0m"
}

// Helper function to wrap text with ANSI escape code for blue color
fun blueText(text: String): String {
    return "\u001B[34m$text\u001B[0m"
}

// Helper function to wrap text with ANSI escape code for green color
fun greenText(text: String): String {
    return "\u001B[32m$text\u001B[0m"
}

// Function to return a simple ASCII art of a car
fun carIcon(): String {
    return """
        ______
       //  ||\ \
 ____//___||_\ \___
 )  _          _    \
 |_/ \________/ \___|
___\_/________\_/______
"""
}

// Function to return a simple ASCII art of a bus
fun busIcon(): String {
    return """
 _____________________
||                   ||
||      BUS          ||
||___________________||
|_____________________|
  (O)           (O)
"""
}
