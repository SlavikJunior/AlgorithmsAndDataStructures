package com.github.slavikjunior.strings

class ValidAnagramSolution {

    companion object {

        fun isAnagram(s: String, t: String): Boolean {
            if (s.length != t.length) return false

            val map = hashMapOf<Char, Int>()

            for (i in s.indices) {
                val charS = s[i]
                val charT = t[i]

                map[charS] = map.getOrDefault(charS, 0) + 1
                map[charT] = map.getOrDefault(charT, 0) - 1
            }

            return map.values.all { it == 0 }
        }
    }
}

fun main() {

    println(ValidAnagramSolution.isAnagram("slava", "avasl"))
}
