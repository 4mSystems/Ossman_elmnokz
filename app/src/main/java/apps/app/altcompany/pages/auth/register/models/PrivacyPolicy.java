package apps.app.altcompany.pages.auth.register.models;

import com.google.gson.annotations.SerializedName;

public class PrivacyPolicy {

	@SerializedName("details")
	private String details;

	public String getDetails(){
		return details;
	}
}