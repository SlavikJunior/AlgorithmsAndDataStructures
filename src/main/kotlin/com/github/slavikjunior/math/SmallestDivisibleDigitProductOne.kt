package com.github.slavikjunior.math

class SmallestDivisibleDigitProductOneSolution {

    companion object {

        fun smallestNumber(n: Int, t: Int): Int {
            for (num in n until n + 10) {
                var current = num
                var product = 1
                while(current > 0) {
                    val tail = current % 10
                    product *= tail
                    current /= 10
                }

                if (product % t == 0) return num
            }

            return -1
        }
    }
}

fun main() {

    println(
        SmallestDivisibleDigitProductOneSolution.smallestNumber(
            n = 15,
            t = 3
        )
    )
}
