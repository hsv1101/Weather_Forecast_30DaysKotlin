package com.hs.weatherforecast.domain.usecase;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0010B\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u001c\u0010\u000b\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/hs/weatherforecast/domain/usecase/SearchCitiesUseCase;", "Lcom/hs/weatherforecast/utils/UseCaseLiveData;", "Lcom/hs/weatherforecast/ui/search/SearchViewState;", "Lcom/hs/weatherforecast/domain/usecase/SearchCitiesUseCase$SearchCitiesParams;", "Lcom/hs/weatherforecast/repo/SearchCitiesRepository;", "repository", "(Lcom/hs/weatherforecast/repo/SearchCitiesRepository;)V", "buildUseCaseObservable", "Landroidx/lifecycle/LiveData;", "params", "getRepository", "onSearchResultReady", "resource", "Lcom/hs/weatherforecast/utils/domain/Resource;", "", "Lcom/hs/weatherforecast/db/entity/CitiesForSearchEntity;", "SearchCitiesParams", "app_debug"})
public final class SearchCitiesUseCase extends com.hs.weatherforecast.utils.UseCaseLiveData<com.hs.weatherforecast.ui.search.SearchViewState, com.hs.weatherforecast.domain.usecase.SearchCitiesUseCase.SearchCitiesParams, com.hs.weatherforecast.repo.SearchCitiesRepository> {
    private final com.hs.weatherforecast.repo.SearchCitiesRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hs.weatherforecast.repo.SearchCitiesRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.hs.weatherforecast.ui.search.SearchViewState> buildUseCaseObservable(@org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.domain.usecase.SearchCitiesUseCase.SearchCitiesParams params) {
        return null;
    }
    
    private final com.hs.weatherforecast.ui.search.SearchViewState onSearchResultReady(com.hs.weatherforecast.utils.domain.Resource<? extends java.util.List<com.hs.weatherforecast.db.entity.CitiesForSearchEntity>> resource) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchCitiesUseCase(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.repo.SearchCitiesRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hs/weatherforecast/domain/usecase/SearchCitiesUseCase$SearchCitiesParams;", "Lcom/hs/weatherforecast/utils/UseCaseLiveData$Params;", "city", "", "(Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "app_debug"})
    public static final class SearchCitiesParams extends com.hs.weatherforecast.utils.UseCaseLiveData.Params {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String city = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCity() {
            return null;
        }
        
        public SearchCitiesParams(@org.jetbrains.annotations.NotNull()
        java.lang.String city) {
            super();
        }
        
        public SearchCitiesParams() {
            super();
        }
    }
}