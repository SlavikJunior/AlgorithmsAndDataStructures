package com.github.slavikjunior.integers

class Solution {

    companion object {

        fun minElement(nums: IntArray): Int {
            return replaceElements(nums).min()
        }

        fun replaceElements(nums: IntArray): IntArray {
            return nums.map {
                it.toSumOfDigits()
            }.toIntArray()
        }
    }
}

fun main() {

    val test = intArrayOf(1123, 23, 34, 45)
    println(Solution.minElement(test))
}

fun Int.toSumOfDigits(): Int =
    this.toString().toCharArray().fold(0) { acc, ch ->
        acc + ch.digitToInt()
    }
