package edu.solid.ocp

import OCPExercise.NormalSortedPrimeNumbers
import OCPExercise.ReversedSortedPrimeNumbers
import java.util.Arrays
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class PrimeNumberGeneratorTests {
    @Test
    fun test_natural_order() {
        val generador = NormalSortedPrimeNumbers()
        val expected = listOf(2, 3, 5, 7, 11, 13)
        Assert.assertThat(generador.getSortedPrimeNumbers(15), CoreMatchers.`is`(expected))
    }

    @Test
    fun test_reverse_order() {
        val generador = ReversedSortedPrimeNumbers()
        val expected = listOf(13, 11, 7, 5, 3, 2)
        Assert.assertThat(generador.getSortedPrimeNumbers(15), CoreMatchers.`is`(expected))
    }
}