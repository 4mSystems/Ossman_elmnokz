package te.app.ossman_elmonkz.pages.settings.viewModels;

import androidx.lifecycle.MutableLiveData;


import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.settings.models.ContactRequest;
import te.app.ossman_elmonkz.repository.SettingsRepository;

public class SettingsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    ContactRequest contactRequest;

    @Inject
    public SettingsViewModel(SettingsRepository repository) {
        contactRequest = new ContactRequest();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void sendContact() {
        if (getContactRequest().isValid())
            compositeDisposable.add(repository.sendContact(getContactRequest()));
    }

    public ContactRequest getContactRequest() {
        return contactRequest;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public SettingsRepository getRepository() {
        return repository;
    }

}
