package apps.app.altcompany.databinding;
import apps.app.altcompany.R;
import apps.app.altcompany.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSuggestionBindingImpl extends FragmentSuggestionBinding implements apps.app.altcompany.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_suggestion_title, 4);
        sViewsWithIds.put(R.id.rl_suggestion_desc, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtComplainDetailsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of suggestionViewModel.suggestionsRequest.suggestions_text
            //         is suggestionViewModel.suggestionsRequest.setSuggestions_text((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtComplainDetails);
            // localize variables for thread safety
            // suggestionViewModel != null
            boolean suggestionViewModelJavaLangObjectNull = false;
            // suggestionViewModel.suggestionsRequest
            apps.app.altcompany.pages.settings.models.SuggestionsRequest suggestionViewModelSuggestionsRequest = null;
            // suggestionViewModel.suggestionsRequest.suggestions_text
            java.lang.String suggestionViewModelSuggestionsRequestSuggestionsText = null;
            // suggestionViewModel.suggestionsRequest != null
            boolean suggestionViewModelSuggestionsRequestJavaLangObjectNull = false;
            // suggestionViewModel
            apps.app.altcompany.pages.settings.viewModels.SettingsViewModel suggestionViewModel = mSuggestionViewModel;



            suggestionViewModelJavaLangObjectNull = (suggestionViewModel) != (null);
            if (suggestionViewModelJavaLangObjectNull) {


                suggestionViewModelSuggestionsRequest = suggestionViewModel.getSuggestionsRequest();

                suggestionViewModelSuggestionsRequestJavaLangObjectNull = (suggestionViewModelSuggestionsRequest) != (null);
                if (suggestionViewModelSuggestionsRequestJavaLangObjectNull) {




                    suggestionViewModelSuggestionsRequest.setSuggestions_text(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtSuggstionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of suggestionViewModel.suggestionsRequest.suggestions_title
            //         is suggestionViewModel.suggestionsRequest.setSuggestions_title((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtSuggstion);
            // localize variables for thread safety
            // suggestionViewModel != null
            boolean suggestionViewModelJavaLangObjectNull = false;
            // suggestionViewModel.suggestionsRequest
            apps.app.altcompany.pages.settings.models.SuggestionsRequest suggestionViewModelSuggestionsRequest = null;
            // suggestionViewModel.suggestionsRequest != null
            boolean suggestionViewModelSuggestionsRequestJavaLangObjectNull = false;
            // suggestionViewModel.suggestionsRequest.suggestions_title
            java.lang.String suggestionViewModelSuggestionsRequestSuggestionsTitle = null;
            // suggestionViewModel
            apps.app.altcompany.pages.settings.viewModels.SettingsViewModel suggestionViewModel = mSuggestionViewModel;



            suggestionViewModelJavaLangObjectNull = (suggestionViewModel) != (null);
            if (suggestionViewModelJavaLangObjectNull) {


                suggestionViewModelSuggestionsRequest = suggestionViewModel.getSuggestionsRequest();

                suggestionViewModelSuggestionsRequestJavaLangObjectNull = (suggestionViewModelSuggestionsRequest) != (null);
                if (suggestionViewModelSuggestionsRequestJavaLangObjectNull) {




                    suggestionViewModelSuggestionsRequest.setSuggestions_title(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSuggestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentSuggestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[2]
            , (apps.app.altcompany.customViews.views.CustomEditText) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[4]
            );
        this.btnSubmitPrimary.setTag(null);
        this.edtComplainDetails.setTag(null);
        this.edtSuggstion.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new apps.app.altcompany.generated.callback.OnClickListener(this, 1);
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
        if (BR.suggestionViewModel == variableId) {
            setSuggestionViewModel((apps.app.altcompany.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSuggestionViewModel(@Nullable apps.app.altcompany.pages.settings.viewModels.SettingsViewModel SuggestionViewModel) {
        updateRegistration(0, SuggestionViewModel);
        this.mSuggestionViewModel = SuggestionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.suggestionViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSuggestionViewModel((apps.app.altcompany.pages.settings.viewModels.SettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSuggestionViewModel(apps.app.altcompany.pages.settings.viewModels.SettingsViewModel SuggestionViewModel, int fieldId) {
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
        apps.app.altcompany.pages.settings.models.SuggestionsRequest suggestionViewModelSuggestionsRequest = null;
        java.lang.String suggestionViewModelSuggestionsRequestSuggestionsText = null;
        apps.app.altcompany.pages.settings.viewModels.SettingsViewModel suggestionViewModel = mSuggestionViewModel;
        java.lang.String suggestionViewModelSuggestionsRequestSuggestionsTitle = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (suggestionViewModel != null) {
                    // read suggestionViewModel.suggestionsRequest
                    suggestionViewModelSuggestionsRequest = suggestionViewModel.getSuggestionsRequest();
                }


                if (suggestionViewModelSuggestionsRequest != null) {
                    // read suggestionViewModel.suggestionsRequest.suggestions_text
                    suggestionViewModelSuggestionsRequestSuggestionsText = suggestionViewModelSuggestionsRequest.getSuggestions_text();
                    // read suggestionViewModel.suggestionsRequest.suggestions_title
                    suggestionViewModelSuggestionsRequestSuggestionsTitle = suggestionViewModelSuggestionsRequest.getSuggestions_title();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnSubmitPrimary.setOnClickListener(mCallback13);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtComplainDetails, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtComplainDetailsandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtSuggstion, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtSuggstionandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtComplainDetails, suggestionViewModelSuggestionsRequestSuggestionsText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtSuggstion, suggestionViewModelSuggestionsRequestSuggestionsTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // suggestionViewModel != null
        boolean suggestionViewModelJavaLangObjectNull = false;
        // suggestionViewModel
        apps.app.altcompany.pages.settings.viewModels.SettingsViewModel suggestionViewModel = mSuggestionViewModel;



        suggestionViewModelJavaLangObjectNull = (suggestionViewModel) != (null);
        if (suggestionViewModelJavaLangObjectNull) {


            suggestionViewModel.suggestionSubmit();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): suggestionViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}