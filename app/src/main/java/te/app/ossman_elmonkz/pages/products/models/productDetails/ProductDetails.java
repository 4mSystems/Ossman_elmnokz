package te.app.ossman_elmonkz.pages.products.models.productDetails;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ProductDetails {

	@SerializedName("product")
	private Product product;

	@SerializedName("related")
	private List<Product> related;

	public Product getProduct(){
		return product;
	}

	public List<Product> getRelated(){
		return related;
	}
}