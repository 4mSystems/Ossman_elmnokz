package apps.app.altcompany.pages.auth.models;

import com.google.gson.annotations.SerializedName;

public class UserData {

    @SerializedName("workers_img")
    private String img;
 @SerializedName("workers_bussinessregister")
    private String workers_bussinessregister;
 @SerializedName("workers_desc")
    private String workers_desc;
@SerializedName("city")
    private String city;


    @SerializedName("workers_phone_number")
    private String phone;

    @SerializedName("jwt")
    private String jwt;


    @SerializedName("workers_username")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("type")
    private int type;

    @SerializedName("email")
    private String email;

    @SerializedName("city_id")
    private int cityId;
    @SerializedName("workers_points")
    private String workers_points;

    public String getImg() {
        return img;
    }

    public String getPhone() {
        return phone;
    }

    public String getJwt() {
        return jwt;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWorkers_bussinessregister() {
        return workers_bussinessregister;
    }

    public String getWorkers_desc() {
        return workers_desc;
    }

    public String getCity() {
        return city;
    }

    public String getWorkers_points() {
        return workers_points;
    }
}