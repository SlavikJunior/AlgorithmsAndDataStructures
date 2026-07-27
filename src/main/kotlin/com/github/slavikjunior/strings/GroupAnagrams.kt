package com.github.slavikjunior.strings

class GroupAnagramsSolution {

//    Given an array of strings strs, group the anagrams together. You can return the answer in any order.

    companion object {

        fun groupAnagrams(strs: Array<String>): List<List<String>> {
            if (strs.isEmpty()) return emptyList()

            val map = hashMapOf<String, List<String>>()

            strs.forEach { current ->
                val uniqueAnagramKey = current.uniqueAnagramKey()

                val anagrams = map.getOrDefault(uniqueAnagramKey, listOf())
                val mutableAnagrams = anagrams.toMutableList()
                mutableAnagrams += current

                map[uniqueAnagramKey] = mutableAnagrams
            }

            return map.values.toList()
        }

        private fun String.uniqueAnagramKey(): String {
            val charArray = this.toCharArray()
            charArray.sort()
            return String(charArray)
        }
    }
}

fun main() {

    println(GroupAnagramsSolution.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
}
