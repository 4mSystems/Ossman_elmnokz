package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCompanyProfileBindingImpl extends FragmentCompanyProfileBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_points, 9);
        sViewsWithIds.put(R.id.card_bio, 10);
        sViewsWithIds.put(R.id.card_email, 11);
        sViewsWithIds.put(R.id.card_phone, 12);
        sViewsWithIds.put(R.id.card_location, 13);
        sViewsWithIds.put(R.id.card_facebook, 14);
        sViewsWithIds.put(R.id.txt_facebook, 15);
        sViewsWithIds.put(R.id.card_twitter, 16);
        sViewsWithIds.put(R.id.txt_twitter, 17);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtCompanyBioandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.companyProfile.workersDesc
            //         is viewModel.companyProfile.setWorkersDesc((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtCompanyBio);
            // localize variables for thread safety
            // viewModel.companyProfile.workersDesc
            java.lang.String viewModelCompanyProfileWorkersDesc = null;
            // viewModel.companyProfile
            apps.app.altcompany.pages.auth.login.models.UserData viewModelCompanyProfile = null;
            // viewModel
            apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.companyProfile != null
            boolean viewModelCompanyProfileJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCompanyProfile = viewModel.getCompanyProfile();

                viewModelCompanyProfileJavaLangObjectNull = (viewModelCompanyProfile) != (null);
                if (viewModelCompanyProfileJavaLangObjectNull) {




                    viewModelCompanyProfile.setWorkersDesc(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.companyProfile.email
            //         is viewModel.companyProfile.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtEmail);
            // localize variables for thread safety
            // viewModel.companyProfile
            apps.app.altcompany.pages.auth.login.models.UserData viewModelCompanyProfile = null;
            // viewModel.companyProfile.email
            java.lang.String viewModelCompanyProfileEmail = null;
            // viewModel
            apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.companyProfile != null
            boolean viewModelCompanyProfileJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCompanyProfile = viewModel.getCompanyProfile();

                viewModelCompanyProfileJavaLangObjectNull = (viewModelCompanyProfile) != (null);
                if (viewModelCompanyProfileJavaLangObjectNull) {




                    viewModelCompanyProfile.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtLocactionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.companyProfile.workers_address
            //         is viewModel.companyProfile.setWorkers_address((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtLocaction);
            // localize variables for thread safety
            // viewModel.companyProfile.workers_address
            java.lang.String viewModelCompanyProfileWorkersAddress = null;
            // viewModel.companyProfile
            apps.app.altcompany.pages.auth.login.models.UserData viewModelCompanyProfile = null;
            // viewModel
            apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.companyProfile != null
            boolean viewModelCompanyProfileJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCompanyProfile = viewModel.getCompanyProfile();

                viewModelCompanyProfileJavaLangObjectNull = (viewModelCompanyProfile) != (null);
                if (viewModelCompanyProfileJavaLangObjectNull) {




                    viewModelCompanyProfile.setWorkers_address(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPhoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.companyProfile.workersPhoneNumber
            //         is viewModel.companyProfile.setWorkersPhoneNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPhone);
            // localize variables for thread safety
            // viewModel.companyProfile.workersPhoneNumber
            java.lang.String viewModelCompanyProfileWorkersPhoneNumber = null;
            // viewModel.companyProfile
            apps.app.altcompany.pages.auth.login.models.UserData viewModelCompanyProfile = null;
            // viewModel
            apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.companyProfile != null
            boolean viewModelCompanyProfileJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCompanyProfile = viewModel.getCompanyProfile();

                viewModelCompanyProfileJavaLangObjectNull = (viewModelCompanyProfile) != (null);
                if (viewModelCompanyProfileJavaLangObjectNull) {




                    viewModelCompanyProfile.setWorkersPhoneNumber(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentCompanyProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentCompanyProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[15]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[17]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatButton) bindings[8];
        this.mboundView8.setTag(null);
        this.txtCompanyBio.setTag(null);
        this.txtEmail.setTag(null);
        this.txtLocaction.setTag(null);
        this.txtPhone.setTag(null);
        this.userImg.setTag(null);
        this.userName.setTag(null);
        this.userPoints.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
        mCallback29 = new apps.app.altcompany.generated.callback.OnClickListener(this, 3);
        mCallback30 = new apps.app.altcompany.generated.callback.OnClickListener(this, 4);
        mCallback28 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
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
        if (BR.viewModel == variableId) {
            setViewModel((apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.companyProfile) {
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
        java.lang.String viewModelCompanyProfileWorkersAddress = null;
        apps.app.altcompany.pages.auth.login.models.UserData viewModelCompanyProfile = null;
        java.lang.String viewModelCompanyProfileWorkersImg = null;
        java.lang.String viewModelCompanyProfileEmail = null;
        java.lang.String viewModelCompanyProfileWorkersDesc = null;
        java.lang.String viewModelCompanyProfileWorkersUsername = null;
        java.lang.String viewModelCompanyProfileWorkersPoints = null;
        java.lang.String viewModelCompanyProfileWorkersPhoneNumber = null;
        java.lang.String viewModelCompanyProfileWorkersPointsConcatJavaLangString = null;
        java.lang.String viewModelCompanyProfileWorkersPointsConcatJavaLangStringConcatUserPointsAndroidStringPoints = null;
        apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.companyProfile
                    viewModelCompanyProfile = viewModel.getCompanyProfile();
                }


                if (viewModelCompanyProfile != null) {
                    // read viewModel.companyProfile.workers_address
                    viewModelCompanyProfileWorkersAddress = viewModelCompanyProfile.getWorkers_address();
                    // read viewModel.companyProfile.workersImg
                    viewModelCompanyProfileWorkersImg = viewModelCompanyProfile.getWorkersImg();
                    // read viewModel.companyProfile.email
                    viewModelCompanyProfileEmail = viewModelCompanyProfile.getEmail();
                    // read viewModel.companyProfile.workersDesc
                    viewModelCompanyProfileWorkersDesc = viewModelCompanyProfile.getWorkersDesc();
                    // read viewModel.companyProfile.workersUsername
                    viewModelCompanyProfileWorkersUsername = viewModelCompanyProfile.getWorkersUsername();
                    // read viewModel.companyProfile.workersPoints
                    viewModelCompanyProfileWorkersPoints = viewModelCompanyProfile.getWorkersPoints();
                    // read viewModel.companyProfile.workersPhoneNumber
                    viewModelCompanyProfileWorkersPhoneNumber = viewModelCompanyProfile.getWorkersPhoneNumber();
                }


                if (viewModelCompanyProfileWorkersPoints != null) {
                    // read viewModel.companyProfile.workersPoints.concat(" ")
                    viewModelCompanyProfileWorkersPointsConcatJavaLangString = viewModelCompanyProfileWorkersPoints.concat(" ");
                }


                if (viewModelCompanyProfileWorkersPointsConcatJavaLangString != null) {
                    // read viewModel.companyProfile.workersPoints.concat(" ").concat(@android:string/points)
                    viewModelCompanyProfileWorkersPointsConcatJavaLangStringConcatUserPointsAndroidStringPoints = viewModelCompanyProfileWorkersPointsConcatJavaLangString.concat(userPoints.getResources().getString(R.string.points));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView8.setOnClickListener(mCallback30);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCompanyBio, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCompanyBioandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtEmailandroidTextAttrChanged);
            this.txtLocaction.setOnClickListener(mCallback29);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtLocaction, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtLocactionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPhone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPhoneandroidTextAttrChanged);
            this.userImg.setOnClickListener(mCallback27);
            this.userName.setOnClickListener(mCallback28);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCompanyBio, viewModelCompanyProfileWorkersDesc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, viewModelCompanyProfileEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLocaction, viewModelCompanyProfileWorkersAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhone, viewModelCompanyProfileWorkersPhoneNumber);
            apps.app.altcompany.base.ApplicationBinding.loadImage(this.userImg, viewModelCompanyProfileWorkersImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userName, viewModelCompanyProfileWorkersUsername);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userPoints, viewModelCompanyProfileWorkersPointsConcatJavaLangStringConcatUserPointsAndroidStringPoints);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.imageSubmit();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.address();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.updateProfile();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toUpdateCategories();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.companyProfile
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}