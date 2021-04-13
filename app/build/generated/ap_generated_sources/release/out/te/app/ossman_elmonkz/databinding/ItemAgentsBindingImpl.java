package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAgentsBindingImpl extends ItemAgentsBinding  {

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
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAgentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemAgentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.address.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.phone.setTag(null);
        this.productImage.setTag(null);
        this.productName.setTag(null);
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
            setItemViewModel((te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemAgentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemAgentViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemAgentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemAgentViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.agentData) {
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
        te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemAgentViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelAgentDataAddress = null;
        te.app.ossman_elmonkz.pages.agentsAndClients.models.AgentData itemViewModelAgentData = null;
        java.lang.String itemViewModelAgentDataImage = null;
        java.lang.String itemViewModelAgentDataName = null;
        java.lang.String itemViewModelAgentDataPhone = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.agentData
                    itemViewModelAgentData = itemViewModel.getAgentData();
                }


                if (itemViewModelAgentData != null) {
                    // read itemViewModel.agentData.address
                    itemViewModelAgentDataAddress = itemViewModelAgentData.getAddress();
                    // read itemViewModel.agentData.image
                    itemViewModelAgentDataImage = itemViewModelAgentData.getImage();
                    // read itemViewModel.agentData.name
                    itemViewModelAgentDataName = itemViewModelAgentData.getName();
                    // read itemViewModel.agentData.phone
                    itemViewModelAgentDataPhone = itemViewModelAgentData.getPhone();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, itemViewModelAgentDataAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phone, itemViewModelAgentDataPhone);
            te.app.ossman_elmonkz.base.ApplicationBinding.loadImage(this.productImage, itemViewModelAgentDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, itemViewModelAgentDataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.agentData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}