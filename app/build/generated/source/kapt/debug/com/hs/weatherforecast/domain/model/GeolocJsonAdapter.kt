// Code generated by moshi-kotlin-codegen. Do not edit.
package com.hs.weatherforecast.domain.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class GeolocJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Geoloc>() {
  private val options: JsonReader.Options = JsonReader.Options.of("lng", "lat")

  private val nullableDoubleAdapter: JsonAdapter<Double?> =
      moshi.adapter(Double::class.javaObjectType, emptySet(), "lng")

  @Volatile
  private var constructorRef: Constructor<Geoloc>? = null

  override fun toString(): String = buildString(28) {
      append("GeneratedJsonAdapter(").append("Geoloc").append(')') }

  override fun fromJson(reader: JsonReader): Geoloc {
    var lng: Double? = null
    var lat: Double? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          lng = nullableDoubleAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          lat = nullableDoubleAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    @Suppress("UNCHECKED_CAST")
    val localConstructor: Constructor<Geoloc> = this.constructorRef ?:
        Geoloc::class.java.getDeclaredConstructor(Double::class.javaObjectType,
        Double::class.javaObjectType, Int::class.javaPrimitiveType,
        Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }
    return localConstructor.newInstance(
        lng,
        lat,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: Geoloc?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("lng")
    nullableDoubleAdapter.toJson(writer, value.lng)
    writer.name("lat")
    nullableDoubleAdapter.toJson(writer, value.lat)
    writer.endObject()
  }
}