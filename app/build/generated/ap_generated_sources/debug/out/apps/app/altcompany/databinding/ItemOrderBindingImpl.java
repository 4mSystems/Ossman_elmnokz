package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOrderBindingImpl extends ItemOrderBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[4]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.imgItemOrder.setTag(null);
        this.rlItemOrderContainer.setTag(null);
        this.tvItemOrderCompany.setTag(null);
        this.tvItemOrderDesc.setTag(null);
        this.tvItemOrderStatus.setTag(null);
        setRootTag(root);
        // listeners
        mCallback46 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemHomeViewModel == variableId) {
            setItemHomeViewModel((apps.app.altcompany.pages.home.viewModels.ItemHomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemHomeViewModel(@Nullable apps.app.altcompany.pages.home.viewModels.ItemHomeViewModel ItemHomeViewModel) {
        updateRegistration(0, ItemHomeViewModel);
        this.mItemHomeViewModel = ItemHomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemHomeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemHomeViewModel((apps.app.altcompany.pages.home.viewModels.ItemHomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemHomeViewModel(apps.app.altcompany.pages.home.viewModels.ItemHomeViewModel ItemHomeViewModel, int fieldId) {
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
        java.lang.String itemHomeViewModelOrdersDataOrdersStatusInt0TvItemOrderStatusAndroidStringWaitingTvItemOrderStatusAndroidStringFinished = null;
        java.lang.String itemHomeViewModelOrdersDataUserUsersImg = null;
        apps.app.altcompany.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
        apps.app.altcompany.pages.home.models.UserDetails itemHomeViewModelOrdersDataUser = null;
        boolean itemHomeViewModelOrdersDataOrdersStatusInt0 = false;
        int itemHomeViewModelOrdersDataOrdersStatus = 0;
        apps.app.altcompany.pages.home.models.OrdersData itemHomeViewModelOrdersData = null;
        java.lang.String itemHomeViewModelOrdersDataUserUsersUsername = null;
        java.lang.String itemHomeViewModelOrdersDataOrdersDesc = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemHomeViewModel != null) {
                    // read itemHomeViewModel.ordersData
                    itemHomeViewModelOrdersData = itemHomeViewModel.getOrdersData();
                }


                if (itemHomeViewModelOrdersData != null) {
                    // read itemHomeViewModel.ordersData.user
                    itemHomeViewModelOrdersDataUser = itemHomeViewModelOrdersData.getUser();
                    // read itemHomeViewModel.ordersData.ordersStatus
                    itemHomeViewModelOrdersDataOrdersStatus = itemHomeViewModelOrdersData.getOrdersStatus();
                    // read itemHomeViewModel.ordersData.ordersDesc
                    itemHomeViewModelOrdersDataOrdersDesc = itemHomeViewModelOrdersData.getOrdersDesc();
                }


                if (itemHomeViewModelOrdersDataUser != null) {
                    // read itemHomeViewModel.ordersData.user.users_img
                    itemHomeViewModelOrdersDataUserUsersImg = itemHomeViewModelOrdersDataUser.getUsers_img();
                    // read itemHomeViewModel.ordersData.user.users_username
                    itemHomeViewModelOrdersDataUserUsersUsername = itemHomeViewModelOrdersDataUser.getUsers_username();
                }
                // read itemHomeViewModel.ordersData.ordersStatus == 0
                itemHomeViewModelOrdersDataOrdersStatusInt0 = (itemHomeViewModelOrdersDataOrdersStatus) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemHomeViewModelOrdersDataOrdersStatusInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read itemHomeViewModel.ordersData.ordersStatus == 0 ? @android:string/waiting : @android:string/finished
                itemHomeViewModelOrdersDataOrdersStatusInt0TvItemOrderStatusAndroidStringWaitingTvItemOrderStatusAndroidStringFinished = ((itemHomeViewModelOrdersDataOrdersStatusInt0) ? (tvItemOrderStatus.getResources().getString(R.string.waiting)) : (tvItemOrderStatus.getResources().getString(R.string.finished)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.loadImage(this.imgItemOrder, itemHomeViewModelOrdersDataUserUsersImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemOrderCompany, itemHomeViewModelOrdersDataUserUsersUsername);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemOrderDesc, itemHomeViewModelOrdersDataOrdersDesc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemOrderStatus, itemHomeViewModelOrdersDataOrdersStatusInt0TvItemOrderStatusAndroidStringWaitingTvItemOrderStatusAndroidStringFinished);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.rlItemOrderContainer.setOnClickListener(mCallback46);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemHomeViewModel
        apps.app.altcompany.pages.home.viewModels.ItemHomeViewModel itemHomeViewModel = mItemHomeViewModel;
        // itemHomeViewModel != null
        boolean itemHomeViewModelJavaLangObjectNull = false;



        itemHomeViewModelJavaLangObjectNull = (itemHomeViewModel) != (null);
        if (itemHomeViewModelJavaLangObjectNull) {


            itemHomeViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemHomeViewModel
        flag 1 (0x2L): itemHomeViewModel.ordersData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemHomeViewModel.ordersData.ordersStatus == 0 ? @android:string/waiting : @android:string/finished
        flag 4 (0x5L): itemHomeViewModel.ordersData.ordersStatus == 0 ? @android:string/waiting : @android:string/finished
    flag mapping end*/
    //end
}