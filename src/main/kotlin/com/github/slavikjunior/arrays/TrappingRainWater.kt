package com.github.slavikjunior.arrays

class TrappingRainWaterSolution {

    companion object {

        fun trap(height: IntArray): Int {
            if (height.isEmpty()) return 0

            var left = 0
            var right = height.lastIndex

            var maxLeft = 0
            var maxRight = 0
            var totalWater = 0

            while (left < right) {
                if (height[left] < height[right]) {

                    if (height[left] >= maxLeft) maxLeft = height[left]
                    else totalWater += maxLeft - height[left]
                    left++

                } else {

                    if (height[right] >= maxRight) maxRight = height[right]
                    else totalWater += maxRight - height[right]
                    right--

                }
            }

            return totalWater
        }
    }
}

fun main() {

    println(TrappingRainWaterSolution.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
}
