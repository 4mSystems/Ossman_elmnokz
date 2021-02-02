package apps.app.altcompany.pages.auth.models.countries;

import com.google.gson.annotations.SerializedName;

public class Countries {

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
}