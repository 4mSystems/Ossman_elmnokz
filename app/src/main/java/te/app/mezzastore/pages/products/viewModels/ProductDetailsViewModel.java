package te.app.mezzastore.pages.products.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.mezzastore.BR;
import te.app.mezzastore.base.BaseViewModel;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.pages.products.adapters.OnBoardAdapter;
import te.app.mezzastore.pages.products.adapters.ProductsAdapter;
import te.app.mezzastore.pages.products.models.productDetails.ProductDetails;
import te.app.mezzastore.repository.CartRepository;
import te.app.mezzastore.repository.ProductRepository;
import te.app.mezzastore.utils.Constants;

public class ProductDetailsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    CartRepository cartRepository;
    @Inject
    ProductRepository productRepository;
    ProductDetails productDetails;
    OnBoardAdapter onBoardAdapter;
    ProductsAdapter productsAdapter;

    @Inject
    public ProductDetailsViewModel(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.liveData = new MutableLiveData<>();
        this.productRepository.setLiveData(liveData);
        productDetails = new ProductDetails();
        cartRepository = new CartRepository(MyApplication.getInstance());
    }

    public void productDetails() {
        compositeDisposable.add(productRepository.getProductDetails(getPassingObject().getId()));
    }

    public void addToCart() {
        getProductDetails().getProduct().setQuantity(1);
        getCartRepository().insert(getProductDetails().getProduct());
        liveData.setValue(new Mutable(Constants.ADD_TO_CART));
    }

    @Bindable
    public ProductDetails getProductDetails() {
        return productDetails;
    }

    @Bindable
    public void setProductDetails(ProductDetails productDetails) {
        getProductsAdapter().update(productDetails.getRelated());
        notifyChange(BR.productDetails);
        this.productDetails = productDetails;
    }

    @Bindable
    public OnBoardAdapter getOnBoardAdapter() {
        return this.onBoardAdapter == null ? this.onBoardAdapter = new OnBoardAdapter() : this.onBoardAdapter;
    }

    @Bindable
    public ProductsAdapter getProductsAdapter() {
        return this.productsAdapter == null ? this.productsAdapter = new ProductsAdapter() : this.productsAdapter;
    }

    public void setupSlider(SliderView sliderView) {
        getOnBoardAdapter().updateData(getProductDetails().getProduct().getImages());
        sliderView.setSliderAdapter(getOnBoardAdapter());
    }

    public CartRepository getCartRepository() {
        return cartRepository;
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
