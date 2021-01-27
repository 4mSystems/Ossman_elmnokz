package apps.app.altcompany.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import apps.app.altcompany.model.base.StatusMessage;

public class NotificationsResponse extends StatusMessage {
    @SerializedName("data")
    private List<NotificationsData> data;

    public void setData(List<NotificationsData> data) {
        this.data = data;
    }

    public List<NotificationsData> getData() {
        return data;
    }

}