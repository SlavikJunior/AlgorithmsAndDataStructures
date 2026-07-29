package com.github.slavikjunior.arrays

class ProductOfArrayExceptSelfSolution {

    companion object {

        fun productExceptSelf(nums: IntArray): IntArray {
            val res = IntArray(nums.size)

            val leftProducts = IntArray(nums.size)
            val rightProducts = IntArray(nums.size)

            var leftProduct = 1
            for (i in nums.indices) {
                leftProducts[i] = leftProduct
                leftProduct *= nums[i]
            }

            var rightProduct = 1
            for (i in nums.lastIndex downTo 0) {
                rightProducts[i] = rightProduct
                rightProduct *= nums[i]
            }

            // leftProducts     =   [1, 1, 2, 6]
            // rightProducts    =   [24, 12, 4, 1]
            // res              =   [24, 12, 8 , 6]

            for (i in res.indices) {
                res[i] = leftProducts[i] * rightProducts[i]
            }

            return res
        }
    }
}

fun main() {
    println(ProductOfArrayExceptSelfSolution.productExceptSelf(intArrayOf(-1,1,0,-3,3)).toList())
}
