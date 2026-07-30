package com.github.slavikjunior.hashtables

class TopKFrequentElementsSolution {

    companion object {

        fun topKFrequent(nums: IntArray, k: Int): IntArray {
            val map = hashMapOf<Int, Int>()

            nums.forEach { current ->
                map[current] = map.getOrDefault(current, 0) + 1
            }

            return map.entries
                .sortedByDescending { it.value }
                .take(k)
                .map { it.key }
                .toIntArray()
        }
    }
}

fun main() {

    println(
        TopKFrequentElementsSolution.topKFrequent(
            nums = intArrayOf(1, 2, 1, 2, 1, 2, 3, 1, 3, 2),
            k = 2
        ).toList()
    )
}
