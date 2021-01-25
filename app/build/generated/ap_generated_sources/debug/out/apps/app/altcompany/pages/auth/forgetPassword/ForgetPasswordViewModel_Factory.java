// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.pages.auth.forgetPassword;

import apps.app.altcompany.repository.AuthRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ForgetPasswordViewModel_Factory implements Factory<ForgetPasswordViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public ForgetPasswordViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public ForgetPasswordViewModel get() {
    ForgetPasswordViewModel instance = newInstance(repositoryProvider.get());
    ForgetPasswordViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static ForgetPasswordViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new ForgetPasswordViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static ForgetPasswordViewModel newInstance(AuthRepository repository) {
    return new ForgetPasswordViewModel(repository);
  }
}
