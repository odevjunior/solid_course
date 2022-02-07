package OCPExercise

import edu.solid.ocp.PrimeNumberGenerator

class NormalSortedPrimeNumbers: SortedPrimeNumbers {
    override fun getSortedPrimeNumbers(limit: Int): List<Int> =
        PrimeNumberGenerator().primes(limit)

}