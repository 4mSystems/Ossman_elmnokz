package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChatAdminBindingImpl extends ItemChatAdminBinding  {

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

    public ItemChatAdminBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemChatAdminBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.driverImage.setTag(null);
        this.itemMessage.setTag(null);
        this.rlItemChat.setTag(null);
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
        if (BR.itemChatViewModel == variableId) {
            setItemChatViewModel((apps.app.altcompany.pages.chatAdmin.viewmodel.ItemChatAdminViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemChatViewModel(@Nullable apps.app.altcompany.pages.chatAdmin.viewmodel.ItemChatAdminViewModel ItemChatViewModel) {
        updateRegistration(0, ItemChatViewModel);
        this.mItemChatViewModel = ItemChatViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemChatViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemChatViewModel((apps.app.altcompany.pages.chatAdmin.viewmodel.ItemChatAdminViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemChatViewModel(apps.app.altcompany.pages.chatAdmin.viewmodel.ItemChatAdminViewModel ItemChatViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.chat) {
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
        java.lang.String itemChatViewModelChatImage = null;
        int itemChatViewModelChatSenderType = 0;
        java.lang.String itemChatViewModelChatMessage = null;
        apps.app.altcompany.pages.chatAdmin.model.ChatAdmin itemChatViewModelChat = null;
        apps.app.altcompany.pages.chatAdmin.viewmodel.ItemChatAdminViewModel itemChatViewModel = mItemChatViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemChatViewModel != null) {
                    // read itemChatViewModel.chat
                    itemChatViewModelChat = itemChatViewModel.getChat();
                }


                if (itemChatViewModelChat != null) {
                    // read itemChatViewModel.chat.image
                    itemChatViewModelChatImage = itemChatViewModelChat.getImage();
                    // read itemChatViewModel.chat.senderType
                    itemChatViewModelChatSenderType = itemChatViewModelChat.getSenderType();
                    // read itemChatViewModel.chat.message
                    itemChatViewModelChatMessage = itemChatViewModelChat.getMessage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.loadImage(this.driverImage, itemChatViewModelChatImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemMessage, itemChatViewModelChatMessage);
            apps.app.altcompany.pages.chatAdmin.viewmodel.ItemChatAdminViewModel.chatAdminDirection(this.rlItemChat, itemChatViewModelChatSenderType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemChatViewModel
        flag 1 (0x2L): itemChatViewModel.chat
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}