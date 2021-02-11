package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyWorksBindingImpl extends FragmentMyWorksBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyWorksBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentMyWorksBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.airbnb.lottie.LottieAnimationView) bindings[1]
            );
        this.animationView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.recyclerview.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback24 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
            setViewModel((apps.app.altcompany.pages.myWorks.viewModels.MyWorksViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable apps.app.altcompany.pages.myWorks.viewModels.MyWorksViewModel ViewModel) {
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
                return onChangeViewModel((apps.app.altcompany.pages.myWorks.viewModels.MyWorksViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(apps.app.altcompany.pages.myWorks.viewModels.MyWorksViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.worksAdapter) {
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
        int viewModelWorksAdapterItemCountInt0ViewGONEViewVISIBLE = 0;
        int viewModelWorksAdapterItemCount = 0;
        apps.app.altcompany.pages.myWorks.adapters.MyWorksAdapter viewModelWorksAdapter = null;
        boolean viewModelWorksAdapterItemCountInt0 = false;
        apps.app.altcompany.pages.myWorks.viewModels.MyWorksViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.worksAdapter
                    viewModelWorksAdapter = viewModel.getWorksAdapter();
                }


                if (viewModelWorksAdapter != null) {
                    // read viewModel.worksAdapter.itemCount
                    viewModelWorksAdapterItemCount = viewModelWorksAdapter.getItemCount();
                }


                // read viewModel.worksAdapter.itemCount > 0
                viewModelWorksAdapterItemCountInt0 = (viewModelWorksAdapterItemCount) > (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelWorksAdapterItemCountInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.worksAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
                viewModelWorksAdapterItemCountInt0ViewGONEViewVISIBLE = ((viewModelWorksAdapterItemCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.animationView.setVisibility(viewModelWorksAdapterItemCountInt0ViewGONEViewVISIBLE);
            apps.app.altcompany.base.ApplicationBinding.getItemsV2Binding(this.mboundView2, viewModelWorksAdapter, "2", "1");
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback24);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        apps.app.altcompany.pages.myWorks.viewModels.MyWorksViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.works();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.worksAdapter
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.worksAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewModel.worksAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}