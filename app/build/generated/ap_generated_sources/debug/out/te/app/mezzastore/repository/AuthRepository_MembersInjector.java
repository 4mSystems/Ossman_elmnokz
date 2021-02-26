// Generated by Dagger (https://dagger.dev).
package te.app.mezzastore.repository;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.mezzastore.connection.ConnectionHelper;

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

  @InjectedFieldSignature("te.app.mezzastore.repository.AuthRepository.connectionHelper")
  public static void injectConnectionHelper(AuthRepository instance,
      ConnectionHelper connectionHelper) {
    instance.connectionHelper = connectionHelper;
  }
}
