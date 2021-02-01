package apps.app.altcompany.customViews.menu;

import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.activity.BaseActivity;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.customViews.actionbar.HomeActionBarView;
import apps.app.altcompany.databinding.LayoutNavigationDrawerBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.login.LoginFragment;
import apps.app.altcompany.pages.chatAdmin.view.ChatAdminFragment;
import apps.app.altcompany.pages.companies.CompanyProfileFragment;
import apps.app.altcompany.pages.home.HomeFragment;
import apps.app.altcompany.pages.myOrders.MyOrdersFragment;
import apps.app.altcompany.pages.notifications.NotificationsFragment;
import apps.app.altcompany.pages.offers.OffersFragment;
import apps.app.altcompany.pages.settings.AboutFragment;
import apps.app.altcompany.pages.settings.ContactUsFragment;
import apps.app.altcompany.pages.settings.PrivacyFragment;
import apps.app.altcompany.pages.settings.SuggestionsFragment;
import apps.app.altcompany.pages.splash.SplashFragment;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.resources.ResourceManager;
import apps.app.altcompany.utils.session.LanguagesHelper;
import apps.app.altcompany.utils.session.UserHelper;


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
            if (position == 1) {
                MovementHelper.replaceFragment(context, new HomeFragment(), "");
            } else if (position == 2) {
                MovementHelper.startActivity(context, CompanyProfileFragment.class.getName(), ResourceManager.getString(R.string.company_profile), null);
            } else if (position == 3) {
                MovementHelper.startActivity(context, MyOrdersFragment.class.getName(), ResourceManager.getString(R.string.previous_orders), null);
            } else if (position == 4) {
                MovementHelper.startActivity(context, OffersFragment.class.getName(), ResourceManager.getString(R.string.offers), null);
            } else if (position == 5) {
                MovementHelper.startActivity(context, NotificationsFragment.class.getName(), ResourceManager.getString(R.string.notifications), null);
            } else if (position == 6) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.CHAT_ADMIN), ResourceManager.getString(R.string.admin_chat), ChatAdminFragment.class.getName(), null);
            } else if (position == 7) {
                MovementHelper.startActivity(context, PrivacyFragment.class.getName(), ResourceManager.getString(R.string.label_privacy_policy), null);
            } else if (position == 8) {
                MovementHelper.startActivity(context, SuggestionsFragment.class.getName(), ResourceManager.getString(R.string.label_suggestions), null);
            } else if (position == 12) {
                MovementHelper.startActivity(context, ContactUsFragment.class.getName(), ResourceManager.getString(R.string.contact_us), null);
            } else if (position == 9) {
                if (LanguagesHelper.getCurrentLanguage().equals("en"))
                    LanguagesHelper.setLanguage("ar");
                else
                    LanguagesHelper.setLanguage("en");
                context.startActivity(new Intent(context, BaseActivity.class));
                context.finishAffinity();
            } else if (position == 10) {
                MovementHelper.startActivity(context, AboutFragment.class.getName(), ResourceManager.getString(R.string.label_about_us), null);
            } else if (position == 11) {
                if (UserHelper.getInstance(context).getUserData() != null) {
                    try {
                        // clearing app data
                        Runtime runtime = Runtime.getRuntime();
                        runtime.exec("pm clear" + MyApplication.getInstance().getPackageName());
                        UserHelper.getInstance(context).loggout();
                        MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }

}
