package te.app.ossman_elmonkz.pages.subCategories.models.search;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SubCategorySearchMain {
    @SerializedName("equals")
    private List<EqualItemsItem> searchData;
    @SerializedName("desc")
    private String desc;

    public List<EqualItemsItem> getSearchData() {
        return searchData;
    }

    public String getDesc() {
        return desc;
    }
}
