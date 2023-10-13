val line: String = readln()
val number: Int = line.toIntOrNull() ?: 0

fun foo(x: Int) = println("Hello ${x + 5}")

foo(number)
