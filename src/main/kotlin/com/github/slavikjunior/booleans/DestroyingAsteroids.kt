package com.github.slavikjunior.booleans


class DestroyingAsteroids {

    companion object {
        fun asteroidsDestroyed(mass: Int, asteroids: IntArray): Boolean {
            asteroids.sort()
            var currentMass = mass.toLong()
            for (asteroid in asteroids) {
                if (currentMass < asteroid) return false
                currentMass += asteroid
            }
            return true
        }
    }
}

fun main() {
    println(
        DestroyingAsteroids.asteroidsDestroyed(
            mass = 5,
            asteroids = intArrayOf(
                4,9,23,4
            )
        )
    )
}