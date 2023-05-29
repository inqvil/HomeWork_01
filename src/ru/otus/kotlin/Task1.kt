
fun main() {
    val numbers = IntArray(99){it}

    val evenNumbers = numbers.filter {   it % 2 == 0 }

    val slice = evenNumbers.slice(1..20)

    val slicePlusOne = slice.map { it + 1 }

    val sum = slicePlusOne.sum()

    println("${numbers.contentToString()} \n\n $evenNumbers \n\n $slice \n\n $slicePlusOne \n\n $sum")
}


