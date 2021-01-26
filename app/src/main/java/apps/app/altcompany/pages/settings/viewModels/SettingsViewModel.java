
package apps.app.altcompany.pages.settings.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.register.models.PrivacyPolicy;
import apps.app.altcompany.pages.settings.models.SuggestionsRequest;
import apps.app.altcompany.repository.SettingsRepository;
import io.reactivex.disposables.CompositeDisposable;

public class SettingsViewModel extends BaseViewModel {
    @Inject
    SettingsRepository repository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private PrivacyPolicy privacyData;
    SuggestionsRequest suggestionsRequest;

    @Inject
    public SettingsViewModel(SettingsRepository repository) {
        suggestionsRequest = new SuggestionsRequest();
        this.repository = repository;
        privacyData = new PrivacyPolicy();
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void privacy() {
        compositeDisposable.add(repository.getPrivacy());
    }

    public void about() {
        compositeDisposable.add(repository.getAbout());
    }

    public void suggestionSubmit() {
        if (getSuggestionsRequest().isValid())
            compositeDisposable.add(repository.sendSuggest(getSuggestionsRequest()));
    }

    public SettingsRepository getRepository() {
        return repository;
    }

    @Bindable
    public PrivacyPolicy getPrivacyData() {
        return privacyData;
    }

    @Bindable
    public void setPrivacyData(PrivacyPolicy privacyData) {
        notifyChange(BR.privacyData);
        this.privacyData = privacyData;
    }

    public SuggestionsRequest getSuggestionsRequest() {
        return suggestionsRequest;
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
}
