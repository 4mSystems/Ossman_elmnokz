package apps.app.altcompany.pages.splash;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.repository.AuthRepository;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;


public class SplashViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;

    @Inject
    public SplashViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void splashStart() {
        Thread splashThread = new Thread() {
            public void run() {
                try {
                    int waited = 0;
                    while (waited <= 3000) {
                        waited += 100;
                        sleep(100);
                    }
                    if (UserHelper.getInstance(MyApplication.getInstance()).getUserData() != null)
                        liveData.postValue(new Mutable(Constants.HOME));
                    else
                        liveData.postValue(new Mutable(Constants.LOGIN));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashThread.start();
    }

    public AuthRepository getRepository() {
        return repository;
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

    public void toLogin() {
        liveData.setValue(new Mutable(Constants.START_APP));
    }
}
