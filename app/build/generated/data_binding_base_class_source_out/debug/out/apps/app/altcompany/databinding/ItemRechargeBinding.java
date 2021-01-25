// Generated by data binding compiler. Do not edit!
package apps.app.altcompany.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import apps.app.altcompany.R;
import apps.app.altcompany.customViews.views.CustomTextViewMedium;
import apps.app.altcompany.pages.auth.register.viewModels.ItemPackagesViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemRechargeBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewMedium packeName;

  @NonNull
  public final AppCompatImageView radio;

  @Bindable
  protected ItemPackagesViewModel mItemMenuViewModel;

  protected ItemRechargeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewMedium packeName, AppCompatImageView radio) {
    super(_bindingComponent, _root, _localFieldCount);
    this.packeName = packeName;
    this.radio = radio;
  }

  public abstract void setItemMenuViewModel(@Nullable ItemPackagesViewModel itemMenuViewModel);

  @Nullable
  public ItemPackagesViewModel getItemMenuViewModel() {
    return mItemMenuViewModel;
  }

  @NonNull
  public static ItemRechargeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_recharge, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemRechargeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemRechargeBinding>inflateInternal(inflater, R.layout.item_recharge, root, attachToRoot, component);
  }

  @NonNull
  public static ItemRechargeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_recharge, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemRechargeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemRechargeBinding>inflateInternal(inflater, R.layout.item_recharge, null, false, component);
  }

  public static ItemRechargeBinding bind(@NonNull View view) {
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
  public static ItemRechargeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemRechargeBinding)bind(component, view, R.layout.item_recharge);
  }
}
