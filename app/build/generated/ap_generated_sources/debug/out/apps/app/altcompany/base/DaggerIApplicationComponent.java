// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.base;

import androidx.lifecycle.MutableLiveData;
import apps.app.altcompany.activity.BaseActivity;
import apps.app.altcompany.activity.MainActivity;
import apps.app.altcompany.activity.MainActivity_MembersInjector;
import apps.app.altcompany.connection.Api;
import apps.app.altcompany.connection.ConnectionHelper;
import apps.app.altcompany.connection.ConnectionHelper_Factory;
import apps.app.altcompany.connection.ConnectionModule;
import apps.app.altcompany.connection.ConnectionModule_WebServiceFactory;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.changePassword.ChangePasswordFragment;
import apps.app.altcompany.pages.auth.changePassword.ChangePasswordFragment_MembersInjector;
import apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel;
import apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel_Factory;
import apps.app.altcompany.pages.auth.changePassword.ChangePasswordViewModel_MembersInjector;
import apps.app.altcompany.pages.auth.confirmCode.CodeViewModel;
import apps.app.altcompany.pages.auth.confirmCode.CodeViewModel_Factory;
import apps.app.altcompany.pages.auth.confirmCode.CodeViewModel_MembersInjector;
import apps.app.altcompany.pages.auth.confirmCode.ConfirmCodeFragment;
import apps.app.altcompany.pages.auth.confirmCode.ConfirmCodeFragment_MembersInjector;
import apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordFragment;
import apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordFragment_MembersInjector;
import apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel;
import apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel_Factory;
import apps.app.altcompany.pages.auth.forgetPassword.ForgetPasswordViewModel_MembersInjector;
import apps.app.altcompany.pages.auth.login.LoginFragment;
import apps.app.altcompany.pages.auth.login.LoginFragment_MembersInjector;
import apps.app.altcompany.pages.auth.login.LoginViewModel;
import apps.app.altcompany.pages.auth.login.LoginViewModel_Factory;
import apps.app.altcompany.pages.auth.login.LoginViewModel_MembersInjector;
import apps.app.altcompany.pages.auth.register.RegisterFragment;
import apps.app.altcompany.pages.auth.register.RegisterFragment_MembersInjector;
import apps.app.altcompany.pages.auth.register.RegisterStep2Fragment;
import apps.app.altcompany.pages.auth.register.RegisterStep2Fragment_MembersInjector;
import apps.app.altcompany.pages.auth.register.RegisterStep3Fragment;
import apps.app.altcompany.pages.auth.register.RegisterStep3Fragment_MembersInjector;
import apps.app.altcompany.pages.auth.register.RegisterStep4Fragment;
import apps.app.altcompany.pages.auth.register.RegisterStep4Fragment_MembersInjector;
import apps.app.altcompany.pages.auth.register.RegisterViewModel;
import apps.app.altcompany.pages.auth.register.RegisterViewModel_Factory;
import apps.app.altcompany.pages.auth.register.RegisterViewModel_MembersInjector;
import apps.app.altcompany.pages.splash.SplashFragment;
import apps.app.altcompany.pages.splash.SplashFragment_MembersInjector;
import apps.app.altcompany.pages.splash.SplashViewModel;
import apps.app.altcompany.pages.splash.SplashViewModel_Factory;
import apps.app.altcompany.pages.splash.SplashViewModel_MembersInjector;
import apps.app.altcompany.repository.AuthRepository;
import apps.app.altcompany.repository.AuthRepository_Factory;
import apps.app.altcompany.utils.locations.MapAddressActivity;
import apps.app.altcompany.utils.locations.MapAddressActivity_MembersInjector;
import apps.app.altcompany.utils.locations.MapAddressViewModel;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerIApplicationComponent implements IApplicationComponent {
  private Provider<MutableLiveData<Mutable>> getMutableLiveDataProvider;

  private Provider<Api> webServiceProvider;

  private Provider<ConnectionHelper> connectionHelperProvider;

  private Provider<AuthRepository> authRepositoryProvider;

  private DaggerIApplicationComponent(ConnectionModule connectionModuleParam,
      LiveData liveDataParam) {

    initialize(connectionModuleParam, liveDataParam);
  }

  public static IApplicationComponent.Builder builder() {
    return new Builder();
  }

  public static IApplicationComponent create() {
    return new Builder().build();
  }

  private SplashViewModel splashViewModel() {
    return injectSplashViewModel(SplashViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private LoginViewModel loginViewModel() {
    return injectLoginViewModel(LoginViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ForgetPasswordViewModel forgetPasswordViewModel() {
    return injectForgetPasswordViewModel(ForgetPasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private CodeViewModel codeViewModel() {
    return injectCodeViewModel(CodeViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ChangePasswordViewModel changePasswordViewModel() {
    return injectChangePasswordViewModel(ChangePasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private RegisterViewModel registerViewModel() {
    return injectRegisterViewModel(RegisterViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ConnectionModule connectionModuleParam,
      final LiveData liveDataParam) {
    this.getMutableLiveDataProvider = DoubleCheck.provider(LiveData_GetMutableLiveDataFactory.create(liveDataParam));
    this.webServiceProvider = DoubleCheck.provider(ConnectionModule_WebServiceFactory.create(connectionModuleParam));
    this.connectionHelperProvider = DoubleCheck.provider(ConnectionHelper_Factory.create(webServiceProvider, webServiceProvider));
    this.authRepositoryProvider = DoubleCheck.provider(AuthRepository_Factory.create(connectionHelperProvider, connectionHelperProvider));
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  @Override
  public void inject(BaseActivity tmpActivity) {
  }

  @Override
  public void inject(SplashFragment splashFragment) {
    injectSplashFragment(splashFragment);
  }

  @Override
  public void inject(LoginFragment loginFragment) {
    injectLoginFragment(loginFragment);
  }

  @Override
  public void inject(ForgetPasswordFragment forgetPasswordFragment) {
    injectForgetPasswordFragment(forgetPasswordFragment);
  }

  @Override
  public void inject(ConfirmCodeFragment confirmCodeFragment) {
    injectConfirmCodeFragment(confirmCodeFragment);
  }

  @Override
  public void inject(ChangePasswordFragment changePasswordFragment) {
    injectChangePasswordFragment(changePasswordFragment);
  }

  @Override
  public void inject(RegisterFragment registerFragment) {
    injectRegisterFragment(registerFragment);
  }

  @Override
  public void inject(RegisterStep2Fragment step2Fragment) {
    injectRegisterStep2Fragment(step2Fragment);
  }

  @Override
  public void inject(RegisterStep3Fragment step3Fragment) {
    injectRegisterStep3Fragment(step3Fragment);
  }

  @Override
  public void inject(RegisterStep4Fragment registerStep4Fragment) {
    injectRegisterStep4Fragment(registerStep4Fragment);
  }

  @Override
  public void inject(MapAddressActivity mapAddressActivity) {
    injectMapAddressActivity(mapAddressActivity);
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectLiveData(instance, getMutableLiveDataProvider.get());
    return instance;
  }

  private SplashViewModel injectSplashViewModel(SplashViewModel instance) {
    SplashViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private SplashFragment injectSplashFragment(SplashFragment instance) {
    SplashFragment_MembersInjector.injectViewModel(instance, splashViewModel());
    return instance;
  }

  private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
    LoginViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private LoginFragment injectLoginFragment(LoginFragment instance) {
    LoginFragment_MembersInjector.injectViewModel(instance, loginViewModel());
    return instance;
  }

  private ForgetPasswordViewModel injectForgetPasswordViewModel(ForgetPasswordViewModel instance) {
    ForgetPasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ForgetPasswordFragment injectForgetPasswordFragment(ForgetPasswordFragment instance) {
    ForgetPasswordFragment_MembersInjector.injectViewModel(instance, forgetPasswordViewModel());
    return instance;
  }

  private CodeViewModel injectCodeViewModel(CodeViewModel instance) {
    CodeViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ConfirmCodeFragment injectConfirmCodeFragment(ConfirmCodeFragment instance) {
    ConfirmCodeFragment_MembersInjector.injectViewModel(instance, codeViewModel());
    return instance;
  }

  private ChangePasswordViewModel injectChangePasswordViewModel(ChangePasswordViewModel instance) {
    ChangePasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ChangePasswordFragment injectChangePasswordFragment(ChangePasswordFragment instance) {
    ChangePasswordFragment_MembersInjector.injectViewModel(instance, changePasswordViewModel());
    return instance;
  }

  private RegisterViewModel injectRegisterViewModel(RegisterViewModel instance) {
    RegisterViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private RegisterFragment injectRegisterFragment(RegisterFragment instance) {
    RegisterFragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private RegisterStep2Fragment injectRegisterStep2Fragment(RegisterStep2Fragment instance) {
    RegisterStep2Fragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private RegisterStep3Fragment injectRegisterStep3Fragment(RegisterStep3Fragment instance) {
    RegisterStep3Fragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private RegisterStep4Fragment injectRegisterStep4Fragment(RegisterStep4Fragment instance) {
    RegisterStep4Fragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private MapAddressActivity injectMapAddressActivity(MapAddressActivity instance) {
    MapAddressActivity_MembersInjector.injectMapAddressViewModel(instance, new MapAddressViewModel());
    return instance;
  }

  private static final class Builder implements IApplicationComponent.Builder {
    @Override
    public IApplicationComponent build() {
      return new DaggerIApplicationComponent(new ConnectionModule(), new LiveData());
    }
  }
}
