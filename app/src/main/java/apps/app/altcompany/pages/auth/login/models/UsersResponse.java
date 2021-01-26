package apps.app.altcompany.pages.auth.login.models;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class UsersResponse extends StatusMessage {
	@SerializedName("data")
	private UserData data;

	public UserData getData(){
		return data;
	}
}