package te.app.mezzastore.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.mezzastore.base.BaseViewModel;
import te.app.mezzastore.pages.home.models.CategoriesItem;
import te.app.mezzastore.utils.Constants;

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
