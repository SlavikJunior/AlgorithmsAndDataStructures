package com.github.slavikjunior.greedy

class MinimumNumberOfPushesToTypeWordTwoSolution {

    companion object {

        fun minimumPushes(word: String): Int {
            val array = IntArray(26)

            word.forEach { char ->
                array[char - 'a']++
            }

            var result = 0
            array.sortedDescending().forEachIndexed { index, count ->
                if (count == 0) return result

                result += count * ((index / 8) + 1)
            }

            return result
        }
    }
}

fun main() {

    println(MinimumNumberOfPushesToTypeWordTwoSolution.minimumPushes("aabbccddeeffgghhiiiiii"))
}
