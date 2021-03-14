package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemClientsBindingImpl extends ItemClientsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br4, 6);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemClientsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemClientsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[5]
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[4]
            );
        this.address.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.phone.setTag(null);
        this.productImage.setTag(null);
        this.productName.setTag(null);
        this.shopName.setTag(null);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemClientViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemClientViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemClientViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemClientViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.clientData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemClientViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelClientDataPhone = null;
        java.lang.String itemViewModelClientDataAddress = null;
        java.lang.String itemViewModelClientDataShopName = null;
        te.app.ossman_elmonkz.pages.agentsAndClients.models.clients.ClientData itemViewModelClientData = null;
        java.lang.String itemViewModelClientDataNameSubstringInt0Int1 = null;
        java.lang.String itemViewModelClientDataName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.clientData
                    itemViewModelClientData = itemViewModel.getClientData();
                }


                if (itemViewModelClientData != null) {
                    // read itemViewModel.clientData.phone
                    itemViewModelClientDataPhone = itemViewModelClientData.getPhone();
                    // read itemViewModel.clientData.address
                    itemViewModelClientDataAddress = itemViewModelClientData.getAddress();
                    // read itemViewModel.clientData.shopName
                    itemViewModelClientDataShopName = itemViewModelClientData.getShopName();
                    // read itemViewModel.clientData.name
                    itemViewModelClientDataName = itemViewModelClientData.getName();
                }


                if (itemViewModelClientDataName != null) {
                    // read itemViewModel.clientData.name.substring(0, 1)
                    itemViewModelClientDataNameSubstringInt0Int1 = itemViewModelClientDataName.substring(0, 1);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, itemViewModelClientDataShopName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phone, itemViewModelClientDataPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productImage, itemViewModelClientDataNameSubstringInt0Int1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, itemViewModelClientDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.shopName, itemViewModelClientDataAddress);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.clientData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}