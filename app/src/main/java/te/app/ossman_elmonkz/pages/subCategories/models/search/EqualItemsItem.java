package te.app.ossman_elmonkz.pages.subCategories.models.search;

import com.google.gson.annotations.SerializedName;

public class EqualItemsItem{

	@SerializedName("equal_id")
	private String equalId;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public String getEqualId(){
		return equalId;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
}