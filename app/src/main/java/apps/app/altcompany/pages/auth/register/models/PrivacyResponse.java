package apps.app.altcompany.pages.auth.register.models;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class PrivacyResponse extends StatusMessage {
    @SerializedName("data")
    private PrivacyPolicy data;

    public PrivacyPolicy getData() {
        return data;
    }
}