package com.hs.weatherforecast.databinding;
import com.hs.weatherforecast.R;
import com.hs.weatherforecast.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSearchResultBindingImpl extends ItemSearchResultBinding  {

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

    public ItemSearchResultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemSearchResultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            );
        this.rootView.setTag(null);
        this.textViewCityName.setTag(null);
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
            setViewModel((com.hs.weatherforecast.ui.search.result.SearchResultItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.hs.weatherforecast.ui.search.result.SearchResultItemViewModel ViewModel) {
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
                return onChangeViewModelItem((androidx.databinding.ObservableField<com.hs.weatherforecast.db.entity.CitiesForSearchEntity>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelItem(androidx.databinding.ObservableField<com.hs.weatherforecast.db.entity.CitiesForSearchEntity> ViewModelItem, int fieldId) {
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
        androidx.databinding.ObservableField<com.hs.weatherforecast.db.entity.CitiesForSearchEntity> viewModelItem = null;
        com.hs.weatherforecast.db.entity.CitiesForSearchEntity viewModelItemGet = null;
        android.text.SpannableString viewModelItemGetFullName = null;
        com.hs.weatherforecast.ui.search.result.SearchResultItemViewModel viewModel = mViewModel;

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
                    // read viewModel.item.get().getFullName()
                    viewModelItemGetFullName = viewModelItemGet.getFullName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewCityName, viewModelItemGetFullName);
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