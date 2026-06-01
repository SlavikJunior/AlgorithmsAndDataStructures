package com.github.slavikjunior.arrays

class MinimumCostOfBuyingCandies {

    companion object {

        fun minimumCost(cost: IntArray): Int {
            if (cost.isEmpty()) return 0

            if (cost.size == 1) { return cost[0] }

            if (cost.size == 2) { return cost[0] + cost[1] }

            cost.sortDescending()
            var sum = 0
            for (i in 0 until cost.size - 2 step 3) {
                sum += cost[i]
                sum += cost[i + 1]
            }
            if (cost.size % 3 == 0) {
                sum += 0
            } else if (cost.size % 3 == 1) {
                   sum += cost.last()
            } else {
                sum += cost[cost.lastIndex - 1]
                sum += cost.last()
            }
            return sum
        }
    }
}

fun main() {
    println(MinimumCostOfBuyingCandies.minimumCost(intArrayOf(5,5)))
}
