fun forEach(list: List<Int>, action: (Int) -> Unit) {
    for (element in list) {
        action(element)
    }
}

forEach(listOf(1, 2, 3)) { it ->
    println(it * 2)
}
