package te.app.ossman_elmonkz.pages.subCategories.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.ossman_elmonkz.model.base.StatusMessage;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;

public class MatchesResponse extends StatusMessage {
    @SerializedName("data")
    private List<BrandsModellsItem> brandsModellsItem;

    public List<BrandsModellsItem> getBrandsModellsItem() {
        return brandsModellsItem;
    }
}
