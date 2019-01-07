package trace

data class Color(val r: Double, val g: Double, val b: Double) {

    companion object {
        val Black = Color(0.0, 0.0, 0.0)
        val Red = Color(1.0, 0.0, 0.0)
        val Green = Color(0.0, 1.0, 0.0)
        val Blue = Color(0.0, 0.0, 1.0)
        val White = Color(1.0, 1.0, 1.0)
    }

    operator fun unaryPlus() = this
    operator fun unaryMinus() = Color(-r, -g, -b)

    operator fun times(x: Double) = Color(r * x, g * x, b * x)
    operator fun div(x: Double) = Color(r / x, g / x, b / x)

    operator fun plus(that: Color) = Color(r + that.r, g + that.g, b + that.b)
    operator fun minus(that: Color) = Color(r - that.r, g - that.g, b - that.b)

    fun clip() = Color(r.coerceIn(0.0, 1.0), g.coerceIn(0.0, 1.0), b.coerceIn(0.0, 1.0))

}

operator fun Double.times(that: Color) = Color(this * that.r, this * that.g, this * that.b)
