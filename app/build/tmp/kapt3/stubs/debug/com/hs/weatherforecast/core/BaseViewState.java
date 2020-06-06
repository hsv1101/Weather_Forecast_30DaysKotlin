package com.hs.weatherforecast.core;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-02
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/hs/weatherforecast/core/BaseViewState;", "", "baseStatus", "Lcom/hs/weatherforecast/utils/domain/Status;", "baseError", "", "(Lcom/hs/weatherforecast/utils/domain/Status;Ljava/lang/String;)V", "getBaseError", "()Ljava/lang/String;", "getBaseStatus", "()Lcom/hs/weatherforecast/utils/domain/Status;", "getErrorMessage", "isLoading", "", "shouldShowErrorMessage", "app_debug"})
public class BaseViewState {
    @org.jetbrains.annotations.NotNull()
    private final com.hs.weatherforecast.utils.domain.Status baseStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String baseError = null;
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final boolean shouldShowErrorMessage() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hs.weatherforecast.utils.domain.Status getBaseStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBaseError() {
        return null;
    }
    
    public BaseViewState(@org.jetbrains.annotations.NotNull()
    com.hs.weatherforecast.utils.domain.Status baseStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String baseError) {
        super();
    }
}