package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterStep3BindingImpl extends FragmentRegisterStep3Binding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.your_state_progress_bar_id, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterStep3BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterStep3BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            , (com.kofigyan.stateprogressbar.StateProgressBar) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.recyclerview.widget.RecyclerView) bindings[1];
        this.mboundView1.setTag(null);
        this.submit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        else if (fieldId == BR.packagesAdapter) {
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
        apps.app.altcompany.pages.auth.register.adapters.PackagesAdapter registerStep1ViewModelPackagesAdapter = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (registerStep1ViewModel != null) {
                    // read registerStep1ViewModel.packagesAdapter
                    registerStep1ViewModelPackagesAdapter = registerStep1ViewModel.getPackagesAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.getItemsV2Binding(this.mboundView1, registerStep1ViewModelPackagesAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.submit.setOnClickListener(mCallback15);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // registerStep1ViewModel != null
        boolean registerStep1ViewModelJavaLangObjectNull = false;
        // registerStep1ViewModel
        apps.app.altcompany.pages.auth.register.RegisterViewModel registerStep1ViewModel = mRegisterStep1ViewModel;



        registerStep1ViewModelJavaLangObjectNull = (registerStep1ViewModel) != (null);
        if (registerStep1ViewModelJavaLangObjectNull) {


            registerStep1ViewModel.registerStep3();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerStep1ViewModel
        flag 1 (0x2L): registerStep1ViewModel.packagesAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}