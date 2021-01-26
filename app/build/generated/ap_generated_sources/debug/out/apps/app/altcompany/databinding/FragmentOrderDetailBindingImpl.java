package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderDetailBindingImpl extends FragmentOrderDetailBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_img, 6);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrderDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentOrderDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[6]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatButton) bindings[5];
        this.mboundView5.setTag(null);
        this.txtDetails.setTag(null);
        this.userImg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
        mCallback11 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
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
        java.lang.String viewModelOrdersDataOrdersImgorVideo = null;
        apps.app.altcompany.pages.home.models.UserDetails viewModelOrdersDataUser = null;
        java.lang.String viewModelOrdersDataOrdersDesc = null;
        apps.app.altcompany.pages.home.models.OrdersData viewModelOrdersData = null;
        java.lang.String viewModelOrdersDataUserUsersUsername = null;
        apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.ordersData
                    viewModelOrdersData = viewModel.getOrdersData();
                }


                if (viewModelOrdersData != null) {
                    // read viewModel.ordersData.ordersImgorVideo
                    viewModelOrdersDataOrdersImgorVideo = viewModelOrdersData.getOrdersImgorVideo();
                    // read viewModel.ordersData.user
                    viewModelOrdersDataUser = viewModelOrdersData.getUser();
                    // read viewModel.ordersData.ordersDesc
                    viewModelOrdersDataOrdersDesc = viewModelOrdersData.getOrdersDesc();
                }


                if (viewModelOrdersDataUser != null) {
                    // read viewModel.ordersData.user.users_img
                    viewModelOrdersDataUserUsersImg = viewModelOrdersDataUser.getUsers_img();
                    // read viewModel.ordersData.user.users_username
                    viewModelOrdersDataUserUsersUsername = viewModelOrdersDataUser.getUsers_username();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelOrdersDataUserUsersUsername);
            apps.app.altcompany.base.ApplicationBinding.loadImage(this.mboundView3, viewModelOrdersDataOrdersImgorVideo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDetails, viewModelOrdersDataOrdersDesc);
            apps.app.altcompany.base.ApplicationBinding.loadImage(this.userImg, viewModelOrdersDataUserUsersImg);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(mCallback11);
            this.userImg.setOnClickListener(mCallback10);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toUserDetails();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.sendOffer();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.ordersData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}