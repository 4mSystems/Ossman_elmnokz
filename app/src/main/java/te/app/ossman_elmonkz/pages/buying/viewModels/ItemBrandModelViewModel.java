package te.app.ossman_elmonkz.pages.buying.viewModels;


import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.utils.Constants;

public class ItemBrandModelViewModel extends BaseViewModel {
    public BrandsModellsItem brandsModellsItem;

    public ItemBrandModelViewModel(BrandsModellsItem brandsModellsItem) {
        this.brandsModellsItem = brandsModellsItem;
    }

    @Bindable
    public BrandsModellsItem getBrandsModellsItem() {
        return brandsModellsItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

    public void toProductDetails() {
        getLiveData().setValue(Constants.PRODUCT_DETAILS);
    }

}
