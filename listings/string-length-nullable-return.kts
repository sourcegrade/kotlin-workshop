fun doStuff(string: String?) {
    val length = string?.length ?: return

    println("Length: $length")
}
