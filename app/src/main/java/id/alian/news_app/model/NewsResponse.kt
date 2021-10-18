package id.alian.news_app.model

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)