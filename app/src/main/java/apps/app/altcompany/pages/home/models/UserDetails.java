package apps.app.altcompany.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class UserDetails {
    @SerializedName("users_id")
    private int users_id;
    @SerializedName("users_username")
    private String users_username;
    @SerializedName("email")
    private String email;
    @SerializedName("users_lat")
    private String users_lat;
    @SerializedName("users_lang")
    private String users_lang;
    @SerializedName("users_address")
    private String users_address;
    @SerializedName("users_phone_number")
    private String users_phone_number;
    @SerializedName("users_img")
    private String users_img;

    public int getUsers_id() {
        return users_id;
    }

    public String getUsers_username() {
        return users_username;
    }

    public String getEmail() {
        return email;
    }

    public String getUsers_lat() {
        return users_lat;
    }

    public String getUsers_lang() {
        return users_lang;
    }

    public String getUsers_address() {
        return users_address;
    }

    public String getUsers_phone_number() {
        return users_phone_number;
    }

    public String getUsers_img() {
        return users_img;
    }
}
