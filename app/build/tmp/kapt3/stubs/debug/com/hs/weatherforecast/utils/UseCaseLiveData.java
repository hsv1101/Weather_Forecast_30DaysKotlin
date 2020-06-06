package com.hs.weatherforecast.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u0002\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\tJ\r\u0010\u000b\u001a\u00028\u0002H&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/hs/weatherforecast/utils/UseCaseLiveData;", "M", "P", "R", "", "()V", "buildUseCaseObservable", "Landroidx/lifecycle/LiveData;", "params", "(Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "execute", "getRepository", "()Ljava/lang/Object;", "None", "Params", "app_debug"})
public abstract class UseCaseLiveData<M extends java.lang.Object, P extends java.lang.Object, R extends java.lang.Object> {
    
    public abstract R getRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<M> buildUseCaseObservable(@org.jetbrains.annotations.Nullable()
    P params);
    
    /**
     * Executes the target call
     *
     * @param params represents params to be passed
     * @return [Disposable] result
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<M> execute(@org.jetbrains.annotations.Nullable()
    P params) {
        return null;
    }
    
    public UseCaseLiveData() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hs/weatherforecast/utils/UseCaseLiveData$Params;", "", "()V", "app_debug"})
    public static abstract class Params {
        
        public Params() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hs/weatherforecast/utils/UseCaseLiveData$None;", "", "()V", "app_debug"})
    public static final class None {
        
        public None() {
            super();
        }
    }
}