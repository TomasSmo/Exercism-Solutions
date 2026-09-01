object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        var x = start
        var steps = 0
        
        if (x <= 0) {
            throw IllegalArgumentException()
        }

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2
            } else {
                x = x * 3 + 1
            }

            steps++
        }

        return steps
    }
}
