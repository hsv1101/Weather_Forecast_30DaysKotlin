package com.hs.weatherforecast.db.entity;

import java.lang.System;

/**
 * Created by Furkan on 2019-10-22
 */
@androidx.room.Entity(tableName = "City")
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\u0006\u0010\'\u001a\u00020\u0006J\t\u0010(\u001a\u00020\u000bH\u00d6\u0001J\t\u0010)\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000bH\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014\u00a8\u0006/"}, d2 = {"Lcom/hs/weatherforecast/db/entity/CityEntity;", "Landroid/os/Parcelable;", "city", "Lcom/hs/weatherforecast/domain/model/City;", "(Lcom/hs/weatherforecast/domain/model/City;)V", "cityCountry", "", "cityCoord", "Lcom/hs/weatherforecast/db/entity/CoordEntity;", "cityName", "cityId", "", "(Ljava/lang/String;Lcom/hs/weatherforecast/db/entity/CoordEntity;Ljava/lang/String;Ljava/lang/Integer;)V", "getCityCoord", "()Lcom/hs/weatherforecast/db/entity/CoordEntity;", "setCityCoord", "(Lcom/hs/weatherforecast/db/entity/CoordEntity;)V", "getCityCountry", "()Ljava/lang/String;", "setCityCountry", "(Ljava/lang/String;)V", "getCityId", "()Ljava/lang/Integer;", "setCityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCityName", "setCityName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/hs/weatherforecast/db/entity/CoordEntity;Ljava/lang/String;Ljava/lang/Integer;)Lcom/hs/weatherforecast/db/entity/CityEntity;", "describeContents", "equals", "", "other", "", "getCityAndCountry", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class CityEntity implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cityCountry")
    private java.lang.String cityCountry;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.hs.weatherforecast.db.entity.CoordEntity cityCoord;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cityName")
    private java.lang.String cityName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cityId")
    private java.lang.Integer cityId;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityAndCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCityCountry() {
        return null;
    }
    
    public final void setCityCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.CoordEntity getCityCoord() {
        return null;
    }
    
    public final void setCityCoord(@org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CoordEntity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCityName() {
        return null;
    }
    
    public final void setCityName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCityId() {
        return null;
    }
    
    public final void setCityId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public CityEntity(@org.jetbrains.annotations.Nullable()
    java.lang.String cityCountry, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CoordEntity cityCoord, @org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cityId) {
        super();
    }
    
    @androidx.room.Ignore()
    public CityEntity(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.model.City city) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.CoordEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    /**
     * Created by Furkan on 2019-10-22
     */
    @org.jetbrains.annotations.NotNull()
    public final com.hs.weatherforecast.db.entity.CityEntity copy(@org.jetbrains.annotations.Nullable()
    java.lang.String cityCountry, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CoordEntity cityCoord, @org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cityId) {
        return null;
    }
    
    /**
     * Created by Furkan on 2019-10-22
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by Furkan on 2019-10-22
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Furkan on 2019-10-22
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