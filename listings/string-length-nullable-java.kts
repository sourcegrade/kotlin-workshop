fun doStuff(string: String?) {
    var length: Int = 0
    // the Java way
    if (string == null) {
        length = 0
    } else {
        length = string.length
    }
}
