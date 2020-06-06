package com.hs.weatherforecast.databinding;
import com.hs.weatherforecast.R;
import com.hs.weatherforecast.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWeatherDetailBindingImpl extends FragmentWeatherDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.coordinatorLayout, 8);
        sViewsWithIds.put(R.id.fabClose, 9);
        sViewsWithIds.put(R.id.scrollView, 10);
        sViewsWithIds.put(R.id.cardViewHourOfDayContainer, 11);
        sViewsWithIds.put(R.id.recyclerViewHourOfDay, 12);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentWeatherDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentWeatherDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[11]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[8]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.RelativeLayout) bindings[0]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.cardView.setTag(null);
        this.imageViewForecastIcon.setTag(null);
        this.linearLayoutTempMaxMin.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.rootView.setTag(null);
        this.textViewDayOfWeek.setTag(null);
        this.textViewTemp.setTag(null);
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
            setViewModel((com.hs.weatherforecast.ui.weather_detail.WeatherDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.hs.weatherforecast.ui.weather_detail.WeatherDetailViewModel ViewModel) {
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
                return onChangeViewModelWeatherItem((androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelWeatherItem(androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem> ViewModelWeatherItem, int fieldId) {
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
        androidx.databinding.ObservableField<com.hs.weatherforecast.domain.model.ListItem> viewModelWeatherItem = null;
        java.lang.String viewModelWeatherItemMainGetTempMaxString = null;
        java.lang.String stringFormatLinearLayoutTempMaxMinAndroidStringTempMaxMinViewModelWeatherItemGetDay = null;
        com.hs.weatherforecast.domain.model.Main viewModelWeatherItemMain = null;
        java.lang.String viewModelWeatherItemMainGetTempMinString = null;
        java.lang.String stringFormatTextViewTempAndroidStringTempViewModelWeatherItemGetDay = null;
        com.hs.weatherforecast.domain.model.ListItem viewModelWeatherItemGet = null;
        int viewModelWeatherItemGetColor = 0;
        com.hs.weatherforecast.domain.model.WeatherItem viewModelWeatherItemGetWeatherItem = null;
        java.lang.String viewModelWeatherItemGetDay = null;
        java.lang.String viewModelWeatherItemGetWeatherItemIcon = null;
        java.lang.String stringFormatImageViewForecastIconAndroidStringForecastIconViewModelWeatherItemGetDay = null;
        java.lang.String viewModelWeatherItemMainGetTempString = null;
        java.lang.String stringFormatTextViewDayOfWeekAndroidStringDayOfWeekViewModelWeatherItemGetDay = null;
        com.hs.weatherforecast.ui.weather_detail.WeatherDetailViewModel viewModel = mViewModel;
        java.lang.String stringFormatCardViewAndroidStringCardViewViewModelWeatherItemGetDay = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.weatherItem
                    viewModelWeatherItem = viewModel.getWeatherItem();
                }
                updateRegistration(0, viewModelWeatherItem);


                if (viewModelWeatherItem != null) {
                    // read viewModel.weatherItem.get()
                    viewModelWeatherItemGet = viewModelWeatherItem.get();
                }


                if (viewModelWeatherItemGet != null) {
                    // read viewModel.weatherItem.get().main
                    viewModelWeatherItemMain = viewModelWeatherItemGet.getMain();
                    // read viewModel.weatherItem.get().getColor()
                    viewModelWeatherItemGetColor = viewModelWeatherItemGet.getColor();
                    // read viewModel.weatherItem.get().getWeatherItem()
                    viewModelWeatherItemGetWeatherItem = viewModelWeatherItemGet.getWeatherItem();
                    // read viewModel.weatherItem.get().getDay()
                    viewModelWeatherItemGetDay = viewModelWeatherItemGet.getDay();
                }


                if (viewModelWeatherItemMain != null) {
                    // read viewModel.weatherItem.get().main.getTempMaxString()
                    viewModelWeatherItemMainGetTempMaxString = viewModelWeatherItemMain.getTempMaxString();
                    // read viewModel.weatherItem.get().main.getTempMinString()
                    viewModelWeatherItemMainGetTempMinString = viewModelWeatherItemMain.getTempMinString();
                    // read viewModel.weatherItem.get().main.getTempString()
                    viewModelWeatherItemMainGetTempString = viewModelWeatherItemMain.getTempString();
                }
                if (viewModelWeatherItemGetWeatherItem != null) {
                    // read viewModel.weatherItem.get().getWeatherItem().icon
                    viewModelWeatherItemGetWeatherItemIcon = viewModelWeatherItemGetWeatherItem.getIcon();
                }
                // read String.format(@android:string/tempMaxMin, viewModel.weatherItem.get().getDay())
                stringFormatLinearLayoutTempMaxMinAndroidStringTempMaxMinViewModelWeatherItemGetDay = java.lang.String.format(linearLayoutTempMaxMin.getResources().getString(R.string.tempMaxMin), viewModelWeatherItemGetDay);
                // read String.format(@android:string/temp, viewModel.weatherItem.get().getDay())
                stringFormatTextViewTempAndroidStringTempViewModelWeatherItemGetDay = java.lang.String.format(textViewTemp.getResources().getString(R.string.temp), viewModelWeatherItemGetDay);
                // read String.format(@android:string/forecastIcon, viewModel.weatherItem.get().getDay())
                stringFormatImageViewForecastIconAndroidStringForecastIconViewModelWeatherItemGetDay = java.lang.String.format(imageViewForecastIcon.getResources().getString(R.string.forecastIcon), viewModelWeatherItemGetDay);
                // read String.format(@android:string/dayOfWeek, viewModel.weatherItem.get().getDay())
                stringFormatTextViewDayOfWeekAndroidStringDayOfWeekViewModelWeatherItemGetDay = java.lang.String.format(textViewDayOfWeek.getResources().getString(R.string.dayOfWeek), viewModelWeatherItemGetDay);
                // read String.format(@android:string/cardView, viewModel.weatherItem.get().getDay())
                stringFormatCardViewAndroidStringCardViewViewModelWeatherItemGetDay = java.lang.String.format(cardView.getResources().getString(R.string.cardView), viewModelWeatherItemGetDay);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.cardView.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(viewModelWeatherItemGetColor));
                this.cardView.setTransitionName(stringFormatCardViewAndroidStringCardViewViewModelWeatherItemGetDay);
                this.imageViewForecastIcon.setTransitionName(stringFormatImageViewForecastIconAndroidStringForecastIconViewModelWeatherItemGetDay);
                this.linearLayoutTempMaxMin.setTransitionName(stringFormatLinearLayoutTempMaxMinAndroidStringTempMaxMinViewModelWeatherItemGetDay);
                this.textViewDayOfWeek.setTransitionName(stringFormatTextViewDayOfWeekAndroidStringDayOfWeekViewModelWeatherItemGetDay);
                this.textViewTemp.setTransitionName(stringFormatTextViewTempAndroidStringTempViewModelWeatherItemGetDay);
            }
            // api target 1

            com.hs.weatherforecast.core.BindingAdapterKt.setWeatherIcon(this.imageViewForecastIcon, viewModelWeatherItemGetWeatherItemIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelWeatherItemMainGetTempMinString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelWeatherItemMainGetTempMaxString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewDayOfWeek, viewModelWeatherItemGetDay);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTemp, viewModelWeatherItemMainGetTempString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.weatherItem
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}