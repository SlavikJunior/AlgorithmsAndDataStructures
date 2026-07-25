package com.github.slavikjunior.arrays

import kotlin.math.absoluteValue

class SquaresOfSortedArraySolution {

    companion object {

        fun sortedSquares(nums: IntArray): IntArray {
            val result = IntArray(nums.size)
            var resultInsertionIndex = result.lastIndex

            var leftIndex = 0
            var rightIndex = nums.lastIndex

            while(leftIndex <= rightIndex) {
                val leftElem = nums[leftIndex]
                val rightElem = nums[rightIndex]

                if (leftElem.absoluteValue > rightElem.absoluteValue) {
                    result[resultInsertionIndex] = leftElem * leftElem
                    leftIndex++
                }
                else {
                    result[resultInsertionIndex] = rightElem * rightElem
                    rightIndex--
                }

                resultInsertionIndex--
            }

            return result
        }
    }
}

fun main() {

    println(SquaresOfSortedArraySolution.sortedSquares(intArrayOf(-7,-3,2,3,11)).toList())
}
