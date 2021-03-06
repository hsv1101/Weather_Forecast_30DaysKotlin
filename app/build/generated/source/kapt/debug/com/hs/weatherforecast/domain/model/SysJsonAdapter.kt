// Code generated by moshi-kotlin-codegen. Do not edit.
package com.hs.weatherforecast.domain.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class SysJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Sys>() {
  private val options: JsonReader.Options = JsonReader.Options.of("pod")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "pod")

  override fun toString(): String = buildString(25) {
      append("GeneratedJsonAdapter(").append("Sys").append(')') }

  override fun fromJson(reader: JsonReader): Sys {
    var pod: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> pod = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Sys(
        pod = pod
    )
  }

  override fun toJson(writer: JsonWriter, value: Sys?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("pod")
    nullableStringAdapter.toJson(writer, value.pod)
    writer.endObject()
  }
}
