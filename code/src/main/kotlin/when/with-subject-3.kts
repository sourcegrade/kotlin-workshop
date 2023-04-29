val n: Int = ... // some number
when(n) {
    in 10..15 -> println("n is between (inclusive 10 and 15)")
    else -> println("n is not in range")
}
