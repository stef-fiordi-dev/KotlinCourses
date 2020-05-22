package collections

fun main(args: Array<String>) {
    val arrayList = arrayListOf("Stef", "Fiordi", "Dev")
    val list = arrayListOf("Programmer")
    println(arrayList + list)

    arrayList.add("Yay") //append to the end of the list
    val changed = arrayList.add(1, "Inserted") //insert to passed index
    println(arrayList)

    val removed = arrayList.remove("Dev")
    println(arrayList)
    println(removed)

    val subList = arrayList.subList(1, 3)
    println(subList)
}

//fun main(args: Array<String>) {
//    val array = arrayOf("Florence", "Rome", "Milan")
//
//    val list = listOf("Orange", "Apple", "Banana")
//
//    val arrayList = arrayListOf("Stef", "Fiordi", "Dev")
//    arrayList.add("Freelance")
//
//    val mixed = arrayOf("Kotlin", 20, 3.5, false)
//    val numbers = intArrayOf(1, 2, 3, 4, 5)
//
//    val cities = arrayOf("Naples", "Venice")
//    val allCities = array + cities
//
//    println(allCities.size)
//
//    val empty: Boolean = numbers.isEmpty()
//
//    if (cities.contains("Florence")) {
//        println("It contains Florence")
//    } else {
//        println("It does not")
//    }
//}