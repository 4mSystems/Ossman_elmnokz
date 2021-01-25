package apps.app.altcompany.pages.auth.models;

import com.google.gson.annotations.SerializedName;

public class SocialRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("img")
    private String img;
    @SerializedName("firebase_token")
    private String firebase_token;
    @SerializedName("social_id")
    private String social_id;

    public SocialRequest(String name, String img, String firebase_token, String social_id) {
        this.name = name;
        this.img = img;
        this.firebase_token = firebase_token;
        this.social_id = social_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFirebase_token() {
        return firebase_token;
    }

    public void setFirebase_token(String firebase_token) {
        this.firebase_token = firebase_token;
    }

    public String getSocial_id() {
        return social_id;
    }

    public void setSocial_id(String social_id) {
        this.social_id = social_id;
    }
}
