// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.pages.offers.viewModels;

import apps.app.altcompany.repository.OrdersRepository;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OffersViewModel_MembersInjector implements MembersInjector<OffersViewModel> {
  private final Provider<OrdersRepository> ordersRepositoryProvider;

  public OffersViewModel_MembersInjector(Provider<OrdersRepository> ordersRepositoryProvider) {
    this.ordersRepositoryProvider = ordersRepositoryProvider;
  }

  public static MembersInjector<OffersViewModel> create(
      Provider<OrdersRepository> ordersRepositoryProvider) {
    return new OffersViewModel_MembersInjector(ordersRepositoryProvider);
  }

  @Override
  public void injectMembers(OffersViewModel instance) {
    injectOrdersRepository(instance, ordersRepositoryProvider.get());
  }

  @InjectedFieldSignature("apps.app.altcompany.pages.offers.viewModels.OffersViewModel.ordersRepository")
  public static void injectOrdersRepository(OffersViewModel instance,
      OrdersRepository ordersRepository) {
    instance.ordersRepository = ordersRepository;
  }
}
