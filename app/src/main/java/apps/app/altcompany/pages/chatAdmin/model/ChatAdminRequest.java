package apps.app.altcompany.pages.chatAdmin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChatAdminRequest {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("order_id")
    @Expose
    private String order_id;

    public ChatAdminRequest() {
    }

    public ChatAdminRequest(String type) {
        this.type = type;
    }

    public ChatAdminRequest(String type, String order_id) {
        this.type = type;
        this.order_id = order_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
