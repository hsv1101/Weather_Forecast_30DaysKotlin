package com.hs.weatherforecast.domain.usecase;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000fB\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/hs/weatherforecast/domain/usecase/ForecastUseCase;", "Lcom/hs/weatherforecast/utils/UseCaseLiveData;", "Lcom/hs/weatherforecast/ui/dashboard/ForecastViewState;", "Lcom/hs/weatherforecast/domain/usecase/ForecastUseCase$ForecastParams;", "Lcom/hs/weatherforecast/repo/ForecastRepository;", "repository", "(Lcom/hs/weatherforecast/repo/ForecastRepository;)V", "buildUseCaseObservable", "Landroidx/lifecycle/LiveData;", "params", "getRepository", "onForecastResultReady", "resource", "Lcom/hs/weatherforecast/utils/domain/Resource;", "Lcom/hs/weatherforecast/db/entity/ForecastEntity;", "ForecastParams", "app_debug"})
public final class ForecastUseCase extends com.hs.weatherforecast.utils.UseCaseLiveData<com.hs.weatherforecast.ui.dashboard.ForecastViewState, com.hs.weatherforecast.domain.usecase.ForecastUseCase.ForecastParams, com.hs.weatherforecast.repo.ForecastRepository> {
    private final com.hs.weatherforecast.repo.ForecastRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hs.weatherforecast.repo.ForecastRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.hs.weatherforecast.ui.dashboard.ForecastViewState> buildUseCaseObservable(@org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.domain.usecase.ForecastUseCase.ForecastParams params) {
        return null;
    }
    
    private final com.hs.weatherforecast.ui.dashboard.ForecastViewState onForecastResultReady(com.hs.weatherforecast.utils.domain.Resource<com.hs.weatherforecast.db.entity.ForecastEntity> resource) {
        return null;
    }
    
    @javax.inject.Inject()
    public ForecastUseCase(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.repo.ForecastRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/hs/weatherforecast/domain/usecase/ForecastUseCase$ForecastParams;", "Lcom/hs/weatherforecast/utils/UseCaseLiveData$Params;", "lat", "", "lon", "fetchRequired", "", "units", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getFetchRequired", "()Z", "getLat", "()Ljava/lang/String;", "getLon", "getUnits", "app_debug"})
    public static final class ForecastParams extends com.hs.weatherforecast.utils.UseCaseLiveData.Params {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lat = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lon = null;
        private final boolean fetchRequired = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String units = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLat() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLon() {
            return null;
        }
        
        public final boolean getFetchRequired() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUnits() {
            return null;
        }
        
        public ForecastParams(@org.jetbrains.annotations.NotNull()
        java.lang.String lat, @org.jetbrains.annotations.NotNull()
        java.lang.String lon, boolean fetchRequired, @org.jetbrains.annotations.NotNull()
        java.lang.String units) {
            super();
        }
    }
}