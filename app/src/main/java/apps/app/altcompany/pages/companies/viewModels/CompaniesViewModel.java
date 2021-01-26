
package apps.app.altcompany.pages.companies.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.login.models.UserData;
import apps.app.altcompany.pages.auth.models.RegisterRequest;
import apps.app.altcompany.repository.AuthRepository;
import apps.app.altcompany.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class CompaniesViewModel extends BaseViewModel {
    @Inject
    AuthRepository repository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private UserData companyProfile;
    RegisterRequest registerRequest;
    ArrayList<FileObject> fileObjectList;

    @Inject
    public CompaniesViewModel(AuthRepository repository) {
        registerRequest = new RegisterRequest();
        fileObjectList = new ArrayList<>();
        companyProfile = new UserData();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void companyProfile() {
        compositeDisposable.add(repository.companyProfile());
    }

    public void updateProfile() {
        getRegisterRequest().setName(getCompanyProfile().getWorkersUsername());
        getRegisterRequest().setEmail(getCompanyProfile().getEmail());
        getRegisterRequest().setPhone(getCompanyProfile().getWorkersPhoneNumber());
        getRegisterRequest().setWorkers_desc(getCompanyProfile().getWorkersDesc());
        compositeDisposable.add(repository.updateProfile(getRegisterRequest(), getFileObjectList()));
    }

    public void address() {
        liveData.setValue(new Mutable(Constants.CURRENT_LOCATION));
    }

    public void toUpdateCategories() {
        liveData.setValue(new Mutable(Constants.CATEGORIES));
    }

    public void imageSubmit() {
        liveData.setValue(new Mutable(Constants.IMAGE));
    }

    public RegisterRequest getRegisterRequest() {
        return registerRequest;
    }

    public ArrayList<FileObject> getFileObjectList() {
        return fileObjectList;
    }

    @Bindable
    public UserData getCompanyProfile() {
        return companyProfile;
    }

    @Bindable
    public void setCompanyProfile(UserData companyProfile) {
        notifyChange(BR.companyProfile);
        this.companyProfile = companyProfile;
    }

    public AuthRepository getRepository() {
        return repository;
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
