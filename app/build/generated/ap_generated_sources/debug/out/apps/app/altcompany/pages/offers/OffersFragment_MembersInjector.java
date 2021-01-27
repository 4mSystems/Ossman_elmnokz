// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.pages.offers;

import apps.app.altcompany.pages.offers.viewModels.OffersViewModel;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OffersFragment_MembersInjector implements MembersInjector<OffersFragment> {
  private final Provider<OffersViewModel> viewModelProvider;

  public OffersFragment_MembersInjector(Provider<OffersViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<OffersFragment> create(
      Provider<OffersViewModel> viewModelProvider) {
    return new OffersFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(OffersFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("apps.app.altcompany.pages.offers.OffersFragment.viewModel")
  public static void injectViewModel(OffersFragment instance, OffersViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
