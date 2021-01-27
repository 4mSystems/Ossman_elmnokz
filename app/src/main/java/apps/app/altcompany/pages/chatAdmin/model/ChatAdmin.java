package apps.app.altcompany.pages.chatAdmin.model;

import com.google.gson.annotations.SerializedName;

public class ChatAdmin {

	@SerializedName("image")
	private String image;

	@SerializedName("sender_type")
	private int senderType;

	@SerializedName("message")
	private String message;

	public void setSenderType(int senderType) {
		this.senderType = senderType;
	}

	public String getImage(){
		return image;
	}

	public int getSenderType(){
		return senderType;
	}

	public String getMessage(){
		return message;
	}
}