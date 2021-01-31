// Generated by data binding compiler. Do not edit!
package apps.app.altcompany.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import apps.app.altcompany.R;
import com.google.android.exoplayer2.ui.PlayerView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityExoPlayerBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar spinnerVideoDetails;

  @NonNull
  public final PlayerView videoFullScreenPlayer;

  protected ActivityExoPlayerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar spinnerVideoDetails, PlayerView videoFullScreenPlayer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.spinnerVideoDetails = spinnerVideoDetails;
    this.videoFullScreenPlayer = videoFullScreenPlayer;
  }

  @NonNull
  public static ActivityExoPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_exo_player, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityExoPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityExoPlayerBinding>inflateInternal(inflater, R.layout.activity_exo_player, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityExoPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_exo_player, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityExoPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityExoPlayerBinding>inflateInternal(inflater, R.layout.activity_exo_player, null, false, component);
  }

  public static ActivityExoPlayerBinding bind(@NonNull View view) {
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
  public static ActivityExoPlayerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityExoPlayerBinding)bind(component, view, R.layout.activity_exo_player);
  }
}
