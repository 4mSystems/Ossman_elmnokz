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
        sViewsWithIds.put(R.id.br, 8);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.google.android.material.textview.MaterialTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.decrement.setTag(null);
        this.increment.setTag(null);
        this.incrementalViewText.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.productImage.setTag(null);
        this.productName.setTag(null);
        this.productPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 3);
        mCallback12 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
        mCallback13 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 2);
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
        java.lang.String stringValueOfItemViewModelProductQuantity = null;
        te.app.ossman_elmonkz.pages.cart.viewModels.ItemCartViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelProductPrice = null;
        java.lang.String itemViewModelProductTitle = null;
        te.app.ossman_elmonkz.pages.products.models.productDetails.Product itemViewModelProduct = null;
        java.lang.String itemViewModelProductPriceConcatJavaLangString = null;
        java.lang.String itemViewModelProductPriceConcatJavaLangStringConcatJavaLangString = null;
        java.lang.String itemViewModelProductMainImage = null;
        int itemViewModelProductQuantity = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.product
                    itemViewModelProduct = itemViewModel.getProduct();
                }


                if (itemViewModelProduct != null) {
                    // read itemViewModel.product.price
                    itemViewModelProductPrice = itemViewModelProduct.getPrice();
                    // read itemViewModel.product.title
                    itemViewModelProductTitle = itemViewModelProduct.getTitle();
                    // read itemViewModel.product.main_image
                    itemViewModelProductMainImage = itemViewModelProduct.getMain_image();
                    // read itemViewModel.product.quantity
                    itemViewModelProductQuantity = itemViewModelProduct.getQuantity();
                }


                if (itemViewModelProductPrice != null) {
                    // read itemViewModel.product.price.concat(" ")
                    itemViewModelProductPriceConcatJavaLangString = itemViewModelProductPrice.concat(" ");
                }
                // read String.valueOf(itemViewModel.product.quantity)
                stringValueOfItemViewModelProductQuantity = java.lang.String.valueOf(itemViewModelProductQuantity);


                if (itemViewModelProductPriceConcatJavaLangString != null) {
                    // read itemViewModel.product.price.concat(" ").concat("ج.م")
                    itemViewModelProductPriceConcatJavaLangStringConcatJavaLangString = itemViewModelProductPriceConcatJavaLangString.concat("ج.م");
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.decrement.setOnClickListener(mCallback13);
            this.increment.setOnClickListener(mCallback12);
            this.mboundView7.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.incrementalViewText, stringValueOfItemViewModelProductQuantity);
            te.app.ossman_elmonkz.base.ApplicationBinding.loadImage(this.productImage, itemViewModelProductMainImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, itemViewModelProductTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productPrice, itemViewModelProductPriceConcatJavaLangStringConcatJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
    flag mapping end*/
    //end
}