package te.app.ossman_elmonkz.pages.products.models.productDetails;

import com.google.gson.annotations.SerializedName;

public class Brand{

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}
}