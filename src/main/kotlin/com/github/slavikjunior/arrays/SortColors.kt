package com.github.slavikjunior.arrays

class SortColorsSolution {

    companion object {

        fun sortColors(nums: IntArray): IntArray {
            var zerosCount = 0
            var onesCount = 0
            var twosCount = 0

            nums.forEach {
                when(it) {
                    0 -> zerosCount++
                    1 -> onesCount++
                    2 -> twosCount++
                }
            }

            var index = 0
            repeat(zerosCount) { nums[index++] = 0 }
            repeat(onesCount) { nums[index++] = 1 }
            repeat(twosCount) { nums[index++] = 2 }

            return nums
        }
    }
}

fun main() {

    println(SortColorsSolution.sortColors(intArrayOf(2, 0, 2, 1, 1, 0)).toList())
}
