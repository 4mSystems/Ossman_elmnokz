package apps.app.altcompany.pages.auth.confirmCode;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.models.ConfirmCodeRequest;
import apps.app.altcompany.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;

public class CodeViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ConfirmCodeRequest request;

    @Inject
    public CodeViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new ConfirmCodeRequest();
    }

    public void confirmCode() {
        getRequest().setPhone(getPassingObject().getObject());
        if (request.isValid()) {
            compositeDisposable.add(repository.confirmCode(request));
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

    public ConfirmCodeRequest getRequest() {
        return request;
    }
}
