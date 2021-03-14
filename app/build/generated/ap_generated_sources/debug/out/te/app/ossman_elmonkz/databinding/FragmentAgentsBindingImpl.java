package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAgentsBindingImpl extends FragmentAgentsBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAgentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentAgentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.airbnb.lottie.LottieAnimationView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbBaseLoadingBar.setTag(null);
        this.rcProducts.setTag(null);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.AgentsClientsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.AgentsClientsViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.AgentsClientsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.AgentsClientsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.agentsAdapter) {
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
        int viewmodelAgentsAdapterItemCount = 0;
        te.app.ossman_elmonkz.pages.agentsAndClients.adapters.AgentsAdapter viewmodelAgentsAdapter = null;
        boolean viewmodelAgentsAdapterItemCountInt0 = false;
        int viewmodelAgentsAdapterItemCountInt0ViewVISIBLEViewGONE = 0;
        te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.AgentsClientsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.agentsAdapter
                    viewmodelAgentsAdapter = viewmodel.getAgentsAdapter();
                }


                if (viewmodelAgentsAdapter != null) {
                    // read viewmodel.agentsAdapter.itemCount
                    viewmodelAgentsAdapterItemCount = viewmodelAgentsAdapter.getItemCount();
                }


                // read viewmodel.agentsAdapter.itemCount == 0
                viewmodelAgentsAdapterItemCountInt0 = (viewmodelAgentsAdapterItemCount) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelAgentsAdapterItemCountInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.agentsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
                viewmodelAgentsAdapterItemCountInt0ViewVISIBLEViewGONE = ((viewmodelAgentsAdapterItemCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.pbBaseLoadingBar.setVisibility(viewmodelAgentsAdapterItemCountInt0ViewVISIBLEViewGONE);
            te.app.ossman_elmonkz.base.ApplicationBinding.getItemsV2Binding(this.rcProducts, viewmodelAgentsAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.agentsAdapter
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.agentsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.agentsAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}