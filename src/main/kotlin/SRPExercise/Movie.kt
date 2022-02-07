package SRPExercise

data class Movie(
    val title: String,
    val genre: String,
    val director: String) {
    override fun toString(): String {
        return "Movie [title=$title, genre=$genre, director=$director]"
    }
}