package te.app.mezzastore.pages.home.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class HomeData {

	@SerializedName("slider_ads")
	private List<SliderAdsItem> sliderAds;

	@SerializedName("categories")
	private List<CategoriesItem> categories;

	public List<SliderAdsItem> getSliderAds(){
		return sliderAds;
	}

	public List<CategoriesItem> getCategories(){
		return categories;
	}
}