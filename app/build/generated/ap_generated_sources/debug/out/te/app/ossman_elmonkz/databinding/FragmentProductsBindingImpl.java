package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductsBindingImpl extends FragmentProductsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.elmonkz_systems_text, 2);
        sViewsWithIds.put(R.id.elmonkz_systems_val, 3);
        sViewsWithIds.put(R.id.br1, 4);
        sViewsWithIds.put(R.id.v1, 5);
        sViewsWithIds.put(R.id.prePayment_text, 6);
        sViewsWithIds.put(R.id.prePayment_text_val, 7);
        sViewsWithIds.put(R.id.br2, 8);
        sViewsWithIds.put(R.id.v2, 9);
        sViewsWithIds.put(R.id.on_hand_text, 10);
        sViewsWithIds.put(R.id.on_hand_val, 11);
        sViewsWithIds.put(R.id.br3, 12);
        sViewsWithIds.put(R.id.v3, 13);
        sViewsWithIds.put(R.id.warning1, 14);
        sViewsWithIds.put(R.id.product_warning2, 15);
        sViewsWithIds.put(R.id.product_warning3, 16);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentProductsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[4]
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[12]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[11]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[15]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[13]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[14]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewmodel((te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.productsAdapter) {
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
        te.app.ossman_elmonkz.pages.products.adapters.ProductsAdapter viewmodelProductsAdapter = null;
        te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.productsAdapter
                    viewmodelProductsAdapter = viewmodel.getProductsAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.ossman_elmonkz.base.ApplicationBinding.getItemsV2Binding(this.rcProducts, viewmodelProductsAdapter, "2", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.productsAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}