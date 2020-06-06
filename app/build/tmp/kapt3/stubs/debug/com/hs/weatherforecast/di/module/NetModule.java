package com.hs.weatherforecast.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/hs/weatherforecast/di/module/NetModule;", "", "()V", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideNonCachedOkHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttpClient", "providePlacesClient", "Lcom/algolia/search/saas/places/PlacesClient;", "provideRetrofit", "Lretrofit2/Retrofit$Builder;", "moshi", "client", "provideService", "Lcom/hs/weatherforecast/domain/WeatherAppAPI;", "retrofit", "app_debug"})
@dagger.Module()
public final class NetModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cached")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "non_cached")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideNonCachedOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit.Builder provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cached")
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hs.weatherforecast.domain.WeatherAppAPI provideService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.algolia.search.saas.places.PlacesClient providePlacesClient() {
        return null;
    }
    
    public NetModule() {
        super();
    }
}