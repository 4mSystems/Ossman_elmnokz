package te.app.ossman_elmonkz.pages.home.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoriesItem {

    @SerializedName("image")
    private String image;

    @SerializedName("id")
    private int id;
    @SerializedName("category_id")
    private int category_id;

    @SerializedName("name")
    private String title;
    @SerializedName("sub_categories")
    private List<CategoriesItem> subCategoriesItems;

    public String getImage() {
        return image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<CategoriesItem> getSubCategoriesItems() {
        return subCategoriesItems;
    }

    public int getCategory_id() {
        return category_id;
    }
}