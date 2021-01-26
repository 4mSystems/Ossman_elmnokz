package apps.app.altcompany.pages.home.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class HomeData {

    @SerializedName("slider")
    private List<String> slider;

    @SerializedName("popup")
    private String popup;

    @SerializedName("orders")
    private List<OrdersData> orders;

    public List<String> getSlider() {
        return slider;
    }

    public String getPopup() {
        return popup;
    }

    public List<OrdersData> getOrders() {
        return orders;
    }
}