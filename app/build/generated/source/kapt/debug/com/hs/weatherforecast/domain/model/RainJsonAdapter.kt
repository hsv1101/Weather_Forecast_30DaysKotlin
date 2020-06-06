// Code generated by moshi-kotlin-codegen. Do not edit.
package com.hs.weatherforecast.domain.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class RainJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Rain>() {
  private val options: JsonReader.Options = JsonReader.Options.of("3h")

  private val nullableDoubleAdapter: JsonAdapter<Double?> =
      moshi.adapter(Double::class.javaObjectType, emptySet(), "jsonMember3h")

  override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("Rain").append(')') }

  override fun fromJson(reader: JsonReader): Rain {
    var jsonMember3h: Double? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> jsonMember3h = nullableDoubleAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Rain(
        jsonMember3h = jsonMember3h
    )
  }

  override fun toJson(writer: JsonWriter, value: Rain?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("3h")
    nullableDoubleAdapter.toJson(writer, value.jsonMember3h)
    writer.endObject()
  }
}
