package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPrivacyBindingImpl extends FragmentPrivacyBinding  {

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
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPrivacyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentPrivacyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.privacyViewModel == variableId) {
            setPrivacyViewModel((apps.app.altcompany.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPrivacyViewModel(@Nullable apps.app.altcompany.pages.settings.viewModels.SettingsViewModel PrivacyViewModel) {
        updateRegistration(0, PrivacyViewModel);
        this.mPrivacyViewModel = PrivacyViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.privacyViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePrivacyViewModel((apps.app.altcompany.pages.settings.viewModels.SettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangePrivacyViewModel(apps.app.altcompany.pages.settings.viewModels.SettingsViewModel PrivacyViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.privacyData) {
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
        apps.app.altcompany.pages.auth.register.models.PrivacyPolicy privacyViewModelPrivacyData = null;
        apps.app.altcompany.pages.settings.viewModels.SettingsViewModel privacyViewModel = mPrivacyViewModel;
        java.lang.String privacyViewModelPrivacyDataDetails = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (privacyViewModel != null) {
                    // read privacyViewModel.privacyData
                    privacyViewModelPrivacyData = privacyViewModel.getPrivacyData();
                }


                if (privacyViewModelPrivacyData != null) {
                    // read privacyViewModel.privacyData.details
                    privacyViewModelPrivacyDataDetails = privacyViewModelPrivacyData.getDetails();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, privacyViewModelPrivacyDataDetails);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): privacyViewModel
        flag 1 (0x2L): privacyViewModel.privacyData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}