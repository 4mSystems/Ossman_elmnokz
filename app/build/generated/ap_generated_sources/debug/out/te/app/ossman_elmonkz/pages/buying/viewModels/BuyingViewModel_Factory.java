// Generated by Dagger (https://dagger.dev).
package te.app.ossman_elmonkz.pages.buying.viewModels;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.ossman_elmonkz.repository.BuyingRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BuyingViewModel_Factory implements Factory<BuyingViewModel> {
  private final Provider<BuyingRepository> buyingRepositoryProvider;

  private final Provider<BuyingRepository> buyingRepositoryProvider2;

  public BuyingViewModel_Factory(Provider<BuyingRepository> buyingRepositoryProvider,
      Provider<BuyingRepository> buyingRepositoryProvider2) {
    this.buyingRepositoryProvider = buyingRepositoryProvider;
    this.buyingRepositoryProvider2 = buyingRepositoryProvider2;
  }

  @Override
  public BuyingViewModel get() {
    BuyingViewModel instance = newInstance(buyingRepositoryProvider.get());
    BuyingViewModel_MembersInjector.injectBuyingRepository(instance, buyingRepositoryProvider2.get());
    return instance;
  }

  public static BuyingViewModel_Factory create(Provider<BuyingRepository> buyingRepositoryProvider,
      Provider<BuyingRepository> buyingRepositoryProvider2) {
    return new BuyingViewModel_Factory(buyingRepositoryProvider, buyingRepositoryProvider2);
  }

  public static BuyingViewModel newInstance(BuyingRepository buyingRepository) {
    return new BuyingViewModel(buyingRepository);
  }
}
