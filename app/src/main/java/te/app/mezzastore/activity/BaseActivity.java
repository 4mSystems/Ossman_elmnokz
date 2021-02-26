package te.app.mezzastore.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import te.app.mezzastore.R;
import te.app.mezzastore.base.IApplicationComponent;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.base.ParentActivity;
import te.app.mezzastore.customViews.actionbar.BackActionBarView;
import te.app.mezzastore.databinding.ActivityBaseBinding;
import te.app.mezzastore.pages.splash.SplashFragment;
import te.app.mezzastore.utils.Constants;
import te.app.mezzastore.utils.helper.MovementHelper;

public class BaseActivity extends ParentActivity {
    ActivityBaseBinding activityBaseBinding;
    public BackActionBarView backActionBarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeLanguage();
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityBaseBinding = DataBindingUtil.setContentView(this, R.layout.activity_base);
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
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001);
        }
    }

    private void setTitleName() {
        backActionBarView = new BackActionBarView(this);
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            backActionBarView.setTitle(getIntent().getStringExtra(Constants.NAME_BAR));
        }
        activityBaseBinding.llBaseActionBarContainer.addView(backActionBarView);
    }


    private Fragment getBundle(Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE, getIntent().getStringExtra(Constants.BUNDLE));
        fragment.setArguments(bundle);
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            setTitleName();
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
}