package te.app.ossman_elmonkz.pages.buying.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BrandModelsPartionMain {

    @SerializedName("partions")
    private List<BrandsModellsItem> partions;

    @SerializedName("brands_modells")
    private List<BrandsModellsItem> brandsModells;

    public List<BrandsModellsItem> getPartions() {
        return partions;
    }

    public List<BrandsModellsItem> getBrandsModells() {
        return brandsModells;
    }

    public void setBrandsModells(List<BrandsModellsItem> brandsModells) {
        this.brandsModells = brandsModells;
    }
}