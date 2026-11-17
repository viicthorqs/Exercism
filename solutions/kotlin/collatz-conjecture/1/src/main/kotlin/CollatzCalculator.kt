object CollatzCalculator {    
    
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "Start must be positive" }
        
        var steps = 0
        var result = start

        while(result != 1) {
            result = if (result.isEven()) result / 2 else (result * 3) + 1
            steps++
        }

        return steps
    }

    private fun Int.isEven() = this % 2 == 0
}