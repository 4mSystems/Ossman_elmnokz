package apps.app.altcompany.pages.settings.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ContactData {

    @SerializedName("phone")
    private String phone;

    @SerializedName("socials")
    private List<SocialsItem> socials;

    public String getPhone() {
        return phone;
    }

    public List<SocialsItem> getSocials() {
        return socials;
    }
}