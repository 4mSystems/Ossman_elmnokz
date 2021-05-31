package te.app.ossman_elmonkz.pages.subCategories.models.search;

import com.google.gson.annotations.SerializedName;


import te.app.ossman_elmonkz.model.base.StatusMessage;

public class SubCategorySearchResponse extends StatusMessage {
    @SerializedName("data")
    private SubCategorySearchMain categorySearchMain;

    public SubCategorySearchMain getCategorySearchMain() {
        return categorySearchMain;
    }
}
