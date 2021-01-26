package apps.app.altcompany.pages.home.models;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {

    @SerializedName("data")
    private HomeData data;

    public HomeData getData() {
        return data;
    }
}