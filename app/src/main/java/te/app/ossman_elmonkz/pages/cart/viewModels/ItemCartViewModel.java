package te.app.ossman_elmonkz.pages.cart.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;
import te.app.ossman_elmonkz.repository.CartRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class ItemCartViewModel extends BaseViewModel {
    public OrderRequest product;

    public ItemCartViewModel(OrderRequest menuModel) {
        this.product = menuModel;
    }

    @Bindable
    public OrderRequest getProduct() {
        return product;
    }

    public void minusItem() {
        if (!product.getQuantity().equals("1")) {
            product.setQuantity(String.valueOf(Integer.parseInt(product.getQuantity()) - 1));
            new CartRepository(MyApplication.getInstance()).update(product);
            getLiveData().setValue(Constants.MINUS);
        }
    }

    public void plusItem() {
        product.setQuantity(String.valueOf(Integer.parseInt(product.getQuantity()) + 1));
        new CartRepository(MyApplication.getInstance()).update(product);
        getLiveData().setValue(Constants.PLUS);
    }

    public void deleteItem() {
        new CartRepository(MyApplication.getInstance()).deleteItem(product.getId());
        getLiveData().setValue(Constants.REMOVE_FROM_CART);
    }

}
