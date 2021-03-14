package te.app.ossman_elmonkz.pages.more.viewModels;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.repository.SettingsRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class MoreViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;

    @Inject
    public MoreViewModel(SettingsRepository marketRepository) {
        this.repository = marketRepository;
        this.liveData = new MutableLiveData<>();
        marketRepository.setLiveData(liveData);
    }


    public void toAbout() {
        liveData.setValue(new Mutable(Constants.ABOUT));
    }


    public void toTerms() {
        liveData.setValue(new Mutable(Constants.TERMS));
    }

    public void toAgents() {
        liveData.setValue(new Mutable(Constants.AGENTS));
    }

    public void toClients() {
        liveData.setValue(new Mutable(Constants.CLIENTS));
    }

    public void toContact() {
        liveData.setValue(new Mutable(Constants.CONTACT));
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
