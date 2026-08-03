package com.github.slavikjunior.sliding

import kotlin.math.max

class LongestHarmoniousSubsequenceSolution {

    companion object {

        fun findLHS(nums: IntArray): Int {
            nums.sort()

            var left = 0
            var maxLength = 0

            for (right in nums.indices) {
                while (nums[right] - nums[left] > 1) {
                    left++
                }

                if (nums[right] - nums[left] == 1) {
                    val currentWindowSize = right - left + 1
                    maxLength = max(maxLength, currentWindowSize)
                }
            }

            return maxLength
        }
    }
}

fun main() {

    println(LongestHarmoniousSubsequenceSolution.findLHS(intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)))
}
