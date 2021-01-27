
package apps.app.altcompany.pages.home.viewModels;

import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.home.adapters.HomeSliderAdapter;
import apps.app.altcompany.pages.home.adapters.OrdersAdapter;
import apps.app.altcompany.pages.home.models.HomeData;
import apps.app.altcompany.repository.OrdersRepository;
import io.reactivex.disposables.CompositeDisposable;

public class HomeViewModel extends BaseViewModel {
    @Inject
    OrdersRepository ordersRepository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OrdersAdapter ordersAdapter;
    private HomeSliderAdapter sliderAdapter;
    private HomeData homeData;

    @Inject
    public HomeViewModel(OrdersRepository ordersRepository) {
        homeData = new HomeData();
        this.ordersRepository = ordersRepository;
        this.liveData = new MutableLiveData<>();
        ordersRepository.setLiveData(liveData);
    }

    public void home() {
        compositeDisposable.add(ordersRepository.home());
    }

    @Bindable
    public OrdersAdapter getOrdersAdapter() {
        return this.ordersAdapter == null ? this.ordersAdapter = new OrdersAdapter() : this.ordersAdapter;
    }

    @Bindable
    public HomeSliderAdapter getSliderAdapter() {
        return this.sliderAdapter == null ? this.sliderAdapter = new HomeSliderAdapter() : this.sliderAdapter;
    }

    @Bindable
    public HomeData getHomeData() {
        return homeData;
    }

    @Bindable
    public void setHomeData(HomeData homeData) {
        getOrdersAdapter().update(homeData.getOrders());
        getSliderAdapter().updateData(homeData.getSlider());
        notifyChange(BR.homeData);
        this.homeData = homeData;
    }

    public void setupSlider(SliderView sliderView) {
        sliderView.setSliderAdapter(getSliderAdapter());
        sliderView.startAutoCycle();
    }

    public OrdersRepository getOrdersRepository() {
        return ordersRepository;
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
