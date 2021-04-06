package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemBrandBindingImpl extends ItemBrandBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

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
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemBrandBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemBrandBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[3]
            );
        this.brandImage.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.productDetails.setTag(null);
        this.productName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
        mCallback18 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 2);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.ossman_elmonkz.pages.buying.viewModels.ItemBrandModelViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.ossman_elmonkz.pages.buying.viewModels.ItemBrandModelViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((te.app.ossman_elmonkz.pages.buying.viewModels.ItemBrandModelViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.ossman_elmonkz.pages.buying.viewModels.ItemBrandModelViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.brandsModellsItem) {
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
        int itemViewModelBrandsModellsItemDescriptionJavaLangObjectNullViewVISIBLEViewGONE = 0;
        te.app.ossman_elmonkz.pages.buying.viewModels.ItemBrandModelViewModel itemViewModel = mItemViewModel;
        boolean itemViewModelBrandsModellsItemDescriptionJavaLangObjectNull = false;
        java.lang.String itemViewModelBrandsModellsItemDescription = null;
        java.lang.String itemViewModelBrandsModellsItemName = null;
        java.lang.String itemViewModelBrandsModellsItemImage = null;
        te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem itemViewModelBrandsModellsItem = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.brandsModellsItem
                    itemViewModelBrandsModellsItem = itemViewModel.getBrandsModellsItem();
                }


                if (itemViewModelBrandsModellsItem != null) {
                    // read itemViewModel.brandsModellsItem.description
                    itemViewModelBrandsModellsItemDescription = itemViewModelBrandsModellsItem.getDescription();
                    // read itemViewModel.brandsModellsItem.name
                    itemViewModelBrandsModellsItemName = itemViewModelBrandsModellsItem.getName();
                    // read itemViewModel.brandsModellsItem.image
                    itemViewModelBrandsModellsItemImage = itemViewModelBrandsModellsItem.getImage();
                }


                // read itemViewModel.brandsModellsItem.description != null
                itemViewModelBrandsModellsItemDescriptionJavaLangObjectNull = (itemViewModelBrandsModellsItemDescription) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelBrandsModellsItemDescriptionJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read itemViewModel.brandsModellsItem.description != null ? View.VISIBLE : View.GONE
                itemViewModelBrandsModellsItemDescriptionJavaLangObjectNullViewVISIBLEViewGONE = ((itemViewModelBrandsModellsItemDescriptionJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.ossman_elmonkz.base.ApplicationBinding.loadImage(this.brandImage, itemViewModelBrandsModellsItemImage);
            this.productDetails.setVisibility(itemViewModelBrandsModellsItemDescriptionJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, itemViewModelBrandsModellsItemName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback17);
            this.productDetails.setOnClickListener(mCallback18);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.ossman_elmonkz.pages.buying.viewModels.ItemBrandModelViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.itemAction();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.ossman_elmonkz.pages.buying.viewModels.ItemBrandModelViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.toProductDetails();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.brandsModellsItem
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.brandsModellsItem.description != null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.brandsModellsItem.description != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}