package com.github.slavikjunior.strings

import kotlin.math.max

class LongestSubstringWithoutRepeatingCharactersSolution {
    companion object {
        fun lengthOfLongestSubstring(s: String): Int {
            var leftPointer = 0
            var maxLength = 0
            val map = hashMapOf<Char, Int>()

            for (rightPointer in s.indices) {
                val currentSymbol = s[rightPointer]

                map[currentSymbol]?.let { lastIndex ->
                    if (lastIndex >= leftPointer) {
                        leftPointer = lastIndex + 1
                    }
                }

                map[currentSymbol] = rightPointer

                maxLength = max(maxLength, rightPointer - leftPointer + 1)
            }

            return maxLength
        }
    }
}

fun main() {

    println(LongestSubstringWithoutRepeatingCharactersSolution.lengthOfLongestSubstring("abcdefaaa"))
}