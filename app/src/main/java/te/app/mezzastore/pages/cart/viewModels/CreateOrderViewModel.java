package te.app.mezzastore.pages.cart.viewModels;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.mezzastore.base.BaseViewModel;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.pages.cart.models.CreateOrder;
import te.app.mezzastore.repository.ProductRepository;

public class CreateOrderViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    CreateOrder createOrder;
    @Inject
    ProductRepository productRepository;

    @Inject
    public CreateOrderViewModel(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.liveData = new MutableLiveData<>();
        this.productRepository.setLiveData(liveData);
        createOrder = new CreateOrder();
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

    public ProductRepository getProductRepository() {
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
