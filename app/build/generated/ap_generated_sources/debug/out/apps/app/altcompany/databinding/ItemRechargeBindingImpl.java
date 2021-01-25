package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRechargeBindingImpl extends ItemRechargeBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.radio, 3);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRechargeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemRechargeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.packeName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
            setItemMenuViewModel((apps.app.altcompany.pages.auth.register.viewModels.ItemPackagesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemMenuViewModel(@Nullable apps.app.altcompany.pages.auth.register.viewModels.ItemPackagesViewModel ItemMenuViewModel) {
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
                return onChangeItemMenuViewModel((apps.app.altcompany.pages.auth.register.viewModels.ItemPackagesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemMenuViewModel(apps.app.altcompany.pages.auth.register.viewModels.ItemPackagesViewModel ItemMenuViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.packagesData) {
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
        java.lang.String itemMenuViewModelPackagesDataPackagesDesc = null;
        apps.app.altcompany.pages.auth.register.viewModels.ItemPackagesViewModel itemMenuViewModel = mItemMenuViewModel;
        apps.app.altcompany.pages.auth.register.models.packages.PackagesData itemMenuViewModelPackagesData = null;
        java.lang.String itemMenuViewModelPackagesDataPackagesName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemMenuViewModel != null) {
                    // read itemMenuViewModel.packagesData
                    itemMenuViewModelPackagesData = itemMenuViewModel.getPackagesData();
                }


                if (itemMenuViewModelPackagesData != null) {
                    // read itemMenuViewModel.packagesData.packagesDesc
                    itemMenuViewModelPackagesDataPackagesDesc = itemMenuViewModelPackagesData.getPackagesDesc();
                    // read itemMenuViewModel.packagesData.packagesName
                    itemMenuViewModelPackagesDataPackagesName = itemMenuViewModelPackagesData.getPackagesName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemMenuViewModelPackagesDataPackagesDesc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.packeName, itemMenuViewModelPackagesDataPackagesName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemMenuViewModel != null
        boolean itemMenuViewModelJavaLangObjectNull = false;
        // itemMenuViewModel
        apps.app.altcompany.pages.auth.register.viewModels.ItemPackagesViewModel itemMenuViewModel = mItemMenuViewModel;



        itemMenuViewModelJavaLangObjectNull = (itemMenuViewModel) != (null);
        if (itemMenuViewModelJavaLangObjectNull) {


            itemMenuViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemMenuViewModel
        flag 1 (0x2L): itemMenuViewModel.packagesData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}