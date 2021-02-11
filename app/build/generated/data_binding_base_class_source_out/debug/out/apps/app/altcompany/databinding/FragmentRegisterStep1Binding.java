// Generated by data binding compiler. Do not edit!
package apps.app.altcompany.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import apps.app.altcompany.R;
import apps.app.altcompany.customViews.views.CustomEditText;
import apps.app.altcompany.customViews.views.DateEditText;
import apps.app.altcompany.pages.auth.register.RegisterViewModel;
import com.kofigyan.stateprogressbar.StateProgressBar;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRegisterStep1Binding extends ViewDataBinding {
  @NonNull
  public final CustomEditText businessRegister;

  @NonNull
  public final CustomEditText companyEmpNum;

  @NonNull
  public final CustomEditText companyRegisterCover;

  @NonNull
  public final DateEditText companyRegisterDate;

  @NonNull
  public final CustomEditText edAddress;

  @NonNull
  public final CustomEditText edtRegisterStep1City;

  @NonNull
  public final CustomEditText edtRegisterStep1Country;

  @NonNull
  public final CircleImageView imgRegisterUpdate;

  @NonNull
  public final RelativeLayout rlRegisterImage;

  @NonNull
  public final NestedScrollView svRegisterStep1;

  @NonNull
  public final StateProgressBar yourStateProgressBarId;

  @Bindable
  protected RegisterViewModel mRegisterStep1ViewModel;

  protected FragmentRegisterStep1Binding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomEditText businessRegister, CustomEditText companyEmpNum,
      CustomEditText companyRegisterCover, DateEditText companyRegisterDate,
      CustomEditText edAddress, CustomEditText edtRegisterStep1City,
      CustomEditText edtRegisterStep1Country, CircleImageView imgRegisterUpdate,
      RelativeLayout rlRegisterImage, NestedScrollView svRegisterStep1,
      StateProgressBar yourStateProgressBarId) {
    super(_bindingComponent, _root, _localFieldCount);
    this.businessRegister = businessRegister;
    this.companyEmpNum = companyEmpNum;
    this.companyRegisterCover = companyRegisterCover;
    this.companyRegisterDate = companyRegisterDate;
    this.edAddress = edAddress;
    this.edtRegisterStep1City = edtRegisterStep1City;
    this.edtRegisterStep1Country = edtRegisterStep1Country;
    this.imgRegisterUpdate = imgRegisterUpdate;
    this.rlRegisterImage = rlRegisterImage;
    this.svRegisterStep1 = svRegisterStep1;
    this.yourStateProgressBarId = yourStateProgressBarId;
  }

  public abstract void setRegisterStep1ViewModel(
      @Nullable RegisterViewModel registerStep1ViewModel);

  @Nullable
  public RegisterViewModel getRegisterStep1ViewModel() {
    return mRegisterStep1ViewModel;
  }

  @NonNull
  public static FragmentRegisterStep1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register_step1, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterStep1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterStep1Binding>inflateInternal(inflater, R.layout.fragment_register_step1, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegisterStep1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register_step1, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterStep1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterStep1Binding>inflateInternal(inflater, R.layout.fragment_register_step1, null, false, component);
  }

  public static FragmentRegisterStep1Binding bind(@NonNull View view) {
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
  public static FragmentRegisterStep1Binding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRegisterStep1Binding)bind(component, view, R.layout.fragment_register_step1);
  }
}
