package com.hs.weatherforecast.ui.search;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/hs/weatherforecast/ui/search/SearchViewModel;", "Lcom/hs/weatherforecast/core/BaseViewModel;", "useCase", "Lcom/hs/weatherforecast/domain/usecase/SearchCitiesUseCase;", "pref", "Landroid/content/SharedPreferences;", "(Lcom/hs/weatherforecast/domain/usecase/SearchCitiesUseCase;Landroid/content/SharedPreferences;)V", "_searchParams", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hs/weatherforecast/domain/usecase/SearchCitiesUseCase$SearchCitiesParams;", "searchViewState", "Landroidx/lifecycle/LiveData;", "Lcom/hs/weatherforecast/ui/search/SearchViewState;", "getSearchViewState", "saveCoordsToSharedPref", "Lio/reactivex/Single;", "", "coordEntity", "Lcom/hs/weatherforecast/db/entity/CoordEntity;", "setSearchParams", "", "params", "app_debug"})
public final class SearchViewModel extends com.hs.weatherforecast.core.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.hs.weatherforecast.domain.usecase.SearchCitiesUseCase.SearchCitiesParams> _searchParams = null;
    private final androidx.lifecycle.LiveData<com.hs.weatherforecast.ui.search.SearchViewState> searchViewState = null;
    private final com.hs.weatherforecast.domain.usecase.SearchCitiesUseCase useCase = null;
    private final android.content.SharedPreferences pref = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.ui.search.SearchViewState> getSearchViewState() {
        return null;
    }
    
    public final void setSearchParams(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.usecase.SearchCitiesUseCase.SearchCitiesParams params) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.Single<java.lang.String> saveCoordsToSharedPref(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.db.entity.CoordEntity coordEntity) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.domain.usecase.SearchCitiesUseCase useCase, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences pref) {
        super();
    }
}