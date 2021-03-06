// Generated by data binding compiler. Do not edit!
package te.app.ossman_elmonkz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.customViews.tesDialog.TesImageDialog;
import te.app.ossman_elmonkz.customViews.views.CustomTextViewMedium;
import te.app.ossman_elmonkz.customViews.views.CustomTextViewRegular;
import te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel;

public abstract class FragmentMoreBinding extends ViewDataBinding {
  @NonNull
  public final TesImageDialog grandLogo;

  @NonNull
  public final CardView loginContainer;

  @NonNull
  public final CustomTextViewMedium moreTitle;

  @NonNull
  public final CustomTextViewRegular tvAgents;

  @NonNull
  public final CustomTextViewRegular tvContact;

  @NonNull
  public final CustomTextViewRegular tvMembers;

  @NonNull
  public final CustomTextViewRegular tvRate;

  @NonNull
  public final CustomTextViewRegular tvShare;

  @NonNull
  public final CustomTextViewRegular tvSupport;

  @NonNull
  public final CustomTextViewRegular tvTerms;

  @NonNull
  public final View viewAgent;

  @NonNull
  public final View viewContact;

  @NonNull
  public final View viewProfile;

  @NonNull
  public final View viewShare;

  @NonNull
  public final View viewSupport;

  @NonNull
  public final View viewTerms;

  @Bindable
  protected MoreViewModel mViewmodel;

  protected FragmentMoreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TesImageDialog grandLogo, CardView loginContainer, CustomTextViewMedium moreTitle,
      CustomTextViewRegular tvAgents, CustomTextViewRegular tvContact,
      CustomTextViewRegular tvMembers, CustomTextViewRegular tvRate, CustomTextViewRegular tvShare,
      CustomTextViewRegular tvSupport, CustomTextViewRegular tvTerms, View viewAgent,
      View viewContact, View viewProfile, View viewShare, View viewSupport, View viewTerms) {
    super(_bindingComponent, _root, _localFieldCount);
    this.grandLogo = grandLogo;
    this.loginContainer = loginContainer;
    this.moreTitle = moreTitle;
    this.tvAgents = tvAgents;
    this.tvContact = tvContact;
    this.tvMembers = tvMembers;
    this.tvRate = tvRate;
    this.tvShare = tvShare;
    this.tvSupport = tvSupport;
    this.tvTerms = tvTerms;
    this.viewAgent = viewAgent;
    this.viewContact = viewContact;
    this.viewProfile = viewProfile;
    this.viewShare = viewShare;
    this.viewSupport = viewSupport;
    this.viewTerms = viewTerms;
  }

  public abstract void setViewmodel(@Nullable MoreViewModel viewmodel);

  @Nullable
  public MoreViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_more, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMoreBinding>inflateInternal(inflater, R.layout.fragment_more, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_more, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMoreBinding>inflateInternal(inflater, R.layout.fragment_more, null, false, component);
  }

  public static FragmentMoreBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentMoreBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMoreBinding)bind(component, view, R.layout.fragment_more);
  }
}
