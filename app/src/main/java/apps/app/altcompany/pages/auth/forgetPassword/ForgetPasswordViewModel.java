package apps.app.altcompany.pages.auth.forgetPassword;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.models.ForgetPasswordRequest;
import apps.app.altcompany.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;

public class ForgetPasswordViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private ForgetPasswordRequest request;

    @Inject
    public ForgetPasswordViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new ForgetPasswordRequest();
    }

    public void sendCode() {
        if (getRequest().isValid()) {
            compositeDisposable.add(repository.forgetPassword(request));
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

    public ForgetPasswordRequest getRequest() {
        return request;
    }
}
