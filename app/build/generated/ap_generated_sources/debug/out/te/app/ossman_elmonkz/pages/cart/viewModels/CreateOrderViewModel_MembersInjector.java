// Generated by Dagger (https://dagger.dev).
package te.app.ossman_elmonkz.pages.cart.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.ossman_elmonkz.repository.BuyingRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CreateOrderViewModel_MembersInjector implements MembersInjector<CreateOrderViewModel> {
  private final Provider<BuyingRepository> productRepositoryProvider;

  public CreateOrderViewModel_MembersInjector(
      Provider<BuyingRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  public static MembersInjector<CreateOrderViewModel> create(
      Provider<BuyingRepository> productRepositoryProvider) {
    return new CreateOrderViewModel_MembersInjector(productRepositoryProvider);
  }

  @Override
  public void injectMembers(CreateOrderViewModel instance) {
    injectProductRepository(instance, productRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel.productRepository")
  public static void injectProductRepository(CreateOrderViewModel instance,
      BuyingRepository productRepository) {
    instance.productRepository = productRepository;
  }
}
