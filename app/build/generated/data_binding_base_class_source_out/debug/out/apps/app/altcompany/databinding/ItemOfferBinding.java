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
import apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemOfferBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardImg;

  @NonNull
  public final AppCompatImageView imgOffer;

  @Bindable
  protected ItemOfferViewModel mItemHomeViewModel;

  protected ItemOfferBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardImg, AppCompatImageView imgOffer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardImg = cardImg;
    this.imgOffer = imgOffer;
  }

  public abstract void setItemHomeViewModel(@Nullable ItemOfferViewModel itemHomeViewModel);

  @Nullable
  public ItemOfferViewModel getItemHomeViewModel() {
    return mItemHomeViewModel;
  }

  @NonNull
  public static ItemOfferBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_offer, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemOfferBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemOfferBinding>inflateInternal(inflater, R.layout.item_offer, root, attachToRoot, component);
  }

  @NonNull
  public static ItemOfferBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_offer, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemOfferBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemOfferBinding>inflateInternal(inflater, R.layout.item_offer, null, false, component);
  }

  public static ItemOfferBinding bind(@NonNull View view) {
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
  public static ItemOfferBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemOfferBinding)bind(component, view, R.layout.item_offer);
  }
}
