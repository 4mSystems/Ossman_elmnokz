// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.pages.auth.confirmCode;

import apps.app.altcompany.repository.AuthRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CodeViewModel_Factory implements Factory<CodeViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public CodeViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public CodeViewModel get() {
    CodeViewModel instance = newInstance(repositoryProvider.get());
    CodeViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static CodeViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new CodeViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static CodeViewModel newInstance(AuthRepository repository) {
    return new CodeViewModel(repository);
  }
}
