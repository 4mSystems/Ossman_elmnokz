package te.app.ossman_elmonkz.pages.subCategories.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.subCategories.models.search.EqualItemsItem;

public class ItemSearchViewModel extends BaseViewModel {
    public EqualItemsItem searchItem;

    public ItemSearchViewModel(EqualItemsItem searchItem) {
        this.searchItem = searchItem;
    }

    @Bindable
    public EqualItemsItem getSearchItem() {
        return searchItem;
    }

}
