package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterStep2BindingImpl extends FragmentRegisterStep2Binding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

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
    private final androidx.recyclerview.widget.RecyclerView mboundView3;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView4;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterStep2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterStep2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (com.kofigyan.stateprogressbar.StateProgressBar) bindings[1]
            );
        this.departments.setTag(null);
        this.mboundView3 = (androidx.recyclerview.widget.RecyclerView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[5];
        this.mboundView5.setTag(null);
        this.svRegisterStep1.setTag(null);
        this.yourStateProgressBarId.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
        mCallback22 = new apps.app.altcompany.generated.callback.OnClickListener(this, 3);
        mCallback20 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
            case 1 :
                return onChangeRegisterStep1ViewModelRequestCategoryIdError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
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
        else if (fieldId == BR.categoriesAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterStep1ViewModelRequestCategoryIdError(androidx.databinding.ObservableField<java.lang.String> RegisterStep1ViewModelRequestCategoryIdError, int fieldId) {
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
        apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;
        apps.app.altcompany.pages.auth.register.adapters.CategoriesAdapter registerStep1ViewModelCategoriesAdapter = null;
        boolean registerStep1ViewModelUserDataJavaLangObjectNull = false;
        int registerStep1ViewModelUserDataJavaLangObjectNullViewGONEViewVISIBLE = 0;
        apps.app.altcompany.pages.auth.models.RegisterRequest registerStep1ViewModelRequest = null;
        java.lang.String registerStep1ViewModelRequestCategoryIdErrorGet = null;
        apps.app.altcompany.pages.auth.login.models.UserData registerStep1ViewModelUserData = null;
        androidx.databinding.ObservableField<java.lang.String> registerStep1ViewModelRequestCategoryIdError = null;
        int registerStep1ViewModelUserDataJavaLangObjectNullViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (registerStep1ViewModel != null) {
                        // read registerStep1ViewModel.categoriesAdapter
                        registerStep1ViewModelCategoriesAdapter = registerStep1ViewModel.getCategoriesAdapter();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (registerStep1ViewModel != null) {
                        // read registerStep1ViewModel.request
                        registerStep1ViewModelRequest = registerStep1ViewModel.getRequest();
                    }


                    if (registerStep1ViewModelRequest != null) {
                        // read registerStep1ViewModel.request.categoryIdError
                        registerStep1ViewModelRequestCategoryIdError = registerStep1ViewModelRequest.categoryIdError;
                    }
                    updateRegistration(1, registerStep1ViewModelRequestCategoryIdError);


                    if (registerStep1ViewModelRequestCategoryIdError != null) {
                        // read registerStep1ViewModel.request.categoryIdError.get()
                        registerStep1ViewModelRequestCategoryIdErrorGet = registerStep1ViewModelRequestCategoryIdError.get();
                    }
            }
            if ((dirtyFlags & 0x9L) != 0) {

                    if (registerStep1ViewModel != null) {
                        // read registerStep1ViewModel.userData
                        registerStep1ViewModelUserData = registerStep1ViewModel.userData;
                    }


                    // read registerStep1ViewModel.userData != null
                    registerStep1ViewModelUserDataJavaLangObjectNull = (registerStep1ViewModelUserData) != (null);
                if((dirtyFlags & 0x9L) != 0) {
                    if(registerStep1ViewModelUserDataJavaLangObjectNull) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read registerStep1ViewModel.userData != null ? View.GONE : View.VISIBLE
                    registerStep1ViewModelUserDataJavaLangObjectNullViewGONEViewVISIBLE = ((registerStep1ViewModelUserDataJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read registerStep1ViewModel.userData != null ? View.VISIBLE : View.GONE
                    registerStep1ViewModelUserDataJavaLangObjectNullViewVISIBLEViewGONE = ((registerStep1ViewModelUserDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.departments.setOnClickListener(mCallback20);
            this.mboundView4.setOnClickListener(mCallback21);
            this.mboundView5.setOnClickListener(mCallback22);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            apps.app.altcompany.customViews.views.BaseEditText.setError(this.departments, registerStep1ViewModelRequestCategoryIdErrorGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.getItemsV2Binding(this.mboundView3, registerStep1ViewModelCategoriesAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(registerStep1ViewModelUserDataJavaLangObjectNullViewGONEViewVISIBLE);
            this.mboundView5.setVisibility(registerStep1ViewModelUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.yourStateProgressBarId.setVisibility(registerStep1ViewModelUserDataJavaLangObjectNullViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // registerStep1ViewModel != null
                boolean registerStep1ViewModelJavaLangObjectNull = false;
                // registerStep1ViewModel
                apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



                registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
                if (registerStep1ViewModelJavaLangObjectNull) {


                    registerStep1ViewModel.registerStep2();
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


                    registerStep1ViewModel.registerStep2();
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


                    registerStep1ViewModel.toSelectDepartment();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerStep1ViewModel
        flag 1 (0x2L): registerStep1ViewModel.request.categoryIdError
        flag 2 (0x3L): registerStep1ViewModel.categoriesAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): registerStep1ViewModel.userData != null ? View.GONE : View.VISIBLE
        flag 5 (0x6L): registerStep1ViewModel.userData != null ? View.GONE : View.VISIBLE
        flag 6 (0x7L): registerStep1ViewModel.userData != null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): registerStep1ViewModel.userData != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}