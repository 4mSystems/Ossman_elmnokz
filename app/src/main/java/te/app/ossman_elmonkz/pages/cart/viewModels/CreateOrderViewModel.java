package te.app.ossman_elmonkz.pages.cart.viewModels;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.model.govs.GovsData;
import te.app.ossman_elmonkz.pages.cart.models.CreateOrder;
import te.app.ossman_elmonkz.repository.BuyingRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class CreateOrderViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    CreateOrder createOrder;
    @Inject
    BuyingRepository productRepository;
    public List<GovsData> govsDataList;

    @Inject
    public CreateOrderViewModel(BuyingRepository productRepository) {
        govsDataList = new ArrayList<>();
        this.productRepository = productRepository;
        this.liveData = new MutableLiveData<>();
        this.productRepository.setLiveData(liveData);
        createOrder = new CreateOrder();
    }

    public void getGovs() {
        compositeDisposable.add(getProductRepository().getGovs());
    }

    public void sendOrder() {
        if (getCreateOrder().isValid())
            compositeDisposable.add(productRepository.sendOrder(getCreateOrder()));
    }

    public CreateOrder getCreateOrder() {
        return createOrder;
    }

    public void setCreateOrder(CreateOrder createOrder) {
        this.createOrder = createOrder;
    }

    public void showGovs() {
        liveData.setValue(new Mutable(Constants.SHOW_GOVS));
    }

    public BuyingRepository getProductRepository() {
        return productRepository;
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
