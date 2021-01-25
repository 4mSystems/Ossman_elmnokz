package apps.app.altcompany.pages.auth.changePassword;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.models.RegisterRequest;
import apps.app.altcompany.pages.auth.models.UserData;
import apps.app.altcompany.repository.AuthRepository;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.validation.Validate;
import io.reactivex.disposables.CompositeDisposable;

public class ChangePasswordViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private RegisterRequest request;

    @Inject
    public ChangePasswordViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
        userData = new UserData();
    }

    public void submit() {
        if (request.isPasswordsValid()) {
            if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword()))
                compositeDisposable.add(repository.updateProfile(getRequest(), null));
            else
                liveData.setValue(new Mutable(Constants.NOT_MATCH_PASSWORD));
        }
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

    public RegisterRequest getRequest() {
        return request;
    }

}
