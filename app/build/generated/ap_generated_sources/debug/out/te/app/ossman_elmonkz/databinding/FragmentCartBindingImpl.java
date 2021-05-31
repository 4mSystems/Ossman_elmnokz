package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCartBindingImpl extends FragmentCartBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.total, 4);
        sViewsWithIds.put(R.id.tv_total, 5);
        sViewsWithIds.put(R.id.tv_total_value, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (com.airbnb.lottie.LottieAnimationView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[6]
            );
        this.addCart.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.recyclerview.widget.RecyclerView) bindings[1];
        this.mboundView1.setTag(null);
        this.pbBaseLoadingBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.ossman_elmonkz.pages.cart.viewModels.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.cart.viewModels.CartViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.cart.viewModels.CartViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.cart.viewModels.CartViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.cartAdapter) {
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
        boolean viewmodelCartAdapterItemCountInt0 = false;
        int viewmodelCartAdapterItemCountInt0ViewVISIBLEViewGONE = 0;
        te.app.ossman_elmonkz.pages.cart.adapters.CartAdapter viewmodelCartAdapter = null;
        int viewmodelCartAdapterItemCount = 0;
        te.app.ossman_elmonkz.pages.cart.viewModels.CartViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.cartAdapter
                    viewmodelCartAdapter = viewmodel.getCartAdapter();
                }


                if (viewmodelCartAdapter != null) {
                    // read viewmodel.cartAdapter.itemCount
                    viewmodelCartAdapterItemCount = viewmodelCartAdapter.getItemCount();
                }


                // read viewmodel.cartAdapter.itemCount == 0
                viewmodelCartAdapterItemCountInt0 = (viewmodelCartAdapterItemCount) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelCartAdapterItemCountInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.cartAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
                viewmodelCartAdapterItemCountInt0ViewVISIBLEViewGONE = ((viewmodelCartAdapterItemCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addCart.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.ossman_elmonkz.base.ApplicationBinding.getItemsV2Binding(this.mboundView1, viewmodelCartAdapter, "1", "1");
            this.pbBaseLoadingBar.setVisibility(viewmodelCartAdapterItemCountInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.ossman_elmonkz.pages.cart.viewModels.CartViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.toFinishOrder();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.cartAdapter
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.cartAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.cartAdapter.itemCount == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}