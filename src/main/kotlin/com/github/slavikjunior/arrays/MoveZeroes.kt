package com.github.slavikjunior.arrays

private class SolutionMoveZeroes {

    companion object {

        fun moveZeroes(nums: IntArray): IntArray {
            var insertIndex = 0
            for (i in 0 until nums.size) {
                if (nums[i] != 0) {
                    val temp = nums[i]
                    nums[i] = nums[insertIndex]
                    nums[insertIndex] = temp

                    insertIndex++
                }
            }

            return nums
        }
    }
}

fun main() {
    println(SolutionMoveZeroes.moveZeroes(intArrayOf(0,1,0,3,12)).toList())
}
