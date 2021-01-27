// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.pages.myOrders;

import apps.app.altcompany.pages.myOrders.viewModels.MyOrdersViewModel;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyOrdersFragment_MembersInjector implements MembersInjector<MyOrdersFragment> {
  private final Provider<MyOrdersViewModel> viewModelProvider;

  public MyOrdersFragment_MembersInjector(Provider<MyOrdersViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MyOrdersFragment> create(
      Provider<MyOrdersViewModel> viewModelProvider) {
    return new MyOrdersFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MyOrdersFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("apps.app.altcompany.pages.myOrders.MyOrdersFragment.viewModel")
  public static void injectViewModel(MyOrdersFragment instance, MyOrdersViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
