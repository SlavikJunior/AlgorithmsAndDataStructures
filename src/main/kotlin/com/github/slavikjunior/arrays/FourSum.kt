package com.github.slavikjunior.arrays

class FourSumSolution {

    companion object {

        fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
            nums.sort()

            val resultList = mutableListOf<List<Int>>()

            for (i in 0..nums.size - 4) {
                if (i > 0 && nums[i] == nums[i - 1]) continue

                for (j in i + 1..nums.size - 3) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue

                    var left = j + 1
                    var right = nums.lastIndex

                    while (left < right) {
                        val total: Long = nums[i].toLong() + nums[j] + nums[left] + nums[right]

                        if (total == target.toLong()) {
                            resultList += listOf(nums[i], nums[j], nums[left], nums[right])

                            left++
                            right--

                            while (left < right && nums[left] == nums[left - 1]) {
                                left++
                            }

                        } else if (total < target.toLong()) {
                            left++
                        } else {
                            right--
                        }
                    }
                }
            }

            return resultList
        }
    }
}

fun main() {

    println(
        FourSumSolution.fourSum(
            nums = intArrayOf(1, 0, -1, 0, -2, 2),
            target = 0
        )
    )
}
