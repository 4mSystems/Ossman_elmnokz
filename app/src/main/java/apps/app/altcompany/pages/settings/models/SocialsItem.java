package apps.app.altcompany.pages.settings.models;

import com.google.gson.annotations.SerializedName;

public class SocialsItem{

	@SerializedName("social_image")
	private String socialImage;

	@SerializedName("social_link")
	private String socialLink;

	public String getSocialImage(){
		return socialImage;
	}

	public String getSocialLink(){
		return socialLink;
	}
}