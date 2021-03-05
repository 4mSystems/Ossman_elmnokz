package te.app.ossman_elmonkz.pages.gallery.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.products.models.productDetails.Product;
import te.app.ossman_elmonkz.utils.Constants;

public class ItemGalleryViewModel extends BaseViewModel {
    public Product product;

    public ItemGalleryViewModel(Product menuModel) {
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
