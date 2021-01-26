package apps.app.altcompany.pages.home.models.orderDetails;

import com.google.gson.annotations.SerializedName;

public class OrderDetailsRequest {
    @SerializedName("order_id")
    private int orderId;

    public OrderDetailsRequest(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
