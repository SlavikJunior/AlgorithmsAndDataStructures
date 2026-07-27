package com.github.slavikjunior.strings

class MaximumProductOfTwoDigitsSolution {

    companion object {

        fun maxProduct(n: Int): Int {
            var temp = n

            var max1 = 0
            var max2 = 0

            while (temp != 0) {
                val current = temp % 10

                if (current > max1) {
                    max2 = max1
                    max1 = current
                } else if (current > max2) max2 = current

                temp /= 10
            }

            return max1 * max2
        }
    }
}

fun main() {

    println(MaximumProductOfTwoDigitsSolution.maxProduct(1245))
}
