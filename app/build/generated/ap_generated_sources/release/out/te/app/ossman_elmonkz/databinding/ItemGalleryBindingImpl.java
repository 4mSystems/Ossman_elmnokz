package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGalleryBindingImpl extends ItemGalleryBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

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
    private final te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemGalleryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemGalleryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[2];
        this.mboundView2.setTag(null);
        this.productImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.ossman_elmonkz.pages.gallery.viewModels.ItemGalleryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.ossman_elmonkz.pages.gallery.viewModels.ItemGalleryViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.ossman_elmonkz.pages.gallery.viewModels.ItemGalleryViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.ossman_elmonkz.pages.gallery.viewModels.ItemGalleryViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.galleryData) {
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
        te.app.ossman_elmonkz.pages.gallery.viewModels.ItemGalleryViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelGalleryDataName = null;
        te.app.ossman_elmonkz.pages.gallery.models.GalleryData itemViewModelGalleryData = null;
        java.lang.String itemViewModelGalleryDataImage = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.galleryData
                    itemViewModelGalleryData = itemViewModel.getGalleryData();
                }


                if (itemViewModelGalleryData != null) {
                    // read itemViewModel.galleryData.name
                    itemViewModelGalleryDataName = itemViewModelGalleryData.getName();
                    // read itemViewModel.galleryData.image
                    itemViewModelGalleryDataImage = itemViewModelGalleryData.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelGalleryDataName);
            te.app.ossman_elmonkz.base.ApplicationBinding.loadImage(this.productImage, itemViewModelGalleryDataImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.ossman_elmonkz.pages.gallery.viewModels.ItemGalleryViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;
        // itemViewModel.galleryData != null
        boolean itemViewModelGalleryDataJavaLangObjectNull = false;
        // itemViewModel.galleryData
        te.app.ossman_elmonkz.pages.gallery.models.GalleryData itemViewModelGalleryData = null;
        // itemViewModel.galleryData.image
        java.lang.String itemViewModelGalleryDataImage = null;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {




            itemViewModelGalleryData = itemViewModel.getGalleryData();

            itemViewModelGalleryDataJavaLangObjectNull = (itemViewModelGalleryData) != (null);
            if (itemViewModelGalleryDataJavaLangObjectNull) {


                itemViewModelGalleryDataImage = itemViewModelGalleryData.getImage();


                itemViewModel.showImage(itemViewModelGalleryDataImage, callbackArg_0);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.galleryData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}