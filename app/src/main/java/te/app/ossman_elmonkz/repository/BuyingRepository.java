package te.app.ossman_elmonkz.repository;



import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.ossman_elmonkz.connection.ConnectionHelper;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.model.base.StatusMessage;
import te.app.ossman_elmonkz.pages.buying.models.BrandModelsPartionResponse;
import te.app.ossman_elmonkz.pages.buying.models.DataFromSearchRequest;
import te.app.ossman_elmonkz.pages.buying.models.ProductSearchResponse;
import te.app.ossman_elmonkz.pages.cart.models.CreateOrder;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.URLS;

@Singleton
public class BuyingRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public BuyingRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getBrandModelPartion(int subId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BRAND_MODEL_PARTION + "?sub_category_id=" + subId, new Object(), BrandModelsPartionResponse.class,
                Constants.BRAND_MODEL_RESPONSE, true);
    }

    public Disposable getModelsFromSearch(DataFromSearchRequest dataFromSearchRequest) {
        if (dataFromSearchRequest.getBrand_id() == null) //for products
            return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SEARCH + dataFromSearchRequest.getCategory_id()
                            + "&sub_category_id=" + dataFromSearchRequest.getSub_category_id()
                            + "&modell_id=" + dataFromSearchRequest.getModell_id()
                            + "&partion_id=" + dataFromSearchRequest.getPartion_id()
                    , new Object(), ProductSearchResponse.class,
                    Constants.SEARCH, true);
        else // for modells
            return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SEARCH + dataFromSearchRequest.getCategory_id()
                            + "&brand_id=" + dataFromSearchRequest.getBrand_id()
                            + "&partion_id=" + dataFromSearchRequest.getPartion_id()
                            + "&sub_category_id=" + dataFromSearchRequest.getSub_category_id()
                    , new Object(), ProductSearchResponse.class,
                    Constants.SEARCH, true);

    }

    public Disposable sendOrder(CreateOrder createOrder) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_ORDER, createOrder, StatusMessage.class,
                Constants.SEND_ORDER, true);
    }

}