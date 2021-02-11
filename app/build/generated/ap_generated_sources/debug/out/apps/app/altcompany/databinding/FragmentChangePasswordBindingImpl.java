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
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of changePasswordViewModel.request.oldPassword
            //         is changePasswordViewModel.request.setOldPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // changePasswordViewModel.request
            apps.app.altcompany.pages.auth.changePassword.ChangePasswordRequest changePasswordViewModelRequest = null;
            // changePasswordViewModel.request != null
            boolean changePasswordViewModelRequestJavaLangObjectNull = false;
            // changePasswordViewModel.request.oldPassword
            java.lang.String changePasswordViewModelRequestOldPassword = null;
            // changePasswordViewModel
            apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel changePasswordViewModel = mChangePasswordViewModel;
            // changePasswordViewModel != null
            boolean changePasswordViewModelJavaLangObjectNull = false;



            changePasswordViewModelJavaLangObjectNull = (changePasswordViewModel) != (null);
            if (changePasswordViewModelJavaLangObjectNull) {


                changePasswordViewModelRequest = changePasswordViewModel.getRequest();

                changePasswordViewModelRequestJavaLangObjectNull = (changePasswordViewModelRequest) != (null);
                if (changePasswordViewModelRequestJavaLangObjectNull) {




                    changePasswordViewModelRequest.setOldPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of changePasswordViewModel.request.newPassword
            //         is changePasswordViewModel.request.setNewPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // changePasswordViewModel.request
            apps.app.altcompany.pages.auth.changePassword.ChangePasswordRequest changePasswordViewModelRequest = null;
            // changePasswordViewModel.request != null
            boolean changePasswordViewModelRequestJavaLangObjectNull = false;
            // changePasswordViewModel
            apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel changePasswordViewModel = mChangePasswordViewModel;
            // changePasswordViewModel != null
            boolean changePasswordViewModelJavaLangObjectNull = false;
            // changePasswordViewModel.request.newPassword
            java.lang.String changePasswordViewModelRequestNewPassword = null;



            changePasswordViewModelJavaLangObjectNull = (changePasswordViewModel) != (null);
            if (changePasswordViewModelJavaLangObjectNull) {


                changePasswordViewModelRequest = changePasswordViewModel.getRequest();

                changePasswordViewModelRequestJavaLangObjectNull = (changePasswordViewModelRequest) != (null);
                if (changePasswordViewModelRequestJavaLangObjectNull) {




                    changePasswordViewModelRequest.setNewPassword(((java.lang.String) (callbackArg_0)));
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
            apps.app.altcompany.pages.auth.changePassword.ChangePasswordRequest changePasswordViewModelRequest = null;
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
        super(bindingComponent, root, 1
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
        mCallback14 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.changePasswordViewModel == variableId) {
            setChangePasswordViewModel((apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChangePasswordViewModel(@Nullable apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel ChangePasswordViewModel) {
        updateRegistration(0, ChangePasswordViewModel);
        this.mChangePasswordViewModel = ChangePasswordViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.changePasswordViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeChangePasswordViewModel((apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeChangePasswordViewModel(apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel ChangePasswordViewModel, int fieldId) {
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
        int changePasswordViewModelPassingObjectId = 0;
        apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel changePasswordViewModel = mChangePasswordViewModel;
        boolean changePasswordViewModelPassingObjectIdInt1 = false;
        boolean changePasswordViewModelPassingObjectJavaLangObjectNullChangePasswordViewModelPassingObjectIdInt1BooleanFalse = false;
        apps.app.altcompany.pages.auth.changePassword.ChangePasswordRequest changePasswordViewModelRequest = null;
        int changePasswordViewModelPassingObjectJavaLangObjectNullChangePasswordViewModelPassingObjectIdInt1BooleanFalseViewGONEViewVISIBLE = 0;
        apps.app.altcompany.PassingObject changePasswordViewModelPassingObject = null;
        java.lang.String changePasswordViewModelRequestOldPassword = null;
        java.lang.String changePasswordViewModelRequestConfirmPassword = null;
        java.lang.String changePasswordViewModelRequestNewPassword = null;
        boolean changePasswordViewModelPassingObjectJavaLangObjectNull = false;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (changePasswordViewModel != null) {
                        // read changePasswordViewModel.request
                        changePasswordViewModelRequest = changePasswordViewModel.getRequest();
                    }


                    if (changePasswordViewModelRequest != null) {
                        // read changePasswordViewModel.request.oldPassword
                        changePasswordViewModelRequestOldPassword = changePasswordViewModelRequest.getOldPassword();
                        // read changePasswordViewModel.request.confirmPassword
                        changePasswordViewModelRequestConfirmPassword = changePasswordViewModelRequest.getConfirmPassword();
                        // read changePasswordViewModel.request.newPassword
                        changePasswordViewModelRequestNewPassword = changePasswordViewModelRequest.getNewPassword();
                    }
            }

                if (changePasswordViewModel != null) {
                    // read changePasswordViewModel.passingObject
                    changePasswordViewModelPassingObject = changePasswordViewModel.getPassingObject();
                }


                // read changePasswordViewModel.passingObject != null
                changePasswordViewModelPassingObjectJavaLangObjectNull = (changePasswordViewModelPassingObject) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(changePasswordViewModelPassingObjectJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (changePasswordViewModelPassingObject != null) {
                    // read changePasswordViewModel.passingObject.id
                    changePasswordViewModelPassingObjectId = changePasswordViewModelPassingObject.getId();
                }


                // read changePasswordViewModel.passingObject.id == 1
                changePasswordViewModelPassingObjectIdInt1 = (changePasswordViewModelPassingObjectId) == (1);
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read changePasswordViewModel.passingObject != null ? changePasswordViewModel.passingObject.id == 1 : false
                changePasswordViewModelPassingObjectJavaLangObjectNullChangePasswordViewModelPassingObjectIdInt1BooleanFalse = ((changePasswordViewModelPassingObjectJavaLangObjectNull) ? (changePasswordViewModelPassingObjectIdInt1) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(changePasswordViewModelPassingObjectJavaLangObjectNullChangePasswordViewModelPassingObjectIdInt1BooleanFalse) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read changePasswordViewModel.passingObject != null ? changePasswordViewModel.passingObject.id == 1 : false ? View.GONE : View.VISIBLE
                changePasswordViewModelPassingObjectJavaLangObjectNullChangePasswordViewModelPassingObjectIdInt1BooleanFalseViewGONEViewVISIBLE = ((changePasswordViewModelPassingObjectJavaLangObjectNullChangePasswordViewModelPassingObjectIdInt1BooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, changePasswordViewModelRequestOldPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, changePasswordViewModelRequestNewPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, changePasswordViewModelRequestConfirmPassword);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(changePasswordViewModelPassingObjectJavaLangObjectNullChangePasswordViewModelPassingObjectIdInt1BooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback14);
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
        flag 0 (0x1L): changePasswordViewModel
        flag 1 (0x2L): changePasswordViewModel.passingObject
        flag 2 (0x3L): null
        flag 3 (0x4L): changePasswordViewModel.passingObject != null ? changePasswordViewModel.passingObject.id == 1 : false
        flag 4 (0x5L): changePasswordViewModel.passingObject != null ? changePasswordViewModel.passingObject.id == 1 : false
        flag 5 (0x6L): changePasswordViewModel.passingObject != null ? changePasswordViewModel.passingObject.id == 1 : false ? View.GONE : View.VISIBLE
        flag 6 (0x7L): changePasswordViewModel.passingObject != null ? changePasswordViewModel.passingObject.id == 1 : false ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}