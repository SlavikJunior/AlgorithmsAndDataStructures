package com.github.slavikjunior.arrays

class RepeatedNTimes {

    companion object {

        fun repeatedNTimes(nums: IntArray): Int {
            nums.sort()
            var prev = nums[0]
            for (i in 1 until nums.size) {
                if (prev == nums[i]) {
                    return nums[i]
                }
                prev = nums[i]
            }
            return nums[nums.size - 1]
        }
    }
}

fun main() {
    println(RepeatedNTimes.repeatedNTimes(intArrayOf(5,1,5,2,5,3,5,4)))
}