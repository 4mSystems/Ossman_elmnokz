package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_login_facebook, 6);
        sViewsWithIds.put(R.id.img_login_google, 7);
    }
    // views
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView2;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewRegular mboundView3;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView4;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtLoginandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.loginRequest.email
            //         is loginViewModel.loginRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtLogin);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.loginRequest
            apps.app.altcompany.pages.auth.models.LoginRequest loginViewModelLoginRequest = null;
            // loginViewModel.loginRequest.email
            java.lang.String loginViewModelLoginRequestEmail = null;
            // loginViewModel.loginRequest != null
            boolean loginViewModelLoginRequestJavaLangObjectNull = false;
            // loginViewModel
            apps.app.altcompany.pages.auth.login.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelLoginRequest = loginViewModel.getLoginRequest();

                loginViewModelLoginRequestJavaLangObjectNull = (loginViewModelLoginRequest) != (null);
                if (loginViewModelLoginRequestJavaLangObjectNull) {




                    loginViewModelLoginRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtLoginerrorAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.loginRequest.emailError.get()
            //         is loginViewModel.loginRequest.emailError.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = apps.app.altcompany.customViews.views.BaseEditText.getError(edtLogin);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.loginRequest
            apps.app.altcompany.pages.auth.models.LoginRequest loginViewModelLoginRequest = null;
            // loginViewModel.loginRequest.emailError.get()
            java.lang.String loginViewModelLoginRequestEmailErrorGet = null;
            // loginViewModel.loginRequest.emailError != null
            boolean loginViewModelLoginRequestEmailErrorJavaLangObjectNull = false;
            // loginViewModel.loginRequest.emailError
            androidx.databinding.ObservableField<java.lang.String> loginViewModelLoginRequestEmailError = null;
            // loginViewModel.loginRequest != null
            boolean loginViewModelLoginRequestJavaLangObjectNull = false;
            // loginViewModel
            apps.app.altcompany.pages.auth.login.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelLoginRequest = loginViewModel.getLoginRequest();

                loginViewModelLoginRequestJavaLangObjectNull = (loginViewModelLoginRequest) != (null);
                if (loginViewModelLoginRequestJavaLangObjectNull) {


                    loginViewModelLoginRequestEmailError = loginViewModelLoginRequest.emailError;

                    loginViewModelLoginRequestEmailErrorJavaLangObjectNull = (loginViewModelLoginRequestEmailError) != (null);
                    if (loginViewModelLoginRequestEmailErrorJavaLangObjectNull) {




                        loginViewModelLoginRequestEmailError.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.loginRequest.password
            //         is loginViewModel.loginRequest.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.loginRequest
            apps.app.altcompany.pages.auth.models.LoginRequest loginViewModelLoginRequest = null;
            // loginViewModel.loginRequest.password
            java.lang.String loginViewModelLoginRequestPassword = null;
            // loginViewModel.loginRequest != null
            boolean loginViewModelLoginRequestJavaLangObjectNull = false;
            // loginViewModel
            apps.app.altcompany.pages.auth.login.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelLoginRequest = loginViewModel.getLoginRequest();

                loginViewModelLoginRequestJavaLangObjectNull = (loginViewModelLoginRequest) != (null);
                if (loginViewModelLoginRequestJavaLangObjectNull) {




                    loginViewModelLoginRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2errorAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.loginRequest.passwordError.get()
            //         is loginViewModel.loginRequest.passwordError.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = apps.app.altcompany.customViews.views.BaseEditText.getError(mboundView2);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.loginRequest
            apps.app.altcompany.pages.auth.models.LoginRequest loginViewModelLoginRequest = null;
            // loginViewModel.loginRequest.passwordError
            androidx.databinding.ObservableField<java.lang.String> loginViewModelLoginRequestPasswordError = null;
            // loginViewModel.loginRequest.passwordError.get()
            java.lang.String loginViewModelLoginRequestPasswordErrorGet = null;
            // loginViewModel.loginRequest.passwordError != null
            boolean loginViewModelLoginRequestPasswordErrorJavaLangObjectNull = false;
            // loginViewModel.loginRequest != null
            boolean loginViewModelLoginRequestJavaLangObjectNull = false;
            // loginViewModel
            apps.app.altcompany.pages.auth.login.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelLoginRequest = loginViewModel.getLoginRequest();

                loginViewModelLoginRequestJavaLangObjectNull = (loginViewModelLoginRequest) != (null);
                if (loginViewModelLoginRequestJavaLangObjectNull) {


                    loginViewModelLoginRequestPasswordError = loginViewModelLoginRequest.passwordError;

                    loginViewModelLoginRequestPasswordErrorJavaLangObjectNull = (loginViewModelLoginRequestPasswordError) != (null);
                    if (loginViewModelLoginRequestPasswordErrorJavaLangObjectNull) {




                        loginViewModelLoginRequestPasswordError.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.RelativeLayout) bindings[0]
            );
        this.edtLogin.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (apps.app.altcompany.customViews.views.CustomTextViewRegular) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[5];
        this.mboundView5.setTag(null);
        this.rlLoginContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
        mCallback8 = new apps.app.altcompany.generated.callback.OnClickListener(this, 3);
        mCallback6 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((apps.app.altcompany.pages.auth.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable apps.app.altcompany.pages.auth.login.LoginViewModel LoginViewModel) {
        updateRegistration(2, LoginViewModel);
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelLoginRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelLoginRequestPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeLoginViewModel((apps.app.altcompany.pages.auth.login.LoginViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelLoginRequestEmailError(androidx.databinding.ObservableField<java.lang.String> LoginViewModelLoginRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelLoginRequestPasswordError(androidx.databinding.ObservableField<java.lang.String> LoginViewModelLoginRequestPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModel(apps.app.altcompany.pages.auth.login.LoginViewModel LoginViewModel, int fieldId) {
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
        apps.app.altcompany.pages.auth.models.LoginRequest loginViewModelLoginRequest = null;
        java.lang.String loginViewModelLoginRequestEmailErrorGet = null;
        java.lang.String loginViewModelLoginRequestPasswordErrorGet = null;
        java.lang.String loginViewModelLoginRequestEmail = null;
        androidx.databinding.ObservableField<java.lang.String> loginViewModelLoginRequestEmailError = null;
        java.lang.String loginViewModelLoginRequestPassword = null;
        androidx.databinding.ObservableField<java.lang.String> loginViewModelLoginRequestPasswordError = null;
        apps.app.altcompany.pages.auth.login.LoginViewModel loginViewModel = mLoginViewModel;

        if ((dirtyFlags & 0xfL) != 0) {



                if (loginViewModel != null) {
                    // read loginViewModel.loginRequest
                    loginViewModelLoginRequest = loginViewModel.getLoginRequest();
                }

            if ((dirtyFlags & 0xcL) != 0) {

                    if (loginViewModelLoginRequest != null) {
                        // read loginViewModel.loginRequest.email
                        loginViewModelLoginRequestEmail = loginViewModelLoginRequest.getEmail();
                        // read loginViewModel.loginRequest.password
                        loginViewModelLoginRequestPassword = loginViewModelLoginRequest.getPassword();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginViewModelLoginRequest != null) {
                        // read loginViewModel.loginRequest.emailError
                        loginViewModelLoginRequestEmailError = loginViewModelLoginRequest.emailError;
                    }
                    updateRegistration(0, loginViewModelLoginRequestEmailError);


                    if (loginViewModelLoginRequestEmailError != null) {
                        // read loginViewModel.loginRequest.emailError.get()
                        loginViewModelLoginRequestEmailErrorGet = loginViewModelLoginRequestEmailError.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (loginViewModelLoginRequest != null) {
                        // read loginViewModel.loginRequest.passwordError
                        loginViewModelLoginRequestPasswordError = loginViewModelLoginRequest.passwordError;
                    }
                    updateRegistration(1, loginViewModelLoginRequestPasswordError);


                    if (loginViewModelLoginRequestPasswordError != null) {
                        // read loginViewModel.loginRequest.passwordError.get()
                        loginViewModelLoginRequestPasswordErrorGet = loginViewModelLoginRequestPasswordError.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtLogin, loginViewModelLoginRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, loginViewModelLoginRequestPassword);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.edtLogin, loginViewModelLoginRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setListener(this.edtLogin, edtLoginerrorAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtLogin, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtLoginandroidTextAttrChanged);
            apps.app.altcompany.customViews.views.BaseEditText.setListener(this.mboundView2, mboundView2errorAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback6);
            this.mboundView4.setOnClickListener(mCallback7);
            this.mboundView5.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView2, loginViewModelLoginRequestPasswordErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // loginViewModel != null
                boolean loginViewModelJavaLangObjectNull = false;
                // loginViewModel
                apps.app.altcompany.pages.auth.login.LoginViewModel loginViewModel = mLoginViewModel;



                loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
                if (loginViewModelJavaLangObjectNull) {


                    loginViewModel.loginPhone();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // loginViewModel != null
                boolean loginViewModelJavaLangObjectNull = false;
                // loginViewModel
                apps.app.altcompany.pages.auth.login.LoginViewModel loginViewModel = mLoginViewModel;



                loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
                if (loginViewModelJavaLangObjectNull) {


                    loginViewModel.register();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // loginViewModel != null
                boolean loginViewModelJavaLangObjectNull = false;
                // loginViewModel
                apps.app.altcompany.pages.auth.login.LoginViewModel loginViewModel = mLoginViewModel;



                loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
                if (loginViewModelJavaLangObjectNull) {


                    loginViewModel.forgetPassword();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel.loginRequest.emailError
        flag 1 (0x2L): loginViewModel.loginRequest.passwordError
        flag 2 (0x3L): loginViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}