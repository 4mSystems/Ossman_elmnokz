package te.app.ossman_elmonkz.pages.buying.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class ProductSearchResponse extends StatusMessage {
    @SerializedName("data")
    private List<BrandsModellsItem> modellsItemList;

    public List<BrandsModellsItem> getModellsItemList() {
        return modellsItemList;
    }
}
