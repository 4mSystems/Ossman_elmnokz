package te.app.ossman_elmonkz.pages.buying.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.repository.BuyingRepository;

public class ProductDetailsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    BrandsModellsItem productDetails;

    @Inject
    public ProductDetailsViewModel(BuyingRepository buyingRepository) {
        this.liveData = new MutableLiveData<>();
        productDetails = new BrandsModellsItem();
    }

    @Bindable
    public BrandsModellsItem getProductDetails() {
        return productDetails;
    }

    @Bindable
    public void setProductDetails(BrandsModellsItem productDetails) {
        notifyChange(BR.productDetails);
        this.productDetails = productDetails;
    }
}
