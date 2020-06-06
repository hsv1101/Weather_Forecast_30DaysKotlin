package com.hs.weatherforecast.core;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-02
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/hs/weatherforecast/core/Constants;", "", "()V", "AlgoliaKeys", "Coords", "NetworkService", "app_debug"})
public final class Constants {
    public static final com.hs.weatherforecast.core.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/hs/weatherforecast/core/Constants$NetworkService;", "", "()V", "API_KEY_QUERY", "", "API_KEY_VALUE", "BASE_URL", "RATE_LIMITER_TYPE", "app_debug"})
    public static final class NetworkService {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "http://api.openweathermap.org/data/2.5/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY_VALUE = "751d80f6c314139192ffcb62c107e654";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RATE_LIMITER_TYPE = "data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY_QUERY = "appid";
        public static final com.hs.weatherforecast.core.Constants.NetworkService INSTANCE = null;
        
        private NetworkService() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hs/weatherforecast/core/Constants$AlgoliaKeys;", "", "()V", "APPLICATION_ID", "", "SEARCH_API_KEY", "app_debug"})
    public static final class AlgoliaKeys {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String APPLICATION_ID = "plNW8IW0YOIN";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SEARCH_API_KEY = "029766644cb160efa51f2a32284310eb";
        public static final com.hs.weatherforecast.core.Constants.AlgoliaKeys INSTANCE = null;
        
        private AlgoliaKeys() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/hs/weatherforecast/core/Constants$Coords;", "", "()V", "LAT", "", "LON", "METRIC", "app_debug"})
    public static final class Coords {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LAT = "lat";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LON = "lon";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String METRIC = "metric";
        public static final com.hs.weatherforecast.core.Constants.Coords INSTANCE = null;
        
        private Coords() {
            super();
        }
    }
}