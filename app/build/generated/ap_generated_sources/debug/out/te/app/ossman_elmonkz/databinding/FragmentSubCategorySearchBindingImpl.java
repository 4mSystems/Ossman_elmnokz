package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSubCategorySearchBindingImpl extends FragmentSubCategorySearchBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.brand_name, 7);
        sViewsWithIds.put(R.id.model_name, 8);
        sViewsWithIds.put(R.id.desc_container, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.orderRequest.brandName
            //         is viewmodel.orderRequest.setBrandName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.orderRequest.brandName
            java.lang.String viewmodelOrderRequestBrandName = null;
            // viewmodel.orderRequest != null
            boolean viewmodelOrderRequestJavaLangObjectNull = false;
            // viewmodel.orderRequest
            te.app.ossman_elmonkz.pages.buying.models.OrderRequest viewmodelOrderRequest = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelOrderRequest = viewmodel.getOrderRequest();

                viewmodelOrderRequestJavaLangObjectNull = (viewmodelOrderRequest) != (null);
                if (viewmodelOrderRequestJavaLangObjectNull) {




                    viewmodelOrderRequest.setBrandName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.search
            //         is viewmodel.search = (java.lang.String) callbackArg_0
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.search
            java.lang.String viewmodelSearch = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodel.search = ((java.lang.String) (callbackArg_0));
            }
        }
    };

    public FragmentSubCategorySearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentSubCategorySearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (android.widget.ProgressBar) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (androidx.recyclerview.widget.RecyclerView) bindings[4];
        this.mboundView4.setTag(null);
        this.productWarning2.setTag(null);
        this.searchBtn.setTag(null);
        this.searchProgress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 3);
        mCallback7 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
        mCallback8 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewmodel((te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.searchProgressVisible) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.searchAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.desc) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String viewmodelOrderRequestBrandName = null;
        java.lang.String viewmodelSearch = null;
        int viewmodelSearchProgressVisible = 0;
        te.app.ossman_elmonkz.pages.subCategories.adapters.SearchAdapter viewmodelSearchAdapter = null;
        te.app.ossman_elmonkz.pages.buying.models.OrderRequest viewmodelOrderRequest = null;
        java.lang.String viewmodelDesc = null;
        te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x11L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.search
                        viewmodelSearch = viewmodel.search;
                        // read viewmodel.orderRequest
                        viewmodelOrderRequest = viewmodel.getOrderRequest();
                    }


                    if (viewmodelOrderRequest != null) {
                        // read viewmodel.orderRequest.brandName
                        viewmodelOrderRequestBrandName = viewmodelOrderRequest.getBrandName();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.getSearchProgressVisible();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchAdapter
                        viewmodelSearchAdapter = viewmodel.getSearchAdapter();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.desc
                        viewmodelDesc = viewmodel.getDesc();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback8);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.searchBtn.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewmodelOrderRequestBrandName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelSearch);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            te.app.ossman_elmonkz.base.ApplicationBinding.getItemsV2Binding(this.mboundView4, viewmodelSearchAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productWarning2, viewmodelDesc);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            this.searchProgress.setVisibility(viewmodelSearchProgressVisible);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.search();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toBrand();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toModel();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.searchProgressVisible
        flag 2 (0x3L): viewmodel.searchAdapter
        flag 3 (0x4L): viewmodel.desc
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}