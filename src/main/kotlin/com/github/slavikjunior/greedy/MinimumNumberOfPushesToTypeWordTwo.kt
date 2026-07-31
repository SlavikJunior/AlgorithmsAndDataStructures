package com.github.slavikjunior.greedy

class MinimumNumberOfPushesToTypeWordTwoSolution {

    companion object {

        fun minimumPushes(word: String): Int {
            val map = mutableMapOf<Char, Int>()
            word.toCharArray().forEach { char ->
                map[char] = map.getOrDefault(char, 0) + 1
            }

            var result = 0
            map.entries.sortedByDescending { it.value }.forEachIndexed { index, entry ->
                when  {
                    index < 8 -> result += entry.value
                    index in 8..15 -> result += entry.value * 2
                    index in 16..23 -> result += entry.value * 3
                    index in 24..25 -> result += entry.value * 4
                }
            }

            return result
        }
    }
}

fun main() {

    println(MinimumNumberOfPushesToTypeWordTwoSolution.minimumPushes("aabbccddeeffgghhiiiiii"))
}
