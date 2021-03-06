package te.app.ossman_elmonkz.pages.buying.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BrandsModellsItem {

    @SerializedName("image")
    private String image;

    @SerializedName("price")
    private String price;
    @SerializedName("description")
    private String description;
    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;
    @SerializedName("brand_id")
    @Expose
    private int brand_id;
    @SerializedName("product_colors")
    private List<ProductColors> productColors;

    public List<ProductColors> getProductColors() {
        return productColors;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}