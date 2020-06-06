package com.hs.weatherforecast.ui.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/hs/weatherforecast/ui/dashboard/CurrentWeatherViewState;", "Lcom/hs/weatherforecast/core/BaseViewState;", "status", "Lcom/hs/weatherforecast/utils/domain/Status;", "error", "", "data", "Lcom/hs/weatherforecast/db/entity/CurrentWeatherEntity;", "(Lcom/hs/weatherforecast/utils/domain/Status;Ljava/lang/String;Lcom/hs/weatherforecast/db/entity/CurrentWeatherEntity;)V", "getData", "()Lcom/hs/weatherforecast/db/entity/CurrentWeatherEntity;", "getError", "()Ljava/lang/String;", "getStatus", "()Lcom/hs/weatherforecast/utils/domain/Status;", "getForecast", "app_debug"})
public final class CurrentWeatherViewState extends com.hs.weatherforecast.core.BaseViewState {
    @org.jetbrains.annotations.NotNull()
    private final com.hs.weatherforecast.utils.domain.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hs.weatherforecast.db.entity.CurrentWeatherEntity data = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.CurrentWeatherEntity getForecast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hs.weatherforecast.utils.domain.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hs.weatherforecast.db.entity.CurrentWeatherEntity getData() {
        return null;
    }
    
    public CurrentWeatherViewState(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.utils.domain.Status status, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.db.entity.CurrentWeatherEntity data) {
        super(null, null);
    }
}