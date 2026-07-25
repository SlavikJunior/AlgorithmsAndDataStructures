package com.github.slavikjunior.arrays

class SquaresOfSortedArraySolution {

    companion object {

        fun sortedSquares(nums: IntArray): IntArray {
            return nums.map { it * it }.sorted().toIntArray()
        }
    }
}

fun main() {

    println(SquaresOfSortedArraySolution.sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).toList())
}
