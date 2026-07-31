package com.github.slavikjunior.arrays

import kotlin.math.max

class LongestConsecutiveSequenceSolution {

    companion object {

        fun longestConsecutive(nums: IntArray): Int {
            val set = nums.toHashSet()

            var maxLength = 0

            for (num in set) {
                if (!set.contains(num - 1)) {
                    var currentNum = num
                    var currentLength = 1

                    while (set.contains(currentNum + 1)) {
                        currentNum++
                        currentLength++
                    }

                    maxLength = max(maxLength, currentLength)
                }
            }

            return maxLength
        }
    }
}

fun main() {

    println(LongestConsecutiveSequenceSolution.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)))
}