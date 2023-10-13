fun forEach(list: List<Int>, action: (Int) -> Unit) {
    for (element in list) {
        action(element)
    }
}

val doAction: (Int) -> Unit = { it ->
    println(it * 2)
}
forEach(listOf(1, 2, 3), doAction)
