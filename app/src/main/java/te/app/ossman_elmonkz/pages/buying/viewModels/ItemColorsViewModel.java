package te.app.ossman_elmonkz.pages.buying.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.buying.models.ProductColors;
import te.app.ossman_elmonkz.utils.Constants;

public class ItemColorsViewModel extends BaseViewModel {
    public ProductColors productColor;

    public ItemColorsViewModel(ProductColors productColor) {
        this.productColor = productColor;
    }

    @Bindable
    public ProductColors getProductColor() {
        return productColor;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }



}
