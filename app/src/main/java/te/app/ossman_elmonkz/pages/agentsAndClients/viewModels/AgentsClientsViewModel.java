package te.app.ossman_elmonkz.pages.agentsAndClients.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.model.govs.GovsData;
import te.app.ossman_elmonkz.pages.agentsAndClients.adapters.AgentsAdapter;
import te.app.ossman_elmonkz.pages.agentsAndClients.adapters.ClientsAdapter;
import te.app.ossman_elmonkz.pages.settings.models.ContactRequest;
import te.app.ossman_elmonkz.repository.SettingsRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class AgentsClientsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    AgentsAdapter agentsAdapter;
    ClientsAdapter clientsAdapter;
    public List<GovsData> govsDataList;

    @Inject
    public AgentsClientsViewModel(SettingsRepository repository) {
        govsDataList = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getAgents() {
        compositeDisposable.add(repository.getAgents());
    }

    public void getClients(int govId) {
        compositeDisposable.add(repository.getClients(govId));
    }

    public void getGovs() {
        compositeDisposable.add(repository.getGovs());
    }

    public void showGovs() {
        liveData.setValue(new Mutable(Constants.SHOW_GOVS));
    }

    @Bindable
    public AgentsAdapter getAgentsAdapter() {
        return this.agentsAdapter == null ? this.agentsAdapter = new AgentsAdapter() : this.agentsAdapter;
    }

    @Bindable
    public ClientsAdapter getClientsAdapter() {
        return this.clientsAdapter == null ? this.clientsAdapter = new ClientsAdapter() : this.clientsAdapter;
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
