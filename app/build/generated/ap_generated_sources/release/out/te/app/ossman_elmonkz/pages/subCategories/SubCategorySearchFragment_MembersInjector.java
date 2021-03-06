// Generated by Dagger (https://dagger.dev).
package te.app.ossman_elmonkz.pages.subCategories;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SubCategorySearchFragment_MembersInjector implements MembersInjector<SubCategorySearchFragment> {
  private final Provider<SubCategoriesSearchViewModel> viewModelProvider;

  public SubCategorySearchFragment_MembersInjector(
      Provider<SubCategoriesSearchViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SubCategorySearchFragment> create(
      Provider<SubCategoriesSearchViewModel> viewModelProvider) {
    return new SubCategorySearchFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SubCategorySearchFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.ossman_elmonkz.pages.subCategories.SubCategorySearchFragment.viewModel")
  public static void injectViewModel(SubCategorySearchFragment instance,
      SubCategoriesSearchViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
