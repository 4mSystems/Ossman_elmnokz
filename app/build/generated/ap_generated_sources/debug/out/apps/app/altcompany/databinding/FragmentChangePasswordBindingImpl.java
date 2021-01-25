package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentChangePasswordBindingImpl extends FragmentChangePasswordBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

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
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView1;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView2;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView3;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewRegular mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of changePasswordViewModel.request.password
            //         is changePasswordViewModel.request.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // changePasswordViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest changePasswordViewModelRequest = null;
            // changePasswordViewModel.request != null
            boolean changePasswordViewModelRequestJavaLangObjectNull = false;
            // changePasswordViewModel
            apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel changePasswordViewModel = mChangePasswordViewModel;
            // changePasswordViewModel != null
            boolean changePasswordViewModelJavaLangObjectNull = false;
            // changePasswordViewModel.request.password
            java.lang.String changePasswordViewModelRequestPassword = null;



            changePasswordViewModelJavaLangObjectNull = (changePasswordViewModel) != (null);
            if (changePasswordViewModelJavaLangObjectNull) {


                changePasswordViewModelRequest = changePasswordViewModel.getRequest();

                changePasswordViewModelRequestJavaLangObjectNull = (changePasswordViewModelRequest) != (null);
                if (changePasswordViewModelRequestJavaLangObjectNull) {




                    changePasswordViewModelRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of changePasswordViewModel.request.password
            //         is changePasswordViewModel.request.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // changePasswordViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest changePasswordViewModelRequest = null;
            // changePasswordViewModel.request != null
            boolean changePasswordViewModelRequestJavaLangObjectNull = false;
            // changePasswordViewModel
            apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel changePasswordViewModel = mChangePasswordViewModel;
            // changePasswordViewModel != null
            boolean changePasswordViewModelJavaLangObjectNull = false;
            // changePasswordViewModel.request.password
            java.lang.String changePasswordViewModelRequestPassword = null;



            changePasswordViewModelJavaLangObjectNull = (changePasswordViewModel) != (null);
            if (changePasswordViewModelJavaLangObjectNull) {


                changePasswordViewModelRequest = changePasswordViewModel.getRequest();

                changePasswordViewModelRequestJavaLangObjectNull = (changePasswordViewModelRequest) != (null);
                if (changePasswordViewModelRequestJavaLangObjectNull) {




                    changePasswordViewModelRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of changePasswordViewModel.request.confirmPassword
            //         is changePasswordViewModel.request.setConfirmPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // changePasswordViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest changePasswordViewModelRequest = null;
            // changePasswordViewModel.request != null
            boolean changePasswordViewModelRequestJavaLangObjectNull = false;
            // changePasswordViewModel
            apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel changePasswordViewModel = mChangePasswordViewModel;
            // changePasswordViewModel.request.confirmPassword
            java.lang.String changePasswordViewModelRequestConfirmPassword = null;
            // changePasswordViewModel != null
            boolean changePasswordViewModelJavaLangObjectNull = false;



            changePasswordViewModelJavaLangObjectNull = (changePasswordViewModel) != (null);
            if (changePasswordViewModelJavaLangObjectNull) {


                changePasswordViewModelRequest = changePasswordViewModel.getRequest();

                changePasswordViewModelRequestJavaLangObjectNull = (changePasswordViewModelRequest) != (null);
                if (changePasswordViewModelRequestJavaLangObjectNull) {




                    changePasswordViewModelRequest.setConfirmPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentChangePasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentChangePasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (apps.app.altcompany.customViews.views.CustomTextViewRegular) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.changePasswordViewModel == variableId) {
            setChangePasswordViewModel((apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChangePasswordViewModel(@Nullable apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel ChangePasswordViewModel) {
        updateRegistration(2, ChangePasswordViewModel);
        this.mChangePasswordViewModel = ChangePasswordViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.changePasswordViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeChangePasswordViewModelRequestPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeChangePasswordViewModelRequestConfirmPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeChangePasswordViewModel((apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeChangePasswordViewModelRequestPasswordError(androidx.databinding.ObservableField<java.lang.String> ChangePasswordViewModelRequestPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChangePasswordViewModelRequestConfirmPasswordError(androidx.databinding.ObservableField<java.lang.String> ChangePasswordViewModelRequestConfirmPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChangePasswordViewModel(apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel ChangePasswordViewModel, int fieldId) {
        if (fieldId == BR._all) {
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
        apps.app.altcompany.pages.auth.models.RegisterRequest changePasswordViewModelRequest = null;
        java.lang.String changePasswordViewModelRequestConfirmPasswordErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> changePasswordViewModelRequestPasswordError = null;
        androidx.databinding.ObservableField<java.lang.String> changePasswordViewModelRequestConfirmPasswordError = null;
        apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel changePasswordViewModel = mChangePasswordViewModel;
        java.lang.String changePasswordViewModelRequestConfirmPassword = null;
        java.lang.String changePasswordViewModelRequestPasswordErrorGet = null;
        java.lang.String changePasswordViewModelRequestPassword = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (changePasswordViewModel != null) {
                    // read changePasswordViewModel.request
                    changePasswordViewModelRequest = changePasswordViewModel.getRequest();
                }

            if ((dirtyFlags & 0xdL) != 0) {

                    if (changePasswordViewModelRequest != null) {
                        // read changePasswordViewModel.request.passwordError
                        changePasswordViewModelRequestPasswordError = changePasswordViewModelRequest.passwordError;
                    }
                    updateRegistration(0, changePasswordViewModelRequestPasswordError);


                    if (changePasswordViewModelRequestPasswordError != null) {
                        // read changePasswordViewModel.request.passwordError.get()
                        changePasswordViewModelRequestPasswordErrorGet = changePasswordViewModelRequestPasswordError.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (changePasswordViewModelRequest != null) {
                        // read changePasswordViewModel.request.confirmPasswordError
                        changePasswordViewModelRequestConfirmPasswordError = changePasswordViewModelRequest.confirmPasswordError;
                    }
                    updateRegistration(1, changePasswordViewModelRequestConfirmPasswordError);


                    if (changePasswordViewModelRequestConfirmPasswordError != null) {
                        // read changePasswordViewModel.request.confirmPasswordError.get()
                        changePasswordViewModelRequestConfirmPasswordErrorGet = changePasswordViewModelRequestConfirmPasswordError.get();
                    }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (changePasswordViewModelRequest != null) {
                        // read changePasswordViewModel.request.confirmPassword
                        changePasswordViewModelRequestConfirmPassword = changePasswordViewModelRequest.getConfirmPassword();
                        // read changePasswordViewModel.request.password
                        changePasswordViewModelRequestPassword = changePasswordViewModelRequest.getPassword();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, changePasswordViewModelRequestPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, changePasswordViewModelRequestPassword);
            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView2, changePasswordViewModelRequestPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, changePasswordViewModelRequestConfirmPassword);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView1, changePasswordViewModelRequestPasswordErrorGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView3, changePasswordViewModelRequestConfirmPasswordErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // changePasswordViewModel
        apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel changePasswordViewModel = mChangePasswordViewModel;
        // changePasswordViewModel != null
        boolean changePasswordViewModelJavaLangObjectNull = false;



        changePasswordViewModelJavaLangObjectNull = (changePasswordViewModel) != (null);
        if (changePasswordViewModelJavaLangObjectNull) {


            changePasswordViewModel.submit();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): changePasswordViewModel.request.passwordError
        flag 1 (0x2L): changePasswordViewModel.request.confirmPasswordError
        flag 2 (0x3L): changePasswordViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}