package te.app.ossman_elmonkz.pages.home.viewModels;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.home.adapters.CategoriesAdapter;
import te.app.ossman_elmonkz.pages.home.adapters.HomeSliderAdapter;
import te.app.ossman_elmonkz.pages.home.models.HomeData;
import te.app.ossman_elmonkz.repository.HomeRepository;
import te.app.ossman_elmonkz.utils.Constants;

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

    public void toContact() {
        liveData.setValue(new Mutable(Constants.CONTACT));
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

    @BindingMethods({
            @BindingMethod(
                    type = BottomNavigationView.class,
                    attribute = "app:onNavigationItemSelected",
                    method = "setOnNavigationItemSelectedListener"
            ),
    })
    public class DataBindingAdapter {

    }

    private static final String TAG = "HomeViewModel";

    public boolean onNavigationClick(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuHome:
                liveData.setValue(new Mutable(Constants.MENU_HOME));
                return true;
            case R.id.menuProducts:
                liveData.setValue(new Mutable(Constants.MENU_PRODUCTS));
                return true;
             case R.id.menuMore:
                liveData.setValue(new Mutable(Constants.MENU_MORE));
                return true;

            default:
                return true;
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }
}
