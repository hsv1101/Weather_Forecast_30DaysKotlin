package com.hs.weatherforecast.databinding;
import com.hs.weatherforecast.R;
import com.hs.weatherforecast.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutDashboardForecastBindingImpl extends LayoutDashboardForecastBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewHumidityHeader, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutDashboardForecastBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private LayoutDashboardForecastBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.cardView.setTag(null);
        this.imageViewWeatherIcon.setTag(null);
        this.textViewHumidity.setTag(null);
        this.textViewTemperature.setTag(null);
        this.textViewWeatherMain.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewState == variableId) {
            setViewState((com.hs.weatherforecast.ui.dashboard.CurrentWeatherViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable com.hs.weatherforecast.ui.dashboard.CurrentWeatherViewState ViewState) {
        this.mViewState = ViewState;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewState);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean viewStateIsLoading = false;
        java.lang.String viewStateDataGetCurrentWeatherMain = null;
        com.hs.weatherforecast.db.entity.CurrentWeatherEntity viewStateData = null;
        java.lang.String viewStateDataMainGetHumidityString = null;
        com.hs.weatherforecast.db.entity.MainEntity viewStateDataMain = null;
        com.hs.weatherforecast.ui.dashboard.CurrentWeatherViewState viewState = mViewState;
        java.lang.String viewStateDataGetCurrentWeatherIcon = null;
        java.lang.String viewStateDataMainGetTempString = null;
        int viewStateIsLoadingViewINVISIBLEViewVISIBLE = 0;
        com.hs.weatherforecast.domain.model.WeatherItem viewStateDataGetCurrentWeather = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.isLoading()
                    viewStateIsLoading = viewState.isLoading();
                    // read viewState.data
                    viewStateData = viewState.getData();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewStateIsLoading) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewState.isLoading() ? View.INVISIBLE : View.VISIBLE
                viewStateIsLoadingViewINVISIBLEViewVISIBLE = ((viewStateIsLoading) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                if (viewStateData != null) {
                    // read viewState.data.main
                    viewStateDataMain = viewStateData.getMain();
                    // read viewState.data.getCurrentWeather()
                    viewStateDataGetCurrentWeather = viewStateData.getCurrentWeather();
                }


                if (viewStateDataMain != null) {
                    // read viewState.data.main.getHumidityString()
                    viewStateDataMainGetHumidityString = viewStateDataMain.getHumidityString();
                    // read viewState.data.main.getTempString()
                    viewStateDataMainGetTempString = viewStateDataMain.getTempString();
                }
                if (viewStateDataGetCurrentWeather != null) {
                    // read viewState.data.getCurrentWeather().main
                    viewStateDataGetCurrentWeatherMain = viewStateDataGetCurrentWeather.getMain();
                    // read viewState.data.getCurrentWeather().icon
                    viewStateDataGetCurrentWeatherIcon = viewStateDataGetCurrentWeather.getIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.cardView.setVisibility(viewStateIsLoadingViewINVISIBLEViewVISIBLE);
            com.hs.weatherforecast.core.BindingAdapterKt.setWeatherIcon(this.imageViewWeatherIcon, viewStateDataGetCurrentWeatherIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewHumidity, viewStateDataMainGetHumidityString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTemperature, viewStateDataMainGetTempString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewWeatherMain, viewStateDataGetCurrentWeatherMain);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewState
        flag 1 (0x2L): null
        flag 2 (0x3L): viewState.isLoading() ? View.INVISIBLE : View.VISIBLE
        flag 3 (0x4L): viewState.isLoading() ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}