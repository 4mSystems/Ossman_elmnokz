// Generated by data binding compiler. Do not edit!
package apps.app.altcompany.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import apps.app.altcompany.R;
import apps.app.altcompany.customViews.views.CustomTextViewMedium;
import apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel;
import com.google.android.material.textfield.TextInputEditText;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCompanyProfileBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardBio;

  @NonNull
  public final CardView cardEmail;

  @NonNull
  public final CardView cardFacebook;

  @NonNull
  public final CardView cardLocation;

  @NonNull
  public final CardView cardMyWorks;

  @NonNull
  public final CardView cardPhone;

  @NonNull
  public final CardView cardPoints;

  @NonNull
  public final CardView cardTwitter;

  @NonNull
  public final AppCompatImageView cover;

  @NonNull
  public final TextInputEditText txtCompanyBio;

  @NonNull
  public final TextInputEditText txtEmail;

  @NonNull
  public final TextInputEditText txtFacebook;

  @NonNull
  public final TextInputEditText txtLocaction;

  @NonNull
  public final CustomTextViewMedium txtMyWorks;

  @NonNull
  public final TextInputEditText txtPhone;

  @NonNull
  public final TextInputEditText txtTwitter;

  @NonNull
  public final CircleImageView userImg;

  @NonNull
  public final CustomTextViewMedium userName;

  @NonNull
  public final CustomTextViewMedium userPoints;

  @Bindable
  protected CompaniesViewModel mViewModel;

  protected FragmentCompanyProfileBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CardView cardBio, CardView cardEmail, CardView cardFacebook,
      CardView cardLocation, CardView cardMyWorks, CardView cardPhone, CardView cardPoints,
      CardView cardTwitter, AppCompatImageView cover, TextInputEditText txtCompanyBio,
      TextInputEditText txtEmail, TextInputEditText txtFacebook, TextInputEditText txtLocaction,
      CustomTextViewMedium txtMyWorks, TextInputEditText txtPhone, TextInputEditText txtTwitter,
      CircleImageView userImg, CustomTextViewMedium userName, CustomTextViewMedium userPoints) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardBio = cardBio;
    this.cardEmail = cardEmail;
    this.cardFacebook = cardFacebook;
    this.cardLocation = cardLocation;
    this.cardMyWorks = cardMyWorks;
    this.cardPhone = cardPhone;
    this.cardPoints = cardPoints;
    this.cardTwitter = cardTwitter;
    this.cover = cover;
    this.txtCompanyBio = txtCompanyBio;
    this.txtEmail = txtEmail;
    this.txtFacebook = txtFacebook;
    this.txtLocaction = txtLocaction;
    this.txtMyWorks = txtMyWorks;
    this.txtPhone = txtPhone;
    this.txtTwitter = txtTwitter;
    this.userImg = userImg;
    this.userName = userName;
    this.userPoints = userPoints;
  }

  public abstract void setViewModel(@Nullable CompaniesViewModel viewModel);

  @Nullable
  public CompaniesViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCompanyProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_company_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCompanyProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCompanyProfileBinding>inflateInternal(inflater, R.layout.fragment_company_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCompanyProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_company_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCompanyProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCompanyProfileBinding>inflateInternal(inflater, R.layout.fragment_company_profile, null, false, component);
  }

  public static FragmentCompanyProfileBinding bind(@NonNull View view) {
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
  public static FragmentCompanyProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCompanyProfileBinding)bind(component, view, R.layout.fragment_company_profile);
  }
}
