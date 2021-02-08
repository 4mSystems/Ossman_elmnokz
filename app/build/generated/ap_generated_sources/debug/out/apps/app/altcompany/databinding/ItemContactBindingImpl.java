package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemContactBindingImpl extends ItemContactBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_item_contact_container, 3);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemContactBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[3]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.imgItemContact.setTag(null);
        this.rlItemContact.setTag(null);
        this.tvItemContact.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemContactViewModel == variableId) {
            setItemContactViewModel((apps.app.altcompany.pages.settings.viewModels.ItemContactViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemContactViewModel(@Nullable apps.app.altcompany.pages.settings.viewModels.ItemContactViewModel ItemContactViewModel) {
        updateRegistration(0, ItemContactViewModel);
        this.mItemContactViewModel = ItemContactViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemContactViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemContactViewModel((apps.app.altcompany.pages.settings.viewModels.ItemContactViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemContactViewModel(apps.app.altcompany.pages.settings.viewModels.ItemContactViewModel ItemContactViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.socialsItem) {
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
        java.lang.String itemContactViewModelSocialsItemSocialImage = null;
        apps.app.altcompany.pages.settings.models.SocialsItem itemContactViewModelSocialsItem = null;
        apps.app.altcompany.pages.settings.viewModels.ItemContactViewModel itemContactViewModel = mItemContactViewModel;
        java.lang.String itemContactViewModelSocialsItemSocialLink = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemContactViewModel != null) {
                    // read itemContactViewModel.socialsItem
                    itemContactViewModelSocialsItem = itemContactViewModel.getSocialsItem();
                }


                if (itemContactViewModelSocialsItem != null) {
                    // read itemContactViewModel.socialsItem.socialImage
                    itemContactViewModelSocialsItemSocialImage = itemContactViewModelSocialsItem.getSocialImage();
                    // read itemContactViewModel.socialsItem.socialLink
                    itemContactViewModelSocialsItemSocialLink = itemContactViewModelSocialsItem.getSocialLink();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.loadImage(this.imgItemContact, itemContactViewModelSocialsItemSocialImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemContact, itemContactViewModelSocialsItemSocialLink);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.rlItemContact.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemContactViewModel != null
        boolean itemContactViewModelJavaLangObjectNull = false;
        // itemContactViewModel
        apps.app.altcompany.pages.settings.viewModels.ItemContactViewModel itemContactViewModel = mItemContactViewModel;



        itemContactViewModelJavaLangObjectNull = (itemContactViewModel) != (null);
        if (itemContactViewModelJavaLangObjectNull) {


            itemContactViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemContactViewModel
        flag 1 (0x2L): itemContactViewModel.socialsItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}