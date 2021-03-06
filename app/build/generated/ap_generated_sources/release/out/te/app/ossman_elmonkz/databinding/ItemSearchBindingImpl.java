package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSearchBindingImpl extends ItemSearchBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.productName.setTag(null);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.ossman_elmonkz.pages.subCategories.viewModels.ItemSearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.ossman_elmonkz.pages.subCategories.viewModels.ItemSearchViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.ossman_elmonkz.pages.subCategories.viewModels.ItemSearchViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.ossman_elmonkz.pages.subCategories.viewModels.ItemSearchViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.searchItem) {
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
        te.app.ossman_elmonkz.pages.subCategories.viewModels.ItemSearchViewModel itemViewModel = mItemViewModel;
        boolean itemViewModelSearchItemBrandNameJavaLangObjectNull = false;
        java.lang.String itemViewModelSearchItemBrandNameJavaLangObjectNullItemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandNameConcatJavaLangStringItemViewModelSearchItemName = null;
        java.lang.String itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangString = null;
        java.lang.String itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandNameConcatJavaLangString = null;
        java.lang.String itemViewModelSearchItemName = null;
        java.lang.String itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandName = null;
        java.lang.String itemViewModelSearchItemNameConcatJavaLangString = null;
        te.app.ossman_elmonkz.pages.subCategories.models.search.EqualItemsItem itemViewModelSearchItem = null;
        java.lang.String itemViewModelSearchItemBrandName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.searchItem
                    itemViewModelSearchItem = itemViewModel.getSearchItem();
                }


                if (itemViewModelSearchItem != null) {
                    // read itemViewModel.searchItem.brandName
                    itemViewModelSearchItemBrandName = itemViewModelSearchItem.getBrandName();
                }


                // read itemViewModel.searchItem.brandName != null
                itemViewModelSearchItemBrandNameJavaLangObjectNull = (itemViewModelSearchItemBrandName) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelSearchItemBrandNameJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x18L) != 0) {

                if (itemViewModelSearchItem != null) {
                    // read itemViewModel.searchItem.name
                    itemViewModelSearchItemName = itemViewModelSearchItem.getName();
                }

            if ((dirtyFlags & 0x10L) != 0) {

                    if (itemViewModelSearchItemName != null) {
                        // read itemViewModel.searchItem.name.concat(" ")
                        itemViewModelSearchItemNameConcatJavaLangString = itemViewModelSearchItemName.concat(" ");
                    }


                    if (itemViewModelSearchItemNameConcatJavaLangString != null) {
                        // read itemViewModel.searchItem.name.concat(" ").concat("(")
                        itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangString = itemViewModelSearchItemNameConcatJavaLangString.concat("(");
                    }


                    if (itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangString != null) {
                        // read itemViewModel.searchItem.name.concat(" ").concat("(").concat(itemViewModel.searchItem.brandName)
                        itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandName = itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangString.concat(itemViewModelSearchItemBrandName);
                    }


                    if (itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandName != null) {
                        // read itemViewModel.searchItem.name.concat(" ").concat("(").concat(itemViewModel.searchItem.brandName).concat(")")
                        itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandNameConcatJavaLangString = itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandName.concat(")");
                    }
            }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemViewModel.searchItem.brandName != null ? itemViewModel.searchItem.name.concat(" ").concat("(").concat(itemViewModel.searchItem.brandName).concat(")") : itemViewModel.searchItem.name
                itemViewModelSearchItemBrandNameJavaLangObjectNullItemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandNameConcatJavaLangStringItemViewModelSearchItemName = ((itemViewModelSearchItemBrandNameJavaLangObjectNull) ? (itemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandNameConcatJavaLangString) : (itemViewModelSearchItemName));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, itemViewModelSearchItemBrandNameJavaLangObjectNullItemViewModelSearchItemNameConcatJavaLangStringConcatJavaLangStringConcatItemViewModelSearchItemBrandNameConcatJavaLangStringItemViewModelSearchItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.searchItem
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.searchItem.brandName != null ? itemViewModel.searchItem.name.concat(" ").concat("(").concat(itemViewModel.searchItem.brandName).concat(")") : itemViewModel.searchItem.name
        flag 4 (0x5L): itemViewModel.searchItem.brandName != null ? itemViewModel.searchItem.name.concat(" ").concat("(").concat(itemViewModel.searchItem.brandName).concat(")") : itemViewModel.searchItem.name
    flag mapping end*/
    //end
}