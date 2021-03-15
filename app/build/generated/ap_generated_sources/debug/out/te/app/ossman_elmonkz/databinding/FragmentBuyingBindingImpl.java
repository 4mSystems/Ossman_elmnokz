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
        sViewsWithIds.put(R.id.brand_name, 7);
        sViewsWithIds.put(R.id.model_name, 8);
        sViewsWithIds.put(R.id.customTextViewMedium, 9);
        sViewsWithIds.put(R.id.br, 10);
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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
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

    public FragmentBuyingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentBuyingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (te.app.ossman_elmonkz.customViews.views.IncrementalView) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            );
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
        setRootTag(root);
        // listeners
        mCallback17 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
        mCallback19 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 3);
        mCallback20 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 4);
        mCallback18 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
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
        java.lang.String viewmodelOrderRequestQuantity = null;
        te.app.ossman_elmonkz.PassingObject viewmodelPassingObject = null;
        java.lang.String viewmodelPassingObjectObject = null;
        boolean viewmodelPassingObjectObjectEqualsJavaLangString8 = false;
        java.lang.String viewmodelOrderRequestBrandName = null;
        java.lang.String viewmodelOrderRequestPartName = null;
        int viewmodelPassingObjectObjectEqualsJavaLangString8ViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelOrderRequestModelName = null;
        te.app.ossman_elmonkz.pages.buying.models.OrderRequest viewmodelOrderRequest = null;
        te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.passingObject
                    viewmodelPassingObject = viewmodel.getPassingObject();
                }


                if (viewmodelPassingObject != null) {
                    // read viewmodel.passingObject.object
                    viewmodelPassingObjectObject = viewmodelPassingObject.getObject();
                }


                if (viewmodelPassingObjectObject != null) {
                    // read viewmodel.passingObject.object.equals("8")
                    viewmodelPassingObjectObjectEqualsJavaLangString8 = viewmodelPassingObjectObject.equals("8");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelPassingObjectObjectEqualsJavaLangString8) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.passingObject.object.equals("8") ? View.VISIBLE : View.GONE
                viewmodelPassingObjectObjectEqualsJavaLangString8ViewVISIBLEViewGONE = ((viewmodelPassingObjectObjectEqualsJavaLangString8) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.orderRequest
                        viewmodelOrderRequest = viewmodel.getOrderRequest();
                    }


                    if (viewmodelOrderRequest != null) {
                        // read viewmodel.orderRequest.quantity
                        viewmodelOrderRequestQuantity = viewmodelOrderRequest.getQuantity();
                        // read viewmodel.orderRequest.brandName
                        viewmodelOrderRequestBrandName = viewmodelOrderRequest.getBrandName();
                        // read viewmodel.orderRequest.partName
                        viewmodelOrderRequestPartName = viewmodelOrderRequest.getPartName();
                        // read viewmodel.orderRequest.modelName
                        viewmodelOrderRequestModelName = viewmodelOrderRequest.getModelName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.departmentName.setVisibility(viewmodelPassingObjectObjectEqualsJavaLangString8ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.edit.setOnClickListener(mCallback20);
            te.app.ossman_elmonkz.customViews.views.IncrementalView.setValueListner(this.incrementalViewFloorNumber, incrementalViewFloorNumbervalueAttrChanged);
            this.mboundView2.setOnClickListener(mCallback17);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback18);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback19);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            te.app.ossman_elmonkz.customViews.views.IncrementalView.getValue(this.incrementalViewFloorNumber, viewmodelOrderRequestQuantity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelOrderRequestPartName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelOrderRequestBrandName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelOrderRequestModelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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


                    viewmodel.addToCart();
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
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.passingObject
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.passingObject.object.equals("8") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.passingObject.object.equals("8") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}