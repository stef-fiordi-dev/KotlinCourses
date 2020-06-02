package oo

//enum class Color(val rgb: Int) {
//    RED(0xFF0000), BLUE(0x00FF00), GREEN(0x0000FF), YELLOW(0XFFFF00);
//
//    fun containsRed(): Boolean {
//        return this.rgb and 0xFF0000 != 0
//    }
//}

//fun main(args: Array<String>) {
//    println(0x10)
//    println(0x1F)
//    println(0xFF)
//    println(0xCAFEBABE)
//
//    println(0x000000) // black
//    println(0xFFFFFF) // white
//    println(0xFF0000) // red
//    println(0x00FF00) // green
//    println(0x0000FF) // blue
//    println(0x000088) // dark blue
//
//    // binary numbers
//    // 0..1 -> 0b1010 = 10
//    println(0b1010)
//    println(0b11111111 == 0xFF)
//    println(0b11111111_00000000_00000000 == 0xFF0000)
//
//    // bitwise operation
//    println(0b1101 and 0b1011)
//
//    // 0x01CAFE and 0xFF0000 == 0x010000
//    println(Color.RED.containsRed())
//    println(Color.GREEN.containsRed())
//    println(Color.BLUE.containsRed())
//    println(Color.YELLOW.containsRed())
//
//    // bitwise operators
//    //    1101
//    // or 1000
//    //  = 1101
//    println(0b1101 or 0b1000)
//
//    //     1101
//    // xor 1000
//    //   = 0101
//    println(0b1101 xor 0b1000)
//
//    //inverse
//    // 0b10011.inv() == 0b...01100
//    println(0b10011.inv() and 0x0000001F) // 0b01100
//}