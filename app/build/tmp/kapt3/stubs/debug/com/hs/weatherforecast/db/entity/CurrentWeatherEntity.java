package com.hs.weatherforecast.db.entity;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-02
 */
@androidx.room.Entity(tableName = "CurrentWeather")
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Bq\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u0017J\u0010\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u00106\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u00108\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u008c\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\t\u0010A\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\u0006\u0010F\u001a\u00020\u0006J\b\u0010G\u001a\u0004\u0018\u00010\u0010J\u0012\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020\rH\u0002J\t\u0010K\u001a\u00020\u0006H\u00d6\u0001J\t\u0010L\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R \u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104\u00a8\u0006R"}, d2 = {"Lcom/hs/weatherforecast/db/entity/CurrentWeatherEntity;", "Landroid/os/Parcelable;", "currentWeather", "Lcom/hs/weatherforecast/domain/model/CurrentWeatherResponse;", "(Lcom/hs/weatherforecast/domain/model/CurrentWeatherResponse;)V", "visibility", "", "timezone", "main", "Lcom/hs/weatherforecast/db/entity/MainEntity;", "clouds", "Lcom/hs/weatherforecast/db/entity/CloudsEntity;", "dt", "", "weather", "", "Lcom/hs/weatherforecast/domain/model/WeatherItem;", "name", "", "id", "base", "wind", "Lcom/hs/weatherforecast/db/entity/WindEntity;", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/hs/weatherforecast/db/entity/MainEntity;Lcom/hs/weatherforecast/db/entity/CloudsEntity;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Lcom/hs/weatherforecast/db/entity/WindEntity;)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/hs/weatherforecast/db/entity/CloudsEntity;", "setClouds", "(Lcom/hs/weatherforecast/db/entity/CloudsEntity;)V", "getDt", "()Ljava/lang/Long;", "setDt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "()I", "getMain", "()Lcom/hs/weatherforecast/db/entity/MainEntity;", "setMain", "(Lcom/hs/weatherforecast/db/entity/MainEntity;)V", "getName", "getTimezone", "()Ljava/lang/Integer;", "setTimezone", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getVisibility", "setVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/hs/weatherforecast/db/entity/WindEntity;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/hs/weatherforecast/db/entity/MainEntity;Lcom/hs/weatherforecast/db/entity/CloudsEntity;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Lcom/hs/weatherforecast/db/entity/WindEntity;)Lcom/hs/weatherforecast/db/entity/CurrentWeatherEntity;", "describeContents", "equals", "", "other", "", "getColor", "getCurrentWeather", "getDateTime", "Lorg/threeten/bp/DayOfWeek;", "s", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class CurrentWeatherEntity implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "visibility")
    private java.lang.Integer visibility;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "timezone")
    private java.lang.Integer timezone;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.hs.weatherforecast.db.entity.MainEntity main;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.hs.weatherforecast.db.entity.CloudsEntity clouds;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "dt")
    private java.lang.Long dt;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "weather")
    private final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "base")
    private final java.lang.String base = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private final com.hs.weatherforecast.db.entity.WindEntity wind = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.domain.model.WeatherItem getCurrentWeather() {
        return null;
    }
    
    private final org.threeten.bp.DayOfWeek getDateTime(long s) {
        return null;
    }
    
    public final int getColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    public final void setVisibility(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTimezone() {
        return null;
    }
    
    public final void setTimezone(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.MainEntity getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.MainEntity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.CloudsEntity getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CloudsEntity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDt() {
        return null;
    }
    
    public final void setDt(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.WindEntity getWind() {
        return null;
    }
    
    public CurrentWeatherEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    java.lang.Integer timezone, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.MainEntity main, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CloudsEntity clouds, @org.jetbrains.annotations.Nullable()
    java.lang.Long dt, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    java.lang.String name, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.WindEntity wind) {
        super();
    }
    
    @androidx.room.Ignore()
    public CurrentWeatherEntity(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.model.CurrentWeatherResponse currentWeather) {
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
    public final com.hs.weatherforecast.db.entity.MainEntity component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.CloudsEntity component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.WindEntity component10() {
        return null;
    }
    
    /**
     * Created by JAIhsingh on 2020-06-02
     */
    @org.jetbrains.annotations.NotNull()
    public final com.hs.weatherforecast.db.entity.CurrentWeatherEntity copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    java.lang.Integer timezone, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.MainEntity main, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CloudsEntity clouds, @org.jetbrains.annotations.Nullable()
    java.lang.Long dt, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    java.lang.String name, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.WindEntity wind) {
        return null;
    }
    
    /**
     * Created by JAIhsingh on 2020-06-02
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by JAIhsingh on 2020-06-02
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by JAIhsingh on 2020-06-02
     */
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