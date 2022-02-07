package edu.solid.ocp

import java.util.ArrayList

class PrimeNumberGenerator {
    fun primes(limit: Int): List<Int> {
        val primes: MutableList<Int> = ArrayList()
        for (i in 2 until limit) {
            if (isPrime(i)) {
                primes.add(i)
            }
        }
        return primes
    }

    private fun isPrime(candidate: Int): Boolean {
        for (i in 2 until candidate) {
            if (candidate % i == 0) {
                return false
            }
        }
        return true
    }
}