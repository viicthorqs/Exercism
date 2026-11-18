object Darts {

    fun score(x: Any, y: Any): Int {
        val dx = (x as Number).toDouble()
        val dy = (y as Number).toDouble()

        val distance = dx * dx + dy * dy

        return when {
            distance <= 1.0 -> 10
            distance <= 25.0 -> 5
            distance <= 100.0 -> 1
            else -> 0
        }
    }
}