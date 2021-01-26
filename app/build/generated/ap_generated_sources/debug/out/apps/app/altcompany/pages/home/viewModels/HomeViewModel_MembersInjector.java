// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.pages.home.viewModels;

import apps.app.altcompany.repository.OrdersRepository;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_MembersInjector implements MembersInjector<HomeViewModel> {
  private final Provider<OrdersRepository> ordersRepositoryProvider;

  public HomeViewModel_MembersInjector(Provider<OrdersRepository> ordersRepositoryProvider) {
    this.ordersRepositoryProvider = ordersRepositoryProvider;
  }

  public static MembersInjector<HomeViewModel> create(
      Provider<OrdersRepository> ordersRepositoryProvider) {
    return new HomeViewModel_MembersInjector(ordersRepositoryProvider);
  }

  @Override
  public void injectMembers(HomeViewModel instance) {
    injectOrdersRepository(instance, ordersRepositoryProvider.get());
  }

  @InjectedFieldSignature("apps.app.altcompany.pages.home.viewModels.HomeViewModel.ordersRepository")
  public static void injectOrdersRepository(HomeViewModel instance,
      OrdersRepository ordersRepository) {
    instance.ordersRepository = ordersRepository;
  }
}
