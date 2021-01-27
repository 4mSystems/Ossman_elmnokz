// Generated by data binding compiler. Do not edit!
package apps.app.altcompany.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import apps.app.altcompany.R;
import apps.app.altcompany.pages.notifications.viewModels.NotificationsViewModels;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNotificationsBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView animationView;

  @Bindable
  protected NotificationsViewModels mViewModel;

  protected FragmentNotificationsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LottieAnimationView animationView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animationView = animationView;
  }

  public abstract void setViewModel(@Nullable NotificationsViewModels viewModel);

  @Nullable
  public NotificationsViewModels getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNotificationsBinding>inflateInternal(inflater, R.layout.fragment_notifications, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNotificationsBinding>inflateInternal(inflater, R.layout.fragment_notifications, null, false, component);
  }

  public static FragmentNotificationsBinding bind(@NonNull View view) {
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
  public static FragmentNotificationsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentNotificationsBinding)bind(component, view, R.layout.fragment_notifications);
  }
}
