package apps.app.altcompany.pages.offers.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class OffersResponse extends StatusMessage {

    @SerializedName("data")
    private List<OffersData> data;

    public List<OffersData> getData() {
        return data;
    }
}