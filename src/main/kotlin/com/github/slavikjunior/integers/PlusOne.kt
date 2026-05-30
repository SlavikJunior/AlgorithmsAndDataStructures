package com.github.slavikjunior.integers

class PlusOne {

    companion object {
        fun plusOne(digits: IntArray): IntArray {
            for (i in digits.indices.reversed()) {
                if (digits[i] < 9) {
                    digits[i]++
                    return digits
                }
                digits[i] = 0
            }
            return IntArray(digits.size + 1).also { it[0] = 1 }
        }
    }
}

fun main() {

    println(
        PlusOne.plusOne(
            intArrayOf(
                7,
                2,
                8,
                5,
                0,
                9,
                1,
                2,
                9,
                5,
                3,
                6,
                6,
                7,
                3,
                2,
                8,
                4,
                3,
                7,
                9,
                5,
                7,
                7,
                4,
                7,
                4,
                9,
                4,
                7,
                0,
                1,
                1,
                1,
                7,
                4,
                0,
                0,
                6
            )
        ).contentToString()
    )
}