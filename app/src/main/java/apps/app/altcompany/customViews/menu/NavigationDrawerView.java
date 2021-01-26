package apps.app.altcompany.customViews.menu;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import apps.app.altcompany.R;
import apps.app.altcompany.customViews.actionbar.HomeActionBarView;
import apps.app.altcompany.databinding.LayoutNavigationDrawerBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.companies.CompanyProfileFragment;
import apps.app.altcompany.pages.settings.AboutFragment;
import apps.app.altcompany.pages.settings.PrivacyFragment;
import apps.app.altcompany.pages.settings.SuggestionsFragment;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.resources.ResourceManager;


public class NavigationDrawerView extends RelativeLayout {
    public MutableLiveData<Mutable> liveData;
    public LayoutNavigationDrawerBinding layoutNavigationDrawerBinding;
    AppCompatActivity context;
    HomeActionBarView homeActionBarView;
    private MenuViewModel menuViewModel;

    public NavigationDrawerView(AppCompatActivity context) {
        super(context);
        this.context = context;
        liveData = new MutableLiveData<>();
        init();
    }

    public NavigationDrawerView(AppCompatActivity context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();

    }

    public NavigationDrawerView(AppCompatActivity context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
//                MovementHelper.addFragment(getContext(),new Fragment(),"fda");
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutNavigationDrawerBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_navigation_drawer, this, true);
        menuViewModel = new MenuViewModel();
        layoutNavigationDrawerBinding.setMenuViewModel(menuViewModel);
        setEvents();
    }

    public void setActionBar(HomeActionBarView homeActionBarView) {
        this.homeActionBarView = homeActionBarView;
    }

    private void setEvents() {
        menuViewModel.getMenuAdapter().getLiveDataAdapter().observeForever(position -> {
            layoutNavigationDrawerBinding.dlMainNavigationMenu.closeDrawer(GravityCompat.START);
            if (position == 2) {
                MovementHelper.startActivity(context, CompanyProfileFragment.class.getName(), ResourceManager.getString(R.string.company_profile), null);
            } else if (position == 7) {
                MovementHelper.startActivity(context, PrivacyFragment.class.getName(), ResourceManager.getString(R.string.label_privacy_policy), null);
            } else if (position == 10) {
                MovementHelper.startActivity(context, AboutFragment.class.getName(), ResourceManager.getString(R.string.label_about_us), null);
            } else if (position == 8) {
                MovementHelper.startActivity(context, SuggestionsFragment.class.getName(), ResourceManager.getString(R.string.label_suggestions), null);
            }
        });

    }

}
