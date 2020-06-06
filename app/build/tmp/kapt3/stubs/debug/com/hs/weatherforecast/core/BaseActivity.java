package com.hs.weatherforecast.core;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-02
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\'J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002R\u001b\u0010\t\u001a\u00028\u00018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lcom/hs/weatherforecast/core/BaseActivity;", "VM", "Lcom/hs/weatherforecast/core/BaseViewModel;", "DB", "Landroidx/databinding/ViewDataBinding;", "Ldagger/android/support/DaggerAppCompatActivity;", "mViewModelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "binding$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/hs/weatherforecast/core/BaseViewModel;", "viewModel$delegate", "viewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelProviderFactory$app_debug", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelProviderFactory$app_debug", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getLayoutRes", "", "initViewModel", "", "(Lcom/hs/weatherforecast/core/BaseViewModel;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInject", "setupBindingLifecycleOwner", "app_debug"})
public abstract class BaseActivity<VM extends com.hs.weatherforecast.core.BaseViewModel, DB extends androidx.databinding.ViewDataBinding> extends dagger.android.support.DaggerAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelProviderFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final java.lang.Class<VM> mViewModelClass = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelProviderFactory$app_debug() {
        return null;
    }
    
    public final void setViewModelProviderFactory$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    @org.jetbrains.annotations.NotNull()
    public final DB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    /**
     * If you want to inject Dependency Injection
     * on your activity, you can override this.
     */
    public void onInject() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * You need override this method.
     * And you need to set viewModel to binding: binding.viewModel = viewModel
     */
    public abstract void initViewModel(@org.jetbrains.annotations.NotNull()
    VM viewModel);
    
    private final void setupBindingLifecycleOwner() {
    }
    
    public BaseActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> mViewModelClass) {
        super();
    }
}