package apps.app.altcompany.pages.home.models;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.pages.auth.login.models.UserData;

public class OrdersData {

    @SerializedName("orders_id")
    private int ordersId;

    @SerializedName("orders_time")
    private String ordersTime;

    @SerializedName("type")
    private String mediaType;

    @SerializedName("orders_date")
    private String ordersDate;

    @SerializedName("orders_status")
    private int ordersStatus;

    @SerializedName("orders_img")
    private String orders_img;
    @SerializedName("orders_video")
    private String orders_video;

    @SerializedName("orders_desc")
    private String ordersDesc;
    @SerializedName("user")
    private UserDetails user;

    public int getOrdersId() {
        return ordersId;
    }

    public String getOrdersTime() {
        return ordersTime;
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getOrdersDate() {
        return ordersDate;
    }

    public int getOrdersStatus() {
        return ordersStatus;
    }

    public String getOrders_img() {
        return orders_img;
    }

    public String getOrders_video() {
        return orders_video;
    }

    public String getOrdersDesc() {
        return ordersDesc;
    }

    public UserDetails getUser() {
        return user;
    }
}