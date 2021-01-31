
package apps.app.altcompany.pages.myOrders.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.myOrders.adapters.MyOrdersAdapter;
import apps.app.altcompany.repository.OrdersRepository;
import io.reactivex.disposables.CompositeDisposable;

public class MyOrdersViewModel extends BaseViewModel {
    @Inject
    OrdersRepository ordersRepository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MyOrdersAdapter ordersAdapter;

    @Inject
    public MyOrdersViewModel(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
        this.liveData = new MutableLiveData<>();
        ordersRepository.setLiveData(liveData);
    }

    public void myOrders(int orderType) {
        compositeDisposable.add(ordersRepository.myOrders(orderType));
    }

    @Bindable
    public MyOrdersAdapter getOrdersAdapter() {
        return this.ordersAdapter == null ? this.ordersAdapter = new MyOrdersAdapter() : this.ordersAdapter;
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
