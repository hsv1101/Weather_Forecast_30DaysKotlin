package com.hs.weatherforecast.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u001a\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"setErrorText", "", "view", "Landroid/widget/TextView;", "viewState", "Lcom/hs/weatherforecast/core/BaseViewState;", "setErrorView", "Landroid/view/View;", "setVisibilty", "isVisible", "", "setWeatherIcon", "Landroid/widget/ImageView;", "iconPath", "", "app_debug"})
public final class BindingAdapterKt {
    
    /**
     * Created by JAIhsingh on 2020-06-02
     */
    @androidx.databinding.BindingAdapter(value = {"app:visibility"})
    public static final void setVisibilty(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean isVisible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:setWeatherIcon"})
    public static final void setWeatherIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String iconPath) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:setErrorView"})
    public static final void setErrorView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.core.BaseViewState viewState) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:setErrorText"})
    public static final void setErrorText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    com.hs.weatherforecast.core.BaseViewState viewState) {
    }
}