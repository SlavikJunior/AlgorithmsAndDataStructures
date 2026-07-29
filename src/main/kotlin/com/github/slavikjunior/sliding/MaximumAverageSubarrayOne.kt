package com.github.slavikjunior.sliding

import kotlin.math.max

class MaximumAverageSubarrayOneSolution {

    companion object {

        fun findMaxAverage(nums: IntArray, k: Int): Double {
            var subArraySum = 0
            for (i in 0 until k) {
                subArraySum += nums[i]
            }

            var maxSum = subArraySum

            for (i in 1 .. nums.size - k) {
                subArraySum -= nums[i - 1]
                subArraySum += nums[i + k - 1]

                maxSum = max(maxSum, subArraySum)
            }

            return maxSum / k.toDouble()
        }
    }
}

fun main() {

    println(
        MaximumAverageSubarrayOneSolution.findMaxAverage(
            nums = intArrayOf(1, 12, -5, -6, 50, 3),
            k = 4
        )
    )
}
