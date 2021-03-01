package te.app.mezzastore.pages.cart.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.mezzastore.base.BaseViewModel;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.pages.cart.adapters.CartAdapter;
import te.app.mezzastore.pages.products.models.productDetails.Product;
import te.app.mezzastore.repository.CartRepository;

public class CartViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    CartRepository cartRepository;
    LiveData<String> cartTotal;
    LiveData<List<Product>> cartLiveData;
    CartAdapter cartAdapter;

    @Inject
    public CartViewModel() {
        this.liveData = new MutableLiveData<>();
        cartRepository = new CartRepository(MyApplication.getInstance());
        cartLiveData = cartRepository.getAllProducts();
        cartTotal = cartRepository.getCartTotal();

    }

    public LiveData<List<Product>> getCartLiveData() {
        return cartLiveData;
    }

    public LiveData<String> getCartTotal() {
        return cartTotal;
    }

    @Bindable
    public CartAdapter getCartAdapter() {
        return this.cartAdapter == null ? this.cartAdapter = new CartAdapter() : this.cartAdapter;
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
