// Generated by Dagger (https://dagger.dev).
package te.app.ossman_elmonkz.pages.products.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.ossman_elmonkz.repository.SettingsRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductsViewModel_MembersInjector implements MembersInjector<ProductsViewModel> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  public ProductsViewModel_MembersInjector(
      Provider<SettingsRepository> settingsRepositoryProvider) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
  }

  public static MembersInjector<ProductsViewModel> create(
      Provider<SettingsRepository> settingsRepositoryProvider) {
    return new ProductsViewModel_MembersInjector(settingsRepositoryProvider);
  }

  @Override
  public void injectMembers(ProductsViewModel instance) {
    injectSettingsRepository(instance, settingsRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel.settingsRepository")
  public static void injectSettingsRepository(ProductsViewModel instance,
      SettingsRepository settingsRepository) {
    instance.settingsRepository = settingsRepository;
  }
}
