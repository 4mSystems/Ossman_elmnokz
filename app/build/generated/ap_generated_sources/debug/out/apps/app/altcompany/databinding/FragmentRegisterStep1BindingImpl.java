package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterStep1BindingImpl extends FragmentRegisterStep1Binding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.your_state_progress_bar_id, 14);
        sViewsWithIds.put(R.id.rl_register_image, 15);
    }
    // views
    @NonNull
    private final android.widget.CheckBox mboundView11;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView12;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView13;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView2;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView3;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView4;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView5;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener businessRegisterandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerStep1ViewModel.request.bussinessregister
            //         is registerStep1ViewModel.request.setBussinessregister((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(businessRegister);
            // localize variables for thread safety
            // registerStep1ViewModel != null
            boolean registerStep1ViewModelJavaLangObjectNull = false;
            // registerStep1ViewModel
            apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
            // registerStep1ViewModel.request != null
            boolean registerStep1ViewModelRequestJavaLangObjectNull = false;
            // registerStep1ViewModel.request.bussinessregister
            java.lang.String registerStep1ViewModelRequestBussinessregister = null;
            // registerStep1ViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;



            registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
            if (registerStep1ViewModelJavaLangObjectNull) {


                registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();

                registerStep1ViewModelRequestJavaLangObjectNull = (registerStep1ViewModelRequest) != (null);
                if (registerStep1ViewModelRequestJavaLangObjectNull) {




                    registerStep1ViewModelRequest.setBussinessregister(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerStep1ViewModel.request.workers_address
            //         is registerStep1ViewModel.request.setWorkers_address((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edAddress);
            // localize variables for thread safety
            // registerStep1ViewModel != null
            boolean registerStep1ViewModelJavaLangObjectNull = false;
            // registerStep1ViewModel
            apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
            // registerStep1ViewModel.request != null
            boolean registerStep1ViewModelRequestJavaLangObjectNull = false;
            // registerStep1ViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;
            // registerStep1ViewModel.request.workers_address
            java.lang.String registerStep1ViewModelRequestWorkersAddress = null;



            registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
            if (registerStep1ViewModelJavaLangObjectNull) {


                registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();

                registerStep1ViewModelRequestJavaLangObjectNull = (registerStep1ViewModelRequest) != (null);
                if (registerStep1ViewModelRequestJavaLangObjectNull) {




                    registerStep1ViewModelRequest.setWorkers_address(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerStep1ViewModel.request.name
            //         is registerStep1ViewModel.request.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // registerStep1ViewModel != null
            boolean registerStep1ViewModelJavaLangObjectNull = false;
            // registerStep1ViewModel
            apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
            // registerStep1ViewModel.request != null
            boolean registerStep1ViewModelRequestJavaLangObjectNull = false;
            // registerStep1ViewModel.request.name
            java.lang.String registerStep1ViewModelRequestName = null;
            // registerStep1ViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;



            registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
            if (registerStep1ViewModelJavaLangObjectNull) {


                registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();

                registerStep1ViewModelRequestJavaLangObjectNull = (registerStep1ViewModelRequest) != (null);
                if (registerStep1ViewModelRequestJavaLangObjectNull) {




                    registerStep1ViewModelRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerStep1ViewModel.request.email
            //         is registerStep1ViewModel.request.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // registerStep1ViewModel != null
            boolean registerStep1ViewModelJavaLangObjectNull = false;
            // registerStep1ViewModel
            apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
            // registerStep1ViewModel.request != null
            boolean registerStep1ViewModelRequestJavaLangObjectNull = false;
            // registerStep1ViewModel.request.email
            java.lang.String registerStep1ViewModelRequestEmail = null;
            // registerStep1ViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;



            registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
            if (registerStep1ViewModelJavaLangObjectNull) {


                registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();

                registerStep1ViewModelRequestJavaLangObjectNull = (registerStep1ViewModelRequest) != (null);
                if (registerStep1ViewModelRequestJavaLangObjectNull) {




                    registerStep1ViewModelRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerStep1ViewModel.request.phone
            //         is registerStep1ViewModel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // registerStep1ViewModel != null
            boolean registerStep1ViewModelJavaLangObjectNull = false;
            // registerStep1ViewModel
            apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
            // registerStep1ViewModel.request != null
            boolean registerStep1ViewModelRequestJavaLangObjectNull = false;
            // registerStep1ViewModel.request.phone
            java.lang.String registerStep1ViewModelRequestPhone = null;
            // registerStep1ViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;



            registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
            if (registerStep1ViewModelJavaLangObjectNull) {


                registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();

                registerStep1ViewModelRequestJavaLangObjectNull = (registerStep1ViewModelRequest) != (null);
                if (registerStep1ViewModelRequestJavaLangObjectNull) {




                    registerStep1ViewModelRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerStep1ViewModel.request.password
            //         is registerStep1ViewModel.request.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // registerStep1ViewModel != null
            boolean registerStep1ViewModelJavaLangObjectNull = false;
            // registerStep1ViewModel
            apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
            // registerStep1ViewModel.request != null
            boolean registerStep1ViewModelRequestJavaLangObjectNull = false;
            // registerStep1ViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;
            // registerStep1ViewModel.request.password
            java.lang.String registerStep1ViewModelRequestPassword = null;



            registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
            if (registerStep1ViewModelJavaLangObjectNull) {


                registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();

                registerStep1ViewModelRequestJavaLangObjectNull = (registerStep1ViewModelRequest) != (null);
                if (registerStep1ViewModelRequestJavaLangObjectNull) {




                    registerStep1ViewModelRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerStep1ViewModel.request.workers_desc
            //         is registerStep1ViewModel.request.setWorkers_desc((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // registerStep1ViewModel != null
            boolean registerStep1ViewModelJavaLangObjectNull = false;
            // registerStep1ViewModel
            apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
            // registerStep1ViewModel.request.workers_desc
            java.lang.String registerStep1ViewModelRequestWorkersDesc = null;
            // registerStep1ViewModel.request != null
            boolean registerStep1ViewModelRequestJavaLangObjectNull = false;
            // registerStep1ViewModel.request
            apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;



            registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
            if (registerStep1ViewModelJavaLangObjectNull) {


                registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();

                registerStep1ViewModelRequestJavaLangObjectNull = (registerStep1ViewModelRequest) != (null);
                if (registerStep1ViewModelRequestJavaLangObjectNull) {




                    registerStep1ViewModelRequest.setWorkers_desc(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegisterStep1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterStep1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[10]
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[8]
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[7]
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[6]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[15]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (com.kofigyan.stateprogressbar.StateProgressBar) bindings[14]
            );
        this.businessRegister.setTag(null);
        this.edAddress.setTag(null);
        this.edtRegisterStep1City.setTag(null);
        this.edtRegisterStep1Country.setTag(null);
        this.imgRegisterUpdate.setTag(null);
        this.mboundView11 = (android.widget.CheckBox) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView9 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.svRegisterStep1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new apps.app.altcompany.generated.callback.OnClickListener(this, 4);
        mCallback30 = new apps.app.altcompany.generated.callback.OnClickListener(this, 7);
        mCallback28 = new apps.app.altcompany.generated.callback.OnClickListener(this, 5);
        mCallback24 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
        mCallback31 = new apps.app.altcompany.generated.callback.OnClickListener(this, 8);
        mCallback25 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
        mCallback29 = new apps.app.altcompany.generated.callback.OnClickListener(this, 6);
        mCallback26 = new apps.app.altcompany.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.registerStep1ViewModel == variableId) {
            setRegisterStep1ViewModel((apps.app.altcompany.pages.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterStep1ViewModel(@Nullable apps.app.altcompany.pages.auth.register.RegisterViewModel RegisterStep1ViewModel) {
        updateRegistration(7, RegisterStep1ViewModel);
        this.mRegisterStep1ViewModel = RegisterStep1ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.registerStep1ViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRegisterStep1ViewModelRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeRegisterStep1ViewModelRequestCountryError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeRegisterStep1ViewModelRequestDesError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeRegisterStep1ViewModelRequestPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeRegisterStep1ViewModelRequestCityError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeRegisterStep1ViewModelRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeRegisterStep1ViewModelRequestBusinessError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeRegisterStep1ViewModel((apps.app.altcompany.pages.auth.register.RegisterViewModel) object, fieldId);
            case 8 :
                return onChangeRegisterStep1ViewModelRequestAddressError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeRegisterStep1ViewModelRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestPhoneError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestCountryError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestCountryError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestDesError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestDesError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestPasswordError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestCityError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestCityError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestEmailError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestBusinessError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestBusinessError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModel(apps.app.altcompany.pages.auth.register.RegisterViewModel RegisterStep1ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestAddressError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestAddressError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestNameError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.lang.String registerStep1ViewModelRequestPhone = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestPhoneError = null;
        apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;
        java.lang.String registerStep1ViewModelRequestBusinessErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestCountryError = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestDesError = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestPasswordError = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestCityError = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestEmailError = null;
        java.lang.String registerStep1ViewModelRequestCityErrorGet = null;
        java.lang.String registerStep1ViewModelRequestName = null;
        java.lang.String registerStep1ViewModelRequestEmailErrorGet = null;
        java.lang.String registerStep1ViewModelRequestBussinessregister = null;
        java.lang.String registerStep1ViewModelRequestNameErrorGet = null;
        java.lang.String registerStep1ViewModelRequestDesErrorGet = null;
        java.lang.String registerStep1ViewModelRequestCountryErrorGet = null;
        java.lang.String registerStep1ViewModelRequestAddressErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestBusinessError = null;
        java.lang.String registerStep1ViewModelRequestWorkersDesc = null;
        java.lang.String registerStep1ViewModelRequestEmail = null;
        apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
        java.lang.String registerStep1ViewModelRequestPasswordErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestAddressError = null;
        java.lang.String registerStep1ViewModelRequestPassword = null;
        java.lang.String registerStep1ViewModelRequestWorkersAddress = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestNameError = null;
        java.lang.String registerStep1ViewModelRequestPhoneErrorGet = null;

        if ((dirtyFlags & 0x7ffL) != 0) {



                if (registerStep1ViewModel != null) {
                    // read registerStep1ViewModel.request
                    registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();
                }

            if ((dirtyFlags & 0x480L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.phone
                        registerStep1ViewModelRequestPhone = registerStep1ViewModelRequest.getPhone();
                        // read registerStep1ViewModel.request.name
                        registerStep1ViewModelRequestName = registerStep1ViewModelRequest.getName();
                        // read registerStep1ViewModel.request.bussinessregister
                        registerStep1ViewModelRequestBussinessregister = registerStep1ViewModelRequest.getBussinessregister();
                        // read registerStep1ViewModel.request.workers_desc
                        registerStep1ViewModelRequestWorkersDesc = registerStep1ViewModelRequest.getWorkers_desc();
                        // read registerStep1ViewModel.request.email
                        registerStep1ViewModelRequestEmail = registerStep1ViewModelRequest.getEmail();
                        // read registerStep1ViewModel.request.password
                        registerStep1ViewModelRequestPassword = registerStep1ViewModelRequest.getPassword();
                        // read registerStep1ViewModel.request.workers_address
                        registerStep1ViewModelRequestWorkersAddress = registerStep1ViewModelRequest.getWorkers_address();
                    }
            }
            if ((dirtyFlags & 0x481L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.phoneError
                        registerStep1ViewModelRequestPhoneError = registerStep1ViewModelRequest.phoneError;
                    }
                    updateRegistration(0, registerStep1ViewModelRequestPhoneError);


                    if (registerStep1ViewModelRequestPhoneError != null) {
                        // read registerStep1ViewModel.request.phoneError.get()
                        registerStep1ViewModelRequestPhoneErrorGet = registerStep1ViewModelRequestPhoneError.get();
                    }
            }
            if ((dirtyFlags & 0x482L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.countryError
                        registerStep1ViewModelRequestCountryError = registerStep1ViewModelRequest.countryError;
                    }
                    updateRegistration(1, registerStep1ViewModelRequestCountryError);


                    if (registerStep1ViewModelRequestCountryError != null) {
                        // read registerStep1ViewModel.request.countryError.get()
                        registerStep1ViewModelRequestCountryErrorGet = registerStep1ViewModelRequestCountryError.get();
                    }
            }
            if ((dirtyFlags & 0x484L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.desError
                        registerStep1ViewModelRequestDesError = registerStep1ViewModelRequest.desError;
                    }
                    updateRegistration(2, registerStep1ViewModelRequestDesError);


                    if (registerStep1ViewModelRequestDesError != null) {
                        // read registerStep1ViewModel.request.desError.get()
                        registerStep1ViewModelRequestDesErrorGet = registerStep1ViewModelRequestDesError.get();
                    }
            }
            if ((dirtyFlags & 0x488L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.passwordError
                        registerStep1ViewModelRequestPasswordError = registerStep1ViewModelRequest.passwordError;
                    }
                    updateRegistration(3, registerStep1ViewModelRequestPasswordError);


                    if (registerStep1ViewModelRequestPasswordError != null) {
                        // read registerStep1ViewModel.request.passwordError.get()
                        registerStep1ViewModelRequestPasswordErrorGet = registerStep1ViewModelRequestPasswordError.get();
                    }
            }
            if ((dirtyFlags & 0x490L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.cityError
                        registerStep1ViewModelRequestCityError = registerStep1ViewModelRequest.cityError;
                    }
                    updateRegistration(4, registerStep1ViewModelRequestCityError);


                    if (registerStep1ViewModelRequestCityError != null) {
                        // read registerStep1ViewModel.request.cityError.get()
                        registerStep1ViewModelRequestCityErrorGet = registerStep1ViewModelRequestCityError.get();
                    }
            }
            if ((dirtyFlags & 0x4a0L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.emailError
                        registerStep1ViewModelRequestEmailError = registerStep1ViewModelRequest.emailError;
                    }
                    updateRegistration(5, registerStep1ViewModelRequestEmailError);


                    if (registerStep1ViewModelRequestEmailError != null) {
                        // read registerStep1ViewModel.request.emailError.get()
                        registerStep1ViewModelRequestEmailErrorGet = registerStep1ViewModelRequestEmailError.get();
                    }
            }
            if ((dirtyFlags & 0x4c0L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.businessError
                        registerStep1ViewModelRequestBusinessError = registerStep1ViewModelRequest.businessError;
                    }
                    updateRegistration(6, registerStep1ViewModelRequestBusinessError);


                    if (registerStep1ViewModelRequestBusinessError != null) {
                        // read registerStep1ViewModel.request.businessError.get()
                        registerStep1ViewModelRequestBusinessErrorGet = registerStep1ViewModelRequestBusinessError.get();
                    }
            }
            if ((dirtyFlags & 0x580L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.addressError
                        registerStep1ViewModelRequestAddressError = registerStep1ViewModelRequest.addressError;
                    }
                    updateRegistration(8, registerStep1ViewModelRequestAddressError);


                    if (registerStep1ViewModelRequestAddressError != null) {
                        // read registerStep1ViewModel.request.addressError.get()
                        registerStep1ViewModelRequestAddressErrorGet = registerStep1ViewModelRequestAddressError.get();
                    }
            }
            if ((dirtyFlags & 0x680L) != 0) {

                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.nameError
                        registerStep1ViewModelRequestNameError = registerStep1ViewModelRequest.nameError;
                    }
                    updateRegistration(9, registerStep1ViewModelRequestNameError);


                    if (registerStep1ViewModelRequestNameError != null) {
                        // read registerStep1ViewModel.request.nameError.get()
                        registerStep1ViewModelRequestNameErrorGet = registerStep1ViewModelRequestNameError.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.businessRegister.setOnClickListener(mCallback28);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.businessRegister, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, businessRegisterandroidTextAttrChanged);
            this.edAddress.setOnClickListener(mCallback27);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edAddressandroidTextAttrChanged);
            this.edtRegisterStep1City.setOnClickListener(mCallback26);
            this.edtRegisterStep1Country.setOnClickListener(mCallback25);
            this.imgRegisterUpdate.setOnClickListener(mCallback24);
            this.mboundView11.setOnClickListener(mCallback29);
            this.mboundView12.setOnClickListener(mCallback30);
            this.mboundView13.setOnClickListener(mCallback31);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x480L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.businessRegister, registerStep1ViewModelRequestBussinessregister);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edAddress, registerStep1ViewModelRequestWorkersAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, registerStep1ViewModelRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, registerStep1ViewModelRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, registerStep1ViewModelRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, registerStep1ViewModelRequestPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, registerStep1ViewModelRequestWorkersDesc);
        }
        if ((dirtyFlags & 0x4c0L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.businessRegister, registerStep1ViewModelRequestBusinessErrorGet);
        }
        if ((dirtyFlags & 0x580L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.edAddress, registerStep1ViewModelRequestAddressErrorGet);
        }
        if ((dirtyFlags & 0x490L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.edtRegisterStep1City, registerStep1ViewModelRequestCityErrorGet);
        }
        if ((dirtyFlags & 0x482L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.edtRegisterStep1Country, registerStep1ViewModelRequestCountryErrorGet);
        }
        if ((dirtyFlags & 0x680L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView2, registerStep1ViewModelRequestNameErrorGet);
        }
        if ((dirtyFlags & 0x4a0L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView3, registerStep1ViewModelRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x481L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView4, registerStep1ViewModelRequestPhoneErrorGet);
        }
        if ((dirtyFlags & 0x488L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView5, registerStep1ViewModelRequestPasswordErrorGet);
        }
        if ((dirtyFlags & 0x484L) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.mboundView9, registerStep1ViewModelRequestDesErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.address();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.terms();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.toBusinessRegister();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.imageSubmit();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.register();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.countries();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.check();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.cities();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerStep1ViewModel.request.phoneError
        flag 1 (0x2L): registerStep1ViewModel.request.countryError
        flag 2 (0x3L): registerStep1ViewModel.request.desError
        flag 3 (0x4L): registerStep1ViewModel.request.passwordError
        flag 4 (0x5L): registerStep1ViewModel.request.cityError
        flag 5 (0x6L): registerStep1ViewModel.request.emailError
        flag 6 (0x7L): registerStep1ViewModel.request.businessError
        flag 7 (0x8L): registerStep1ViewModel
        flag 8 (0x9L): registerStep1ViewModel.request.addressError
        flag 9 (0xaL): registerStep1ViewModel.request.nameError
        flag 10 (0xbL): null
    flag mapping end*/
    //end
}