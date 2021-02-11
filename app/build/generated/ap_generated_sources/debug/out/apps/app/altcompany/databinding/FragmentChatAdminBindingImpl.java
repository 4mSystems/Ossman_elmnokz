package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentChatAdminBindingImpl extends FragmentChatAdminBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.message, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edMessageandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.message
            //         is viewmodel.request.setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edMessage);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            apps.app.altcompany.pages.chatAdmin.model.ChatAdminRequest viewmodelRequest = null;
            // viewmodel.request.message
            java.lang.String viewmodelRequestMessage = null;
            // viewmodel
            apps.app.altcompany.pages.chatAdmin.viewmodel.ChatAdminViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.request;

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setMessage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentChatAdminBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentChatAdminBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            );
        this.edMessage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rcChat.setTag(null);
        this.sendChat.setTag(null);
        setRootTag(root);
        // listeners
        mCallback48 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewmodel((apps.app.altcompany.pages.chatAdmin.viewmodel.ChatAdminViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable apps.app.altcompany.pages.chatAdmin.viewmodel.ChatAdminViewModel Viewmodel) {
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
                return onChangeViewmodel((apps.app.altcompany.pages.chatAdmin.viewmodel.ChatAdminViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(apps.app.altcompany.pages.chatAdmin.viewmodel.ChatAdminViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        int viewmodelLangEqualsJavaLangStringArInt180Int0 = 0;
        apps.app.altcompany.pages.chatAdmin.model.ChatAdminRequest viewmodelRequest = null;
        java.lang.String viewmodelRequestMessage = null;
        boolean viewmodelLangEqualsJavaLangStringAr = false;
        java.lang.String viewmodelLang = null;
        apps.app.altcompany.pages.chatAdmin.adapter.ChatAdminAdapter viewmodelAdapter = null;
        apps.app.altcompany.pages.chatAdmin.viewmodel.ChatAdminViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.request
                    viewmodelRequest = viewmodel.request;
                    // read viewmodel.lang
                    viewmodelLang = viewmodel.lang;
                    // read viewmodel.adapter
                    viewmodelAdapter = viewmodel.adapter;
                }


                if (viewmodelRequest != null) {
                    // read viewmodel.request.message
                    viewmodelRequestMessage = viewmodelRequest.getMessage();
                }
                if (viewmodelLang != null) {
                    // read viewmodel.lang.equals("ar")
                    viewmodelLangEqualsJavaLangStringAr = viewmodelLang.equals("ar");
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewmodelLangEqualsJavaLangStringAr) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewmodel.lang.equals("ar") ? 180 : 0
                viewmodelLangEqualsJavaLangStringArInt180Int0 = ((viewmodelLangEqualsJavaLangStringAr) ? (180) : (0));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edMessage, viewmodelRequestMessage);
            apps.app.altcompany.base.ApplicationBinding.getItemsV2Binding(this.rcChat, viewmodelAdapter, "1", "1");
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.sendChat.setRotation(viewmodelLangEqualsJavaLangStringArInt180Int0);
            }
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edMessage, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edMessageandroidTextAttrChanged);
            this.sendChat.setOnClickListener(mCallback48);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        apps.app.altcompany.pages.chatAdmin.viewmodel.ChatAdminViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.sendMessage();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewmodel.lang.equals("ar") ? 180 : 0
        flag 3 (0x4L): viewmodel.lang.equals("ar") ? 180 : 0
    flag mapping end*/
    //end
}