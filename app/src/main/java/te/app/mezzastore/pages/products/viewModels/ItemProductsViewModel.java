package te.app.mezzastore.pages.products.viewModels;

import androidx.databinding.Bindable;

import te.app.mezzastore.base.BaseViewModel;
import te.app.mezzastore.pages.products.models.productDetails.Product;
import te.app.mezzastore.utils.Constants;

public class ItemProductsViewModel extends BaseViewModel {
    public Product product;

    public ItemProductsViewModel(Product menuModel) {
        this.product = menuModel;
    }

    @Bindable
    public Product getProduct() {
        return product;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
