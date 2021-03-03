// Generated by Dagger (https://dagger.dev).
package te.app.mezzastore.repository;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.mezzastore.connection.ConnectionHelper;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeRepository_Factory implements Factory<HomeRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  public HomeRepository_Factory(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
  }

  @Override
  public HomeRepository get() {
    HomeRepository instance = newInstance(connectionHelperProvider.get());
    HomeRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider2.get());
    return instance;
  }

  public static HomeRepository_Factory create(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    return new HomeRepository_Factory(connectionHelperProvider, connectionHelperProvider2);
  }

  public static HomeRepository newInstance(ConnectionHelper connectionHelper) {
    return new HomeRepository(connectionHelper);
  }
}
