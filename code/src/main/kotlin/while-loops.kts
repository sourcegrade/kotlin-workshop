val it = listOf("foo", "bar", "baz").iterator()
while (it.hasNext()) {
    val elem = it.next()
    println(elem)
}
