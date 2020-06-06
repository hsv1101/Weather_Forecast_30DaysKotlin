package com.hs.weatherforecast.utils.typeconverters;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0007J\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/hs/weatherforecast/utils/typeconverters/DataConverter;", "", "()V", "listToString", "", "objects", "", "Lcom/hs/weatherforecast/domain/model/ListItem;", "stringToList", "data", "weatherListToString", "Lcom/hs/weatherforecast/domain/model/WeatherItem;", "weatherStringToList", "app_debug"})
public final class DataConverter {
    public static final com.hs.weatherforecast.utils.typeconverters.DataConverter INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final java.util.List<com.hs.weatherforecast.domain.model.ListItem> stringToList(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final java.lang.String listToString(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hs.weatherforecast.domain.model.ListItem> objects) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> weatherStringToList(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final java.lang.String weatherListToString(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hs.weatherforecast.domain.model.WeatherItem> objects) {
        return null;
    }
    
    private DataConverter() {
        super();
    }
}