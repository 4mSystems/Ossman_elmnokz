package te.app.mezzastore.databinding;
import te.app.mezzastore.R;
import te.app.mezzastore.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductsBindingImpl extends ItemProductsBinding implements te.app.mezzastore.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final te.app.mezzastore.customViews.views.CustomTextViewMedium mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemProductsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (te.app.mezzastore.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (te.app.mezzastore.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.productImage.setTag(null);
        this.productName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new te.app.mezzastore.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.mezzastore.pages.products.viewModels.ItemProductsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.mezzastore.pages.products.viewModels.ItemProductsViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.mezzastore.pages.products.viewModels.ItemProductsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.mezzastore.pages.products.viewModels.ItemProductsViewModel ItemViewModel, int fieldId) {
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
        java.lang.String itemViewModelProductPriceConcatJavaLangString = null;
        te.app.mezzastore.pages.products.viewModels.ItemProductsViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelProductPrice = null;
        java.lang.String itemViewModelProductImage = null;
        java.lang.String itemViewModelProductTitle = null;
        te.app.mezzastore.pages.products.models.productDetails.Product itemViewModelProduct = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.product
                    itemViewModelProduct = itemViewModel.getProduct();
                }


                if (itemViewModelProduct != null) {
                    // read itemViewModel.product.price
                    itemViewModelProductPrice = itemViewModelProduct.getPrice();
                    // read itemViewModel.product.image
                    itemViewModelProductImage = itemViewModelProduct.getImage();
                    // read itemViewModel.product.title
                    itemViewModelProductTitle = itemViewModelProduct.getTitle();
                }


                if (itemViewModelProductPrice != null) {
                    // read itemViewModel.product.price.concat("ج.م")
                    itemViewModelProductPriceConcatJavaLangString = itemViewModelProductPrice.concat("ج.م");
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelProductPriceConcatJavaLangString);
            te.app.mezzastore.base.ApplicationBinding.loadImage(this.productImage, itemViewModelProductImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, itemViewModelProductTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.mezzastore.pages.products.viewModels.ItemProductsViewModel itemViewModel = mItemViewModel;
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
        flag 1 (0x2L): itemViewModel.product
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}