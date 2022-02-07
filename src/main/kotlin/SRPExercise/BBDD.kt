package SRPExercise

import java.util.*
import java.util.stream.Collectors

object BBDD {
    private const val GENRE_FANTASY = "fantasy"
    private const val GENRE_WAR = "war"
    const val DIRECTOR_SPIELBERG = "Spielberg"

    @JvmField
    val ET: Movie = Movie("ET", GENRE_FANTASY, DIRECTOR_SPIELBERG)
    val SAVING_RYAN: Movie = Movie("Saving Private Ryan", GENRE_WAR, DIRECTOR_SPIELBERG)
    val ALL: Array<Movie> = arrayOf(ET, SAVING_RYAN)
    @JvmField
    val JOHN: Client = Client("JOHN", listOf(ET))
    var MOVIES_BY_DIRECTOR: Map<String, List<Movie>> = Arrays.stream(ALL)
        .collect(Collectors.groupingBy(Movie::director))
}