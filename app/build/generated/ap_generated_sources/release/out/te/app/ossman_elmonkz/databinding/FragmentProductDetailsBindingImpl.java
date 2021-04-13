package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailsBindingImpl extends FragmentProductDetailsBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.productImage.setTag(null);
        this.productPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.ossman_elmonkz.pages.buying.viewModels.ProductDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.buying.viewModels.ProductDetailsViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.buying.viewModels.ProductDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.buying.viewModels.ProductDetailsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.productDetails) {
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
        java.lang.String viewmodelProductDetailsImage = null;
        java.lang.String viewmodelProductDetailsDescription = null;
        te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem viewmodelProductDetails = null;
        int viewmodelProductDetailsPriceJavaLangObjectNullViewmodelProductDetailsPriceEqualsJavaLangString0BooleanFalseViewGONEViewVISIBLE = 0;
        boolean viewmodelProductDetailsPriceJavaLangObjectNullViewmodelProductDetailsPriceEqualsJavaLangString0BooleanFalse = false;
        java.lang.String viewmodelProductDetailsPriceConcatJavaLangStringConcatProductPriceAndroidStringCoin = null;
        java.lang.String viewmodelProductDetailsPrice = null;
        boolean viewmodelProductDetailsPriceJavaLangObjectNull = false;
        java.lang.String viewmodelProductDetailsPriceConcatJavaLangString = null;
        te.app.ossman_elmonkz.pages.buying.viewModels.ProductDetailsViewModel viewmodel = mViewmodel;
        boolean viewmodelProductDetailsPriceEqualsJavaLangString0 = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.productDetails
                    viewmodelProductDetails = viewmodel.getProductDetails();
                }


                if (viewmodelProductDetails != null) {
                    // read viewmodel.productDetails.image
                    viewmodelProductDetailsImage = viewmodelProductDetails.getImage();
                    // read viewmodel.productDetails.description
                    viewmodelProductDetailsDescription = viewmodelProductDetails.getDescription();
                    // read viewmodel.productDetails.price
                    viewmodelProductDetailsPrice = viewmodelProductDetails.getPrice();
                }


                // read viewmodel.productDetails.price == null
                viewmodelProductDetailsPriceJavaLangObjectNull = (viewmodelProductDetailsPrice) == (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelProductDetailsPriceJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
                if (viewmodelProductDetailsPrice != null) {
                    // read viewmodel.productDetails.price.concat(" ")
                    viewmodelProductDetailsPriceConcatJavaLangString = viewmodelProductDetailsPrice.concat(" ");
                }


                if (viewmodelProductDetailsPriceConcatJavaLangString != null) {
                    // read viewmodel.productDetails.price.concat(" ").concat(@android:string/coin)
                    viewmodelProductDetailsPriceConcatJavaLangStringConcatProductPriceAndroidStringCoin = viewmodelProductDetailsPriceConcatJavaLangString.concat(productPrice.getResources().getString(R.string.coin));
                }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (viewmodelProductDetailsPrice != null) {
                    // read viewmodel.productDetails.price.equals("0")
                    viewmodelProductDetailsPriceEqualsJavaLangString0 = viewmodelProductDetailsPrice.equals("0");
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewmodel.productDetails.price == null ? viewmodel.productDetails.price.equals("0") : false
                viewmodelProductDetailsPriceJavaLangObjectNullViewmodelProductDetailsPriceEqualsJavaLangString0BooleanFalse = ((viewmodelProductDetailsPriceJavaLangObjectNull) ? (viewmodelProductDetailsPriceEqualsJavaLangString0) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelProductDetailsPriceJavaLangObjectNullViewmodelProductDetailsPriceEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.productDetails.price == null ? viewmodel.productDetails.price.equals("0") : false ? View.GONE : View.VISIBLE
                viewmodelProductDetailsPriceJavaLangObjectNullViewmodelProductDetailsPriceEqualsJavaLangString0BooleanFalseViewGONEViewVISIBLE = ((viewmodelProductDetailsPriceJavaLangObjectNullViewmodelProductDetailsPriceEqualsJavaLangString0BooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelProductDetailsDescription);
            te.app.ossman_elmonkz.base.ApplicationBinding.loadImage(this.productImage, viewmodelProductDetailsImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productPrice, viewmodelProductDetailsPriceConcatJavaLangStringConcatProductPriceAndroidStringCoin);
            this.productPrice.setVisibility(viewmodelProductDetailsPriceJavaLangObjectNullViewmodelProductDetailsPriceEqualsJavaLangString0BooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.productImage.setOnClickListener(mCallback16);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel.productDetails.image
        java.lang.String viewmodelProductDetailsImage = null;
        // viewmodel.productDetails
        te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem viewmodelProductDetails = null;
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel.productDetails != null
        boolean viewmodelProductDetailsJavaLangObjectNull = false;
        // viewmodel
        te.app.ossman_elmonkz.pages.buying.viewModels.ProductDetailsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {




            viewmodelProductDetails = viewmodel.getProductDetails();

            viewmodelProductDetailsJavaLangObjectNull = (viewmodelProductDetails) != (null);
            if (viewmodelProductDetailsJavaLangObjectNull) {


                viewmodelProductDetailsImage = viewmodelProductDetails.getImage();


                viewmodel.showImage(viewmodelProductDetailsImage, callbackArg_0);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.productDetails
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.productDetails.price == null ? viewmodel.productDetails.price.equals("0") : false ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewmodel.productDetails.price == null ? viewmodel.productDetails.price.equals("0") : false ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewmodel.productDetails.price == null ? viewmodel.productDetails.price.equals("0") : false
        flag 6 (0x7L): viewmodel.productDetails.price == null ? viewmodel.productDetails.price.equals("0") : false
    flag mapping end*/
    //end
}