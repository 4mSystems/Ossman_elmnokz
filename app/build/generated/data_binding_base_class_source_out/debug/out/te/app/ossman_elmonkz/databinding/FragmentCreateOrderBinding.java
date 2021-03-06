// Generated by data binding compiler. Do not edit!
package te.app.ossman_elmonkz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel;

public abstract class FragmentCreateOrderBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton addCart;

  @NonNull
  public final TextInputLayout clientAddress;

  @NonNull
  public final TextInputEditText clientGovText;

  @NonNull
  public final TextInputLayout clientGovs;

  @NonNull
  public final TextInputLayout clientName;

  @NonNull
  public final TextInputLayout clientNotes;

  @NonNull
  public final TextInputLayout clientPhone;

  @Bindable
  protected CreateOrderViewModel mViewmodel;

  protected FragmentCreateOrderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton addCart, TextInputLayout clientAddress, TextInputEditText clientGovText,
      TextInputLayout clientGovs, TextInputLayout clientName, TextInputLayout clientNotes,
      TextInputLayout clientPhone) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addCart = addCart;
    this.clientAddress = clientAddress;
    this.clientGovText = clientGovText;
    this.clientGovs = clientGovs;
    this.clientName = clientName;
    this.clientNotes = clientNotes;
    this.clientPhone = clientPhone;
  }

  public abstract void setViewmodel(@Nullable CreateOrderViewModel viewmodel);

  @Nullable
  public CreateOrderViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentCreateOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_create_order, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCreateOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCreateOrderBinding>inflateInternal(inflater, R.layout.fragment_create_order, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCreateOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_create_order, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCreateOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCreateOrderBinding>inflateInternal(inflater, R.layout.fragment_create_order, null, false, component);
  }

  public static FragmentCreateOrderBinding bind(@NonNull View view) {
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
  public static FragmentCreateOrderBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCreateOrderBinding)bind(component, view, R.layout.fragment_create_order);
  }
}
