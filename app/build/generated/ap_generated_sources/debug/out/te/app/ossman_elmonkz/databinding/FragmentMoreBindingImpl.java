package te.app.ossman_elmonkz.databinding;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMoreBindingImpl extends FragmentMoreBinding implements te.app.ossman_elmonkz.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.more_title, 8);
        sViewsWithIds.put(R.id.login_container, 9);
        sViewsWithIds.put(R.id.view_profile, 10);
        sViewsWithIds.put(R.id.view_agent, 11);
        sViewsWithIds.put(R.id.view_contact, 12);
        sViewsWithIds.put(R.id.view_support, 13);
        sViewsWithIds.put(R.id.view_terms, 14);
        sViewsWithIds.put(R.id.view_share, 15);
        sViewsWithIds.put(R.id.grand_logo, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMoreBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentMoreBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.ossman_elmonkz.customViews.tesDialog.TesImageDialog) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[1]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular) bindings[5]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[14]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAgents.setTag(null);
        this.tvContact.setTag(null);
        this.tvMembers.setTag(null);
        this.tvRate.setTag(null);
        this.tvShare.setTag(null);
        this.tvSupport.setTag(null);
        this.tvTerms.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 7);
        mCallback15 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 5);
        mCallback13 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 3);
        mCallback11 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 1);
        mCallback16 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 6);
        mCallback14 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 4);
        mCallback12 = new te.app.ossman_elmonkz.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel Viewmodel, int fieldId) {
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
        te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel viewmodel = mViewmodel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.tvAgents.setOnClickListener(mCallback12);
            this.tvContact.setOnClickListener(mCallback13);
            this.tvMembers.setOnClickListener(mCallback11);
            this.tvRate.setOnClickListener(mCallback17);
            this.tvShare.setOnClickListener(mCallback16);
            this.tvSupport.setOnClickListener(mCallback14);
            this.tvTerms.setOnClickListener(mCallback15);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.rateApp();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toTerms();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toContact();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toClients();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.share();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toAbout();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toAgents();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}