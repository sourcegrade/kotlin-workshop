val line: String = readln()
val number: Int? = line.toIntOrNull()

fun foo(x: Int) = println("Hello ${x + 5}")

foo(number) // Type mismatch. Required: Int Found: Int?
