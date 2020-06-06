package com.hs.weatherforecast.db.entity;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-02
 */
@androidx.room.Entity(tableName = "Forecast")
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0006H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006*"}, d2 = {"Lcom/hs/weatherforecast/db/entity/ForecastEntity;", "Landroid/os/Parcelable;", "forecastResponse", "Lcom/hs/weatherforecast/domain/model/ForecastResponse;", "(Lcom/hs/weatherforecast/domain/model/ForecastResponse;)V", "id", "", "city", "Lcom/hs/weatherforecast/db/entity/CityEntity;", "list", "", "Lcom/hs/weatherforecast/domain/model/ListItem;", "(ILcom/hs/weatherforecast/db/entity/CityEntity;Ljava/util/List;)V", "getCity", "()Lcom/hs/weatherforecast/db/entity/CityEntity;", "setCity", "(Lcom/hs/weatherforecast/db/entity/CityEntity;)V", "getId", "()I", "setId", "(I)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ForecastEntity implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.hs.weatherforecast.db.entity.CityEntity city;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "list")
    private java.util.List<com.hs.weatherforecast.domain.model.ListItem> list;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.CityEntity getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CityEntity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.domain.model.ListItem> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.hs.weatherforecast.domain.model.ListItem> p0) {
    }
    
    public ForecastEntity(int id, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CityEntity city, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hs.weatherforecast.domain.model.ListItem> list) {
        super();
    }
    
    @androidx.room.Ignore()
    public ForecastEntity(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.model.ForecastResponse forecastResponse) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.CityEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.domain.model.ListItem> component3() {
        return null;
    }
    
    /**
     * Created by JAIhsingh on 2020-06-02
     */
    @org.jetbrains.annotations.NotNull()
    public final com.hs.weatherforecast.db.entity.ForecastEntity copy(int id, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CityEntity city, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hs.weatherforecast.domain.model.ListItem> list) {
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