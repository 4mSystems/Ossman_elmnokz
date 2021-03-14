package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductsBindingImpl extends FragmentProductsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.elmonkz_systems_text, 7);
        sViewsWithIds.put(R.id.br1, 8);
        sViewsWithIds.put(R.id.v1, 9);
        sViewsWithIds.put(R.id.prePayment_text, 10);
        sViewsWithIds.put(R.id.br2, 11);
        sViewsWithIds.put(R.id.v2, 12);
        sViewsWithIds.put(R.id.on_hand_text, 13);
        sViewsWithIds.put(R.id.br3, 14);
        sViewsWithIds.put(R.id.v3, 15);
        sViewsWithIds.put(R.id.warning1, 16);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentProductsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[11]
            , (androidx.constraintlayout.widget.Barrier) bindings[14]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[13]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[15]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[16]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[5]
            );
        this.elmonkzSystemsVal.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.onHandVal.setTag(null);
        this.prePaymentTextVal.setTag(null);
        this.productWarning2.setTag(null);
        this.rcProducts.setTag(null);
        this.warningPhone.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewmodel((te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.productsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.aboutMain) {
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
        te.app.ossman_elmonkz.pages.settings.models.AboutMain viewmodelAboutMain = null;
        te.app.ossman_elmonkz.pages.settings.models.News viewmodelAboutMainNews = null;
        java.lang.String viewmodelAboutMainAboutDataMonkezPreReserve = null;
        te.app.ossman_elmonkz.pages.settings.models.AboutData viewmodelAboutMainAboutData = null;
        te.app.ossman_elmonkz.pages.subCategories.adapters.SubCategoriesAdapter viewmodelProductsAdapter = null;
        java.lang.String warningPhoneAndroidStringTWordJavaLangStringViewmodelAboutMainAboutDataMonkezPhone = null;
        java.lang.String viewmodelAboutMainAboutDataMonkezSystem = null;
        java.lang.String viewmodelAboutMainNewsBody = null;
        java.lang.String viewmodelAboutMainAboutDataMonkezPhone = null;
        java.lang.String viewmodelAboutMainAboutDataMonkezRecieve = null;
        te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.aboutMain
                        viewmodelAboutMain = viewmodel.getAboutMain();
                    }


                    if (viewmodelAboutMain != null) {
                        // read viewmodel.aboutMain.news
                        viewmodelAboutMainNews = viewmodelAboutMain.getNews();
                        // read viewmodel.aboutMain.aboutData
                        viewmodelAboutMainAboutData = viewmodelAboutMain.getAboutData();
                    }


                    if (viewmodelAboutMainNews != null) {
                        // read viewmodel.aboutMain.news.body
                        viewmodelAboutMainNewsBody = viewmodelAboutMainNews.getBody();
                    }
                    if (viewmodelAboutMainAboutData != null) {
                        // read viewmodel.aboutMain.aboutData.monkezPreReserve
                        viewmodelAboutMainAboutDataMonkezPreReserve = viewmodelAboutMainAboutData.getMonkezPreReserve();
                        // read viewmodel.aboutMain.aboutData.monkezSystem
                        viewmodelAboutMainAboutDataMonkezSystem = viewmodelAboutMainAboutData.getMonkezSystem();
                        // read viewmodel.aboutMain.aboutData.monkezPhone
                        viewmodelAboutMainAboutDataMonkezPhone = viewmodelAboutMainAboutData.getMonkezPhone();
                        // read viewmodel.aboutMain.aboutData.monkezRecieve
                        viewmodelAboutMainAboutDataMonkezRecieve = viewmodelAboutMainAboutData.getMonkezRecieve();
                    }


                    // read ((@android:string/t_word) + (" ")) + (viewmodel.aboutMain.aboutData.monkezPhone)
                    warningPhoneAndroidStringTWordJavaLangStringViewmodelAboutMainAboutDataMonkezPhone = ((warningPhone.getResources().getString(R.string.t_word)) + (" ")) + (viewmodelAboutMainAboutDataMonkezPhone);
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.productsAdapter
                        viewmodelProductsAdapter = viewmodel.getProductsAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.elmonkzSystemsVal, viewmodelAboutMainAboutDataMonkezSystem);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.onHandVal, viewmodelAboutMainAboutDataMonkezRecieve);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.prePaymentTextVal, viewmodelAboutMainAboutDataMonkezPreReserve);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productWarning2, viewmodelAboutMainNewsBody);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.warningPhone, warningPhoneAndroidStringTWordJavaLangStringViewmodelAboutMainAboutDataMonkezPhone);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            te.app.ossman_elmonkz.base.ApplicationBinding.getItemsV2Binding(this.rcProducts, viewmodelProductsAdapter, "2", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.productsAdapter
        flag 2 (0x3L): viewmodel.aboutMain
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}