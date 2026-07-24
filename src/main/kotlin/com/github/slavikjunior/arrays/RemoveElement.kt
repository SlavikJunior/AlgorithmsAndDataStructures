package com.github.slavikjunior.arrays

class RemoveElementSolution {

    companion object {

        fun removeElement(nums: IntArray, `val`: Int): Int {
            var innerIndex = 0

            for (i in nums.indices) {
                if (nums[i] != `val`) {
                    nums[innerIndex] = nums[i]
                    innerIndex++
                }
            }

            return innerIndex
        }
    }
}

fun main() {
    println(RemoveElementSolution.removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
}
