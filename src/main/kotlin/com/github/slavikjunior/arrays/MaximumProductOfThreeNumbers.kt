package com.github.slavikjunior.arrays

import kotlin.math.max

class MaximumProductOfThreeNumbersSolution {

    companion object {

        fun maximumProduct(nums: IntArray): Int {
            var min1 = Int.MAX_VALUE
            var min2 = Int.MAX_VALUE

            var max1 = Int.MIN_VALUE
            var max2 = Int.MIN_VALUE
            var max3 = Int.MIN_VALUE

            for (current in nums) {
                if (current > max1) {
                    max3 = max2
                    max2 = max1
                    max1 = current
                } else if (current > max2) {
                    max3 = max2
                    max2 = current
                } else if (current > max3) {
                    max3 = current
                }

                if (current < min1) {
                    min2 = min1
                    min1 = current
                } else if (current < min2) {
                    min2 = current
                }
            }

            val firstProduct = min1 * min2 * max1
            val secondProduct = max1 * max2 * max3

            return max(firstProduct, secondProduct)
        }
    }
}

fun main() {

    println(MaximumProductOfThreeNumbersSolution.maximumProduct(intArrayOf(1,2,-3,-4)))
}
