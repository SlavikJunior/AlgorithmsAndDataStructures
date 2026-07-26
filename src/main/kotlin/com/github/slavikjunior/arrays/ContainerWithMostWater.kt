package com.github.slavikjunior.arrays

import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWaterSolution {

    companion object {

        fun maxArea(height: IntArray): Int {
            var leftPointer = 0
            var rightPointer = height.lastIndex

            var maxSquare = 0

            while (leftPointer < rightPointer) {
                val leftValue = height[leftPointer]
                val rightValue = height[rightPointer]

                val currentWidth = rightPointer - leftPointer
                val currentArea = min(leftValue, rightValue) * currentWidth
                maxSquare = max(maxSquare, currentArea)

                if (leftValue < rightValue) leftPointer++
                else rightPointer--
            }

            return maxSquare
        }
    }
}

fun main() {

    println(ContainerWithMostWaterSolution.maxArea(intArrayOf(1, 1)))
}
