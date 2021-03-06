package te.app.ossman_elmonkz.pages.subCategories.models.search;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class SearchResponse extends StatusMessage {
    @SerializedName("data")
    private List<EqualItemsItem> data;

    public List<EqualItemsItem> getData() {
        return data;
    }

}