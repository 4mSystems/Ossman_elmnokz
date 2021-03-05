package te.app.ossman_elmonkz.pages.products.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.products.adapters.ProductsAdapter;
import te.app.ossman_elmonkz.repository.ProductRepository;

public class ProductsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ProductRepository productRepository;
    ProductsAdapter productsAdapter;

    @Inject
    public ProductsViewModel(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.liveData = new MutableLiveData<>();
        this.productRepository.setLiveData(liveData);
    }

    public void getProducts() {
        compositeDisposable.add(productRepository.getProducts(getPassingObject().getId()));
    }

    public void filter(int type) {
        compositeDisposable.add(productRepository.filter(type, getPassingObject().getId()));
    }

    @Bindable
    public ProductsAdapter getProductsAdapter() {
        return this.productsAdapter == null ? this.productsAdapter = new ProductsAdapter() : this.productsAdapter;
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
