package te.app.mezzastore.pages.home.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.mezzastore.BR;
import te.app.mezzastore.base.BaseViewModel;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.pages.home.adapters.CategoriesAdapter;
import te.app.mezzastore.pages.home.adapters.HomeSliderAdapter;
import te.app.mezzastore.pages.home.models.HomeData;
import te.app.mezzastore.repository.HomeRepository;
import te.app.mezzastore.utils.Constants;

public class HomeViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    HomeData homeData;
    @Inject
    HomeRepository homeRepository;
    CategoriesAdapter categoriesAdapter;
    HomeSliderAdapter homeSliderAdapter;

    @Inject
    public HomeViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void homeData() {
        compositeDisposable.add(homeRepository.getHomeData());
    }

    public void toCart() {
        liveData.setValue(new Mutable(Constants.CART));
    }

    @Bindable
    public HomeData getHomeData() {
        return homeData;
    }

    public void setupSlider(SliderView sliderView) {
        getHomeSliderAdapter().updateData(getHomeData().getSliderAds());
        sliderView.setSliderAdapter(getHomeSliderAdapter());
    }

    @Bindable
    public void setHomeData(HomeData homeData) {
        getCategoriesAdapter().update(homeData.getCategories());
        notifyChange(BR.homeData);
        this.homeData = homeData;
    }

    @Bindable
    public CategoriesAdapter getCategoriesAdapter() {
        return this.categoriesAdapter == null ? this.categoriesAdapter = new CategoriesAdapter() : this.categoriesAdapter;
    }

    @Bindable
    public HomeSliderAdapter getHomeSliderAdapter() {
        return this.homeSliderAdapter == null ? this.homeSliderAdapter = new HomeSliderAdapter() : this.homeSliderAdapter;
    }

    public HomeRepository getHomeRepository() {
        return homeRepository;
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
