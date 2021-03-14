package te.app.ossman_elmonkz.pages.splash;

import android.os.Handler;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.onBoard.OnBoardAdapter;
import te.app.ossman_elmonkz.repository.HomeRepository;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;


public class SplashViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository repository;
    OnBoardAdapter onBoardAdapter;

    @Inject
    public SplashViewModel(HomeRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void splashStart() {
        new Handler().postDelayed(() -> liveData.setValue(new Mutable(Constants.HOME)), 3000);
    }

    public HomeRepository getRepository() {
        return repository;
    }

    public void getSlider() {
        compositeDisposable.add(repository.getBoard());
    }

    public void setupSlider(SliderView sliderView) {
        sliderView.setSliderAdapter(onBoardAdapter);
    }

    public void toNext() {
        liveData.setValue(new Mutable(Constants.NEXT));
    }

    @Bindable
    public OnBoardAdapter getOnBoardAdapter() {
        return this.onBoardAdapter == null ? this.onBoardAdapter = new OnBoardAdapter() : this.onBoardAdapter;
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

}
