package edu.solid.srp

import SRPExercise.CommonRecommender
import SRPExercise.BBDD
import SRPExercise.CSVRecommender
import org.junit.Assert
import org.junit.Test

class TestCommonRecommenderSRP {

    private val csvRecommender = CSVRecommender()
    private val commonRecommender = CommonRecommender()
    @Test
    fun basic_test() {
        val recommenations = commonRecommender.recommends(BBDD.JOHN)
        Assert.assertFalse(BBDD.ET.toString() in recommenations)
    }

    @Test
    fun test_format() {
        val csv = csvRecommender.recommends(BBDD.JOHN)
        val expected = "Saving Private Ryan,Spielberg,war"
        Assert.assertEquals(expected, csv)
    }
}