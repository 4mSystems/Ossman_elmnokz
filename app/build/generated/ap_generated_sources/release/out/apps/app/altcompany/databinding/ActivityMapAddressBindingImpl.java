package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMapAddressBindingImpl extends ActivityMapAddressBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_header, 4);
        sViewsWithIds.put(R.id.tv_home_header, 5);
        sViewsWithIds.put(R.id.img_marker_center, 6);
        sViewsWithIds.put(R.id.map_progress, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMapAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityMapAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (android.widget.ProgressBar) bindings[7]
            , (com.google.android.gms.maps.MapView) bindings[2]
            , (android.widget.RelativeLayout) bindings[4]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[5]
            );
        this.imgMapSubmit.setTag(null);
        this.mapView.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatButton) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
        mCallback13 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.mapAddressViewModel == variableId) {
            setMapAddressViewModel((apps.app.altcompany.utils.locations.MapAddressViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMapAddressViewModel(@Nullable apps.app.altcompany.utils.locations.MapAddressViewModel MapAddressViewModel) {
        updateRegistration(1, MapAddressViewModel);
        this.mMapAddressViewModel = MapAddressViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mapAddressViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMapAddressViewModelMMapLatLng((androidx.databinding.ObservableField<com.google.android.gms.maps.model.LatLng>) object, fieldId);
            case 1 :
                return onChangeMapAddressViewModel((apps.app.altcompany.utils.locations.MapAddressViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMapAddressViewModelMMapLatLng(androidx.databinding.ObservableField<com.google.android.gms.maps.model.LatLng> MapAddressViewModelMMapLatLng, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMapAddressViewModel(apps.app.altcompany.utils.locations.MapAddressViewModel MapAddressViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.databinding.ObservableField<com.google.android.gms.maps.model.LatLng> mapAddressViewModelMMapLatLng = null;
        com.google.android.gms.maps.model.LatLng mapAddressViewModelMMapLatLngGet = null;
        boolean mapAddressViewModelPassingObjectIdInt0 = false;
        int mapAddressViewModelPassingObjectIdInt0ViewGONEViewVISIBLE = 0;
        apps.app.altcompany.PassingObject mapAddressViewModelPassingObject = null;
        apps.app.altcompany.utils.locations.MapAddressViewModel mapAddressViewModel = mMapAddressViewModel;
        int mapAddressViewModelPassingObjectId = 0;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (mapAddressViewModel != null) {
                        // read mapAddressViewModel.mMapLatLng
                        mapAddressViewModelMMapLatLng = mapAddressViewModel.mMapLatLng;
                    }
                    updateRegistration(0, mapAddressViewModelMMapLatLng);


                    if (mapAddressViewModelMMapLatLng != null) {
                        // read mapAddressViewModel.mMapLatLng.get()
                        mapAddressViewModelMMapLatLngGet = mapAddressViewModelMMapLatLng.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (mapAddressViewModel != null) {
                        // read mapAddressViewModel.passingObject
                        mapAddressViewModelPassingObject = mapAddressViewModel.getPassingObject();
                    }


                    if (mapAddressViewModelPassingObject != null) {
                        // read mapAddressViewModel.passingObject.id
                        mapAddressViewModelPassingObjectId = mapAddressViewModelPassingObject.getId();
                    }


                    // read mapAddressViewModel.passingObject.id != 0
                    mapAddressViewModelPassingObjectIdInt0 = (mapAddressViewModelPassingObjectId) != (0);
                if((dirtyFlags & 0xeL) != 0) {
                    if(mapAddressViewModelPassingObjectIdInt0) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read mapAddressViewModel.passingObject.id != 0 ? View.GONE : View.VISIBLE
                    mapAddressViewModelPassingObjectIdInt0ViewGONEViewVISIBLE = ((mapAddressViewModelPassingObjectIdInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.imgMapSubmit.setOnClickListener(mCallback13);
            this.mboundView3.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            apps.app.altcompany.utils.locations.MapAddressViewModel.initMap(this.mapView, mapAddressViewModelMMapLatLngGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(mapAddressViewModelPassingObjectIdInt0ViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // mapAddressViewModel
                apps.app.altcompany.utils.locations.MapAddressViewModel mapAddressViewModel = mMapAddressViewModel;
                // mapAddressViewModel != null
                boolean mapAddressViewModelJavaLangObjectNull = false;



                mapAddressViewModelJavaLangObjectNull = (mapAddressViewModel) != (null);
                if (mapAddressViewModelJavaLangObjectNull) {


                    mapAddressViewModel.submit();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // mapAddressViewModel
                apps.app.altcompany.utils.locations.MapAddressViewModel mapAddressViewModel = mMapAddressViewModel;
                // mapAddressViewModel != null
                boolean mapAddressViewModelJavaLangObjectNull = false;



                mapAddressViewModelJavaLangObjectNull = (mapAddressViewModel) != (null);
                if (mapAddressViewModelJavaLangObjectNull) {



                    mapAddressViewModel.goBack(getRoot().getContext());
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mapAddressViewModel.mMapLatLng
        flag 1 (0x2L): mapAddressViewModel
        flag 2 (0x3L): mapAddressViewModel.passingObject
        flag 3 (0x4L): null
        flag 4 (0x5L): mapAddressViewModel.passingObject.id != 0 ? View.GONE : View.VISIBLE
        flag 5 (0x6L): mapAddressViewModel.passingObject.id != 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}