// Generated by Dagger (https://dagger.dev).
package te.app.mezzastore.repository;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.mezzastore.connection.ConnectionHelper;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductRepository_Factory implements Factory<ProductRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  public ProductRepository_Factory(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
  }

  @Override
  public ProductRepository get() {
    ProductRepository instance = newInstance(connectionHelperProvider.get());
    ProductRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider2.get());
    return instance;
  }

  public static ProductRepository_Factory create(
      Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    return new ProductRepository_Factory(connectionHelperProvider, connectionHelperProvider2);
  }

  public static ProductRepository newInstance(ConnectionHelper connectionHelper) {
    return new ProductRepository(connectionHelper);
  }
}
