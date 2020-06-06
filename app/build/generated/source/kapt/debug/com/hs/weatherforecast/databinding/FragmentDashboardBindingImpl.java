package com.hs.weatherforecast.databinding;
import com.hs.weatherforecast.R;
import com.hs.weatherforecast.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDashboardBindingImpl extends FragmentDashboardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"layout_dashboard_forecast"},
            new int[] {3},
            new int[] {com.hs.weatherforecast.R.layout.layout_dashboard_forecast});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 4);
        sViewsWithIds.put(R.id.textViewForecastHeader, 5);
        sViewsWithIds.put(R.id.recyclerForecast, 6);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDashboardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentDashboardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.hs.weatherforecast.databinding.LayoutDashboardForecastBinding) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.RelativeLayout) bindings[0]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.progressBar.setTag(null);
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        containerForecast.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (containerForecast.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewState == variableId) {
            setViewState((com.hs.weatherforecast.ui.dashboard.ForecastViewState) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.hs.weatherforecast.ui.dashboard.DashboardFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable com.hs.weatherforecast.ui.dashboard.ForecastViewState ViewState) {
        this.mViewState = ViewState;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewState);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.hs.weatherforecast.ui.dashboard.DashboardFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        containerForecast.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeContainerForecast((com.hs.weatherforecast.databinding.LayoutDashboardForecastBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeContainerForecast(com.hs.weatherforecast.databinding.LayoutDashboardForecastBinding ContainerForecast, int fieldId) {
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
        com.hs.weatherforecast.ui.dashboard.ForecastViewState viewState = mViewState;
        boolean viewStateIsLoading = false;

        if ((dirtyFlags & 0xaL) != 0) {



                if (viewState != null) {
                    // read viewState.isLoading()
                    viewStateIsLoading = viewState.isLoading();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.hs.weatherforecast.core.BindingAdapterKt.setVisibilty(this.progressBar, viewStateIsLoading);
        }
        executeBindingsOn(containerForecast);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): containerForecast
        flag 1 (0x2L): viewState
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}