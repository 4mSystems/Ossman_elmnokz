package apps.app.altcompany.pages.auth.models.cities;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class CitiesResponse extends StatusMessage {

    @SerializedName("data")
    private List<Cities> citiesList;

    public List<Cities> getCitiesList() {
        return citiesList;
    }

}