package apps.app.altcompany.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.base.ParentActivity;
import apps.app.altcompany.customViews.actionbar.BackActionBarView;
import apps.app.altcompany.databinding.ActivityBaseBinding;
import apps.app.altcompany.pages.chatAdmin.view.ChatAdminFragment;
import apps.app.altcompany.pages.home.OrderDetailsFragment;
import apps.app.altcompany.pages.splash.SplashFragment;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.resources.ResourceManager;

public class BaseActivity extends ParentActivity {
    private static final String TAG = "BaseActivity";
    ActivityBaseBinding activityBaseBinding;
    public BackActionBarView backActionBarView;
    private MutableLiveData<Boolean> refreshingLiveData = new MutableLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeLanguage();
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityBaseBinding = DataBindingUtil.setContentView(this, R.layout.activity_base);
        getNotification();
        if (!notification_checked) {
            if (getIntent().hasExtra(Constants.PAGE)) {
                String fragmentName = getIntent().getStringExtra(Constants.PAGE);
                if (fragmentName != null) {
                    try {
                        Fragment fragment = (Fragment) Class.forName(fragmentName).newInstance();
                        MovementHelper.replaceFragmentTag(this, getBundle(fragment), fragmentName, "");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else
                MovementHelper.replaceFragment(this, new SplashFragment(), "");
        }
        enableRefresh(false);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001);
        }
        activityBaseBinding.swipeContainer.setOnRefreshListener(() -> {
            refreshingLiveData.setValue(true);
        });
    }

    private void setTitleName(@Nullable String title) {
        backActionBarView = new BackActionBarView(this);
        if (title != null) {
            backActionBarView.setTitle(title);
        } else {
            if (getIntent().hasExtra(Constants.NAME_BAR)) {
                backActionBarView.setTitle(getIntent().getStringExtra(Constants.NAME_BAR));
            }
        }
        activityBaseBinding.llBaseActionBarContainer.addView(backActionBarView);
    }

    public void getNotification() {
//        Log.d(TAG, "Notification GET");
        if (getIntent() != null && getIntent().getBooleanExtra("is_notification", false)) {
            notification_checked = true;
            String typeNotifications = getIntent().getStringExtra("type");
            String orderId = getIntent().getStringExtra("order_id");
            Log.e(TAG, "getNotification: " + orderId);
            Bundle bundle = new Bundle();
            switch (typeNotifications) {
                case "0":  // Offers
                    setTitleName(ResourceManager.getString(R.string.order_details));
                    OrderDetailsFragment homeMainFragment = new OrderDetailsFragment();
                    bundle.putString(Constants.BUNDLE, new Gson().toJson(new PassingObject(Integer.parseInt(orderId), "1")));
                    homeMainFragment.setArguments(bundle);
                    MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
                    break;
                case "1": { // chat
                    if (!TextUtils.isEmpty(orderId)) {
                        setTitleName(ResourceManager.getString(R.string.chat));
                        ChatAdminFragment fragment = new ChatAdminFragment();
                        bundle.putString(Constants.BUNDLE, new Gson().toJson(new PassingObject(Integer.parseInt(orderId), Constants.CHAT)));
                        fragment.setArguments(bundle);
                        MovementHelper.replaceFragmentTag(this, fragment, fragment.getClass().getName(), "");
                    } else {
                        setTitleName(ResourceManager.getString(R.string.admin_chat));
                        ChatAdminFragment fragment = new ChatAdminFragment();
                        MovementHelper.replaceFragmentTag(this, fragment, fragment.getClass().getName(), "");
                    }

                    break;
                }
//                case "2": { // chatAdmin
//                    setTitleName(ResourceManager.getString(R.string.admin_chat));
//                    ChatAdminFragment fragment = new ChatAdminFragment();
//                    MovementHelper.replaceFragmentTag(this, fragment, fragment.getClass().getName(), "");
//                    break;
//                }
            }
        }
    }

    private Fragment getBundle(Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE, getIntent().getStringExtra(Constants.BUNDLE));
        fragment.setArguments(bundle);
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            setTitleName(null);
        }

        return fragment;
    }

    @Override
    public void onBackPressed() {
        try {
            if (dialogLoader != null && dialogLoader.isShowing()) {
                dialogLoader.dismiss();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        super.onBackPressed();
    }

    public void enableRefresh(boolean status) {
        activityBaseBinding.swipeContainer.setEnabled(status);
    }

    public void stopRefresh(boolean status) {
        activityBaseBinding.swipeContainer.setRefreshing(status);
    }

    public MutableLiveData<Boolean> getRefreshingLiveData() {
        return refreshingLiveData;
    }


}