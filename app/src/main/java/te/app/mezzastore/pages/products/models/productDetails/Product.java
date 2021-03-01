package te.app.mezzastore.pages.products.models.productDetails;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.List;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "product")
public class Product {
    @Ignore
    @SerializedName("date")
    private String date;
    @Ignore
    @SerializedName("images")
    private List<String> images;
    @Ignore
    @SerializedName("image")
    private String image;
    @SerializedName("main_image")
    private String main_image;

    @Ignore
    @SerializedName("description")
    private String description;

    @SerializedName("title")
    private String title;
    @Ignore
    @SerializedName("color")
    private String colors;
    @Ignore
    @SerializedName("brand_id")
    private int brandId;
    @Ignore
    @SerializedName("category_id")
    private int categoryId;

    @SerializedName("price")
    private String price;
    @Ignore
    @SerializedName("sub_category_id")
    private int subCategoryId;
    private int quantity;

    @SerializedName("id")
    @PrimaryKey
    private int id;

    @Ignore
    @SerializedName("favorite")
    private boolean favorite;
    @Ignore
    @SerializedName("brand")
    private Brand brand;

    public String getDate() {
        return date;
    }

    public List<String> getImages() {
        return images;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getColors() {
        return colors;
    }

    public int getBrandId() {
        return brandId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getPrice() {
        return price;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public int getId() {
        return id;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }
}