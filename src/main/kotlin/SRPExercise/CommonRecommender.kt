package SRPExercise

class CommonRecommender: Recommender {
    override fun recommends(client: Client): String {
        return super.process(client).joinToString(",")
    }
}