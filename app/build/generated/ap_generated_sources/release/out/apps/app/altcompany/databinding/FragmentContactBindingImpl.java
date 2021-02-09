package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContactBindingImpl extends FragmentContactBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_contact, 3);
        sViewsWithIds.put(R.id.ll_phone, 4);
        sViewsWithIds.put(R.id.img_item_contact, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentContactBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvContact.setTag(null);
        this.tvPhone.setTag(null);
        setRootTag(root);
        // listeners
        mCallback41 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.aboutViewModel == variableId) {
            setAboutViewModel((apps.app.altcompany.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAboutViewModel(@Nullable apps.app.altcompany.pages.settings.viewModels.SettingsViewModel AboutViewModel) {
        updateRegistration(0, AboutViewModel);
        this.mAboutViewModel = AboutViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.aboutViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAboutViewModel((apps.app.altcompany.pages.settings.viewModels.SettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAboutViewModel(apps.app.altcompany.pages.settings.viewModels.SettingsViewModel AboutViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.contactUsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.contactResponse) {
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
        apps.app.altcompany.pages.settings.viewModels.SettingsViewModel aboutViewModel = mAboutViewModel;
        apps.app.altcompany.pages.settings.models.ContactResponse aboutViewModelContactResponse = null;
        apps.app.altcompany.pages.settings.models.ContactData aboutViewModelContactResponseData = null;
        apps.app.altcompany.pages.settings.adapters.ContactUsAdapter aboutViewModelContactUsAdapter = null;
        java.lang.String aboutViewModelContactResponseDataPhone = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (aboutViewModel != null) {
                        // read aboutViewModel.contactResponse
                        aboutViewModelContactResponse = aboutViewModel.getContactResponse();
                    }


                    if (aboutViewModelContactResponse != null) {
                        // read aboutViewModel.contactResponse.data
                        aboutViewModelContactResponseData = aboutViewModelContactResponse.getData();
                    }


                    if (aboutViewModelContactResponseData != null) {
                        // read aboutViewModel.contactResponse.data.phone
                        aboutViewModelContactResponseDataPhone = aboutViewModelContactResponseData.getPhone();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (aboutViewModel != null) {
                        // read aboutViewModel.contactUsAdapter
                        aboutViewModelContactUsAdapter = aboutViewModel.getContactUsAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.getItemsV2Binding(this.rvContact, aboutViewModelContactUsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.tvPhone.setOnClickListener(mCallback41);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhone, aboutViewModelContactResponseDataPhone);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // aboutViewModel
        apps.app.altcompany.pages.settings.viewModels.SettingsViewModel aboutViewModel = mAboutViewModel;
        // aboutViewModel != null
        boolean aboutViewModelJavaLangObjectNull = false;



        aboutViewModelJavaLangObjectNull = (aboutViewModel) != (null);
        if (aboutViewModelJavaLangObjectNull) {


            aboutViewModel.phoneSubmit();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): aboutViewModel
        flag 1 (0x2L): aboutViewModel.contactUsAdapter
        flag 2 (0x3L): aboutViewModel.contactResponse
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}