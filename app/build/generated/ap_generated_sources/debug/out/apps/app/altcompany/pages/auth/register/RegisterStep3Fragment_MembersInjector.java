// Generated by Dagger (https://dagger.dev).
package apps.app.altcompany.pages.auth.register;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegisterStep3Fragment_MembersInjector implements MembersInjector<RegisterStep3Fragment> {
  private final Provider<RegisterViewModel> viewModelProvider;

  public RegisterStep3Fragment_MembersInjector(Provider<RegisterViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<RegisterStep3Fragment> create(
      Provider<RegisterViewModel> viewModelProvider) {
    return new RegisterStep3Fragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(RegisterStep3Fragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("apps.app.altcompany.pages.auth.register.RegisterStep3Fragment.viewModel")
  public static void injectViewModel(RegisterStep3Fragment instance, RegisterViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
