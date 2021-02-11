package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConfirmCodeBindingImpl extends FragmentConfirmCodeBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener pinViewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of verificationCodeViewModel.request.code
            //         is verificationCodeViewModel.request.setCode((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(pinView);
            // localize variables for thread safety
            // verificationCodeViewModel.request.code
            java.lang.String verificationCodeViewModelRequestCode = null;
            // verificationCodeViewModel
            apps.app.altcompany.pages.auth.confirmCode.CodeViewModel verificationCodeViewModel = mVerificationCodeViewModel;
            // verificationCodeViewModel != null
            boolean verificationCodeViewModelJavaLangObjectNull = false;
            // verificationCodeViewModel.request
            apps.app.altcompany.pages.auth.models.ConfirmCodeRequest verificationCodeViewModelRequest = null;
            // verificationCodeViewModel.request != null
            boolean verificationCodeViewModelRequestJavaLangObjectNull = false;



            verificationCodeViewModelJavaLangObjectNull = (verificationCodeViewModel) != (null);
            if (verificationCodeViewModelJavaLangObjectNull) {


                verificationCodeViewModelRequest = verificationCodeViewModel.getRequest();

                verificationCodeViewModelRequestJavaLangObjectNull = (verificationCodeViewModelRequest) != (null);
                if (verificationCodeViewModelRequestJavaLangObjectNull) {




                    verificationCodeViewModelRequest.setCode(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentConfirmCodeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentConfirmCodeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (com.chaos.view.PinView) bindings[1]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.pinView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback20 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.verificationCodeViewModel == variableId) {
            setVerificationCodeViewModel((apps.app.altcompany.pages.auth.confirmCode.CodeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVerificationCodeViewModel(@Nullable apps.app.altcompany.pages.auth.confirmCode.CodeViewModel VerificationCodeViewModel) {
        updateRegistration(0, VerificationCodeViewModel);
        this.mVerificationCodeViewModel = VerificationCodeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.verificationCodeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVerificationCodeViewModel((apps.app.altcompany.pages.auth.confirmCode.CodeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVerificationCodeViewModel(apps.app.altcompany.pages.auth.confirmCode.CodeViewModel VerificationCodeViewModel, int fieldId) {
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
        java.lang.String verificationCodeViewModelRequestCode = null;
        apps.app.altcompany.pages.auth.confirmCode.CodeViewModel verificationCodeViewModel = mVerificationCodeViewModel;
        apps.app.altcompany.pages.auth.models.ConfirmCodeRequest verificationCodeViewModelRequest = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (verificationCodeViewModel != null) {
                    // read verificationCodeViewModel.request
                    verificationCodeViewModelRequest = verificationCodeViewModel.getRequest();
                }


                if (verificationCodeViewModelRequest != null) {
                    // read verificationCodeViewModel.request.code
                    verificationCodeViewModelRequestCode = verificationCodeViewModelRequest.getCode();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback20);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.pinView, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, pinViewandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pinView, verificationCodeViewModelRequestCode);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // verificationCodeViewModel
        apps.app.altcompany.pages.auth.confirmCode.CodeViewModel verificationCodeViewModel = mVerificationCodeViewModel;
        // verificationCodeViewModel != null
        boolean verificationCodeViewModelJavaLangObjectNull = false;



        verificationCodeViewModelJavaLangObjectNull = (verificationCodeViewModel) != (null);
        if (verificationCodeViewModelJavaLangObjectNull) {


            verificationCodeViewModel.confirmCode();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): verificationCodeViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}