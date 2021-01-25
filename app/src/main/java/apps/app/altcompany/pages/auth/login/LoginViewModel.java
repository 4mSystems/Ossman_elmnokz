package apps.app.altcompany.pages.auth.login;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.models.LoginRequest;
import apps.app.altcompany.pages.auth.models.SocialRequest;
import apps.app.altcompany.repository.AuthRepository;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;

public class LoginViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private LoginRequest loginRequest;

    @Inject
    public LoginViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        loginRequest = new LoginRequest();
    }

    public void register() {
        liveData.setValue(new Mutable(Constants.REGISTER));
    }

    private static final String TAG = "LoginViewModel";

    public void forgetPassword() {
        liveData.setValue(new Mutable(Constants.FORGET_PASSWORD));
    }

    public void toSignGoogle() {
        liveData.setValue(new Mutable(Constants.GOOGLE));
    }

    public void toSignFacebook() {
        liveData.setValue(new Mutable(Constants.FACEBOOK));
    }

    public void loginPhone() {
        getLoginRequest().setFirebase_token(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getLoginRequest().isValid()) {
            repository.login(loginRequest);
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void socialLogin(SocialRequest socialRequest) {
        compositeDisposable.add(repository.loginSocial(socialRequest));
    }

    public void toRegister() {
        liveData.setValue(new Mutable(Constants.REGISTER));
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

    public LoginRequest getLoginRequest() {
        return loginRequest;
    }
}
