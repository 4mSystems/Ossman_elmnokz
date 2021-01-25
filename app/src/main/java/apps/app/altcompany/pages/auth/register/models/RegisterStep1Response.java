package apps.app.altcompany.pages.auth.register.models;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class RegisterStep1Response extends StatusMessage {
    @SerializedName("data")
    private RegisterStep1Data registerStep1Data;

    public RegisterStep1Data getRegisterStep1Data() {
        return registerStep1Data;
    }
}
