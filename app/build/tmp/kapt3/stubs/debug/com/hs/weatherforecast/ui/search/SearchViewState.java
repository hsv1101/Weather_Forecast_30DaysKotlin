package com.hs.weatherforecast.ui.search;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/hs/weatherforecast/ui/search/SearchViewState;", "Lcom/hs/weatherforecast/core/BaseViewState;", "status", "Lcom/hs/weatherforecast/utils/domain/Status;", "error", "", "data", "", "Lcom/hs/weatherforecast/db/entity/CitiesForSearchEntity;", "(Lcom/hs/weatherforecast/utils/domain/Status;Ljava/lang/String;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "getStatus", "()Lcom/hs/weatherforecast/utils/domain/Status;", "getSearchResult", "app_debug"})
public final class SearchViewState extends com.hs.weatherforecast.core.BaseViewState {
    @org.jetbrains.annotations.NotNull()
    private final com.hs.weatherforecast.utils.domain.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity> data = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity> getSearchResult() {
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
    public final java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity> getData() {
        return null;
    }
    
    public SearchViewState(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.utils.domain.Status status, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity> data) {
        super(null, null);
    }
}