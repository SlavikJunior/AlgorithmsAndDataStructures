package com.github.slavikjunior.hashtables

class ContainsDuplicateTwoSolution {

    companion object {

        fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
            val map = hashMapOf<Int, Int>()

            nums.forEachIndexed { index, value ->
                map[value]?.let { otherIndex -> if (index - otherIndex <= k) return true }
                map[value] = index
            }

            return false
        }
    }
}

fun main() {

    println(ContainsDuplicateTwoSolution.containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3), 2))
}
