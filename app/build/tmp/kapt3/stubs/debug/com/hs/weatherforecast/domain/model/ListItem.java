package com.hs.weatherforecast.domain.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0012\b\u0001\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0013\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0082\u0001\u00102\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\b\u0003\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0002\u00103J\t\u00104\u001a\u000205H\u00d6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u00d6\u0003J\u0006\u0010:\u001a\u000205J\u0012\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u0003H\u0002J\b\u0010>\u001a\u0004\u0018\u00010\u0007J\u0006\u0010?\u001a\u000205J\u0006\u0010@\u001a\u00020\u0007J\b\u0010A\u001a\u0004\u0018\u00010\fJ\t\u0010B\u001a\u000205H\u00d6\u0001J\t\u0010C\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000205H\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006I"}, d2 = {"Lcom/hs/weatherforecast/domain/model/ListItem;", "Landroid/os/Parcelable;", "dt", "", "rain", "Lcom/hs/weatherforecast/domain/model/Rain;", "dtTxt", "", "snow", "Lcom/hs/weatherforecast/domain/model/Snow;", "weather", "", "Lcom/hs/weatherforecast/domain/model/WeatherItem;", "main", "Lcom/hs/weatherforecast/domain/model/Main;", "clouds", "Lcom/hs/weatherforecast/domain/model/Clouds;", "sys", "Lcom/hs/weatherforecast/domain/model/Sys;", "wind", "Lcom/hs/weatherforecast/domain/model/Wind;", "(Ljava/lang/Long;Lcom/hs/weatherforecast/domain/model/Rain;Ljava/lang/String;Lcom/hs/weatherforecast/domain/model/Snow;Ljava/util/List;Lcom/hs/weatherforecast/domain/model/Main;Lcom/hs/weatherforecast/domain/model/Clouds;Lcom/hs/weatherforecast/domain/model/Sys;Lcom/hs/weatherforecast/domain/model/Wind;)V", "getClouds", "()Lcom/hs/weatherforecast/domain/model/Clouds;", "getDt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDtTxt", "()Ljava/lang/String;", "getMain", "()Lcom/hs/weatherforecast/domain/model/Main;", "getRain", "()Lcom/hs/weatherforecast/domain/model/Rain;", "getSnow", "()Lcom/hs/weatherforecast/domain/model/Snow;", "getSys", "()Lcom/hs/weatherforecast/domain/model/Sys;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/hs/weatherforecast/domain/model/Wind;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Lcom/hs/weatherforecast/domain/model/Rain;Ljava/lang/String;Lcom/hs/weatherforecast/domain/model/Snow;Ljava/util/List;Lcom/hs/weatherforecast/domain/model/Main;Lcom/hs/weatherforecast/domain/model/Clouds;Lcom/hs/weatherforecast/domain/model/Sys;Lcom/hs/weatherforecast/domain/model/Wind;)Lcom/hs/weatherforecast/domain/model/ListItem;", "describeContents", "", "equals", "", "other", "", "getColor", "getDateTime", "Lorg/threeten/bp/DayOfWeek;", "s", "getDay", "getHourColor", "getHourOfDay", "getWeatherItem", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ListItem implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long dt = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Rain rain = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dtTxt = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Snow snow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Main main = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Clouds clouds = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Sys sys = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Wind wind = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.WeatherItem getWeatherItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDay() {
        return null;
    }
    
    private final org.threeten.bp.DayOfWeek getDateTime(long s) {
        return null;
    }
    
    public final int getColor() {
        return 0;
    }
    
    public final int getHourColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHourOfDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Rain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Snow getSnow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Wind getWind() {
        return null;
    }
    
    public ListItem(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Long dt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "rain")
    com.hs.weatherforecast.domain.model.Rain rain, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "snow")
    com.hs.weatherforecast.domain.model.Snow snow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    com.hs.weatherforecast.domain.model.Main main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clouds")
    com.hs.weatherforecast.domain.model.Clouds clouds, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    com.hs.weatherforecast.domain.model.Sys sys, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    com.hs.weatherforecast.domain.model.Wind wind) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Rain component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Snow component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Main component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Clouds component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Sys component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Wind component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hs.weatherforecast.domain.model.ListItem copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Long dt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "rain")
    com.hs.weatherforecast.domain.model.Rain rain, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "snow")
    com.hs.weatherforecast.domain.model.Snow snow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    com.hs.weatherforecast.domain.model.Main main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clouds")
    com.hs.weatherforecast.domain.model.Clouds clouds, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    com.hs.weatherforecast.domain.model.Sys sys, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    com.hs.weatherforecast.domain.model.Wind wind) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}