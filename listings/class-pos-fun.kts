class Pos(val y: Int, val x: Int) {
    fun moveUp() = Pos(y - 1, x)
}

val myPos: Pos = Pos(2, 4)
val newPos: Pos = myPos.moveUp() // Pos(1, 4)
