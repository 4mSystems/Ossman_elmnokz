package te.app.mezzastore.databinding;
import te.app.mezzastore.R;
import te.app.mezzastore.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailsBindingImpl extends FragmentProductDetailsBinding implements te.app.mezzastore.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageSlider, 9);
        sViewsWithIds.put(R.id.product_related, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (com.smarteist.autoimageslider.SliderView) bindings[9]
            , (te.app.mezzastore.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.mezzastore.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.mezzastore.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.mezzastore.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.mezzastore.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.mezzastore.customViews.views.CustomTextViewRegular) bindings[10]
            );
        this.addCart.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView7 = (androidx.recyclerview.widget.RecyclerView) bindings[7];
        this.mboundView7.setTag(null);
        this.productBrand.setTag(null);
        this.productColor.setTag(null);
        this.productDesc.setTag(null);
        this.productName.setTag(null);
        this.productPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new te.app.mezzastore.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewmodel((te.app.mezzastore.pages.products.viewModels.ProductDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.mezzastore.pages.products.viewModels.ProductDetailsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.mezzastore.pages.products.viewModels.ProductDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.mezzastore.pages.products.viewModels.ProductDetailsViewModel Viewmodel, int fieldId) {
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
        else if (fieldId == BR.productsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewmodelProductDetailsProductDescription = null;
        te.app.mezzastore.pages.products.models.productDetails.ProductDetails viewmodelProductDetails = null;
        java.lang.String viewmodelProductDetailsProductTitle = null;
        java.lang.String viewmodelProductDetailsProductColors = null;
        te.app.mezzastore.pages.products.models.productDetails.Product viewmodelProductDetailsProduct = null;
        boolean viewmodelProductDetailsProductFavorite = false;
        te.app.mezzastore.pages.products.adapters.ProductsAdapter viewmodelProductsAdapter = null;
        boolean viewmodelProductDetailsProductBrandJavaLangObjectNull = false;
        java.lang.String viewmodelProductDetailsProductPriceConcatJavaLangStringConcatJavaLangString = null;
        java.lang.String productBrandAndroidStringBrandConcatJavaLangStringConcatViewmodelProductDetailsProductBrandJavaLangObjectNullViewmodelProductDetailsProductBrandTitleJavaLangString = null;
        java.lang.String viewmodelProductDetailsProductPriceConcatJavaLangString = null;
        java.lang.String productColorAndroidStringColorConcatJavaLangStringConcatViewmodelProductDetailsProductColorsJavaLangObjectNullViewmodelProductDetailsProductColorsJavaLangString = null;
        java.lang.String viewmodelProductDetailsProductColorsJavaLangObjectNullViewmodelProductDetailsProductColorsJavaLangString = null;
        android.graphics.drawable.Drawable viewmodelProductDetailsProductFavoriteMboundView1AndroidDrawableIcFavoriteFillMboundView1AndroidDrawableIcFavoriteBorder = null;
        java.lang.String viewmodelProductDetailsProductPriceJavaLangObjectNullViewmodelProductDetailsProductPriceConcatJavaLangStringConcatJavaLangStringJavaLangString = null;
        te.app.mezzastore.pages.products.models.productDetails.Brand viewmodelProductDetailsProductBrand = null;
        java.lang.String viewmodelProductDetailsProductBrandTitle = null;
        java.lang.String viewmodelProductDetailsProductBrandJavaLangObjectNullViewmodelProductDetailsProductBrandTitleJavaLangString = null;
        boolean viewmodelProductDetailsProductPriceJavaLangObjectNull = false;
        boolean viewmodelProductDetailsProductColorsJavaLangObjectNull = false;
        java.lang.String viewmodelProductDetailsProductPrice = null;
        te.app.mezzastore.pages.products.viewModels.ProductDetailsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.productDetails
                        viewmodelProductDetails = viewmodel.getProductDetails();
                    }


                    if (viewmodelProductDetails != null) {
                        // read viewmodel.productDetails.product
                        viewmodelProductDetailsProduct = viewmodelProductDetails.getProduct();
                    }


                    if (viewmodelProductDetailsProduct != null) {
                        // read viewmodel.productDetails.product.description
                        viewmodelProductDetailsProductDescription = viewmodelProductDetailsProduct.getDescription();
                        // read viewmodel.productDetails.product.title
                        viewmodelProductDetailsProductTitle = viewmodelProductDetailsProduct.getTitle();
                        // read viewmodel.productDetails.product.colors
                        viewmodelProductDetailsProductColors = viewmodelProductDetailsProduct.getColors();
                        // read viewmodel.productDetails.product.favorite
                        viewmodelProductDetailsProductFavorite = viewmodelProductDetailsProduct.isFavorite();
                        // read viewmodel.productDetails.product.brand
                        viewmodelProductDetailsProductBrand = viewmodelProductDetailsProduct.getBrand();
                        // read viewmodel.productDetails.product.price
                        viewmodelProductDetailsProductPrice = viewmodelProductDetailsProduct.getPrice();
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelProductDetailsProductFavorite) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.productDetails.product.colors != null
                    viewmodelProductDetailsProductColorsJavaLangObjectNull = (viewmodelProductDetailsProductColors) != (null);
                    // read viewmodel.productDetails.product.favorite ? @android:drawable/ic_favorite_fill : @android:drawable/ic_favorite_border
                    viewmodelProductDetailsProductFavoriteMboundView1AndroidDrawableIcFavoriteFillMboundView1AndroidDrawableIcFavoriteBorder = ((viewmodelProductDetailsProductFavorite) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.ic_favorite_fill)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.ic_favorite_border)));
                    // read viewmodel.productDetails.product.brand != null
                    viewmodelProductDetailsProductBrandJavaLangObjectNull = (viewmodelProductDetailsProductBrand) != (null);
                    // read viewmodel.productDetails.product.price != null
                    viewmodelProductDetailsProductPriceJavaLangObjectNull = (viewmodelProductDetailsProductPrice) != (null);
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelProductDetailsProductColorsJavaLangObjectNull) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelProductDetailsProductBrandJavaLangObjectNull) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelProductDetailsProductPriceJavaLangObjectNull) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.productsAdapter
                        viewmodelProductsAdapter = viewmodel.getProductsAdapter();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

                if (viewmodelProductDetailsProductPrice != null) {
                    // read viewmodel.productDetails.product.price.concat(" ")
                    viewmodelProductDetailsProductPriceConcatJavaLangString = viewmodelProductDetailsProductPrice.concat(" ");
                }


                if (viewmodelProductDetailsProductPriceConcatJavaLangString != null) {
                    // read viewmodel.productDetails.product.price.concat(" ").concat("ج.م")
                    viewmodelProductDetailsProductPriceConcatJavaLangStringConcatJavaLangString = viewmodelProductDetailsProductPriceConcatJavaLangString.concat("ج.م");
                }
        }
        if ((dirtyFlags & 0xbL) != 0) {

                // read viewmodel.productDetails.product.colors != null ? viewmodel.productDetails.product.colors : ""
                viewmodelProductDetailsProductColorsJavaLangObjectNullViewmodelProductDetailsProductColorsJavaLangString = ((viewmodelProductDetailsProductColorsJavaLangObjectNull) ? (viewmodelProductDetailsProductColors) : (""));


                // read @android:string/color.concat(" ").concat(viewmodel.productDetails.product.colors != null ? viewmodel.productDetails.product.colors : "")
                productColorAndroidStringColorConcatJavaLangStringConcatViewmodelProductDetailsProductColorsJavaLangObjectNullViewmodelProductDetailsProductColorsJavaLangString = productColor.getResources().getString(R.string.color).concat(" ").concat(viewmodelProductDetailsProductColorsJavaLangObjectNullViewmodelProductDetailsProductColorsJavaLangString);
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (viewmodelProductDetailsProductBrand != null) {
                    // read viewmodel.productDetails.product.brand.title
                    viewmodelProductDetailsProductBrandTitle = viewmodelProductDetailsProductBrand.getTitle();
                }
        }

        if ((dirtyFlags & 0xbL) != 0) {

                // read viewmodel.productDetails.product.price != null ? viewmodel.productDetails.product.price.concat(" ").concat("ج.م") : ""
                viewmodelProductDetailsProductPriceJavaLangObjectNullViewmodelProductDetailsProductPriceConcatJavaLangStringConcatJavaLangStringJavaLangString = ((viewmodelProductDetailsProductPriceJavaLangObjectNull) ? (viewmodelProductDetailsProductPriceConcatJavaLangStringConcatJavaLangString) : (""));
                // read viewmodel.productDetails.product.brand != null ? viewmodel.productDetails.product.brand.title : ""
                viewmodelProductDetailsProductBrandJavaLangObjectNullViewmodelProductDetailsProductBrandTitleJavaLangString = ((viewmodelProductDetailsProductBrandJavaLangObjectNull) ? (viewmodelProductDetailsProductBrandTitle) : (""));


                // read @android:string/brand.concat(" ").concat(viewmodel.productDetails.product.brand != null ? viewmodel.productDetails.product.brand.title : "")
                productBrandAndroidStringBrandConcatJavaLangStringConcatViewmodelProductDetailsProductBrandJavaLangObjectNullViewmodelProductDetailsProductBrandTitleJavaLangString = productBrand.getResources().getString(R.string.brand).concat(" ").concat(viewmodelProductDetailsProductBrandJavaLangObjectNullViewmodelProductDetailsProductBrandTitleJavaLangString);
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.addCart.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView1, viewmodelProductDetailsProductFavoriteMboundView1AndroidDrawableIcFavoriteFillMboundView1AndroidDrawableIcFavoriteBorder);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productBrand, productBrandAndroidStringBrandConcatJavaLangStringConcatViewmodelProductDetailsProductBrandJavaLangObjectNullViewmodelProductDetailsProductBrandTitleJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productColor, productColorAndroidStringColorConcatJavaLangStringConcatViewmodelProductDetailsProductColorsJavaLangObjectNullViewmodelProductDetailsProductColorsJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productDesc, viewmodelProductDetailsProductDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, viewmodelProductDetailsProductTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productPrice, viewmodelProductDetailsProductPriceJavaLangObjectNullViewmodelProductDetailsProductPriceConcatJavaLangStringConcatJavaLangStringJavaLangString);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            te.app.mezzastore.base.ApplicationBinding.getItemsV2Binding(this.mboundView7, viewmodelProductsAdapter, "2", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.mezzastore.pages.products.viewModels.ProductDetailsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.addToCart();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.productDetails
        flag 2 (0x3L): viewmodel.productsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.productDetails.product.colors != null ? viewmodel.productDetails.product.colors : ""
        flag 5 (0x6L): viewmodel.productDetails.product.colors != null ? viewmodel.productDetails.product.colors : ""
        flag 6 (0x7L): viewmodel.productDetails.product.favorite ? @android:drawable/ic_favorite_fill : @android:drawable/ic_favorite_border
        flag 7 (0x8L): viewmodel.productDetails.product.favorite ? @android:drawable/ic_favorite_fill : @android:drawable/ic_favorite_border
        flag 8 (0x9L): viewmodel.productDetails.product.price != null ? viewmodel.productDetails.product.price.concat(" ").concat("ج.م") : ""
        flag 9 (0xaL): viewmodel.productDetails.product.price != null ? viewmodel.productDetails.product.price.concat(" ").concat("ج.م") : ""
        flag 10 (0xbL): viewmodel.productDetails.product.brand != null ? viewmodel.productDetails.product.brand.title : ""
        flag 11 (0xcL): viewmodel.productDetails.product.brand != null ? viewmodel.productDetails.product.brand.title : ""
    flag mapping end*/
    //end
}