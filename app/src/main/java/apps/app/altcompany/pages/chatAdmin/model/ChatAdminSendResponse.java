package apps.app.altcompany.pages.chatAdmin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class ChatAdminSendResponse extends StatusMessage {

    @SerializedName("data")
    @Expose
    private ChatAdmin data;

    public ChatAdmin getData() {
        return data;
    }
}
