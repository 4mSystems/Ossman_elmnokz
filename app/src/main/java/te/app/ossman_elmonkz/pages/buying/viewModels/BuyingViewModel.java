package te.app.ossman_elmonkz.pages.buying.viewModels;


import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.buying.adapter.ProductColorAdapter;
import te.app.ossman_elmonkz.pages.buying.models.BrandModelsPartionMain;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.pages.buying.models.DataFromSearchRequest;
import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;
import te.app.ossman_elmonkz.repository.BuyingRepository;
import te.app.ossman_elmonkz.repository.CartRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class BuyingViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    BuyingRepository buyingRepository;
    BrandModelsPartionMain brandModelsPartionMain;
    OrderRequest orderRequest;
    BrandsModellsItem modellsItem;
    CartRepository cartRepository;
    public DataFromSearchRequest dataFromSearchRequest;
    ProductColorAdapter productColorAdapter;
    public ObservableField<String> colorCode = new ObservableField<>();
    public ObservableField<String> colorName = new ObservableField<>();

    @Inject
    public BuyingViewModel(BuyingRepository buyingRepository) {
        dataFromSearchRequest = new DataFromSearchRequest();
        orderRequest = new OrderRequest();
        modellsItem = new BrandsModellsItem();
        brandModelsPartionMain = new BrandModelsPartionMain();
        this.liveData = new MutableLiveData<>();
        this.buyingRepository = buyingRepository;
        this.buyingRepository.setLiveData(this.liveData);
        cartRepository = new CartRepository(MyApplication.getInstance());
    }

    //    getPassingObject().getObject() Sub cat id
    public void getBrandModel() {
        compositeDisposable.add(buyingRepository.getBrandModelPartion(Integer.parseInt(getPassingObject().getObject())));
    }

    public void addToCart() {
        if (getPassingObject().getObject().equals(Constants.INTERNAL_ACCESSORIES) || getPassingObject().getObject().equals(Constants.EXTERNAL_ACCESSORIES)) {
            if (getOrderRequest().isAllValid()) {
                if (getOrderRequest().isHasColor()) {
                    if (!TextUtils.isEmpty(getOrderRequest().getProductColorName())) {
                        getCartRepository().insert(getOrderRequest());
                        liveData.setValue(new Mutable(Constants.ADD_TO_CART));
                    } else
                        liveData.setValue(new Mutable(Constants.COLOR_WARNING));
                } else {
                    getCartRepository().insert(getOrderRequest());
                    liveData.setValue(new Mutable(Constants.ADD_TO_CART));
                }
            }
        } else {
            if (getOrderRequest().isValid()) {
                if (getOrderRequest().isHasColor()) {
                    if (!TextUtils.isEmpty(getOrderRequest().getProductColorName())) {
                        getCartRepository().insert(getOrderRequest());
                        liveData.setValue(new Mutable(Constants.ADD_TO_CART));
                    } else
                        liveData.setValue(new Mutable(Constants.COLOR_WARNING));
                } else {
                    getCartRepository().insert(getOrderRequest());
                    liveData.setValue(new Mutable(Constants.ADD_TO_CART));
                }
            }
        }

    }

    public void toPart() {
        if (getBrandModelsPartionMain().getBrandsModells() != null)
            liveData.setValue(new Mutable(Constants.SELECT_PART));
    }

    public void toBrand() {
        if (getBrandModelsPartionMain().getBrandsModells() != null)
            liveData.setValue(new Mutable(Constants.SELECT_BRAND));
    }


    public void toModel() {
        if (getOrderRequest().getBrandName() != null) {
            dataFromSearchRequest.setBrand_id(getOrderRequest().getBrandId());
            dataFromSearchRequest.setCategory_id(String.valueOf(getPassingObject().getId()));
            dataFromSearchRequest.setSub_category_id(String.valueOf(getPassingObject().getObject()));
            liveData.setValue(new Mutable(Constants.SELECT_MODELS));
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void toProducts() {
        if (getOrderRequest().getModelName() != null) {
            dataFromSearchRequest.setBrand_id(null);
            dataFromSearchRequest.setModell_id(getOrderRequest().getModelId());
            dataFromSearchRequest.setCategory_id(String.valueOf(getPassingObject().getId()));
            dataFromSearchRequest.setSub_category_id(String.valueOf(getPassingObject().getObject()));
            if (getPassingObject().getObject().equals(Constants.INTERNAL_ACCESSORIES) || getPassingObject().getObject().equals(Constants.EXTERNAL_ACCESSORIES))
                dataFromSearchRequest.setPartion_id(getOrderRequest().getPartId());
            liveData.setValue(new Mutable(Constants.SELECT_PRODUCT));
        } else
            liveData.setValue(new Mutable(Constants.MODEL_WARNING));
    }

    @Bindable
    public BrandModelsPartionMain getBrandModelsPartionMain() {
        return brandModelsPartionMain;
    }

    @Bindable
    public void setBrandModelsPartionMain(BrandModelsPartionMain brandModelsPartionMain) {
        notifyChange(BR.brandModelsPartionMain);
        this.brandModelsPartionMain = brandModelsPartionMain;
    }

    @Bindable
    public ProductColorAdapter getProductColorAdapter() {
        return this.productColorAdapter == null ? this.productColorAdapter = new ProductColorAdapter() : this.productColorAdapter;
    }

    public BrandsModellsItem getModellsItem() {
        return modellsItem;
    }

    public void setModellsItem(BrandsModellsItem modellsItem) {
        this.modellsItem = modellsItem;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public BuyingRepository getBuyingRepository() {
        return buyingRepository;
    }

    public CartRepository getCartRepository() {
        return cartRepository;
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
