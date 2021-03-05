package te.app.ossman_elmonkz.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.ossman_elmonkz.connection.ConnectionHelper;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.model.base.StatusMessage;
import te.app.ossman_elmonkz.pages.cart.models.CreateOrder;
import te.app.ossman_elmonkz.pages.products.models.ProductResponse;
import te.app.ossman_elmonkz.pages.products.models.productDetails.ProductDetailsResponse;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.URLS;

@Singleton
public class ProductRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public ProductRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getProducts(int catId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.PRODUCTS + catId+" /ar/v1", new Object(), ProductResponse.class,
                Constants.PRODUCTS_RESPONSE, true);
    }

    public Disposable filter(int type, int catId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.FILTER + catId + "&type=" + type, new Object(), ProductResponse.class,
                Constants.PRODUCTS_RESPONSE, true);
    }

    public Disposable getProductDetails(int productId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.PRODUCT_DETAILS + productId + "/ar/v1", new Object(), ProductDetailsResponse.class,
                Constants.Product_DETAILS, true);
    }

    public Disposable sendOrder(CreateOrder createOrder) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_ORDER, createOrder, StatusMessage.class,
                Constants.SEND_ORDER, true);
    }

}