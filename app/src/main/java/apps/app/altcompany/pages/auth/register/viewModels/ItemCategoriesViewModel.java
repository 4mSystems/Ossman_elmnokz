package apps.app.altcompany.pages.auth.register.viewModels;

import android.util.Log;

import androidx.databinding.Bindable;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.pages.auth.register.models.categories.RelatedSubCategoriesItem;
import apps.app.altcompany.utils.Constants;


public class ItemCategoriesViewModel extends BaseViewModel {
    public RelatedSubCategoriesItem categoryData;

    public ItemCategoriesViewModel(RelatedSubCategoriesItem categoryData) {
        this.categoryData = categoryData;
    }

    @Bindable
    public RelatedSubCategoriesItem getCategoryData() {
        return categoryData;
    }

    public void itemAction() {
        Log.e("itemAction", "itemAction: "+categoryData.isChecked() );
        if (categoryData.isChecked()) {
            categoryData.setChecked(false);
            getLiveData().setValue(Constants.REMOVE_CAT);
        } else {
            categoryData.setChecked(false);
            getLiveData().setValue(Constants.ADD_CAT);
        }
    }
}
