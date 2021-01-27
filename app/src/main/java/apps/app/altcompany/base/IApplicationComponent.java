package apps.app.altcompany.base;

import javax.inject.Singleton;

import apps.app.altcompany.pages.auth.register.RegisterFragment;
import apps.app.altcompany.pages.auth.register.RegisterStep2Fragment;
import apps.app.altcompany.pages.auth.register.RegisterStep3Fragment;
import apps.app.altcompany.pages.auth.register.RegisterStep4Fragment;
import apps.app.altcompany.pages.chatAdmin.view.ChatAdminFragment;
import apps.app.altcompany.pages.companies.CompanyProfileFragment;
import apps.app.altcompany.pages.home.HomeFragment;
import apps.app.altcompany.pages.home.OrderDetailsFragment;
import apps.app.altcompany.pages.home.UserDetailsFragment;
import apps.app.altcompany.pages.myOrders.MyOrdersFragment;
import apps.app.altcompany.pages.notifications.NotificationsFragment;
import apps.app.altcompany.pages.offers.AddOfferFragment;
import apps.app.altcompany.pages.offers.OffersFragment;
import apps.app.altcompany.pages.settings.AboutFragment;
import apps.app.altcompany.pages.settings.PrivacyFragment;
import apps.app.altcompany.pages.settings.SuggestionsFragment;
import apps.app.altcompany.utils.locations.MapAddressActivity;
import dagger.Component;
import apps.app.altcompany.activity.BaseActivity;
import apps.app.altcompany.activity.MainActivity;
import apps.app.altcompany.connection.ConnectionModule;
import apps.app.altcompany.pages.auth.changePassword.ChangePasswordFragment;
import apps.app.altcompany.pages.auth.confirmCode.ConfirmCodeFragment;
import apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordFragment;
import apps.app.altcompany.pages.auth.login.LoginFragment;
import apps.app.altcompany.pages.splash.SplashFragment;

@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(SplashFragment splashFragment);

    void inject(LoginFragment loginFragment);

    void inject(ForgetPasswordFragment forgetPasswordFragment);

    void inject(ConfirmCodeFragment confirmCodeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(RegisterFragment registerFragment);

    void inject(RegisterStep2Fragment step2Fragment);

    void inject(RegisterStep3Fragment step3Fragment);

    void inject(RegisterStep4Fragment registerStep4Fragment);

    void inject(MapAddressActivity mapAddressActivity);

    void inject(HomeFragment homeFragment);

    void inject(PrivacyFragment privacyFragment);

    void inject(OrderDetailsFragment orderDetailsFragment);

    void inject(UserDetailsFragment userDetailsFragment);

    void inject(CompanyProfileFragment companyProfileFragment);

    void inject(SuggestionsFragment suggestionsFragment);

    void inject(AboutFragment aboutFragment);

    void inject(MyOrdersFragment myOrdersFragment);

    void inject(OffersFragment offersFragment);

    void inject(AddOfferFragment addOfferFragment);

    void inject(NotificationsFragment notificationsFragment);
    void inject(ChatAdminFragment chatAdminFragment);


    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
