package te.app.mezzastore.pages.products.models.productDetails;

import com.google.gson.annotations.SerializedName;

import te.app.mezzastore.model.base.StatusMessage;

public class ProductDetailsResponse extends StatusMessage {
    @SerializedName("data")
    private ProductDetails data;

    public ProductDetails getData() {
        return data;
    }

}