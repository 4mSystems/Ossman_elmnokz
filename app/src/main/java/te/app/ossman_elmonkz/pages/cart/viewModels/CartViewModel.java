package te.app.ossman_elmonkz.pages.cart.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;
import te.app.ossman_elmonkz.pages.cart.adapters.CartAdapter;
import te.app.ossman_elmonkz.repository.CartRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class CartViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    CartRepository cartRepository;
    LiveData<String> cartTotal;
    LiveData<List<OrderRequest>> cartLiveData;
    CartAdapter cartAdapter;

    @Inject
    public CartViewModel() {
        this.liveData = new MutableLiveData<>();
        cartRepository = new CartRepository(MyApplication.getInstance());
        cartLiveData = cartRepository.getAllProducts();
//        cartTotal = cartRepository.getCartTotal();

    }

    public LiveData<List<OrderRequest>> getCartLiveData() {
        return cartLiveData;
    }

    public LiveData<String> getCartTotal() {
        return cartTotal;
    }

    @Bindable
    public CartAdapter getCartAdapter() {
        return this.cartAdapter == null ? this.cartAdapter = new CartAdapter() : this.cartAdapter;
    }

    public void toFinishOrder() {
        if (getCartAdapter().getItemCount() > 0)
            liveData.setValue(new Mutable(Constants.FINISH_ORDER));
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
