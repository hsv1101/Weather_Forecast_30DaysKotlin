package com.hs.weatherforecast.domain.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00a9\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\b\u0003\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00102\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00109\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0013\u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u00b2\u0001\u0010<\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\b\u0003\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u00d6\u0003J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\t\u0010D\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b)\u0010\u001eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u001b\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u0006J"}, d2 = {"Lcom/hs/weatherforecast/domain/model/CurrentWeatherResponse;", "Landroid/os/Parcelable;", "visibility", "", "timezone", "main", "Lcom/hs/weatherforecast/domain/model/Main;", "clouds", "Lcom/hs/weatherforecast/domain/model/Clouds;", "sys", "Lcom/hs/weatherforecast/domain/model/Sys;", "dt", "coord", "Lcom/hs/weatherforecast/domain/model/Coord;", "weather", "", "Lcom/hs/weatherforecast/domain/model/WeatherItem;", "name", "", "cod", "id", "base", "wind", "Lcom/hs/weatherforecast/domain/model/Wind;", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/hs/weatherforecast/domain/model/Main;Lcom/hs/weatherforecast/domain/model/Clouds;Lcom/hs/weatherforecast/domain/model/Sys;Ljava/lang/Integer;Lcom/hs/weatherforecast/domain/model/Coord;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/hs/weatherforecast/domain/model/Wind;)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/hs/weatherforecast/domain/model/Clouds;", "getCod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoord", "()Lcom/hs/weatherforecast/domain/model/Coord;", "getDt", "getId", "getMain", "()Lcom/hs/weatherforecast/domain/model/Main;", "getName", "getSys", "()Lcom/hs/weatherforecast/domain/model/Sys;", "getTimezone", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/hs/weatherforecast/domain/model/Wind;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/hs/weatherforecast/domain/model/Main;Lcom/hs/weatherforecast/domain/model/Clouds;Lcom/hs/weatherforecast/domain/model/Sys;Ljava/lang/Integer;Lcom/hs/weatherforecast/domain/model/Coord;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/hs/weatherforecast/domain/model/Wind;)Lcom/hs/weatherforecast/domain/model/CurrentWeatherResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CurrentWeatherResponse implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer timezone = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Main main = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Clouds clouds = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Sys sys = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer dt = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Coord coord = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer cod = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String base = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.domain.model.Wind wind = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTimezone() {
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
    public final java.lang.Integer getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Coord getCoord() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Wind getWind() {
        return null;
    }
    
    public CurrentWeatherResponse(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "visibility")
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "timezone")
    java.lang.Integer timezone, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    com.hs.weatherforecast.domain.model.Main main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clouds")
    com.hs.weatherforecast.domain.model.Clouds clouds, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    com.hs.weatherforecast.domain.model.Sys sys, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "coord")
    com.hs.weatherforecast.domain.model.Coord coord, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cod")
    java.lang.Integer cod, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "base")
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    com.hs.weatherforecast.domain.model.Wind wind) {
        super();
    }
    
    public CurrentWeatherResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Main component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Clouds component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Sys component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Coord component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.Wind component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hs.weatherforecast.domain.model.CurrentWeatherResponse copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "visibility")
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "timezone")
    java.lang.Integer timezone, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    com.hs.weatherforecast.domain.model.Main main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clouds")
    com.hs.weatherforecast.domain.model.Clouds clouds, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    com.hs.weatherforecast.domain.model.Sys sys, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "coord")
    com.hs.weatherforecast.domain.model.Coord coord, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cod")
    java.lang.Integer cod, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "base")
    java.lang.String base, @org.jetbrains.annotations.Nullable()
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