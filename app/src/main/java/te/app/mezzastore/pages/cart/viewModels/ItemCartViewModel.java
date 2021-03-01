package te.app.mezzastore.pages.cart.viewModels;

import android.util.Log;

import androidx.databinding.Bindable;

import te.app.mezzastore.base.BaseViewModel;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.pages.products.models.productDetails.Product;
import te.app.mezzastore.repository.CartRepository;
import te.app.mezzastore.utils.Constants;

public class ItemCartViewModel extends BaseViewModel {
    public Product product;

    public ItemCartViewModel(Product menuModel) {
        this.product = menuModel;
    }

    @Bindable
    public Product getProduct() {
        return product;
    }

    public void minusItem() {
        product.setQuantity(product.getQuantity() - 1);
        new CartRepository(MyApplication.getInstance()).update(product);
        getLiveData().setValue(Constants.MINUS);
    }

    public void plusItem() {
        product.setQuantity(product.getQuantity() + 1);
        new CartRepository(MyApplication.getInstance()).update(product);
        getLiveData().setValue(Constants.PLUS);
    }
    public void deleteItem() {
        new CartRepository(MyApplication.getInstance()).deleteItem(product.getId());
        getLiveData().setValue(Constants.REMOVE_FROM_CART);
    }

}
