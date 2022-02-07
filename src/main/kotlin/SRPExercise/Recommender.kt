package SRPExercise

import java.util.ArrayList

interface Recommender {
    fun process(client: Client): List<Movie> {
        val recommended: MutableList<Movie> = ArrayList<Movie>()
        client.favorites.forEach { recommended.addAll(BBDD.MOVIES_BY_DIRECTOR[it.director]!!) }
        return recommended.filter { !client.favorites.contains(it) }
    }

    fun recommends(client: Client): String
}