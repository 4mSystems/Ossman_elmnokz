package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMenuBindingImpl extends ItemMenuBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.imgMenuItem.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMenuItem.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemMenuViewModel == variableId) {
            setItemMenuViewModel((apps.app.altcompany.customViews.menu.ItemMenuViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemMenuViewModel(@Nullable apps.app.altcompany.customViews.menu.ItemMenuViewModel ItemMenuViewModel) {
        updateRegistration(0, ItemMenuViewModel);
        this.mItemMenuViewModel = ItemMenuViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemMenuViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemMenuViewModel((apps.app.altcompany.customViews.menu.ItemMenuViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemMenuViewModel(apps.app.altcompany.customViews.menu.ItemMenuViewModel ItemMenuViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.menuModel) {
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
        int itemMenuViewModelMenuModelIcon = 0;
        apps.app.altcompany.customViews.menu.MenuModel itemMenuViewModelMenuModel = null;
        apps.app.altcompany.customViews.menu.ItemMenuViewModel itemMenuViewModel = mItemMenuViewModel;
        java.lang.String itemMenuViewModelMenuModelTitle = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemMenuViewModel != null) {
                    // read itemMenuViewModel.menuModel
                    itemMenuViewModelMenuModel = itemMenuViewModel.getMenuModel();
                }


                if (itemMenuViewModelMenuModel != null) {
                    // read itemMenuViewModel.menuModel.icon
                    itemMenuViewModelMenuModelIcon = itemMenuViewModelMenuModel.icon;
                    // read itemMenuViewModel.menuModel.title
                    itemMenuViewModelMenuModelTitle = itemMenuViewModelMenuModel.title;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.loadImage(this.imgMenuItem, itemMenuViewModelMenuModelIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMenuItem, itemMenuViewModelMenuModelTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback10);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemMenuViewModel != null
        boolean itemMenuViewModelJavaLangObjectNull = false;
        // itemMenuViewModel
        apps.app.altcompany.customViews.menu.ItemMenuViewModel itemMenuViewModel = mItemMenuViewModel;



        itemMenuViewModelJavaLangObjectNull = (itemMenuViewModel) != (null);
        if (itemMenuViewModelJavaLangObjectNull) {


            itemMenuViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemMenuViewModel
        flag 1 (0x2L): itemMenuViewModel.menuModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}