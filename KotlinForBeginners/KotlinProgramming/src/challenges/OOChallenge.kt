package challenges

interface  Lendable {
    fun borrow()
}

abstract class InventoryItem(val title: String, val genre: String, val year: Int): Lendable {

}

class LibraryBook(title: String, genre: String, year: Int, val author: String): InventoryItem(title, genre, year) {
    override fun borrow() {
        println("Borrowing book...")
    }
}

class LibraryDVD(title: String, genre: String, year: Int, val lengthSeconds: Int): InventoryItem(title, genre, year) {
    override fun borrow() {
        println("Borrowing DVD...")
    }
}