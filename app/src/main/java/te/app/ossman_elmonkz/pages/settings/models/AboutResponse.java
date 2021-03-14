package te.app.ossman_elmonkz.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class AboutResponse extends StatusMessage {

    @SerializedName("data")
    private AboutMain data;

    public AboutMain getData() {
        return data;
    }

}