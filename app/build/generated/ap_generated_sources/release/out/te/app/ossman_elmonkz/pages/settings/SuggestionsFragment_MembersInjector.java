// Generated by Dagger (https://dagger.dev).
package te.app.ossman_elmonkz.pages.settings;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.ossman_elmonkz.pages.settings.viewModels.SettingsViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SuggestionsFragment_MembersInjector implements MembersInjector<SuggestionsFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public SuggestionsFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SuggestionsFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new SuggestionsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SuggestionsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.ossman_elmonkz.pages.settings.SuggestionsFragment.viewModel")
  public static void injectViewModel(SuggestionsFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
