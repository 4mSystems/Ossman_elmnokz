
package apps.app.altcompany.pages.home.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.home.models.OrdersData;
import apps.app.altcompany.repository.OrdersRepository;
import apps.app.altcompany.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class OrderDetailsViewModel extends BaseViewModel {
    @Inject
    OrdersRepository ordersRepository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OrdersData ordersData;

    @Inject
    public OrderDetailsViewModel(OrdersRepository ordersRepository) {
        ordersData = new OrdersData();
        this.ordersRepository = ordersRepository;
        this.liveData = new MutableLiveData<>();
        ordersRepository.setLiveData(liveData);
    }

    public void orderDetails() {
        compositeDisposable.add(ordersRepository.orderDetails(getPassingObject().getId()));
    }

    public void sendOffer() {
        if (getPassingObject().getObject().equals("-1"))
            compositeDisposable.add(ordersRepository.sendOffer(getPassingObject().getId()));
        else
            liveData.setValue(new Mutable(Constants.CHAT));
    }

    public void toUserDetails() {
        liveData.setValue(new Mutable(Constants.USER_DETAILS));
    }

    public void toViewProduct() {
        if (!TextUtils.isEmpty(getOrdersData().getOrders_img()))
            liveData.setValue(new Mutable(Constants.VIEW_IMAGE));
        else
            liveData.setValue(new Mutable(Constants.VIEW_VIDEO));
    }

    @Bindable
    public OrdersData getOrdersData() {
        return ordersData;
    }

    @Bindable
    public void setOrdersData(OrdersData ordersData) {
        notifyChange(BR.ordersData);
        this.ordersData = ordersData;
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
