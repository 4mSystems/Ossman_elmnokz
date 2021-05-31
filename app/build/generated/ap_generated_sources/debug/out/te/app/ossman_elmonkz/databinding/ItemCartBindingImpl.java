package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCartBindingImpl extends ItemCartBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br, 9);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[9]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[7]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.colorName.setTag(null);
        this.decrement.setTag(null);
        this.increment.setTag(null);
        this.incrementalViewText.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.productBrand.setTag(null);
        this.productModel.setTag(null);
        this.productName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
        mCallback32 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 3);
        mCallback31 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 2);
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
            setItemViewModel((te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.product) {
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
        java.lang.String productModelAndroidStringModelConcatJavaLangStringConcatItemViewModelProductModelNameJavaLangObjectNullItemViewModelProductModelNameJavaLangString = null;
        java.lang.String productNameAndroidStringDepartmentConcatJavaLangStringConcatItemViewModelProductPartNameJavaLangObjectNullItemViewModelProductPartNameJavaLangString = null;
        java.lang.String itemViewModelProductProductColorName = null;
        java.lang.String itemViewModelProductModelNameJavaLangObjectNullItemViewModelProductModelNameJavaLangString = null;
        java.lang.String itemViewModelProductBrandName = null;
        te.app.ossman_elmonkz.pages.buying.models.OrderRequest itemViewModelProduct = null;
        boolean itemViewModelProductProductColorNameJavaLangObjectNull = false;
        boolean itemViewModelProductBrandNameJavaLangObjectNull = false;
        java.lang.String itemViewModelProductProductColorNameJavaLangObjectNullItemViewModelProductProductColorNameJavaLangString = null;
        boolean itemViewModelProductPartNameJavaLangObjectNull = false;
        java.lang.String itemViewModelProductQuantity = null;
        java.lang.String productBrandAndroidStringBrandConcatJavaLangStringConcatItemViewModelProductBrandNameJavaLangObjectNullItemViewModelProductBrandNameJavaLangString = null;
        java.lang.String itemViewModelProductPartName = null;
        java.lang.String itemViewModelProductPartNameJavaLangObjectNullItemViewModelProductPartNameJavaLangString = null;
        java.lang.String itemViewModelProductModelName = null;
        java.lang.String itemViewModelProductBrandNameJavaLangObjectNullItemViewModelProductBrandNameJavaLangString = null;
        te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel itemViewModel = mItemViewModel;
        int itemViewModelProductPartNameJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean itemViewModelProductModelNameJavaLangObjectNull = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.product
                    itemViewModelProduct = itemViewModel.getProduct();
                }


                if (itemViewModelProduct != null) {
                    // read itemViewModel.product.productColorName
                    itemViewModelProductProductColorName = itemViewModelProduct.getProductColorName();
                    // read itemViewModel.product.brandName
                    itemViewModelProductBrandName = itemViewModelProduct.getBrandName();
                    // read itemViewModel.product.quantity
                    itemViewModelProductQuantity = itemViewModelProduct.getQuantity();
                    // read itemViewModel.product.partName
                    itemViewModelProductPartName = itemViewModelProduct.getPartName();
                    // read itemViewModel.product.modelName
                    itemViewModelProductModelName = itemViewModelProduct.getModelName();
                }


                // read itemViewModel.product.productColorName != null
                itemViewModelProductProductColorNameJavaLangObjectNull = (itemViewModelProductProductColorName) != (null);
                // read itemViewModel.product.brandName != null
                itemViewModelProductBrandNameJavaLangObjectNull = (itemViewModelProductBrandName) != (null);
                // read itemViewModel.product.partName != null
                itemViewModelProductPartNameJavaLangObjectNull = (itemViewModelProductPartName) != (null);
                // read itemViewModel.product.modelName != null
                itemViewModelProductModelNameJavaLangObjectNull = (itemViewModelProductModelName) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelProductProductColorNameJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelProductBrandNameJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelProductPartNameJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelProductModelNameJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read itemViewModel.product.partName != null ? View.VISIBLE : View.GONE
                itemViewModelProductPartNameJavaLangObjectNullViewVISIBLEViewGONE = ((itemViewModelProductPartNameJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemViewModel.product.modelName != null ? itemViewModel.product.modelName : ""
                itemViewModelProductModelNameJavaLangObjectNullItemViewModelProductModelNameJavaLangString = ((itemViewModelProductModelNameJavaLangObjectNull) ? (itemViewModelProductModelName) : (""));
                // read itemViewModel.product.productColorName != null ? itemViewModel.product.productColorName : ""
                itemViewModelProductProductColorNameJavaLangObjectNullItemViewModelProductProductColorNameJavaLangString = ((itemViewModelProductProductColorNameJavaLangObjectNull) ? (itemViewModelProductProductColorName) : (""));
                // read itemViewModel.product.partName != null ? itemViewModel.product.partName : ""
                itemViewModelProductPartNameJavaLangObjectNullItemViewModelProductPartNameJavaLangString = ((itemViewModelProductPartNameJavaLangObjectNull) ? (itemViewModelProductPartName) : (""));
                // read itemViewModel.product.brandName != null ? itemViewModel.product.brandName : ""
                itemViewModelProductBrandNameJavaLangObjectNullItemViewModelProductBrandNameJavaLangString = ((itemViewModelProductBrandNameJavaLangObjectNull) ? (itemViewModelProductBrandName) : (""));


                // read @android:string/model.concat(" ").concat(itemViewModel.product.modelName != null ? itemViewModel.product.modelName : "")
                productModelAndroidStringModelConcatJavaLangStringConcatItemViewModelProductModelNameJavaLangObjectNullItemViewModelProductModelNameJavaLangString = productModel.getResources().getString(R.string.model).concat(" ").concat(itemViewModelProductModelNameJavaLangObjectNullItemViewModelProductModelNameJavaLangString);
                // read @android:string/department.concat(" ").concat(itemViewModel.product.partName != null ? itemViewModel.product.partName : "")
                productNameAndroidStringDepartmentConcatJavaLangStringConcatItemViewModelProductPartNameJavaLangObjectNullItemViewModelProductPartNameJavaLangString = productName.getResources().getString(R.string.department).concat(" ").concat(itemViewModelProductPartNameJavaLangObjectNullItemViewModelProductPartNameJavaLangString);
                // read @android:string/brand.concat(" ").concat(itemViewModel.product.brandName != null ? itemViewModel.product.brandName : "")
                productBrandAndroidStringBrandConcatJavaLangStringConcatItemViewModelProductBrandNameJavaLangObjectNullItemViewModelProductBrandNameJavaLangString = productBrand.getResources().getString(R.string.brand).concat(" ").concat(itemViewModelProductBrandNameJavaLangObjectNullItemViewModelProductBrandNameJavaLangString);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.colorName, itemViewModelProductProductColorNameJavaLangObjectNullItemViewModelProductProductColorNameJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.incrementalViewText, itemViewModelProductQuantity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productBrand, productBrandAndroidStringBrandConcatJavaLangStringConcatItemViewModelProductBrandNameJavaLangObjectNullItemViewModelProductBrandNameJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productModel, productModelAndroidStringModelConcatJavaLangStringConcatItemViewModelProductModelNameJavaLangObjectNullItemViewModelProductModelNameJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, productNameAndroidStringDepartmentConcatJavaLangStringConcatItemViewModelProductPartNameJavaLangObjectNullItemViewModelProductPartNameJavaLangString);
            this.productName.setVisibility(itemViewModelProductPartNameJavaLangObjectNullViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.decrement.setOnClickListener(mCallback31);
            this.increment.setOnClickListener(mCallback30);
            this.mboundView8.setOnClickListener(mCallback32);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.plusItem();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.deleteItem();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.minusItem();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.product
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.product.modelName != null ? itemViewModel.product.modelName : ""
        flag 4 (0x5L): itemViewModel.product.modelName != null ? itemViewModel.product.modelName : ""
        flag 5 (0x6L): itemViewModel.product.productColorName != null ? itemViewModel.product.productColorName : ""
        flag 6 (0x7L): itemViewModel.product.productColorName != null ? itemViewModel.product.productColorName : ""
        flag 7 (0x8L): itemViewModel.product.partName != null ? itemViewModel.product.partName : ""
        flag 8 (0x9L): itemViewModel.product.partName != null ? itemViewModel.product.partName : ""
        flag 9 (0xaL): itemViewModel.product.brandName != null ? itemViewModel.product.brandName : ""
        flag 10 (0xbL): itemViewModel.product.brandName != null ? itemViewModel.product.brandName : ""
        flag 11 (0xcL): itemViewModel.product.partName != null ? View.VISIBLE : View.GONE
        flag 12 (0xdL): itemViewModel.product.partName != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}