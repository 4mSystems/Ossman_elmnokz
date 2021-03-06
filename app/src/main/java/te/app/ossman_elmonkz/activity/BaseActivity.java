package te.app.ossman_elmonkz.activity;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.base.ParentActivity;
import te.app.ossman_elmonkz.customViews.actionbar.BackActionBarView;
import te.app.ossman_elmonkz.databinding.ActivityBaseBinding;
import te.app.ossman_elmonkz.pages.splash.SplashFragment;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;

public class BaseActivity extends ParentActivity {
    public ActivityBaseBinding activityBaseBinding;
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
    }

    private void setTitleName() {
        backActionBarView = new BackActionBarView(this);
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            backActionBarView.setTitle(getIntent().getStringExtra(Constants.NAME_BAR));
        }
        if (getIntent().hasExtra(Constants.SHARE_BAR)) {
            backActionBarView.layoutActionBarBackBinding.imgActionBarFilter.setVisibility(View.VISIBLE);
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