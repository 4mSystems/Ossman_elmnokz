package apps.app.altcompany.pages.chatAdmin.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class ChatAdminResponse extends StatusMessage {

	@SerializedName("data")
	private List<ChatAdmin> data;

	public List<ChatAdmin> getData(){
		return data;
	}
}