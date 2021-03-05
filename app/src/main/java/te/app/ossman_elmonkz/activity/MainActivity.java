package te.app.ossman_elmonkz.activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.base.ParentActivity;
import te.app.ossman_elmonkz.customViews.actionbar.HomeActionBarView;
import te.app.ossman_elmonkz.databinding.ActivityMainBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.home.HomeFragment;
import te.app.ossman_elmonkz.pages.home.viewModels.HomeViewModel;
import te.app.ossman_elmonkz.pages.more.MoreFragment;
import te.app.ossman_elmonkz.pages.products.ProductsFragment;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;

public class MainActivity extends ParentActivity {
    ActivityMainBinding activityMainBinding;
    @Inject
    HomeViewModel viewModel;
    HomeActionBarView homeActionBarView;
    MutableLiveData<Boolean> refreshingLiveData = new MutableLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeLanguage();
        setContentView(R.layout.activity_main);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(viewModel);
        homeActionBarView = new HomeActionBarView(this);
//        activityMainBinding.llBaseContainer.addView(homeActionBarView);
        setHomeActionTitle(getResources().getString(R.string.menuHome), null);
        MovementHelper.replaceFragment(this, new HomeFragment(), "");
        setEvents();

    }

    private void setEvents() {
        viewModel.liveData.observe(this, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.MENU_HOME:
//                    setHomeActionTitle(getResources().getString(R.string.menuHome), "Visible");
                    MovementHelper.replaceFragment(this, new HomeFragment(), "");
                    break;
                case Constants.MENU_PRODUCTS:
//                    setHomeActionTitle(getResources().getString(R.string.menuFavorites), null);
                    MovementHelper.replaceFragment(this, new ProductsFragment(), "");
                    break;
                case Constants.MENU_MORE:
//                    setHomeActionTitle(getResources().getString(R.string.menuAccount), null);
                    MovementHelper.replaceFragment(this, new MoreFragment(), "");
                    break;

            }
        });
        activityMainBinding.swipeContainer.setOnRefreshListener(() -> {
            refreshingLiveData.setValue(true);
        });
    }

    private void setHomeActionTitle(String title, String notificationVisible) {
        homeActionBarView.setTitle(title);
//        if (notificationVisible != null)
//            homeActionBarView.notificationVisible(View.VISIBLE);
//        else
//            homeActionBarView.notificationVisible(View.GONE);
    }

    public void enableRefresh(boolean status) {
        activityMainBinding.swipeContainer.setEnabled(status);
    }

    public void stopRefresh(boolean status) {
        activityMainBinding.swipeContainer.setRefreshing(status);
    }

    public MutableLiveData<Boolean> getRefreshingLiveData() {
        return refreshingLiveData;
    }

}
