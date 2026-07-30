package com.github.slavikjunior.greedy

class MinimumNumberOfPushesToTypeWordOneSolution {

    companion object {

        fun minimumPushes(word: String): Int {
            val n = word.length
            return when {
                n <= 8 -> n
                n <= 16 -> 8 + (n - 8) * 2
                n <= 24 -> 24 + (n - 16) * 3
                else -> 48 + (n - 24) * 4
            }
        }
    }
}

fun main() {
    println(MinimumNumberOfPushesToTypeWordOneSolution.minimumPushes("qwertyuiopasdfghjklzxcvbnm"))
}
