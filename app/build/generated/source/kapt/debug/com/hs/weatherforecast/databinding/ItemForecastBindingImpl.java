package com.hs.weatherforecast.databinding;
import com.hs.weatherforecast.R;
import com.hs.weatherforecast.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemForecastBindingImpl extends ItemForecastBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.loopeer.shadow.ShadowView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemForecastBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemForecastBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            );
        this.cardView.setTag(null);
        this.imageViewForecastIcon.setTag(null);
        this.linearLayoutTempMaxMin.setTag(null);
        this.mboundView1 = (com.loopeer.shadow.ShadowView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.rootView.setTag(null);
        this.textViewDayOfWeek.setTag(null);
        this.textViewTemp.setTag(null);
        this.textViewTimeOfDay.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.hs.weatherforecast.ui.dashboard.forecast.ForecastItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.hs.weatherforecast.ui.dashboard.forecast.ForecastItemViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelItem((androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelItem(androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem> ViewModelItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem> viewModelItem = null;
        java.lang.String stringFormatTextViewDayOfWeekAndroidStringDayOfWeekViewModelItemGetDay = null;
        java.lang.String viewModelItemMainGetTempMaxString = null;
        int viewModelItemGetColor = 0;
        java.lang.String stringFormatTextViewTempAndroidStringTempViewModelItemGetDay = null;
        java.lang.String stringFormatCardViewAndroidStringCardViewViewModelItemGetDay = null;
        java.lang.String viewModelItemMainGetTempMinString = null;
        java.lang.String viewModelItemGetDay = null;
        java.lang.String viewModelItemMainGetTempString = null;
        com.hs.weatherforecast.domain.model.ListItem viewModelItemGet = null;
        com.hs.weatherforecast.domain.model.WeatherItem viewModelItemGetWeatherItem = null;
        java.lang.String viewModelItemGetHourOfDay = null;
        java.lang.String viewModelItemGetWeatherItemIcon = null;
        com.hs.weatherforecast.domain.model.Main viewModelItemMain = null;
        java.lang.String stringFormatLinearLayoutTempMaxMinAndroidStringTempMaxMinViewModelItemGetDay = null;
        com.hs.weatherforecast.ui.dashboard.forecast.ForecastItemViewModel viewModel = mViewModel;
        java.lang.String stringFormatImageViewForecastIconAndroidStringForecastIconViewModelItemGetDay = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.item
                    viewModelItem = viewModel.getItem();
                }
                updateRegistration(0, viewModelItem);


                if (viewModelItem != null) {
                    // read viewModel.item.get()
                    viewModelItemGet = viewModelItem.get();
                }


                if (viewModelItemGet != null) {
                    // read viewModel.item.get().getColor()
                    viewModelItemGetColor = viewModelItemGet.getColor();
                    // read viewModel.item.get().getDay()
                    viewModelItemGetDay = viewModelItemGet.getDay();
                    // read viewModel.item.get().getWeatherItem()
                    viewModelItemGetWeatherItem = viewModelItemGet.getWeatherItem();
                    // read viewModel.item.get().getHourOfDay()
                    viewModelItemGetHourOfDay = viewModelItemGet.getHourOfDay();
                    // read viewModel.item.get().main
                    viewModelItemMain = viewModelItemGet.getMain();
                }


                // read String.format(@android:string/dayOfWeek, viewModel.item.get().getDay())
                stringFormatTextViewDayOfWeekAndroidStringDayOfWeekViewModelItemGetDay = java.lang.String.format(textViewDayOfWeek.getResources().getString(R.string.dayOfWeek), viewModelItemGetDay);
                // read String.format(@android:string/temp, viewModel.item.get().getDay())
                stringFormatTextViewTempAndroidStringTempViewModelItemGetDay = java.lang.String.format(textViewTemp.getResources().getString(R.string.temp), viewModelItemGetDay);
                // read String.format(@android:string/cardView, viewModel.item.get().getDay())
                stringFormatCardViewAndroidStringCardViewViewModelItemGetDay = java.lang.String.format(cardView.getResources().getString(R.string.cardView), viewModelItemGetDay);
                // read String.format(@android:string/tempMaxMin, viewModel.item.get().getDay())
                stringFormatLinearLayoutTempMaxMinAndroidStringTempMaxMinViewModelItemGetDay = java.lang.String.format(linearLayoutTempMaxMin.getResources().getString(R.string.tempMaxMin), viewModelItemGetDay);
                // read String.format(@android:string/forecastIcon, viewModel.item.get().getDay())
                stringFormatImageViewForecastIconAndroidStringForecastIconViewModelItemGetDay = java.lang.String.format(imageViewForecastIcon.getResources().getString(R.string.forecastIcon), viewModelItemGetDay);
                if (viewModelItemGetWeatherItem != null) {
                    // read viewModel.item.get().getWeatherItem().icon
                    viewModelItemGetWeatherItemIcon = viewModelItemGetWeatherItem.getIcon();
                }
                if (viewModelItemMain != null) {
                    // read viewModel.item.get().main.getTempMaxString()
                    viewModelItemMainGetTempMaxString = viewModelItemMain.getTempMaxString();
                    // read viewModel.item.get().main.getTempMinString()
                    viewModelItemMainGetTempMinString = viewModelItemMain.getTempMinString();
                    // read viewModel.item.get().main.getTempString()
                    viewModelItemMainGetTempString = viewModelItemMain.getTempString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.cardView.setTransitionName(stringFormatCardViewAndroidStringCardViewViewModelItemGetDay);
                this.cardView.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(viewModelItemGetColor));
                this.imageViewForecastIcon.setTransitionName(stringFormatImageViewForecastIconAndroidStringForecastIconViewModelItemGetDay);
                this.linearLayoutTempMaxMin.setTransitionName(stringFormatLinearLayoutTempMaxMinAndroidStringTempMaxMinViewModelItemGetDay);
                this.textViewDayOfWeek.setTransitionName(stringFormatTextViewDayOfWeekAndroidStringDayOfWeekViewModelItemGetDay);
                this.textViewTemp.setTransitionName(stringFormatTextViewTempAndroidStringTempViewModelItemGetDay);
            }
            // api target 1

            com.hs.weatherforecast.core.BindingAdapterKt.setWeatherIcon(this.imageViewForecastIcon, viewModelItemGetWeatherItemIcon);
            this.mboundView1.setShadowColor(viewModelItemGetColor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelItemMainGetTempMinString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelItemMainGetTempMaxString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewDayOfWeek, viewModelItemGetDay);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTemp, viewModelItemMainGetTempString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTimeOfDay, viewModelItemGetHourOfDay);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.item
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}