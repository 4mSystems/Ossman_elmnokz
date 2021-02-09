package apps.app.altcompany.pages.auth.register.models.categories;

import com.google.gson.annotations.SerializedName;

public class RelatedSubCategoriesItem {

    @SerializedName("categories_id")
    private int subCategoriesId;

    @SerializedName("sub_categories_img")
    private String subCategoriesImg;

    @SerializedName("categories_name")
    private String subCategoriesName;
    private transient boolean checked = false;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public int getSubCategoriesId() {
        return subCategoriesId;
    }

    public String getSubCategoriesImg() {
        return subCategoriesImg;
    }

    public String getSubCategoriesName() {
        return subCategoriesName;
    }
}