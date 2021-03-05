package te.app.ossman_elmonkz.pages.subCategories.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.ossman_elmonkz.model.base.StatusMessage;
import te.app.ossman_elmonkz.pages.home.models.CategoriesItem;

public class SubCategoriesResponse extends StatusMessage {
    @SerializedName("data")
    private List<CategoriesItem> categoriesItemList;

    public List<CategoriesItem> getCategoriesItemList() {
        return categoriesItemList;
    }
}
