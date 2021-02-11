package apps.app.altcompany.pages.myWorks.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import apps.app.altcompany.model.base.StatusMessage;

public class OffersResponse extends StatusMessage {

    @SerializedName("data")
    private List<OffersData> data;

    public List<OffersData> getData() {
        return data;
    }
}