package apps.app.altcompany.pages.auth.models.cities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Cities implements Serializable {
    @SerializedName("cities_name")
    private String name;
    @SerializedName("cities_id")
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}