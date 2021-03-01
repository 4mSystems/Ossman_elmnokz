// Generated by Dagger (https://dagger.dev).
package te.app.mezzastore.pages.products;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.mezzastore.pages.products.viewModels.ProductsViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductsFragment_MembersInjector implements MembersInjector<ProductsFragment> {
  private final Provider<ProductsViewModel> viewModelProvider;

  public ProductsFragment_MembersInjector(Provider<ProductsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ProductsFragment> create(
      Provider<ProductsViewModel> viewModelProvider) {
    return new ProductsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ProductsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.mezzastore.pages.products.ProductsFragment.viewModel")
  public static void injectViewModel(ProductsFragment instance, ProductsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
