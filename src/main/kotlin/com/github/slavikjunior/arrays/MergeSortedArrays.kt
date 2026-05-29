package com.github.slavikjunior.arrays

class Solution {

    companion object {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
            var i1 = m - 1
            var i2 = n - 1
            for(j in n + m - 1 downTo 0) {
                if (i1 >= 0 && i2 >= 0) {
                    if (nums1[i1] < nums2[i2]) {
                        nums1[j] = nums2[i2]
                        i2 --
                    } else {
                        nums1[j] = nums1[i1]
                        i1 --
                    }
                } else if (i2 < 0) {
                    nums1[j] = nums1[i1]
                    i1 --
                } else if (i1 < 0) {
                    nums1[j] = nums2[i2]
                    i2 --
                }
            }
        }
    }
}

fun main() {
    val nums1: IntArray = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2: IntArray = intArrayOf(2, 5, 6)

    println(nums1.contentToString())
    Solution.merge(nums1, 3, nums2, 3)
    println(nums1.contentToString())
}