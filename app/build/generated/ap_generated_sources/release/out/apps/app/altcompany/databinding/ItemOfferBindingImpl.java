package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOfferBindingImpl extends ItemOfferBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

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
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOfferBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemOfferBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.cardImg.setTag(null);
        this.imgOffer.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
        mCallback4 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
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
        if (BR.itemHomeViewModel == variableId) {
            setItemHomeViewModel((apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemHomeViewModel(@Nullable apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel ItemHomeViewModel) {
        updateRegistration(0, ItemHomeViewModel);
        this.mItemHomeViewModel = ItemHomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemHomeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemHomeViewModel((apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemHomeViewModel(apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel ItemHomeViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.offersData) {
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
        apps.app.altcompany.pages.offers.models.OffersData itemHomeViewModelOffersData = null;
        apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel itemHomeViewModel = mItemHomeViewModel;
        java.lang.String itemHomeViewModelOffersDataOffersImg = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemHomeViewModel != null) {
                    // read itemHomeViewModel.offersData
                    itemHomeViewModelOffersData = itemHomeViewModel.getOffersData();
                }


                if (itemHomeViewModelOffersData != null) {
                    // read itemHomeViewModel.offersData.offersImg
                    itemHomeViewModelOffersDataOffersImg = itemHomeViewModelOffersData.getOffersImg();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.imgOffer.setOnClickListener(mCallback3);
            this.mboundView2.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            apps.app.altcompany.base.ApplicationBinding.loadImage(this.imgOffer, itemHomeViewModelOffersDataOffersImg);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemHomeViewModel.offersData
                apps.app.altcompany.pages.offers.models.OffersData itemHomeViewModelOffersData = null;
                // itemHomeViewModel.offersData != null
                boolean itemHomeViewModelOffersDataJavaLangObjectNull = false;
                // itemHomeViewModel
                apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel itemHomeViewModel = mItemHomeViewModel;
                // itemHomeViewModel != null
                boolean itemHomeViewModelJavaLangObjectNull = false;
                // itemHomeViewModel.offersData.offersImg
                java.lang.String itemHomeViewModelOffersDataOffersImg = null;



                itemHomeViewModelJavaLangObjectNull = (itemHomeViewModel) != (null);
                if (itemHomeViewModelJavaLangObjectNull) {




                    itemHomeViewModelOffersData = itemHomeViewModel.getOffersData();

                    itemHomeViewModelOffersDataJavaLangObjectNull = (itemHomeViewModelOffersData) != (null);
                    if (itemHomeViewModelOffersDataJavaLangObjectNull) {


                        itemHomeViewModelOffersDataOffersImg = itemHomeViewModelOffersData.getOffersImg();


                        itemHomeViewModel.showImage(itemHomeViewModelOffersDataOffersImg, callbackArg_0);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemHomeViewModel
                apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel itemHomeViewModel = mItemHomeViewModel;
                // itemHomeViewModel != null
                boolean itemHomeViewModelJavaLangObjectNull = false;



                itemHomeViewModelJavaLangObjectNull = (itemHomeViewModel) != (null);
                if (itemHomeViewModelJavaLangObjectNull) {


                    itemHomeViewModel.removeOffer();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemHomeViewModel
        flag 1 (0x2L): itemHomeViewModel.offersData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}