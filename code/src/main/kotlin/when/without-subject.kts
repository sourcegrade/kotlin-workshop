val n: Int = ... // some number
when {
    n % 3 == 0 -> println("divisble by 3")
    n % 5 == 0 -> {
        println("divisible by 5")
    }
    else -> println("...")
}
