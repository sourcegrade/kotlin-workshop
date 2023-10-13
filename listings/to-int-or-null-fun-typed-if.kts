val line: String = readln()
val numberOrNull: Int? = line.toIntOrNull()

// the Java way
var number: Int = 0
if (numberOrNull == null) {
    number = 0
} else {
    number = numberOrNull
}
