package apps.app.altcompany.repository;


import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

import apps.app.altcompany.connection.ConnectionHelper;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.home.models.HomeResponse;
import apps.app.altcompany.pages.home.models.OrdersResponse;
import apps.app.altcompany.pages.home.models.orderDetails.OrderDetailsRequest;
import apps.app.altcompany.pages.home.models.orderDetails.OrderDetailsResponse;
import apps.app.altcompany.pages.offers.models.AddOfferRequest;
import apps.app.altcompany.pages.offers.models.OffersResponse;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class OrdersRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public OrdersRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable home() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME, new Object(), HomeResponse.class,
                Constants.HOME, true);
    }

    public Disposable myOrders(int orderId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.MY_ORDERS + "/" + orderId, new Object(), OrdersResponse.class,
                Constants.MY_ORDERS, true);
    }

    public Disposable orderDetails(int orderId) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ORDER_DETAILS, new OrderDetailsRequest(orderId), OrderDetailsResponse.class,
                Constants.ORDER_DETAILS, true);
    }

    public Disposable sendOffer(int orderId) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_OFFER, new OrderDetailsRequest(orderId), StatusMessage.class,
                Constants.SEND_OFFER, true);
    }

    public Disposable offers() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.OFFERS, new Object(), OffersResponse.class,
                Constants.OFFERS, true);
    }

    public Disposable removeOffer(int offerId) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REMOVE_OFFER, new AddOfferRequest(String.valueOf(offerId)), StatusMessage.class,
                Constants.REMOVE_OFFER, true);
    }

    public Disposable addOffer(ArrayList<FileObject> fileObjects) {
        return connectionHelper.requestApi(URLS.ADD_OFFER, new AddOfferRequest("1", "1"), fileObjects, StatusMessage.class,
                Constants.ADD_OFFER, true);
    }
}