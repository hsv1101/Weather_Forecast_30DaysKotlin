package com.hs.weatherforecast.databinding;
import com.hs.weatherforecast.R;
import com.hs.weatherforecast.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemWeatherHourOfDayBindingImpl extends ItemWeatherHourOfDayBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemWeatherHourOfDayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemWeatherHourOfDayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[2]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.imageViewForecastIcon.setTag(null);
        this.rootView.setTag(null);
        this.textViewHourOfDay.setTag(null);
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
            setViewModel((com.hs.weatherforecast.ui.weather_detail.weatherHourOfDay.WeatherHourOfDayItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.hs.weatherforecast.ui.weather_detail.weatherHourOfDay.WeatherHourOfDayItemViewModel ViewModel) {
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
        com.hs.weatherforecast.domain.model.ListItem viewModelItemGet = null;
        com.hs.weatherforecast.domain.model.WeatherItem viewModelItemGetWeatherItem = null;
        java.lang.String viewModelItemGetHourOfDay = null;
        java.lang.String viewModelItemGetWeatherItemIcon = null;
        com.hs.weatherforecast.domain.model.Main viewModelItemMain = null;
        int viewModelItemGetHourColor = 0;
        com.hs.weatherforecast.ui.weather_detail.weatherHourOfDay.WeatherHourOfDayItemViewModel viewModel = mViewModel;
        java.lang.String viewModelItemMainGetTempString = null;

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
                    // read viewModel.item.get().getWeatherItem()
                    viewModelItemGetWeatherItem = viewModelItemGet.getWeatherItem();
                    // read viewModel.item.get().getHourOfDay()
                    viewModelItemGetHourOfDay = viewModelItemGet.getHourOfDay();
                    // read viewModel.item.get().main
                    viewModelItemMain = viewModelItemGet.getMain();
                    // read viewModel.item.get().getHourColor()
                    viewModelItemGetHourColor = viewModelItemGet.getHourColor();
                }


                if (viewModelItemGetWeatherItem != null) {
                    // read viewModel.item.get().getWeatherItem().icon
                    viewModelItemGetWeatherItemIcon = viewModelItemGetWeatherItem.getIcon();
                }
                if (viewModelItemMain != null) {
                    // read viewModel.item.get().main.getTempString()
                    viewModelItemMainGetTempString = viewModelItemMain.getTempString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.imageViewForecastIcon.setImageTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(viewModelItemGetHourColor));
            }
            // api target 1

            com.hs.weatherforecast.core.BindingAdapterKt.setWeatherIcon(this.imageViewForecastIcon, viewModelItemGetWeatherItemIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewHourOfDay, viewModelItemGetHourOfDay);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTemp, viewModelItemMainGetTempString);
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