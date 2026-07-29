package com.github.slavikjunior.sliding

import kotlin.math.max

class LongestSubstringWithoutRepeatingCharactersSolution {

    companion object {

        fun lengthOfLongestSubstring(s: String): Int {
            var maxLength = 0
            var left = 0
            val map = hashMapOf<Char, Int>()

            for (right in s.indices) {
                val char = s[right]
                if (map.containsKey(char)) {
                    left = max(left, map[char]!! + 1)
                }
                map[char] = right
                maxLength = max(maxLength, right - left + 1)
            }

            return maxLength
        }
    }
}

fun main() {

    println(LongestSubstringWithoutRepeatingCharactersSolution.lengthOfLongestSubstring("abcabcbb"))
}
