package com.github.slavikjunior.greedy

class BoatsToSavePeopleSolution {

    companion object {

        fun numRescueBoats(people: IntArray, limit: Int): Int {
            people.countSort(limit)

            var count = 0

            var leftPointer = 0
            var rightPointer = people.lastIndex

            while(leftPointer <= rightPointer) {
                val leftPeople = people[leftPointer]
                val rightPeople = people[rightPointer]

                val sum = leftPeople + rightPeople
                if (sum <= limit) {
                    leftPointer++
                    rightPointer--
                } else rightPointer--

                count++
            }

            return count
        }

        private fun IntArray.countSort(limit: Int) {
            val countArray = IntArray(limit + 1)

            for (weight in this) {
                countArray[weight]++
            }

            var originalIndex = 0
            for (weight in 0..limit) {
                while (countArray[weight] > 0) {
                    this[originalIndex] = weight
                    originalIndex++
                    countArray[weight]--
                }
            }
        }
    }
}

fun main() {

    println(
        BoatsToSavePeopleSolution.numRescueBoats(
            people = intArrayOf(3,2,2,1),
            limit = 3
        )
    )
}
