package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNotificationsBindingImpl extends FragmentNotificationsBinding  {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNotificationsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentNotificationsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.airbnb.lottie.LottieAnimationView) bindings[1]
            );
        this.animationView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.recyclerview.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
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
            setViewModel((apps.app.altcompany.pages.notifications.viewModels.NotificationsViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable apps.app.altcompany.pages.notifications.viewModels.NotificationsViewModels ViewModel) {
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
                return onChangeViewModel((apps.app.altcompany.pages.notifications.viewModels.NotificationsViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(apps.app.altcompany.pages.notifications.viewModels.NotificationsViewModels ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.notificationsAdapter) {
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
        apps.app.altcompany.pages.notifications.NotificationsAdapter viewModelNotificationsAdapter = null;
        int viewModelNotificationsAdapterItemCountInt0ViewGONEViewVISIBLE = 0;
        int viewModelNotificationsAdapterItemCount = 0;
        boolean viewModelNotificationsAdapterItemCountInt0 = false;
        apps.app.altcompany.pages.notifications.viewModels.NotificationsViewModels viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.notificationsAdapter
                    viewModelNotificationsAdapter = viewModel.getNotificationsAdapter();
                }


                if (viewModelNotificationsAdapter != null) {
                    // read viewModel.notificationsAdapter.itemCount
                    viewModelNotificationsAdapterItemCount = viewModelNotificationsAdapter.getItemCount();
                }


                // read viewModel.notificationsAdapter.itemCount > 0
                viewModelNotificationsAdapterItemCountInt0 = (viewModelNotificationsAdapterItemCount) > (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelNotificationsAdapterItemCountInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.notificationsAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
                viewModelNotificationsAdapterItemCountInt0ViewGONEViewVISIBLE = ((viewModelNotificationsAdapterItemCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.animationView.setVisibility(viewModelNotificationsAdapterItemCountInt0ViewGONEViewVISIBLE);
            apps.app.altcompany.base.ApplicationBinding.getItemsV2Binding(this.mboundView2, viewModelNotificationsAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.notificationsAdapter
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.notificationsAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewModel.notificationsAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}