package te.app.ossman_elmonkz.pages.buying.models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BrandsModellsItem {

    @SerializedName("image")
    private String image;

    @SerializedName("modells")
    private List<BrandsModellsItem> modells;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;
    @SerializedName("brand_id")
    @Expose
    private int brand_id;

    public String getImage() {
        return image;
    }

    public List<BrandsModellsItem> getModells() {
        return modells;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}