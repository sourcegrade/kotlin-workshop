fun forEach(list: List<Int>, action: (Int) -> Unit) {
    for (element in list) {
        action(element)
    }
}

fun doAction(x: Int) = println(x * 2)
forEach(listOf(1, 2, 3), ::doAction)
