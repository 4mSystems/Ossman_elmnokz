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
        sViewsWithIds.put(R.id.your_state_progress_bar_id, 13);
        sViewsWithIds.put(R.id.rl_register_image, 14);
    }
    // views
    @NonNull
    private final android.widget.CheckBox mboundView10;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView11;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView12;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView2;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView3;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView4;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView5;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
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
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerStep1ViewModel.request.workers_desc
            //         is registerStep1ViewModel.request.setWorkers_desc((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterStep1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[9]
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[7]
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[6]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[14]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (com.kofigyan.stateprogressbar.StateProgressBar) bindings[13]
            );
        this.businessRegister.setTag(null);
        this.edAddress.setTag(null);
        this.edtRegisterStep1City.setTag(null);
        this.imgRegisterUpdate.setTag(null);
        this.mboundView10 = (android.widget.CheckBox) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView8 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.svRegisterStep1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new apps.app.altcompany.generated.callback.OnClickListener(this, 6);
        mCallback8 = new apps.app.altcompany.generated.callback.OnClickListener(this, 3);
        mCallback6 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
        mCallback12 = new apps.app.altcompany.generated.callback.OnClickListener(this, 7);
        mCallback10 = new apps.app.altcompany.generated.callback.OnClickListener(this, 5);
        mCallback9 = new apps.app.altcompany.generated.callback.OnClickListener(this, 4);
        mCallback7 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
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
        if (BR.registerStep1ViewModel == variableId) {
            setRegisterStep1ViewModel((apps.app.altcompany.pages.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterStep1ViewModel(@Nullable apps.app.altcompany.pages.auth.register.RegisterViewModel RegisterStep1ViewModel) {
        updateRegistration(0, RegisterStep1ViewModel);
        this.mRegisterStep1ViewModel = RegisterStep1ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.registerStep1ViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRegisterStep1ViewModel((apps.app.altcompany.pages.auth.register.RegisterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModel(apps.app.altcompany.pages.auth.register.RegisterViewModel RegisterStep1ViewModel, int fieldId) {
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
        java.lang.String registerStep1ViewModelRequestPhone = null;
        apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;
        java.lang.String registerStep1ViewModelRequestWorkersDesc = null;
        java.lang.String registerStep1ViewModelRequestEmail = null;
        apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
        java.lang.String registerStep1ViewModelRequestName = null;
        java.lang.String registerStep1ViewModelRequestPassword = null;
        java.lang.String registerStep1ViewModelRequestWorkersAddress = null;
        java.lang.String registerStep1ViewModelRequestBussinessregister = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (registerStep1ViewModel != null) {
                    // read registerStep1ViewModel.request
                    registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();
                }


                if (registerStep1ViewModelRequest != null) {
                    // read registerStep1ViewModel.request.phone
                    registerStep1ViewModelRequestPhone = registerStep1ViewModelRequest.getPhone();
                    // read registerStep1ViewModel.request.workers_desc
                    registerStep1ViewModelRequestWorkersDesc = registerStep1ViewModelRequest.getWorkers_desc();
                    // read registerStep1ViewModel.request.email
                    registerStep1ViewModelRequestEmail = registerStep1ViewModelRequest.getEmail();
                    // read registerStep1ViewModel.request.name
                    registerStep1ViewModelRequestName = registerStep1ViewModelRequest.getName();
                    // read registerStep1ViewModel.request.password
                    registerStep1ViewModelRequestPassword = registerStep1ViewModelRequest.getPassword();
                    // read registerStep1ViewModel.request.workers_address
                    registerStep1ViewModelRequestWorkersAddress = registerStep1ViewModelRequest.getWorkers_address();
                    // read registerStep1ViewModel.request.bussinessregister
                    registerStep1ViewModelRequestBussinessregister = registerStep1ViewModelRequest.getBussinessregister();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.businessRegister.setOnClickListener(mCallback9);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.businessRegister, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, businessRegisterandroidTextAttrChanged);
            this.edAddress.setOnClickListener(mCallback8);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edAddressandroidTextAttrChanged);
            this.edtRegisterStep1City.setOnClickListener(mCallback7);
            this.imgRegisterUpdate.setOnClickListener(mCallback6);
            this.mboundView10.setOnClickListener(mCallback10);
            this.mboundView11.setOnClickListener(mCallback11);
            this.mboundView12.setOnClickListener(mCallback12);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.businessRegister, registerStep1ViewModelRequestBussinessregister);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edAddress, registerStep1ViewModelRequestWorkersAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, registerStep1ViewModelRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, registerStep1ViewModelRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, registerStep1ViewModelRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, registerStep1ViewModelRequestPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, registerStep1ViewModelRequestWorkersDesc);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
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
            case 3: {
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
            case 7: {
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
            case 5: {
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
            case 4: {
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
            case 2: {
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
        flag 0 (0x1L): registerStep1ViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}