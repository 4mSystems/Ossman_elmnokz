package apps.app.altcompany.pages.home.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class OrdersResponse extends StatusMessage {

    @SerializedName("data")
    private List<OrdersData> data;

    public List<OrdersData> getData() {
        return data;
    }
}