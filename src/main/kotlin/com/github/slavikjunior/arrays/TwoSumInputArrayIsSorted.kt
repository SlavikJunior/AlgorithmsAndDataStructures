package com.github.slavikjunior.arrays

class TwoSumInputArrayIsSortedSolution {

    companion object {

        fun twoSum(numbers: IntArray, target: Int): IntArray {
            var leftIndex = 0
            var rightIndex = numbers.lastIndex

            var array = intArrayOf()

            while(leftIndex < rightIndex) {
                val sum = numbers[leftIndex] + numbers[rightIndex]

                if (sum == target) {
                    array = intArrayOf(leftIndex + 1, rightIndex + 1); break
                }
                else if (sum < target) leftIndex++
                else rightIndex--
            }

            return array
        }
    }
}

fun main() {
    println(TwoSumInputArrayIsSortedSolution.twoSum(intArrayOf(-1,0), -1).toList())
}
