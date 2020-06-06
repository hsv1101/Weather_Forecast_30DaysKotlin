package com.hs.weatherforecast.core;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-02
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u001d\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0007H\u0016J\u0012\u0010\'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J$\u0010*\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020 H\u0016R\u001c\u0010\u000b\u001a\u00028\u0001X\u0096.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u0004\u0018\u00018\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006."}, d2 = {"Lcom/hs/weatherforecast/core/BaseFragment;", "VM", "Lcom/hs/weatherforecast/core/BaseViewModel;", "DB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "layout", "", "viewModelClass", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "dataBindingComponent", "error/NonExistentClass", "getDataBindingComponent", "()Lerror/NonExistentClass;", "setDataBindingComponent", "(Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "getLayout", "()I", "viewModel", "getViewModel", "()Lcom/hs/weatherforecast/core/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "navigate", "action", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "onInject", "refresh", "app_debug"})
public abstract class BaseFragment<VM extends com.hs.weatherforecast.core.BaseViewModel, DB extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public DB binding;
    @org.jetbrains.annotations.NotNull()
    public error.NonExistentClass dataBindingComponent;
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layout = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public DB getBinding() {
        return null;
    }
    
    public void setBinding(@org.jetbrains.annotations.NotNull()
    DB p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getDataBindingComponent() {
        return null;
    }
    
    public final void setDataBindingComponent(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass p0) {
    }
    
    private final void init(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
    }
    
    public void init() {
    }
    
    private final VM getViewModel() {
        return null;
    }
    
    public void onInject() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public void refresh() {
    }
    
    public void navigate(int action) {
    }
    
    public final int getLayout() {
        return 0;
    }
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layout, @org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> viewModelClass) {
        super();
    }
}