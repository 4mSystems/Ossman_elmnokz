package te.app.ossman_elmonkz.repository;


import android.util.Log;

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
import te.app.ossman_elmonkz.pages.subCategories.models.search.SearchResponse;
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

    public Disposable getBrandModelPartion() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BRAND_MODEL_PARTION, new Object(), BrandModelsPartionResponse.class,
                Constants.BRAND_MODEL_RESPONSE, true);
    }

    public Disposable getModelsFromSearch(DataFromSearchRequest dataFromSearchRequest) {
        Log.e("getModelsFromSearch", "getModelsFromSearch: "+dataFromSearchRequest.getBrand_id());
        if (dataFromSearchRequest.getBrand_id() == null)
            return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SEARCH + dataFromSearchRequest.getCategory_id()
                            + "&sub_category_id=" + dataFromSearchRequest.getSub_category_id()
                            + "&modell_id=" + dataFromSearchRequest.getModell_id()
                            + "&partion_id=" + dataFromSearchRequest.getPartion_id()
                    , new Object(), ProductSearchResponse.class,
                    Constants.SEARCH, true);
        else
            return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SEARCH + dataFromSearchRequest.getCategory_id()
                            + "&brand_id=" + dataFromSearchRequest.getBrand_id()
                    , new Object(), ProductSearchResponse.class,
                    Constants.SEARCH, true);

    }

    public Disposable sendOrder(CreateOrder createOrder) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_ORDER, createOrder, StatusMessage.class,
                Constants.SEND_ORDER, true);
    }

}