// Code generated by moshi-kotlin-codegen. Do not edit.
package com.hs.weatherforecast.domain.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class HitsItemJsonAdapter(
  moshi: Moshi
) : JsonAdapter<HitsItem>() {
  private val options: JsonReader.Options = JsonReader.Options.of("country", "country_code",
      "is_city", "is_country", "administrative", "admin_level", "postcode", "county", "_geoloc",
      "importance", "objectID", "is_suburb", "locale_names")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "country")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "isCity")

  private val nullableListOfNullableStringAdapter: JsonAdapter<List<String?>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, String::class.java), emptySet(),
      "administrative")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "adminLevel")

  private val nullableGeolocAdapter: JsonAdapter<Geoloc?> = moshi.adapter(Geoloc::class.java,
      emptySet(), "geoloc")

  @Volatile
  private var constructorRef: Constructor<HitsItem>? = null

  override fun toString(): String = buildString(30) {
      append("GeneratedJsonAdapter(").append("HitsItem").append(')') }

  override fun fromJson(reader: JsonReader): HitsItem {
    var country: String? = null
    var countryCode: String? = null
    var isCity: Boolean? = null
    var isCountry: Boolean? = null
    var administrative: List<String?>? = null
    var adminLevel: Int? = null
    var postcode: List<String?>? = null
    var county: List<String?>? = null
    var geoloc: Geoloc? = null
    var importance: Int? = null
    var objectID: String? = null
    var isSuburb: Boolean? = null
    var localeNames: List<String?>? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          country = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          countryCode = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          isCity = nullableBooleanAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          isCountry = nullableBooleanAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        4 -> {
          administrative = nullableListOfNullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 4).inv()
          mask0 = mask0 and 0xffffffef.toInt()
        }
        5 -> {
          adminLevel = nullableIntAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 5).inv()
          mask0 = mask0 and 0xffffffdf.toInt()
        }
        6 -> {
          postcode = nullableListOfNullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 6).inv()
          mask0 = mask0 and 0xffffffbf.toInt()
        }
        7 -> {
          county = nullableListOfNullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 7).inv()
          mask0 = mask0 and 0xffffff7f.toInt()
        }
        8 -> {
          geoloc = nullableGeolocAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 8).inv()
          mask0 = mask0 and 0xfffffeff.toInt()
        }
        9 -> {
          importance = nullableIntAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 9).inv()
          mask0 = mask0 and 0xfffffdff.toInt()
        }
        10 -> {
          objectID = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 10).inv()
          mask0 = mask0 and 0xfffffbff.toInt()
        }
        11 -> {
          isSuburb = nullableBooleanAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 11).inv()
          mask0 = mask0 and 0xfffff7ff.toInt()
        }
        12 -> {
          localeNames = nullableListOfNullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 12).inv()
          mask0 = mask0 and 0xffffefff.toInt()
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
    val localConstructor: Constructor<HitsItem> = this.constructorRef ?:
        HitsItem::class.java.getDeclaredConstructor(String::class.java, String::class.java,
        Boolean::class.javaObjectType, Boolean::class.javaObjectType, List::class.java,
        Int::class.javaObjectType, List::class.java, List::class.java, Geoloc::class.java,
        Int::class.javaObjectType, String::class.java, Boolean::class.javaObjectType,
        List::class.java, Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
        this.constructorRef = it }
    return localConstructor.newInstance(
        country,
        countryCode,
        isCity,
        isCountry,
        administrative,
        adminLevel,
        postcode,
        county,
        geoloc,
        importance,
        objectID,
        isSuburb,
        localeNames,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: HitsItem?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("country")
    nullableStringAdapter.toJson(writer, value.country)
    writer.name("country_code")
    nullableStringAdapter.toJson(writer, value.countryCode)
    writer.name("is_city")
    nullableBooleanAdapter.toJson(writer, value.isCity)
    writer.name("is_country")
    nullableBooleanAdapter.toJson(writer, value.isCountry)
    writer.name("administrative")
    nullableListOfNullableStringAdapter.toJson(writer, value.administrative)
    writer.name("admin_level")
    nullableIntAdapter.toJson(writer, value.adminLevel)
    writer.name("postcode")
    nullableListOfNullableStringAdapter.toJson(writer, value.postcode)
    writer.name("county")
    nullableListOfNullableStringAdapter.toJson(writer, value.county)
    writer.name("_geoloc")
    nullableGeolocAdapter.toJson(writer, value.geoloc)
    writer.name("importance")
    nullableIntAdapter.toJson(writer, value.importance)
    writer.name("objectID")
    nullableStringAdapter.toJson(writer, value.objectID)
    writer.name("is_suburb")
    nullableBooleanAdapter.toJson(writer, value.isSuburb)
    writer.name("locale_names")
    nullableListOfNullableStringAdapter.toJson(writer, value.localeNames)
    writer.endObject()
  }
}
