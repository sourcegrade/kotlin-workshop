fun forEach(list: List<Int>, action: (Int) -> Unit) {
    for (element in list) {
        action(element)
    }
}
