package apps.app.altcompany.activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.R;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.base.ParentActivity;
import apps.app.altcompany.customViews.actionbar.HomeActionBarView;
import apps.app.altcompany.customViews.menu.NavigationDrawerView;
import apps.app.altcompany.databinding.ActivityMainBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.home.HomeFragment;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.resources.ResourceManager;

public class MainActivity extends ParentActivity {
    public HomeActionBarView homeActionBarView = null;
    public NavigationDrawerView navigationDrawerView;

    ActivityMainBinding activityMainBinding;
    @Inject
    MutableLiveData<Mutable> liveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        homeActionBarView = new HomeActionBarView(this);
        navigationDrawerView = new NavigationDrawerView(this);
        activityMainBinding.llBaseContainer.addView(navigationDrawerView);
        navigationDrawerView.layoutNavigationDrawerBinding.llBaseActionBarContainer.addView(homeActionBarView, 0);
        homeActionBarView.setNavigation(navigationDrawerView);
        homeActionBarView.connectDrawer(navigationDrawerView.layoutNavigationDrawerBinding.dlMainNavigationMenu, true);
        navigationDrawerView.setActionBar(homeActionBarView);
        homeActionBarView.setTitle(ResourceManager.getString(R.string.label_home));
        MovementHelper.replaceFragment(this, new HomeFragment(), "");
        setEvents();
    }

    private void setEvents() {
//        viewModel.liveData.observe(this, (Observer<Object>) o -> {
//            Mutable mutable = (Mutable) o;
//            handleActions(mutable);
//            switch (((Mutable) o).message) {
//                case Constants.MENU_HOME:
//                    MovementHelper.replaceFragment(this, new HomeCitiesFragment(), "");
//                    break;
//                case Constants.MENU_FAVORITE:
//                    MovementHelper.replaceFragment(this, new MyFavoritesMainFragment(), "");
//                    break;
//                case Constants.MENU_CONVERSATIONS:
//                    MovementHelper.replaceFragment(this, new ConversationsFragment(), "");
//                    break;
//                case Constants.MENU_ACCOUNT:
//                    MovementHelper.replaceFragment(this, new MyAccountFragment(), "");
//                    break;
//                case Constants.MENU_ADD_AD:
//                    MovementHelper.startActivity(this, AdsInfoFragment.class.getName(), getResources().getString(R.string.add_info_title), null);
//                    break;
//            }
//        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
