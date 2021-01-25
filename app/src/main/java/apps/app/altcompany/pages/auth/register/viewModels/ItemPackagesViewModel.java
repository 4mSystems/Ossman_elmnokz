package apps.app.altcompany.pages.auth.register.viewModels;

import androidx.databinding.Bindable;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.pages.auth.register.models.categories.RelatedSubCategoriesItem;
import apps.app.altcompany.pages.auth.register.models.packages.PackagesData;
import apps.app.altcompany.utils.Constants;


public class ItemPackagesViewModel extends BaseViewModel {
    public PackagesData packagesData;

    public ItemPackagesViewModel(PackagesData packagesData) {
        this.packagesData = packagesData;
    }

    @Bindable
    public PackagesData getPackagesData() {
        return packagesData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.ADD_CAT);
    }
}
