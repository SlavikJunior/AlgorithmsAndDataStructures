package com.github.slavikjunior.arrays

class ContainsDuplicateSolution {

    //    Given an integer array nums,
    //    return true if any value appears at least twice in the array, and return false if every element is distinct.
    companion object {

        fun containsDuplicate(nums: IntArray): Boolean {
            val map = hashMapOf<Int, Byte>()

            nums.forEach { current ->
                map[current]?.let { oldValue -> return true }

                map[current] = 1.toByte()
            }

            return false
        }
    }
}

fun main() {
    println(ContainsDuplicateSolution.containsDuplicate(intArrayOf(1, 2, 3, 4, 5, 6)))
}
