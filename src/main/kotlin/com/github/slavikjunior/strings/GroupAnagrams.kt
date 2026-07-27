package com.github.slavikjunior.strings

class GroupAnagramsSolution {

//    Given an array of strings strs, group the anagrams together. You can return the answer in any order.

    companion object {

        fun groupAnagrams(strs: Array<String>) = strs.groupBy { it.uniqueAnagramKey() }.values.toList()

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
