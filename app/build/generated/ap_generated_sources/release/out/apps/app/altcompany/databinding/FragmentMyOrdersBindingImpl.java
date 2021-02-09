package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyOrdersBindingImpl extends FragmentMyOrdersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tabs, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyOrdersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentMyOrdersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.airbnb.lottie.LottieAnimationView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.tabs.TabLayout) bindings[3]
            );
        this.animationView.setTag(null);
        this.rcCurrentOrders.setTag(null);
        this.searchContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.manager == variableId) {
            setManager((androidx.fragment.app.FragmentManager) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((apps.app.altcompany.pages.myOrders.viewModels.MyOrdersViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setManager(@Nullable androidx.fragment.app.FragmentManager Manager) {
        this.mManager = Manager;
    }
    public void setViewModel(@Nullable apps.app.altcompany.pages.myOrders.viewModels.MyOrdersViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((apps.app.altcompany.pages.myOrders.viewModels.MyOrdersViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(apps.app.altcompany.pages.myOrders.viewModels.MyOrdersViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.ordersAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean viewModelOrdersAdapterItemCountInt0 = false;
        int viewModelOrdersAdapterItemCountInt0ViewGONEViewVISIBLE = 0;
        apps.app.altcompany.pages.myOrders.adapters.MyOrdersAdapter viewModelOrdersAdapter = null;
        apps.app.altcompany.pages.myOrders.viewModels.MyOrdersViewModel viewModel = mViewModel;
        int viewModelOrdersAdapterItemCount = 0;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.ordersAdapter
                    viewModelOrdersAdapter = viewModel.getOrdersAdapter();
                }


                if (viewModelOrdersAdapter != null) {
                    // read viewModel.ordersAdapter.itemCount
                    viewModelOrdersAdapterItemCount = viewModelOrdersAdapter.getItemCount();
                }


                // read viewModel.ordersAdapter.itemCount > 0
                viewModelOrdersAdapterItemCountInt0 = (viewModelOrdersAdapterItemCount) > (0);
            if((dirtyFlags & 0xdL) != 0) {
                if(viewModelOrdersAdapterItemCountInt0) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read viewModel.ordersAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
                viewModelOrdersAdapterItemCountInt0ViewGONEViewVISIBLE = ((viewModelOrdersAdapterItemCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.animationView.setVisibility(viewModelOrdersAdapterItemCountInt0ViewGONEViewVISIBLE);
            apps.app.altcompany.base.ApplicationBinding.getItemsV2Binding(this.rcCurrentOrders, viewModelOrdersAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): manager
        flag 2 (0x3L): viewModel.ordersAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.ordersAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewModel.ordersAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}