package apps.app.altcompany.pages.auth.register.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.auth.register.models.categories.RelatedSubCategoriesItem;

public class SubCategoriesResponse extends StatusMessage {
    @SerializedName("data")
    private List<RelatedSubCategoriesItem> subCategoriesItems;

    public List<RelatedSubCategoriesItem> getSubCategoriesItems() {
        return subCategoriesItems;
    }
}
