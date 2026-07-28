package com.github.slavikjunior.strings

class SmallestPalindromicRearrangementSolution {

    companion object {
        fun smallestPalindrome(s: String): String {
            val counts = IntArray(26)
            for (char in s) {
                counts[char - 'a']++
            }

            var middleChar = ""
            var oddCount = 0

            for (i in 0 until 26) {
                if (counts[i] % 2 != 0) {
                    oddCount++
                    middleChar = (i + 'a'.code).toChar().toString()
                }
            }

            if (oddCount > 1) return ""

            val leftHalf = buildString {
                for (i in 0 until 26) {
                    if (counts[i] > 0) {
                        val char = (i + 'a'.code).toChar()
                        val countInHalf = counts[i] / 2
                        repeat(countInHalf) {
                            append(char)
                        }
                    }
                }
            }

            return leftHalf + middleChar + leftHalf.reversed()
        }
    }
}

fun main() {

    println(SmallestPalindromicRearrangementSolution.smallestPalindrome("yey"))
}
