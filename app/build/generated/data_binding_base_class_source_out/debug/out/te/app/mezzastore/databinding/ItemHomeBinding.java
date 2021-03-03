// Generated by data binding compiler. Do not edit!
package te.app.mezzastore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.mezzastore.R;
import te.app.mezzastore.pages.home.viewModels.ItemCategoryViewModel;

public abstract class ItemHomeBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView catImage;

  @Bindable
  protected ItemCategoryViewModel mItemViewModel;

  protected ItemHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView catImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.catImage = catImage;
  }

  public abstract void setItemViewModel(@Nullable ItemCategoryViewModel itemViewModel);

  @Nullable
  public ItemCategoryViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemHomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemHomeBinding>inflateInternal(inflater, R.layout.item_home, root, attachToRoot, component);
  }

  @NonNull
  public static ItemHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemHomeBinding>inflateInternal(inflater, R.layout.item_home, null, false, component);
  }

  public static ItemHomeBinding bind(@NonNull View view) {
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
  public static ItemHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemHomeBinding)bind(component, view, R.layout.item_home);
  }
}
