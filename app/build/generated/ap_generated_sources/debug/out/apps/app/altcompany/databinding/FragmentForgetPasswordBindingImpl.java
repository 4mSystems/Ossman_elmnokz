package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentForgetPasswordBindingImpl extends FragmentForgetPasswordBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.logo, 3);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener phoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of forgetPasswordViewModel.request.phone
            //         is forgetPasswordViewModel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(phone);
            // localize variables for thread safety
            // forgetPasswordViewModel.request.phone
            java.lang.String forgetPasswordViewModelRequestPhone = null;
            // forgetPasswordViewModel.request != null
            boolean forgetPasswordViewModelRequestJavaLangObjectNull = false;
            // forgetPasswordViewModel.request
            apps.app.altcompany.pages.auth.models.ForgetPasswordRequest forgetPasswordViewModelRequest = null;
            // forgetPasswordViewModel != null
            boolean forgetPasswordViewModelJavaLangObjectNull = false;
            // forgetPasswordViewModel
            apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel forgetPasswordViewModel = mForgetPasswordViewModel;



            forgetPasswordViewModelJavaLangObjectNull = (forgetPasswordViewModel) != (null);
            if (forgetPasswordViewModelJavaLangObjectNull) {


                forgetPasswordViewModelRequest = forgetPasswordViewModel.getRequest();

                forgetPasswordViewModelRequestJavaLangObjectNull = (forgetPasswordViewModelRequest) != (null);
                if (forgetPasswordViewModelRequestJavaLangObjectNull) {




                    forgetPasswordViewModelRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentForgetPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentForgetPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[1]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.phone.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.forgetPasswordViewModel == variableId) {
            setForgetPasswordViewModel((apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setForgetPasswordViewModel(@Nullable apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel ForgetPasswordViewModel) {
        updateRegistration(1, ForgetPasswordViewModel);
        this.mForgetPasswordViewModel = ForgetPasswordViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.forgetPasswordViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeForgetPasswordViewModelRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeForgetPasswordViewModel((apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeForgetPasswordViewModelRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> ForgetPasswordViewModelRequestPhoneError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeForgetPasswordViewModel(apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel ForgetPasswordViewModel, int fieldId) {
        if (fieldId == BR._all) {
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
        java.lang.String forgetPasswordViewModelRequestPhone = null;
        java.lang.String forgetPasswordViewModelRequestPhoneErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> forgetPasswordViewModelRequestPhoneError = null;
        apps.app.altcompany.pages.auth.models.ForgetPasswordRequest forgetPasswordViewModelRequest = null;
        apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel forgetPasswordViewModel = mForgetPasswordViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (forgetPasswordViewModel != null) {
                    // read forgetPasswordViewModel.request
                    forgetPasswordViewModelRequest = forgetPasswordViewModel.getRequest();
                }

            if ((dirtyFlags & 0x6L) != 0) {

                    if (forgetPasswordViewModelRequest != null) {
                        // read forgetPasswordViewModel.request.phone
                        forgetPasswordViewModelRequestPhone = forgetPasswordViewModelRequest.getPhone();
                    }
            }

                if (forgetPasswordViewModelRequest != null) {
                    // read forgetPasswordViewModel.request.phoneError
                    forgetPasswordViewModelRequestPhoneError = forgetPasswordViewModelRequest.phoneError;
                }
                updateRegistration(0, forgetPasswordViewModelRequestPhoneError);


                if (forgetPasswordViewModelRequestPhoneError != null) {
                    // read forgetPasswordViewModel.request.phoneError.get()
                    forgetPasswordViewModelRequestPhoneErrorGet = forgetPasswordViewModelRequestPhoneError.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback6);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.phone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, phoneandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phone, forgetPasswordViewModelRequestPhone);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.phone, forgetPasswordViewModelRequestPhoneErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // forgetPasswordViewModel != null
        boolean forgetPasswordViewModelJavaLangObjectNull = false;
        // forgetPasswordViewModel
        apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel forgetPasswordViewModel = mForgetPasswordViewModel;



        forgetPasswordViewModelJavaLangObjectNull = (forgetPasswordViewModel) != (null);
        if (forgetPasswordViewModelJavaLangObjectNull) {


            forgetPasswordViewModel.sendCode();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): forgetPasswordViewModel.request.phoneError
        flag 1 (0x2L): forgetPasswordViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}