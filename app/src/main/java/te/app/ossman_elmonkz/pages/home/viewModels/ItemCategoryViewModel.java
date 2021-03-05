package te.app.ossman_elmonkz.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.home.models.CategoriesItem;
import te.app.ossman_elmonkz.utils.Constants;

public class ItemCategoryViewModel extends BaseViewModel {
    public CategoriesItem categoriesItem;

    public ItemCategoryViewModel(CategoriesItem categoriesItem) {
        this.categoriesItem = categoriesItem;
    }

    @Bindable
    public CategoriesItem getCategoriesItem() {
        return categoriesItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
