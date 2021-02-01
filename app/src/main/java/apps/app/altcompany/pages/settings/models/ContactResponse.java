package apps.app.altcompany.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class ContactResponse extends StatusMessage {
	@SerializedName("data")
	private ContactData data;
	public ContactData getData(){
		return data;
	}
}