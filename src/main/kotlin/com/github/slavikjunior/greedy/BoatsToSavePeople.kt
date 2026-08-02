package com.github.slavikjunior.greedy

class BoatsToSavePeopleSolution {

    companion object {

        fun numRescueBoats(people: IntArray, limit: Int): Int {
            people.sort()

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
