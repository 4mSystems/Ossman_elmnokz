package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCategoryBindingImpl extends ItemCategoryBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatCheckBox mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatCheckBox) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((apps.app.altcompany.pages.auth.register.viewModels.ItemCategoriesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable apps.app.altcompany.pages.auth.register.viewModels.ItemCategoriesViewModel ItemViewModel) {
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
                return onChangeItemViewModel((apps.app.altcompany.pages.auth.register.viewModels.ItemCategoriesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(apps.app.altcompany.pages.auth.register.viewModels.ItemCategoriesViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.categoryData) {
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
        apps.app.altcompany.pages.auth.register.viewModels.ItemCategoriesViewModel itemViewModel = mItemViewModel;
        boolean itemViewModelCategoryDataChecked = false;
        boolean itemViewModelCategoryDataCheckedBooleanTrueBooleanFalse = false;
        apps.app.altcompany.pages.auth.register.models.categories.RelatedSubCategoriesItem itemViewModelCategoryData = null;
        java.lang.String itemViewModelCategoryDataSubCategoriesName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.categoryData
                    itemViewModelCategoryData = itemViewModel.getCategoryData();
                }


                if (itemViewModelCategoryData != null) {
                    // read itemViewModel.categoryData.checked
                    itemViewModelCategoryDataChecked = itemViewModelCategoryData.isChecked();
                    // read itemViewModel.categoryData.subCategoriesName
                    itemViewModelCategoryDataSubCategoriesName = itemViewModelCategoryData.getSubCategoriesName();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelCategoryDataChecked) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read itemViewModel.categoryData.checked ? true : false
                itemViewModelCategoryDataCheckedBooleanTrueBooleanFalse = ((itemViewModelCategoryDataChecked) ? (true) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView1, itemViewModelCategoryDataCheckedBooleanTrueBooleanFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelCategoryDataSubCategoriesName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback18);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        apps.app.altcompany.pages.auth.register.viewModels.ItemCategoriesViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {


            itemViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.categoryData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.categoryData.checked ? true : false
        flag 4 (0x5L): itemViewModel.categoryData.checked ? true : false
    flag mapping end*/
    //end
}