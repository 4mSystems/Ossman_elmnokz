package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserDetailsBindingImpl extends FragmentUserDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_name, 6);
        sViewsWithIds.put(R.id.card_email, 7);
        sViewsWithIds.put(R.id.card_phone, 8);
        sViewsWithIds.put(R.id.card_location, 9);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentUserDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[3]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[5]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.txtDetails.setTag(null);
        this.txtEmail.setTag(null);
        this.txtLocaction.setTag(null);
        this.txtPhone.setTag(null);
        this.userImg.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel ViewModel) {
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
                return onChangeViewModel((apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.ordersData) {
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
        java.lang.String viewModelOrdersDataUserUsersImg = null;
        apps.app.altcompany.pages.home.models.UserDetails viewModelOrdersDataUser = null;
        java.lang.String viewModelOrdersDataUserUsersAddress = null;
        apps.app.altcompany.pages.home.models.OrdersData viewModelOrdersData = null;
        java.lang.String viewModelOrdersDataUserUsersPhoneNumber = null;
        java.lang.String viewModelOrdersDataUserUsersUsername = null;
        apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;
        java.lang.String viewModelOrdersDataUserEmail = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.ordersData
                    viewModelOrdersData = viewModel.getOrdersData();
                }


                if (viewModelOrdersData != null) {
                    // read viewModel.ordersData.user
                    viewModelOrdersDataUser = viewModelOrdersData.getUser();
                }


                if (viewModelOrdersDataUser != null) {
                    // read viewModel.ordersData.user.users_img
                    viewModelOrdersDataUserUsersImg = viewModelOrdersDataUser.getUsers_img();
                    // read viewModel.ordersData.user.users_address
                    viewModelOrdersDataUserUsersAddress = viewModelOrdersDataUser.getUsers_address();
                    // read viewModel.ordersData.user.users_phone_number
                    viewModelOrdersDataUserUsersPhoneNumber = viewModelOrdersDataUser.getUsers_phone_number();
                    // read viewModel.ordersData.user.users_username
                    viewModelOrdersDataUserUsersUsername = viewModelOrdersDataUser.getUsers_username();
                    // read viewModel.ordersData.user.email
                    viewModelOrdersDataUserEmail = viewModelOrdersDataUser.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDetails, viewModelOrdersDataUserUsersUsername);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, viewModelOrdersDataUserEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLocaction, viewModelOrdersDataUserUsersAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhone, viewModelOrdersDataUserUsersPhoneNumber);
            apps.app.altcompany.base.ApplicationBinding.loadImage(this.userImg, viewModelOrdersDataUserUsersImg);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.ordersData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}