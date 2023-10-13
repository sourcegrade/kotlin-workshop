fun forEach(list: List<Int>, action: (Int) -> Unit) {
    for (element in list) {
        action(element)
    }
}

// 'it' parameter implizit
forEach(listOf(1, 2, 3)) {
    println(it * 2)
}
