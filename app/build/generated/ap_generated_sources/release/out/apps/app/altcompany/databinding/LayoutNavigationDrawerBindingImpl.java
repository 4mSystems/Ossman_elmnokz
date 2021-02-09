package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutNavigationDrawerBindingImpl extends LayoutNavigationDrawerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 5);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 6);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 7);
        sViewsWithIds.put(R.id.fl_home_container, 8);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 9);
        sViewsWithIds.put(R.id.rl_navigation_drawer_logo, 10);
        sViewsWithIds.put(R.id.grand_logo, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[5]
            , (android.widget.FrameLayout) bindings[8]
            , (apps.app.altcompany.customViews.grandDialog.GrandImageDialog) bindings[11]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[3]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvNavigationDrawerList.setTag(null);
        this.tvEmailText.setTag(null);
        this.tvUserLogin.setTag(null);
        this.vvNavigationDrawerImage.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.menuViewModel == variableId) {
            setMenuViewModel((apps.app.altcompany.customViews.menu.MenuViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenuViewModel(@Nullable apps.app.altcompany.customViews.menu.MenuViewModel MenuViewModel) {
        updateRegistration(0, MenuViewModel);
        this.mMenuViewModel = MenuViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.menuViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMenuViewModel((apps.app.altcompany.customViews.menu.MenuViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMenuViewModel(apps.app.altcompany.customViews.menu.MenuViewModel MenuViewModel, int fieldId) {
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
        apps.app.altcompany.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
        java.lang.String menuViewModelUserDataEmail = null;
        java.lang.String menuViewModelUserDataWorkersUsername = null;
        apps.app.altcompany.pages.auth.login.models.UserData menuViewModelUserData = null;
        apps.app.altcompany.customViews.menu.MenuAdapter menuViewModelMenuAdapter = null;
        java.lang.String menuViewModelUserDataWorkersImg = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (menuViewModel != null) {
                    // read menuViewModel.userData
                    menuViewModelUserData = menuViewModel.userData;
                    // read menuViewModel.menuAdapter
                    menuViewModelMenuAdapter = menuViewModel.getMenuAdapter();
                }


                if (menuViewModelUserData != null) {
                    // read menuViewModel.userData.email
                    menuViewModelUserDataEmail = menuViewModelUserData.getEmail();
                    // read menuViewModel.userData.workersUsername
                    menuViewModelUserDataWorkersUsername = menuViewModelUserData.getWorkersUsername();
                    // read menuViewModel.userData.workersImg
                    menuViewModelUserDataWorkersImg = menuViewModelUserData.getWorkersImg();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.getItemsV2Binding(this.rvNavigationDrawerList, menuViewModelMenuAdapter, "1", "1");
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmailText, menuViewModelUserDataEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserLogin, menuViewModelUserDataWorkersUsername);
            apps.app.altcompany.base.ApplicationBinding.loadImage(this.vvNavigationDrawerImage, menuViewModelUserDataWorkersImg);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}