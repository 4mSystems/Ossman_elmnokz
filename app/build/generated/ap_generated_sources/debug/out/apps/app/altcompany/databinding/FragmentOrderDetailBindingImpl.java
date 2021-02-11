package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderDetailBindingImpl extends FragmentOrderDetailBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_img, 7);
        sViewsWithIds.put(R.id.edt_login, 8);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomTextViewMedium mboundView2;
    @NonNull
    private final apps.app.altcompany.customViews.views.CustomEditText mboundView5;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.orderDetailsRequest.offer_desc
            //         is viewModel.orderDetailsRequest.setOffer_desc((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.orderDetailsRequest.offer_desc
            java.lang.String viewModelOrderDetailsRequestOfferDesc = null;
            // viewModel.orderDetailsRequest != null
            boolean viewModelOrderDetailsRequestJavaLangObjectNull = false;
            // viewModel
            apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;
            // viewModel.orderDetailsRequest
            apps.app.altcompany.pages.home.models.orderDetails.OrderDetailsRequest viewModelOrderDetailsRequest = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOrderDetailsRequest = viewModel.getOrderDetailsRequest();

                viewModelOrderDetailsRequestJavaLangObjectNull = (viewModelOrderDetailsRequest) != (null);
                if (viewModelOrderDetailsRequestJavaLangObjectNull) {




                    viewModelOrderDetailsRequest.setOffer_desc(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentOrderDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentOrderDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.RelativeLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (apps.app.altcompany.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (apps.app.altcompany.customViews.views.CustomEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatButton) bindings[6];
        this.mboundView6.setTag(null);
        this.orderMedia.setTag(null);
        this.txtDetails.setTag(null);
        this.userImg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
        mCallback19 = new apps.app.altcompany.generated.callback.OnClickListener(this, 3);
        mCallback18 = new apps.app.altcompany.generated.callback.OnClickListener(this, 2);
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
        if (BR.viewModel == variableId) {
            setViewModel((apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel ViewModel) {
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
                return onChangeViewModel((apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.ordersData) {
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
        java.lang.String viewModelOrderDetailsRequestOfferDesc = null;
        int viewModelOrdersDataOrdersStatusInt0ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelOrdersDataUserUsersImg = null;
        boolean textUtilsIsEmptyViewModelOrdersDataOrdersImg = false;
        apps.app.altcompany.pages.home.models.UserDetails viewModelOrdersDataUser = null;
        int viewModelOrdersDataOrdersStatus = 0;
        java.lang.String viewModelOrdersDataOrdersDesc = null;
        java.lang.String viewModelOrdersDataOrdersImg = null;
        int viewModelPassingObjectObjectEqualsJavaLangString1ViewVISIBLEViewGONE = 0;
        apps.app.altcompany.PassingObject viewModelPassingObject = null;
        boolean viewModelOrdersDataOrdersStatusInt0 = false;
        java.lang.String viewModelOrdersDataUserUsersUsername = null;
        java.lang.String viewModelPassingObjectObject = null;
        java.lang.String textUtilsIsEmptyViewModelOrdersDataOrdersImgViewModelOrdersDataOrdersImgJavaLangString = null;
        boolean TextUtilsIsEmptyViewModelOrdersDataOrdersImg1 = false;
        boolean viewModelPassingObjectObjectEqualsJavaLangString1 = false;
        apps.app.altcompany.pages.home.models.OrdersData viewModelOrdersData = null;
        java.lang.String viewModelPassingObjectObjectEqualsJavaLangString1MboundView6AndroidStringSendOfferMboundView6AndroidStringChat = null;
        apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;
        apps.app.altcompany.pages.home.models.orderDetails.OrderDetailsRequest viewModelOrderDetailsRequest = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passingObject
                        viewModelPassingObject = viewModel.getPassingObject();
                    }


                    if (viewModelPassingObject != null) {
                        // read viewModel.passingObject.object
                        viewModelPassingObjectObject = viewModelPassingObject.getObject();
                    }


                    if (viewModelPassingObjectObject != null) {
                        // read viewModel.passingObject.object.equals("-1")
                        viewModelPassingObjectObjectEqualsJavaLangString1 = viewModelPassingObjectObject.equals("-1");
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelPassingObjectObjectEqualsJavaLangString1) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read viewModel.passingObject.object.equals("-1") ? View.VISIBLE : View.GONE
                    viewModelPassingObjectObjectEqualsJavaLangString1ViewVISIBLEViewGONE = ((viewModelPassingObjectObjectEqualsJavaLangString1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.passingObject.object.equals("-1") ? @android:string/send_offer : @android:string/chat
                    viewModelPassingObjectObjectEqualsJavaLangString1MboundView6AndroidStringSendOfferMboundView6AndroidStringChat = ((viewModelPassingObjectObjectEqualsJavaLangString1) ? (mboundView6.getResources().getString(R.string.send_offer)) : (mboundView6.getResources().getString(R.string.chat)));
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ordersData
                        viewModelOrdersData = viewModel.getOrdersData();
                    }


                    if (viewModelOrdersData != null) {
                        // read viewModel.ordersData.user
                        viewModelOrdersDataUser = viewModelOrdersData.getUser();
                        // read viewModel.ordersData.ordersStatus
                        viewModelOrdersDataOrdersStatus = viewModelOrdersData.getOrdersStatus();
                        // read viewModel.ordersData.ordersDesc
                        viewModelOrdersDataOrdersDesc = viewModelOrdersData.getOrdersDesc();
                        // read viewModel.ordersData.orders_img
                        viewModelOrdersDataOrdersImg = viewModelOrdersData.getOrders_img();
                    }


                    if (viewModelOrdersDataUser != null) {
                        // read viewModel.ordersData.user.users_img
                        viewModelOrdersDataUserUsersImg = viewModelOrdersDataUser.getUsers_img();
                        // read viewModel.ordersData.user.users_username
                        viewModelOrdersDataUserUsersUsername = viewModelOrdersDataUser.getUsers_username();
                    }
                    // read viewModel.ordersData.ordersStatus == 0
                    viewModelOrdersDataOrdersStatusInt0 = (viewModelOrdersDataOrdersStatus) == (0);
                    // read TextUtils.isEmpty(viewModel.ordersData.orders_img)
                    textUtilsIsEmptyViewModelOrdersDataOrdersImg = android.text.TextUtils.isEmpty(viewModelOrdersDataOrdersImg);
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewModelOrdersDataOrdersStatusInt0) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.ordersData.ordersStatus == 0 ? View.VISIBLE : View.GONE
                    viewModelOrdersDataOrdersStatusInt0ViewVISIBLEViewGONE = ((viewModelOrdersDataOrdersStatusInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read !TextUtils.isEmpty(viewModel.ordersData.orders_img)
                    TextUtilsIsEmptyViewModelOrdersDataOrdersImg1 = !textUtilsIsEmptyViewModelOrdersDataOrdersImg;
                if((dirtyFlags & 0xbL) != 0) {
                    if(TextUtilsIsEmptyViewModelOrdersDataOrdersImg1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
            if ((dirtyFlags & 0x9L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderDetailsRequest
                        viewModelOrderDetailsRequest = viewModel.getOrderDetailsRequest();
                    }


                    if (viewModelOrderDetailsRequest != null) {
                        // read viewModel.orderDetailsRequest.offer_desc
                        viewModelOrderDetailsRequestOfferDesc = viewModelOrderDetailsRequest.getOffer_desc();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xbL) != 0) {

                // read !TextUtils.isEmpty(viewModel.ordersData.orders_img) ? viewModel.ordersData.orders_img : ""
                textUtilsIsEmptyViewModelOrdersDataOrdersImgViewModelOrdersDataOrdersImgJavaLangString = ((TextUtilsIsEmptyViewModelOrdersDataOrdersImg1) ? (viewModelOrdersDataOrdersImg) : (""));
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelOrdersDataUserUsersUsername);
            this.mboundView6.setVisibility(viewModelOrdersDataOrdersStatusInt0ViewVISIBLEViewGONE);
            apps.app.altcompany.base.ApplicationBinding.loadImage(this.orderMedia, textUtilsIsEmptyViewModelOrdersDataOrdersImgViewModelOrdersDataOrdersImgJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDetails, viewModelOrdersDataOrdersDesc);
            apps.app.altcompany.base.ApplicationBinding.loadImage(this.userImg, viewModelOrdersDataUserUsersImg);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelOrderDetailsRequestOfferDesc);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelPassingObjectObjectEqualsJavaLangString1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelPassingObjectObjectEqualsJavaLangString1MboundView6AndroidStringSendOfferMboundView6AndroidStringChat);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback19);
            this.orderMedia.setOnClickListener(mCallback18);
            this.userImg.setOnClickListener(mCallback17);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toUserDetails();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.sendOffer();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toViewProduct();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.ordersData
        flag 2 (0x3L): viewModel.passingObject
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.ordersData.ordersStatus == 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.ordersData.ordersStatus == 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.passingObject.object.equals("-1") ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.passingObject.object.equals("-1") ? View.VISIBLE : View.GONE
        flag 8 (0x9L): !TextUtils.isEmpty(viewModel.ordersData.orders_img) ? viewModel.ordersData.orders_img : ""
        flag 9 (0xaL): !TextUtils.isEmpty(viewModel.ordersData.orders_img) ? viewModel.ordersData.orders_img : ""
        flag 10 (0xbL): viewModel.passingObject.object.equals("-1") ? @android:string/send_offer : @android:string/chat
        flag 11 (0xcL): viewModel.passingObject.object.equals("-1") ? @android:string/send_offer : @android:string/chat
    flag mapping end*/
    //end
}