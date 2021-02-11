package apps.app.altcompany.pages.home.models.orderDetails;

import com.google.gson.annotations.SerializedName;

public class OrderDetailsRequest {
    @SerializedName("order_id")
    private int orderId;
    @SerializedName("offer_desc")
    private String offer_desc;

    public OrderDetailsRequest(int orderId) {
        this.orderId = orderId;
    }

    public OrderDetailsRequest() {
    }

    public String getOffer_desc() {
        return offer_desc;
    }

    public void setOffer_desc(String offer_desc) {
        this.offer_desc = offer_desc;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
