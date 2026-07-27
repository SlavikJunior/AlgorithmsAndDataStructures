package com.github.slavikjunior.arrays

import kotlin.math.max

class MaximumProductOfTwoElementsInArraySolution {

    companion object {

        fun maxProduct(nums: IntArray): Int {
            var max1 = 0
            var max2 = 0

            var maxProduct = 0

            nums.forEach { current ->
                if (current > max1) {
                    max2 = max1
                    max1 = current
                } else if (current > max2) {
                    max2 = current
                }

                maxProduct = max(maxProduct, (max1 - 1) * (max2 - 1))
            }

            return maxProduct
        }
    }
}

fun main() {

    println(MaximumProductOfTwoElementsInArraySolution.maxProduct(intArrayOf(3,4,5,2)))
}
