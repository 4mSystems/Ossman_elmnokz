package te.app.ossman_elmonkz.pages.subCategories.models.search;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SearchData {

	@SerializedName("sub_category_id")
	private String subCategoryId;

	@SerializedName("id")
	private int id;

	@SerializedName("random_id")
	private String randomId;

	@SerializedName("equal_items")
	private List<EqualItemsItem> equalItems;

	public String getSubCategoryId(){
		return subCategoryId;
	}

	public int getId(){
		return id;
	}

	public String getRandomId(){
		return randomId;
	}

	public List<EqualItemsItem> getEqualItems(){
		return equalItems;
	}
}