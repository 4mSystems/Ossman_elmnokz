// Generated by Dagger (https://dagger.dev).
package te.app.ossman_elmonkz.pages.buying.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.ossman_elmonkz.repository.BuyingRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BuyingViewModel_MembersInjector implements MembersInjector<BuyingViewModel> {
  private final Provider<BuyingRepository> buyingRepositoryProvider;

  public BuyingViewModel_MembersInjector(Provider<BuyingRepository> buyingRepositoryProvider) {
    this.buyingRepositoryProvider = buyingRepositoryProvider;
  }

  public static MembersInjector<BuyingViewModel> create(
      Provider<BuyingRepository> buyingRepositoryProvider) {
    return new BuyingViewModel_MembersInjector(buyingRepositoryProvider);
  }

  @Override
  public void injectMembers(BuyingViewModel instance) {
    injectBuyingRepository(instance, buyingRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel.buyingRepository")
  public static void injectBuyingRepository(BuyingViewModel instance,
      BuyingRepository buyingRepository) {
    instance.buyingRepository = buyingRepository;
  }
}
