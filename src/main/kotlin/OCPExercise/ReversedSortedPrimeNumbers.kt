package OCPExercise

import edu.solid.ocp.PrimeNumberGenerator

class ReversedSortedPrimeNumbers: SortedPrimeNumbers {
    override fun getSortedPrimeNumbers(limit: Int): List<Int> =
        PrimeNumberGenerator().primes(limit).reversed()

}