package com.hs.weatherforecast.domain.model;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010#\u001a\u00020\u0014H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/hs/weatherforecast/domain/model/CurrentWeatherResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/hs/weatherforecast/domain/model/CurrentWeatherResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "nullableCloudsAdapter", "Lcom/hs/weatherforecast/domain/model/Clouds;", "nullableCoordAdapter", "Lcom/hs/weatherforecast/domain/model/Coord;", "nullableIntAdapter", "", "nullableListOfNullableWeatherItemAdapter", "", "Lcom/hs/weatherforecast/domain/model/WeatherItem;", "nullableMainAdapter", "Lcom/hs/weatherforecast/domain/model/Main;", "nullableStringAdapter", "", "nullableSysAdapter", "Lcom/hs/weatherforecast/domain/model/Sys;", "nullableWindAdapter", "Lcom/hs/weatherforecast/domain/model/Wind;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "app_debug"})
public final class CurrentWeatherResponseJsonAdapter extends com.squareup.moshi.JsonAdapter<com.hs.weatherforecast.domain.model.CurrentWeatherResponse> {
    private final com.squareup.moshi.JsonReader.Options options = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> nullableIntAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.hs.weatherforecast.domain.model.Main> nullableMainAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.hs.weatherforecast.domain.model.Clouds> nullableCloudsAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.hs.weatherforecast.domain.model.Sys> nullableSysAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.hs.weatherforecast.domain.model.Coord> nullableCoordAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.hs.weatherforecast.domain.model.WeatherItem>> nullableListOfNullableWeatherItemAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> nullableStringAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.hs.weatherforecast.domain.model.Wind> nullableWindAdapter = null;
    private volatile java.lang.reflect.Constructor<com.hs.weatherforecast.domain.model.CurrentWeatherResponse> constructorRef;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hs.weatherforecast.domain.model.CurrentWeatherResponse fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.domain.model.CurrentWeatherResponse value) {
    }
    
    public CurrentWeatherResponseJsonAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}