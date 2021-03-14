package te.app.ossman_elmonkz.activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
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
                    MovementHelper.replaceFragment(this, new HomeFragment(), "");
                    break;
               case Constants.MENU_MORE:
                    MovementHelper.replaceFragment(this, new MoreFragment(), "");
                    break;

            }
        });

    }

    private void setHomeActionTitle(String title, String notificationVisible) {
        homeActionBarView.setTitle(title);
//        if (notificationVisible != null)
//            homeActionBarView.notificationVisible(View.VISIBLE);
//        else
//            homeActionBarView.notificationVisible(View.GONE);
    }


}
