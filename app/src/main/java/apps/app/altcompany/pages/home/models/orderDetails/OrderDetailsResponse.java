package apps.app.altcompany.pages.home.models.orderDetails;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.home.models.OrdersData;

public class OrderDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private OrdersData data;

    public OrdersData getData() {
        return data;
    }
}