// Generated by Dagger (https://dagger.dev).
package te.app.ossman_elmonkz.pages.products.viewModels;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.ossman_elmonkz.repository.SettingsRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductsViewModel_Factory implements Factory<ProductsViewModel> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider2;

  public ProductsViewModel_Factory(Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider2) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.settingsRepositoryProvider2 = settingsRepositoryProvider2;
  }

  @Override
  public ProductsViewModel get() {
    ProductsViewModel instance = newInstance(settingsRepositoryProvider.get());
    ProductsViewModel_MembersInjector.injectSettingsRepository(instance, settingsRepositoryProvider2.get());
    return instance;
  }

  public static ProductsViewModel_Factory create(
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider2) {
    return new ProductsViewModel_Factory(settingsRepositoryProvider, settingsRepositoryProvider2);
  }

  public static ProductsViewModel newInstance(SettingsRepository settingsRepository) {
    return new ProductsViewModel(settingsRepository);
  }
}
