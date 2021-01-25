// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.repository;

import apps.app.altcompany.connection.ConnectionHelper;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthRepository_MembersInjector implements MembersInjector<AuthRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  public AuthRepository_MembersInjector(Provider<ConnectionHelper> connectionHelperProvider) {
    this.connectionHelperProvider = connectionHelperProvider;
  }

  public static MembersInjector<AuthRepository> create(
      Provider<ConnectionHelper> connectionHelperProvider) {
    return new AuthRepository_MembersInjector(connectionHelperProvider);
  }

  @Override
  public void injectMembers(AuthRepository instance) {
    injectConnectionHelper(instance, connectionHelperProvider.get());
  }

  @InjectedFieldSignature("apps.app.altcompany.repository.AuthRepository.connectionHelper")
  public static void injectConnectionHelper(AuthRepository instance,
      ConnectionHelper connectionHelper) {
    instance.connectionHelper = connectionHelper;
  }
}
