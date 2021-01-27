package apps.app.altcompany.pages.notifications.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.notifications.NotificationsAdapter;
import apps.app.altcompany.repository.SettingsRepository;
import io.reactivex.disposables.CompositeDisposable;

public class NotificationsViewModels extends BaseViewModel {
    private NotificationsAdapter notificationsAdapter;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository settingsRepository;
    public MutableLiveData<Mutable> liveData;

    @Inject
    public NotificationsViewModels(SettingsRepository settingsRepository) {
        this.settingsRepository = settingsRepository;
        this.liveData = new MutableLiveData<>();
        settingsRepository.setLiveData(liveData);
    }

    public void notifications() {
        compositeDisposable.add(settingsRepository.getNotifications());
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public SettingsRepository getSettingsRepository() {
        return settingsRepository;
    }

    @Bindable
    public NotificationsAdapter getNotificationsAdapter() {
        return this.notificationsAdapter == null ? this.notificationsAdapter = new NotificationsAdapter() : this.notificationsAdapter;
    }
}
