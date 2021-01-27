package apps.app.altcompany.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

public class NotificationsData {

    @SerializedName("notifies_created_at")
    private String created_at;

    @SerializedName("notifies_text")
    private String title;
    @SerializedName("notifies_img")
    private String image;
    @SerializedName("notifies_id")
    private int id;

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }
}