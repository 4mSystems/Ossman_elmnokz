// Generated by Dagger (https://dagger.dev).
package te.app.ossman_elmonkz.pages.gallery.viewModels;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.ossman_elmonkz.repository.SettingsRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GalleryViewModel_Factory implements Factory<GalleryViewModel> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider2;

  public GalleryViewModel_Factory(Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider2) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.settingsRepositoryProvider2 = settingsRepositoryProvider2;
  }

  @Override
  public GalleryViewModel get() {
    GalleryViewModel instance = newInstance(settingsRepositoryProvider.get());
    GalleryViewModel_MembersInjector.injectSettingsRepository(instance, settingsRepositoryProvider2.get());
    return instance;
  }

  public static GalleryViewModel_Factory create(
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider2) {
    return new GalleryViewModel_Factory(settingsRepositoryProvider, settingsRepositoryProvider2);
  }

  public static GalleryViewModel newInstance(SettingsRepository settingsRepository) {
    return new GalleryViewModel(settingsRepository);
  }
}
