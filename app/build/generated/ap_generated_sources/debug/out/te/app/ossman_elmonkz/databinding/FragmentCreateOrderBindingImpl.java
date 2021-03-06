package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCreateOrderBindingImpl extends FragmentCreateOrderBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.client_name, 7);
        sViewsWithIds.put(R.id.client_phone, 8);
        sViewsWithIds.put(R.id.client_govs, 9);
        sViewsWithIds.put(R.id.client_address, 10);
        sViewsWithIds.put(R.id.client_notes, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createOrder.name
            //         is viewmodel.createOrder.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createOrder != null
            boolean viewmodelCreateOrderJavaLangObjectNull = false;
            // viewmodel.createOrder.name
            java.lang.String viewmodelCreateOrderName = null;
            // viewmodel.createOrder
            te.app.ossman_elmonkz.pages.cart.models.CreateOrder viewmodelCreateOrder = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateOrder = viewmodel.getCreateOrder();

                viewmodelCreateOrderJavaLangObjectNull = (viewmodelCreateOrder) != (null);
                if (viewmodelCreateOrderJavaLangObjectNull) {




                    viewmodelCreateOrder.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createOrder.phone
            //         is viewmodel.createOrder.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.createOrder.phone
            java.lang.String viewmodelCreateOrderPhone = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createOrder != null
            boolean viewmodelCreateOrderJavaLangObjectNull = false;
            // viewmodel.createOrder
            te.app.ossman_elmonkz.pages.cart.models.CreateOrder viewmodelCreateOrder = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateOrder = viewmodel.getCreateOrder();

                viewmodelCreateOrderJavaLangObjectNull = (viewmodelCreateOrder) != (null);
                if (viewmodelCreateOrderJavaLangObjectNull) {




                    viewmodelCreateOrder.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createOrder.address
            //         is viewmodel.createOrder.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createOrder.address
            java.lang.String viewmodelCreateOrderAddress = null;
            // viewmodel.createOrder != null
            boolean viewmodelCreateOrderJavaLangObjectNull = false;
            // viewmodel.createOrder
            te.app.ossman_elmonkz.pages.cart.models.CreateOrder viewmodelCreateOrder = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateOrder = viewmodel.getCreateOrder();

                viewmodelCreateOrderJavaLangObjectNull = (viewmodelCreateOrder) != (null);
                if (viewmodelCreateOrderJavaLangObjectNull) {




                    viewmodelCreateOrder.setAddress(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.createOrder.notes
            //         is viewmodel.createOrder.setNotes((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewmodel.createOrder.notes
            java.lang.String viewmodelCreateOrderNotes = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.createOrder != null
            boolean viewmodelCreateOrderJavaLangObjectNull = false;
            // viewmodel.createOrder
            te.app.ossman_elmonkz.pages.cart.models.CreateOrder viewmodelCreateOrder = null;
            // viewmodel
            te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCreateOrder = viewmodel.getCreateOrder();

                viewmodelCreateOrderJavaLangObjectNull = (viewmodelCreateOrder) != (null);
                if (viewmodelCreateOrderJavaLangObjectNull) {




                    viewmodelCreateOrder.setNotes(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentCreateOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentCreateOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            );
        this.addCart.setTag(null);
        this.clientGovText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback34 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
        mCallback35 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewmodel((te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewmodelCreateOrderPhone = null;
        te.app.ossman_elmonkz.pages.cart.models.CreateOrder viewmodelCreateOrder = null;
        java.lang.String viewmodelCreateOrderNotes = null;
        java.lang.String viewmodelCreateOrderAddress = null;
        java.lang.String viewmodelCreateOrderName = null;
        te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.createOrder
                    viewmodelCreateOrder = viewmodel.getCreateOrder();
                }


                if (viewmodelCreateOrder != null) {
                    // read viewmodel.createOrder.phone
                    viewmodelCreateOrderPhone = viewmodelCreateOrder.getPhone();
                    // read viewmodel.createOrder.notes
                    viewmodelCreateOrderNotes = viewmodelCreateOrder.getNotes();
                    // read viewmodel.createOrder.address
                    viewmodelCreateOrderAddress = viewmodelCreateOrder.getAddress();
                    // read viewmodel.createOrder.name
                    viewmodelCreateOrderName = viewmodelCreateOrder.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.addCart.setOnClickListener(mCallback35);
            this.clientGovText.setOnClickListener(mCallback34);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewmodelCreateOrderName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelCreateOrderPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelCreateOrderAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelCreateOrderNotes);
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
                te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.showGovs();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.sendOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}