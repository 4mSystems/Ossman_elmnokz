package te.app.ossman_elmonkz.pages.products.models.productDetails;

import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class ProductDetailsResponse extends StatusMessage {
    @SerializedName("data")
    private ProductDetails data;

    public ProductDetails getData() {
        return data;
    }

}