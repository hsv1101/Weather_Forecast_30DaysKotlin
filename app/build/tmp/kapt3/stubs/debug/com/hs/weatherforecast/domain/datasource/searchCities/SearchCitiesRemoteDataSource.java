package com.hs.weatherforecast.domain.datasource.searchCities;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-05-31
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/hs/weatherforecast/domain/datasource/searchCities/SearchCitiesRemoteDataSource;", "", "client", "Lcom/algolia/search/saas/places/PlacesClient;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/algolia/search/saas/places/PlacesClient;Lcom/squareup/moshi/Moshi;)V", "getCityWithQuery", "Lio/reactivex/Single;", "Lcom/hs/weatherforecast/domain/model/SearchResponse;", "query", "", "app_debug"})
public final class SearchCitiesRemoteDataSource {
    private final com.algolia.search.saas.places.PlacesClient client = null;
    private final com.squareup.moshi.Moshi moshi = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.hs.weatherforecast.domain.model.SearchResponse> getCityWithQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchCitiesRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.algolia.search.saas.places.PlacesClient client, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}