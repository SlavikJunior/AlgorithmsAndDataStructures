package com.github.slavikjunior.hashtables

class TwoSumSolution {

    companion object {

        fun twoSum(nums: IntArray, target: Int): IntArray {
            val map = hashMapOf<Int, Int>()

            nums.forEachIndexed { index, value ->
                val dif = target - value

                val indexFromMap = map[dif]
                if (indexFromMap != null) {
                    return intArrayOf(indexFromMap, index)
                }

                map[value] = index
            }

            return intArrayOf()
        }
    }
}

fun main() {
    println(TwoSumSolution.twoSum(intArrayOf(3,2,4), 6).toList())
}
