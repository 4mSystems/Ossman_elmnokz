
package apps.app.altcompany.pages.home.viewModels;

import android.text.TextUtils;
import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.home.models.OrdersData;
import apps.app.altcompany.pages.home.models.orderDetails.OrderDetailsRequest;
import apps.app.altcompany.repository.OrdersRepository;
import apps.app.altcompany.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class OrderDetailsViewModel extends BaseViewModel {
    @Inject
    OrdersRepository ordersRepository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OrdersData ordersData;
    OrderDetailsRequest orderDetailsRequest;

    @Inject
    public OrderDetailsViewModel(OrdersRepository ordersRepository) {
        orderDetailsRequest = new OrderDetailsRequest();
        ordersData = new OrdersData();
        this.ordersRepository = ordersRepository;
        this.liveData = new MutableLiveData<>();
        ordersRepository.setLiveData(liveData);
    }

    public void orderDetails() {
        compositeDisposable.add(ordersRepository.orderDetails(getPassingObject().getId()));
    }

    public void sendOffer() {
        if (getPassingObject().getObject().equals("-1")) {
            getOrderDetailsRequest().setOrderId(getPassingObject().getId());
            if (!TextUtils.isEmpty(getOrderDetailsRequest().getOffer_desc()))
                compositeDisposable.add(ordersRepository.sendOffer(getOrderDetailsRequest()));
        } else
            liveData.setValue(new Mutable(Constants.CHAT));
    }

    public void toUserDetails() {
        liveData.setValue(new Mutable(Constants.USER_DETAILS));
    }

    public void toLocation() {
        liveData.setValue(new Mutable(Constants.CURRENT_LOCATION));
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

    public OrderDetailsRequest getOrderDetailsRequest() {
        return orderDetailsRequest;
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
