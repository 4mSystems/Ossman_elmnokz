package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBuyingBindingImpl extends FragmentBuyingBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.brand_name, 10);
        sViewsWithIds.put(R.id.model_name, 11);
        sViewsWithIds.put(R.id.product_name, 12);
        sViewsWithIds.put(R.id.color_hint, 13);
        sViewsWithIds.put(R.id.br6, 14);
        sViewsWithIds.put(R.id.customTextViewMedium, 15);
        sViewsWithIds.put(R.id.br, 16);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener incrementalViewFloorNumbervalueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.orderRequest.quantity
            //         is viewmodel.orderRequest.setQuantity((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = te.app.ossman_elmonkz.customViews.views.IncrementalView.setValue(incrementalViewFloorNumber);
            // localize variables for thread safety
            // viewmodel.orderRequest.quantity
            java.lang.String viewmodelOrderRequestQuantity = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.orderRequest != null
            boolean viewmodelOrderRequestJavaLangObjectNull = false;
            // viewmodel.orderRequest
            te.app.ossman_elmonkz.pages.buying.models.OrderRequest viewmodelOrderRequest = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelOrderRequest = viewmodel.getOrderRequest();

                viewmodelOrderRequestJavaLangObjectNull = (viewmodelOrderRequest) != (null);
                if (viewmodelOrderRequestJavaLangObjectNull) {




                    viewmodelOrderRequest.setQuantity(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.orderRequest.partName
            //         is viewmodel.orderRequest.setPartName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.orderRequest.partName
            java.lang.String viewmodelOrderRequestPartName = null;
            // viewmodel.orderRequest != null
            boolean viewmodelOrderRequestJavaLangObjectNull = false;
            // viewmodel.orderRequest
            te.app.ossman_elmonkz.pages.buying.models.OrderRequest viewmodelOrderRequest = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelOrderRequest = viewmodel.getOrderRequest();

                viewmodelOrderRequestJavaLangObjectNull = (viewmodelOrderRequest) != (null);
                if (viewmodelOrderRequestJavaLangObjectNull) {




                    viewmodelOrderRequest.setPartName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.orderRequest.brandName
            //         is viewmodel.orderRequest.setBrandName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
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
            te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



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
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.orderRequest.modelName
            //         is viewmodel.orderRequest.setModelName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel.orderRequest.modelName
            java.lang.String viewmodelOrderRequestModelName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.orderRequest != null
            boolean viewmodelOrderRequestJavaLangObjectNull = false;
            // viewmodel.orderRequest
            te.app.ossman_elmonkz.pages.buying.models.OrderRequest viewmodelOrderRequest = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelOrderRequest = viewmodel.getOrderRequest();

                viewmodelOrderRequestJavaLangObjectNull = (viewmodelOrderRequest) != (null);
                if (viewmodelOrderRequestJavaLangObjectNull) {




                    viewmodelOrderRequest.setModelName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.orderRequest.productName
            //         is viewmodel.orderRequest.setProductName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.orderRequest.productName
            java.lang.String viewmodelOrderRequestProductName = null;
            // viewmodel.orderRequest != null
            boolean viewmodelOrderRequestJavaLangObjectNull = false;
            // viewmodel.orderRequest
            te.app.ossman_elmonkz.pages.buying.models.OrderRequest viewmodelOrderRequest = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelOrderRequest = viewmodel.getOrderRequest();

                viewmodelOrderRequestJavaLangObjectNull = (viewmodelOrderRequest) != (null);
                if (viewmodelOrderRequestJavaLangObjectNull) {




                    viewmodelOrderRequest.setProductName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentBuyingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentBuyingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.Barrier) bindings[16]
            , (androidx.constraintlayout.widget.Barrier) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[13]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[15]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (te.app.ossman_elmonkz.customViews.views.IncrementalView) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            );
        this.colorName.setTag(null);
        this.departmentName.setTag(null);
        this.edit.setTag(null);
        this.incrementalViewFloorNumber.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.productColor.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 3);
        mCallback24 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 4);
        mCallback25 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 5);
        mCallback21 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
        mCallback22 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewmodel((te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel Viewmodel) {
        updateRegistration(2, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelColorName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelColorCode((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelColorName(androidx.databinding.ObservableField<java.lang.String> ViewmodelColorName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelColorCode(androidx.databinding.ObservableField<java.lang.String> ViewmodelColorCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.productColorAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        int viewmodelPassingObjectObjectEqualsJavaLangString9BooleanTrueViewmodelPassingObjectObjectEqualsJavaLangString10ViewVISIBLEViewGONE = 0;
        te.app.ossman_elmonkz.PassingObject viewmodelPassingObject = null;
        java.lang.String viewmodelColorNameGet = null;
        boolean viewmodelPassingObjectObjectEqualsJavaLangString9 = false;
        java.lang.String viewmodelColorCodeJavaLangObjectNullViewmodelColorCodeJavaLangStringF2F2F2 = null;
        java.lang.String viewmodelPassingObjectObject = null;
        boolean viewmodelPassingObjectObjectEqualsJavaLangString10 = false;
        int colorParseColorViewmodelColorCodeJavaLangObjectNullViewmodelColorCodeJavaLangStringF2F2F2 = 0;
        java.lang.String viewmodelOrderRequestModelName = null;
        boolean viewmodelColorNameJavaLangObjectNull = false;
        java.lang.String viewmodelOrderRequestQuantity = null;
        java.lang.String viewmodelColorCodeGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelColorName = null;
        boolean viewmodelColorCodeJavaLangObjectNull = false;
        boolean viewmodelPassingObjectObjectEqualsJavaLangString9BooleanTrueViewmodelPassingObjectObjectEqualsJavaLangString10 = false;
        java.lang.String viewmodelOrderRequestBrandName = null;
        te.app.ossman_elmonkz.pages.buying.adapter.ProductColorAdapter viewmodelProductColorAdapter = null;
        java.lang.String viewmodelOrderRequestPartName = null;
        java.lang.String viewmodelColorNameJavaLangObjectNullViewmodelColorNameJavaLangString = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelColorCode = null;
        java.lang.String viewmodelOrderRequestProductName = null;
        te.app.ossman_elmonkz.pages.buying.models.OrderRequest viewmodelOrderRequest = null;
        te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x2cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.object
                        viewmodelPassingObjectObject = viewmodelPassingObject.getObject();
                    }


                    if (viewmodelPassingObjectObject != null) {
                        // read viewmodel.passingObject.object.equals("9")
                        viewmodelPassingObjectObjectEqualsJavaLangString9 = viewmodelPassingObjectObject.equals("9");
                    }
                if((dirtyFlags & 0x2cL) != 0) {
                    if(viewmodelPassingObjectObjectEqualsJavaLangString9) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.colorName
                        viewmodelColorName = viewmodel.colorName;
                    }
                    updateRegistration(0, viewmodelColorName);


                    if (viewmodelColorName != null) {
                        // read viewmodel.colorName.get()
                        viewmodelColorNameGet = viewmodelColorName.get();
                    }


                    // read viewmodel.colorName.get() != null
                    viewmodelColorNameJavaLangObjectNull = (viewmodelColorNameGet) != (null);
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelColorNameJavaLangObjectNull) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.productColorAdapter
                        viewmodelProductColorAdapter = viewmodel.getProductColorAdapter();
                    }
            }
            if ((dirtyFlags & 0x26L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.colorCode
                        viewmodelColorCode = viewmodel.colorCode;
                    }
                    updateRegistration(1, viewmodelColorCode);


                    if (viewmodelColorCode != null) {
                        // read viewmodel.colorCode.get()
                        viewmodelColorCodeGet = viewmodelColorCode.get();
                    }


                    // read viewmodel.colorCode.get() != null
                    viewmodelColorCodeJavaLangObjectNull = (viewmodelColorCodeGet) != (null);
                if((dirtyFlags & 0x26L) != 0) {
                    if(viewmodelColorCodeJavaLangObjectNull) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
            if ((dirtyFlags & 0x24L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.orderRequest
                        viewmodelOrderRequest = viewmodel.getOrderRequest();
                    }


                    if (viewmodelOrderRequest != null) {
                        // read viewmodel.orderRequest.modelName
                        viewmodelOrderRequestModelName = viewmodelOrderRequest.getModelName();
                        // read viewmodel.orderRequest.quantity
                        viewmodelOrderRequestQuantity = viewmodelOrderRequest.getQuantity();
                        // read viewmodel.orderRequest.brandName
                        viewmodelOrderRequestBrandName = viewmodelOrderRequest.getBrandName();
                        // read viewmodel.orderRequest.partName
                        viewmodelOrderRequestPartName = viewmodelOrderRequest.getPartName();
                        // read viewmodel.orderRequest.productName
                        viewmodelOrderRequestProductName = viewmodelOrderRequest.getProductName();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x26L) != 0) {

                // read viewmodel.colorCode.get() != null ? viewmodel.colorCode.get() : "#F2F2F2"
                viewmodelColorCodeJavaLangObjectNullViewmodelColorCodeJavaLangStringF2F2F2 = ((viewmodelColorCodeJavaLangObjectNull) ? (viewmodelColorCodeGet) : ("#F2F2F2"));


                // read Color.parseColor(viewmodel.colorCode.get() != null ? viewmodel.colorCode.get() : "#F2F2F2")
                colorParseColorViewmodelColorCodeJavaLangObjectNullViewmodelColorCodeJavaLangStringF2F2F2 = android.graphics.Color.parseColor(viewmodelColorCodeJavaLangObjectNullViewmodelColorCodeJavaLangStringF2F2F2);
        }
        if ((dirtyFlags & 0x400L) != 0) {

                if (viewmodelPassingObjectObject != null) {
                    // read viewmodel.passingObject.object.equals("10")
                    viewmodelPassingObjectObjectEqualsJavaLangString10 = viewmodelPassingObjectObject.equals("10");
                }
        }
        if ((dirtyFlags & 0x25L) != 0) {

                // read viewmodel.colorName.get() != null ? viewmodel.colorName.get() : ""
                viewmodelColorNameJavaLangObjectNullViewmodelColorNameJavaLangString = ((viewmodelColorNameJavaLangObjectNull) ? (viewmodelColorNameGet) : (""));
        }

        if ((dirtyFlags & 0x2cL) != 0) {

                // read viewmodel.passingObject.object.equals("9") ? true : viewmodel.passingObject.object.equals("10")
                viewmodelPassingObjectObjectEqualsJavaLangString9BooleanTrueViewmodelPassingObjectObjectEqualsJavaLangString10 = ((viewmodelPassingObjectObjectEqualsJavaLangString9) ? (true) : (viewmodelPassingObjectObjectEqualsJavaLangString10));
            if((dirtyFlags & 0x2cL) != 0) {
                if(viewmodelPassingObjectObjectEqualsJavaLangString9BooleanTrueViewmodelPassingObjectObjectEqualsJavaLangString10) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read viewmodel.passingObject.object.equals("9") ? true : viewmodel.passingObject.object.equals("10") ? View.VISIBLE : View.GONE
                viewmodelPassingObjectObjectEqualsJavaLangString9BooleanTrueViewmodelPassingObjectObjectEqualsJavaLangString10ViewVISIBLEViewGONE = ((viewmodelPassingObjectObjectEqualsJavaLangString9BooleanTrueViewmodelPassingObjectObjectEqualsJavaLangString10) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.colorName, viewmodelColorNameJavaLangObjectNullViewmodelColorNameJavaLangString);
        }
        if ((dirtyFlags & 0x26L) != 0) {
            // api target 1

            this.colorName.setTextColor(colorParseColorViewmodelColorCodeJavaLangObjectNullViewmodelColorCodeJavaLangStringF2F2F2);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            this.departmentName.setVisibility(viewmodelPassingObjectObjectEqualsJavaLangString9BooleanTrueViewmodelPassingObjectObjectEqualsJavaLangString10ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.edit.setOnClickListener(mCallback25);
            te.app.ossman_elmonkz.customViews.views.IncrementalView.setValueListner(this.incrementalViewFloorNumber, incrementalViewFloorNumbervalueAttrChanged);
            this.mboundView2.setOnClickListener(mCallback21);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback22);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback23);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            this.mboundView5.setOnClickListener(mCallback24);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            te.app.ossman_elmonkz.customViews.views.IncrementalView.getValue(this.incrementalViewFloorNumber, viewmodelOrderRequestQuantity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelOrderRequestPartName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelOrderRequestBrandName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelOrderRequestModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelOrderRequestProductName);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            te.app.ossman_elmonkz.base.ApplicationBinding.getItemsV2Binding(this.productColor, viewmodelProductColorAdapter, "1", "2");
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
                te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toModel();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toProducts();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.addToCart();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toPart();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toBrand();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.colorName
        flag 1 (0x2L): viewmodel.colorCode
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): viewmodel.passingObject
        flag 4 (0x5L): viewmodel.productColorAdapter
        flag 5 (0x6L): null
        flag 6 (0x7L): viewmodel.passingObject.object.equals("9") ? true : viewmodel.passingObject.object.equals("10") ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.passingObject.object.equals("9") ? true : viewmodel.passingObject.object.equals("10") ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewmodel.colorCode.get() != null ? viewmodel.colorCode.get() : "#F2F2F2"
        flag 9 (0xaL): viewmodel.colorCode.get() != null ? viewmodel.colorCode.get() : "#F2F2F2"
        flag 10 (0xbL): viewmodel.passingObject.object.equals("9") ? true : viewmodel.passingObject.object.equals("10")
        flag 11 (0xcL): viewmodel.passingObject.object.equals("9") ? true : viewmodel.passingObject.object.equals("10")
        flag 12 (0xdL): viewmodel.colorName.get() != null ? viewmodel.colorName.get() : ""
        flag 13 (0xeL): viewmodel.colorName.get() != null ? viewmodel.colorName.get() : ""
    flag mapping end*/
    //end
}