package apps.app.altcompany.pages.auth.register.models.categories;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DepartmentsItem {

	@SerializedName("related_sub_categories")
	private List<RelatedSubCategoriesItem> relatedSubCategories;

	@SerializedName("categories_name")
	private String categoriesName;

	@SerializedName("categories_id")
	private int categoriesId;

	@SerializedName("categories_img")
	private String categoriesImg;

	public List<RelatedSubCategoriesItem> getRelatedSubCategories(){
		return relatedSubCategories;
	}

	public String getCategoriesName(){
		return categoriesName;
	}

	public int getCategoriesId(){
		return categoriesId;
	}

	public String getCategoriesImg(){
		return categoriesImg;
	}
}