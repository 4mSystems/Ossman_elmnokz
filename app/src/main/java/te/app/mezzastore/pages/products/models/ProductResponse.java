package te.app.mezzastore.pages.products.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.mezzastore.model.base.StatusMessage;
import te.app.mezzastore.pages.products.models.productDetails.Product;

public class ProductResponse extends StatusMessage {
    @SerializedName("data")
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }
}
