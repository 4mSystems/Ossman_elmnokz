package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNotificationBindingImpl extends ItemNotificationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_item_notification_image, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvItemNotificationDateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of itemNotificationViewModel.notificationsData.created_at
            //         is itemNotificationViewModel.notificationsData.setCreated_at((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvItemNotificationDate);
            // localize variables for thread safety
            // itemNotificationViewModel.notificationsData.created_at
            java.lang.String itemNotificationViewModelNotificationsDataCreatedAt = null;
            // itemNotificationViewModel
            apps.app.altcompany.pages.notifications.itemViewModels.NotificationsItemViewModels itemNotificationViewModel = mItemNotificationViewModel;
            // itemNotificationViewModel.notificationsData != null
            boolean itemNotificationViewModelNotificationsDataJavaLangObjectNull = false;
            // itemNotificationViewModel.notificationsData
            apps.app.altcompany.pages.notifications.models.NotificationsData itemNotificationViewModelNotificationsData = null;
            // itemNotificationViewModel != null
            boolean itemNotificationViewModelJavaLangObjectNull = false;



            itemNotificationViewModelJavaLangObjectNull = (itemNotificationViewModel) != (null);
            if (itemNotificationViewModelJavaLangObjectNull) {


                itemNotificationViewModelNotificationsData = itemNotificationViewModel.getNotificationsData();

                itemNotificationViewModelNotificationsDataJavaLangObjectNull = (itemNotificationViewModelNotificationsData) != (null);
                if (itemNotificationViewModelNotificationsDataJavaLangObjectNull) {




                    itemNotificationViewModelNotificationsData.setCreated_at(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvItemNotificationDescandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of itemNotificationViewModel.notificationsData.title
            //         is itemNotificationViewModel.notificationsData.setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvItemNotificationDesc);
            // localize variables for thread safety
            // itemNotificationViewModel
            apps.app.altcompany.pages.notifications.itemViewModels.NotificationsItemViewModels itemNotificationViewModel = mItemNotificationViewModel;
            // itemNotificationViewModel.notificationsData.title
            java.lang.String itemNotificationViewModelNotificationsDataTitle = null;
            // itemNotificationViewModel.notificationsData != null
            boolean itemNotificationViewModelNotificationsDataJavaLangObjectNull = false;
            // itemNotificationViewModel.notificationsData
            apps.app.altcompany.pages.notifications.models.NotificationsData itemNotificationViewModelNotificationsData = null;
            // itemNotificationViewModel != null
            boolean itemNotificationViewModelJavaLangObjectNull = false;



            itemNotificationViewModelJavaLangObjectNull = (itemNotificationViewModel) != (null);
            if (itemNotificationViewModelJavaLangObjectNull) {


                itemNotificationViewModelNotificationsData = itemNotificationViewModel.getNotificationsData();

                itemNotificationViewModelNotificationsDataJavaLangObjectNull = (itemNotificationViewModelNotificationsData) != (null);
                if (itemNotificationViewModelNotificationsDataJavaLangObjectNull) {




                    itemNotificationViewModelNotificationsData.setTitle(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ItemNotificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemNotificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[4]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.imgItemNotification.setTag(null);
        this.rlItemNotificationContainer.setTag(null);
        this.tvItemNotificationDate.setTag(null);
        this.tvItemNotificationDesc.setTag(null);
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
        if (BR.itemNotificationViewModel == variableId) {
            setItemNotificationViewModel((apps.app.altcompany.pages.notifications.itemViewModels.NotificationsItemViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemNotificationViewModel(@Nullable apps.app.altcompany.pages.notifications.itemViewModels.NotificationsItemViewModels ItemNotificationViewModel) {
        updateRegistration(0, ItemNotificationViewModel);
        this.mItemNotificationViewModel = ItemNotificationViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemNotificationViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemNotificationViewModel((apps.app.altcompany.pages.notifications.itemViewModels.NotificationsItemViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemNotificationViewModel(apps.app.altcompany.pages.notifications.itemViewModels.NotificationsItemViewModels ItemNotificationViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.notificationsData) {
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
        apps.app.altcompany.pages.notifications.itemViewModels.NotificationsItemViewModels itemNotificationViewModel = mItemNotificationViewModel;
        java.lang.String itemNotificationViewModelNotificationsDataTitle = null;
        apps.app.altcompany.pages.notifications.models.NotificationsData itemNotificationViewModelNotificationsData = null;
        java.lang.String itemNotificationViewModelNotificationsDataCreatedAt = null;
        java.lang.String itemNotificationViewModelNotificationsDataImage = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemNotificationViewModel != null) {
                    // read itemNotificationViewModel.notificationsData
                    itemNotificationViewModelNotificationsData = itemNotificationViewModel.getNotificationsData();
                }


                if (itemNotificationViewModelNotificationsData != null) {
                    // read itemNotificationViewModel.notificationsData.title
                    itemNotificationViewModelNotificationsDataTitle = itemNotificationViewModelNotificationsData.getTitle();
                    // read itemNotificationViewModel.notificationsData.created_at
                    itemNotificationViewModelNotificationsDataCreatedAt = itemNotificationViewModelNotificationsData.getCreated_at();
                    // read itemNotificationViewModel.notificationsData.image
                    itemNotificationViewModelNotificationsDataImage = itemNotificationViewModelNotificationsData.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.loadImage(this.imgItemNotification, itemNotificationViewModelNotificationsDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemNotificationDate, itemNotificationViewModelNotificationsDataCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemNotificationDesc, itemNotificationViewModelNotificationsDataTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvItemNotificationDate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvItemNotificationDateandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvItemNotificationDesc, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvItemNotificationDescandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemNotificationViewModel
        flag 1 (0x2L): itemNotificationViewModel.notificationsData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}