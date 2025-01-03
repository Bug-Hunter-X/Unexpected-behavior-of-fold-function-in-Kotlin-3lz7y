fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.fold(0, { acc, i ->
        println("Acc: $acc, i: $i")
        acc + i
    })
    println("Sum: $sum")
}