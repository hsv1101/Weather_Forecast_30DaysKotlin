// Code generated by moshi-kotlin-codegen. Do not edit.
package com.hs.weatherforecast.domain.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class WeatherItemJsonAdapter(
  moshi: Moshi
) : JsonAdapter<WeatherItem>() {
  private val options: JsonReader.Options = JsonReader.Options.of("icon", "description", "main",
      "id")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "icon")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "id")

  override fun toString(): String = buildString(33) {
      append("GeneratedJsonAdapter(").append("WeatherItem").append(')') }

  override fun fromJson(reader: JsonReader): WeatherItem {
    var icon: String? = null
    var description: String? = null
    var main: String? = null
    var id: Int? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> icon = nullableStringAdapter.fromJson(reader)
        1 -> description = nullableStringAdapter.fromJson(reader)
        2 -> main = nullableStringAdapter.fromJson(reader)
        3 -> id = nullableIntAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return WeatherItem(
        icon = icon,
        description = description,
        main = main,
        id = id
    )
  }

  override fun toJson(writer: JsonWriter, value: WeatherItem?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("icon")
    nullableStringAdapter.toJson(writer, value.icon)
    writer.name("description")
    nullableStringAdapter.toJson(writer, value.description)
    writer.name("main")
    nullableStringAdapter.toJson(writer, value.main)
    writer.name("id")
    nullableIntAdapter.toJson(writer, value.id)
    writer.endObject()
  }
}
