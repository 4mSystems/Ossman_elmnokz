package te.app.mezzastore.databinding;
import te.app.mezzastore.R;
import te.app.mezzastore.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContactBindingImpl extends FragmentContactBinding implements te.app.mezzastore.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.client_name, 5);
        sViewsWithIds.put(R.id.client_phone, 6);
        sViewsWithIds.put(R.id.client_notes, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactRequest.name
            //         is viewmodel.contactRequest.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewmodel.contactRequest != null
            boolean viewmodelContactRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel
            te.app.mezzastore.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;
            // viewmodel.contactRequest
            te.app.mezzastore.pages.settings.models.ContactRequest viewmodelContactRequest = null;
            // viewmodel.contactRequest.name
            java.lang.String viewmodelContactRequestName = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactRequest = viewmodel.getContactRequest();

                viewmodelContactRequestJavaLangObjectNull = (viewmodelContactRequest) != (null);
                if (viewmodelContactRequestJavaLangObjectNull) {




                    viewmodelContactRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactRequest.phone
            //         is viewmodel.contactRequest.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel.contactRequest != null
            boolean viewmodelContactRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactRequest.phone
            java.lang.String viewmodelContactRequestPhone = null;
            // viewmodel
            te.app.mezzastore.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;
            // viewmodel.contactRequest
            te.app.mezzastore.pages.settings.models.ContactRequest viewmodelContactRequest = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactRequest = viewmodel.getContactRequest();

                viewmodelContactRequestJavaLangObjectNull = (viewmodelContactRequest) != (null);
                if (viewmodelContactRequestJavaLangObjectNull) {




                    viewmodelContactRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactRequest.message
            //         is viewmodel.contactRequest.setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewmodel.contactRequest != null
            boolean viewmodelContactRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactRequest.message
            java.lang.String viewmodelContactRequestMessage = null;
            // viewmodel
            te.app.mezzastore.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;
            // viewmodel.contactRequest
            te.app.mezzastore.pages.settings.models.ContactRequest viewmodelContactRequest = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactRequest = viewmodel.getContactRequest();

                viewmodelContactRequestJavaLangObjectNull = (viewmodelContactRequest) != (null);
                if (viewmodelContactRequestJavaLangObjectNull) {




                    viewmodelContactRequest.setMessage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentContactBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            );
        this.addCart.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new te.app.mezzastore.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.mezzastore.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.mezzastore.pages.settings.viewModels.SettingsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.mezzastore.pages.settings.viewModels.SettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.mezzastore.pages.settings.viewModels.SettingsViewModel Viewmodel, int fieldId) {
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
        java.lang.String viewmodelContactRequestPhone = null;
        java.lang.String viewmodelContactRequestMessage = null;
        te.app.mezzastore.pages.settings.models.ContactRequest viewmodelContactRequest = null;
        te.app.mezzastore.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;
        java.lang.String viewmodelContactRequestName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.contactRequest
                    viewmodelContactRequest = viewmodel.getContactRequest();
                }


                if (viewmodelContactRequest != null) {
                    // read viewmodel.contactRequest.phone
                    viewmodelContactRequestPhone = viewmodelContactRequest.getPhone();
                    // read viewmodel.contactRequest.message
                    viewmodelContactRequestMessage = viewmodelContactRequest.getMessage();
                    // read viewmodel.contactRequest.name
                    viewmodelContactRequestName = viewmodelContactRequest.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.addCart.setOnClickListener(mCallback11);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewmodelContactRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelContactRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelContactRequestMessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.mezzastore.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.sendContact();
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