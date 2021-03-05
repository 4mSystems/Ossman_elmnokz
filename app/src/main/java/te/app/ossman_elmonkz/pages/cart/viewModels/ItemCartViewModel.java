package te.app.ossman_elmonkz.pages.cart.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.pages.products.models.productDetails.Product;
import te.app.ossman_elmonkz.repository.CartRepository;
import te.app.ossman_elmonkz.utils.Constants;

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
