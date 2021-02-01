
package apps.app.altcompany.pages.settings.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.register.models.PrivacyPolicy;
import apps.app.altcompany.pages.settings.adapters.ContactUsAdapter;
import apps.app.altcompany.pages.settings.models.ContactResponse;
import apps.app.altcompany.pages.settings.models.SuggestionsRequest;
import apps.app.altcompany.repository.SettingsRepository;
import apps.app.altcompany.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class SettingsViewModel extends BaseViewModel {
    @Inject
    SettingsRepository repository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private PrivacyPolicy privacyData;
    SuggestionsRequest suggestionsRequest;
    ContactResponse contactResponse;
    ContactUsAdapter contactUsAdapter;

    @Inject
    public SettingsViewModel(SettingsRepository repository) {
        suggestionsRequest = new SuggestionsRequest();
        this.repository = repository;
        privacyData = new PrivacyPolicy();
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        contactResponse = new ContactResponse();
    }

    public void privacy() {
        compositeDisposable.add(repository.getPrivacy());
    }

    public void about() {
        compositeDisposable.add(repository.getAbout());
    }

    public void contact() {
        compositeDisposable.add(repository.getContact());
    }

    public void suggestionSubmit() {
        if (getSuggestionsRequest().isValid())
            compositeDisposable.add(repository.sendSuggest(getSuggestionsRequest()));
    }

    public void phoneSubmit() {
        liveData.setValue(new Mutable(Constants.PHONE));
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

    @Bindable
    public ContactUsAdapter getContactUsAdapter() {
        return this.contactUsAdapter == null ? this.contactUsAdapter = new ContactUsAdapter() : this.contactUsAdapter;
    }

    @Bindable
    public ContactResponse getContactResponse() {
        return contactResponse;
    }

    @Bindable
    public void setContactResponse(ContactResponse contactResponse) {
        getContactUsAdapter().update(contactResponse.getData().getSocials());
        notifyChange(BR.contactUsAdapter);
        notifyChange(BR.contactResponse);
        this.contactResponse = contactResponse;
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
