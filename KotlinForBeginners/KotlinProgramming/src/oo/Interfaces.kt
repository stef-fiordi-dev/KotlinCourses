package oo

interface Drivable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: String, override val timeRequired: Int = 120): Drivable, Buildable {

    override fun drive() {
        println("Driving car...")
    }

    override fun build() {
        println("Built a shiny car.")
    }
}

class Motorcycle(val color: String): Drivable {

    override fun drive() {
        println("Driving motorcycle...")
    }
}

fun main(args: Array<String>) {
    val car: Drivable = Car("blue")
    car.drive()
    //car.build() //doesn't work because car object is only of type Drivable

    val motorcycle: Drivable = Motorcycle("red")
    motorcycle.drive()
}