package SRPExercise


class CSVRecommender: Recommender {

    override fun recommends(client: Client): String {
            return super.process(client)
            .map { "${it.title},${it.director},${it.genre}" }
            .joinToString("\n")
    }
}