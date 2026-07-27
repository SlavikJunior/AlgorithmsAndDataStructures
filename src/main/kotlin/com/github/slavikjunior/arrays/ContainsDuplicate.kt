package com.github.slavikjunior.arrays

class ContainsDuplicateSolution {

    //    Given an integer array nums,
    //    return true if any value appears at least twice in the array, and return false if every element is distinct.
    companion object {

        fun containsDuplicate(nums: IntArray): Boolean {
            nums.sort()

            var lastValue = nums.first()
            for (index in 1 until nums.size) {
                val current = nums[index]
                if (current == lastValue) return false
                lastValue = current
            }

            return true
        }
    }
}

fun main() {
    println(ContainsDuplicateSolution.containsDuplicate(intArrayOf(1, 2, 3)))
}
