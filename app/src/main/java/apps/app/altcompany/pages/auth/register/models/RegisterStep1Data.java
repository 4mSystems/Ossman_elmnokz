package apps.app.altcompany.pages.auth.register.models;

import com.google.gson.annotations.SerializedName;

public class RegisterStep1Data {
    @SerializedName("jwt")
    private String jwt;

    public String getJwt() {
        return jwt;
    }
}
