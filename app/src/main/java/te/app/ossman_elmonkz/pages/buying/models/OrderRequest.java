package te.app.ossman_elmonkz.pages.buying.models;

import android.text.TextUtils;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.Random;

@Entity(tableName = "order")
public class OrderRequest {
    private String partName;
    @SerializedName("part_id")
    private String partId;
    private String brandName;
    private String brandId;
    private String modelName;
    private String productName;
    @SerializedName("product_id")
    private String product_id;
    private String modelId;
    @SerializedName("quantity")
    private String quantity = "1";
    @PrimaryKey
    private int id = new Random().nextInt(61);

    public boolean isAllValid() {
        return (!TextUtils.isEmpty(partName) && !TextUtils.isEmpty(brandName) && !TextUtils.isEmpty(modelName) && !TextUtils.isEmpty(productName));
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(brandName) && !TextUtils.isEmpty(modelName) && !TextUtils.isEmpty(productName));
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
