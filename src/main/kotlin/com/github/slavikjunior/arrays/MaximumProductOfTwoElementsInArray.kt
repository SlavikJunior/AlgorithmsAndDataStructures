package com.github.slavikjunior.arrays

class MaximumProductOfTwoElementsInArraySolution {

    companion object {

        fun maxProduct(nums: IntArray): Int {
            nums.sort()
            return (nums.last() - 1) * (nums.preLast() - 1)
        }

        private fun IntArray.preLast(): Int = this[this.lastIndex - 1]
    }
}

fun main() {

    println(MaximumProductOfTwoElementsInArraySolution.maxProduct(intArrayOf(3,4,5,2)))
}
