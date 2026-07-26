package com.github.slavikjunior.arrays

import kotlin.math.max

class MaximumProductOfThreeNumbersSolution {

    companion object {

        fun maximumProduct(nums: IntArray): Int {
            nums.sort()

            val firstProduct = nums[nums.size - 1] * nums[nums.size - 2] * nums[nums.size - 3]
            val secondProduct = nums[nums.size - 1] * nums[0] * nums[1]

            return max(firstProduct, secondProduct)
        }
    }
}

fun main() {

    println(MaximumProductOfThreeNumbersSolution.maximumProduct(intArrayOf(1,2,-3,-4)))
}
