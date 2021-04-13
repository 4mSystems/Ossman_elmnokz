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
        sViewsWithIds.put(R.id.br5, 7);
        sViewsWithIds.put(R.id.br6, 8);
        sViewsWithIds.put(R.id.br4, 9);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemClientsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemClientsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[6]
            , (androidx.constraintlayout.widget.Barrier) bindings[9]
            , (androidx.constraintlayout.widget.Barrier) bindings[7]
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[5]
            );
        this.address.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
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
        int itemViewModelClientDataImageJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelClientDataImage = null;
        boolean itemViewModelClientDataImageJavaLangObjectNull = false;
        java.lang.String itemViewModelClientDataPhone = null;
        java.lang.String itemViewModelClientDataAddress = null;
        int ItemViewModelClientDataImageJavaLangObjectNullViewVISIBLEViewGONE1 = 0;
        boolean ItemViewModelClientDataImageJavaLangObjectNull1 = false;
        java.lang.String itemViewModelClientDataName = null;
        te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemClientViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelClientDataShopName = null;
        te.app.ossman_elmonkz.pages.agentsAndClients.models.clients.ClientData itemViewModelClientData = null;
        java.lang.String itemViewModelClientDataNameSubstringInt0Int1 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.clientData
                    itemViewModelClientData = itemViewModel.getClientData();
                }


                if (itemViewModelClientData != null) {
                    // read itemViewModel.clientData.image
                    itemViewModelClientDataImage = itemViewModelClientData.getImage();
                    // read itemViewModel.clientData.phone
                    itemViewModelClientDataPhone = itemViewModelClientData.getPhone();
                    // read itemViewModel.clientData.address
                    itemViewModelClientDataAddress = itemViewModelClientData.getAddress();
                    // read itemViewModel.clientData.name
                    itemViewModelClientDataName = itemViewModelClientData.getName();
                    // read itemViewModel.clientData.shopName
                    itemViewModelClientDataShopName = itemViewModelClientData.getShopName();
                }


                // read itemViewModel.clientData.image == null
                itemViewModelClientDataImageJavaLangObjectNull = (itemViewModelClientDataImage) == (null);
                // read itemViewModel.clientData.image != null
                ItemViewModelClientDataImageJavaLangObjectNull1 = (itemViewModelClientDataImage) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelClientDataImageJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(ItemViewModelClientDataImageJavaLangObjectNull1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (itemViewModelClientDataName != null) {
                    // read itemViewModel.clientData.name.substring(0, 1)
                    itemViewModelClientDataNameSubstringInt0Int1 = itemViewModelClientDataName.substring(0, 1);
                }


                // read itemViewModel.clientData.image == null ? View.VISIBLE : View.GONE
                ItemViewModelClientDataImageJavaLangObjectNullViewVISIBLEViewGONE1 = ((itemViewModelClientDataImageJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read itemViewModel.clientData.image != null ? View.VISIBLE : View.GONE
                itemViewModelClientDataImageJavaLangObjectNullViewVISIBLEViewGONE = ((ItemViewModelClientDataImageJavaLangObjectNull1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, itemViewModelClientDataShopName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, itemViewModelClientDataNameSubstringInt0Int1);
            this.name.setVisibility(ItemViewModelClientDataImageJavaLangObjectNullViewVISIBLEViewGONE1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phone, itemViewModelClientDataPhone);
            this.productImage.setVisibility(itemViewModelClientDataImageJavaLangObjectNullViewVISIBLEViewGONE);
            te.app.ossman_elmonkz.base.ApplicationBinding.loadImage(this.productImage, itemViewModelClientDataImage);
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
        flag 3 (0x4L): itemViewModel.clientData.image != null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.clientData.image != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemViewModel.clientData.image == null ? View.VISIBLE : View.GONE
        flag 6 (0x7L): itemViewModel.clientData.image == null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}