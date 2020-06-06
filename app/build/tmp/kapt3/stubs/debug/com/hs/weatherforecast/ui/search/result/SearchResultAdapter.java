package com.hs.weatherforecast.ui.search.result;

import java.lang.System;

/**
 * Created by JAIhsingh on 2020-06-01
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/hs/weatherforecast/ui/search/result/SearchResultAdapter;", "Lcom/hs/weatherforecast/core/BaseAdapter;", "Lcom/hs/weatherforecast/db/entity/CitiesForSearchEntity;", "callBack", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "bind", "binding", "Landroidx/databinding/ViewDataBinding;", "position", "", "createBinding", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class SearchResultAdapter extends com.hs.weatherforecast.core.BaseAdapter<com.hs.weatherforecast.db.entity.CitiesForSearchEntity> {
    private final kotlin.jvm.functions.Function1<com.hs.weatherforecast.db.entity.CitiesForSearchEntity, kotlin.Unit> callBack = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.databinding.ViewDataBinding createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    protected void bind(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding binding, int position) {
    }
    
    public SearchResultAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.hs.weatherforecast.db.entity.CitiesForSearchEntity, kotlin.Unit> callBack) {
        super(null);
    }
}