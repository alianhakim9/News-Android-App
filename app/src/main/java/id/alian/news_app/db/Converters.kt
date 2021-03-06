package id.alian.news_app.db

import androidx.room.TypeConverter
import id.alian.news_app.model.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}