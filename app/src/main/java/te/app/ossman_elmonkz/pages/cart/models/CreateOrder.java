package te.app.ossman_elmonkz.pages.cart.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;

public class CreateOrder {
    @SerializedName("product")
    private List<OrderRequest> productList;
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("address")
    private String address;
    @SerializedName("notes")
    private String notes;
    @SerializedName("device_id")
    private String device_id;


    public CreateOrder() {
    }

    public CreateOrder(List<OrderRequest> productList) {
        this.productList = productList;
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(phone) && !TextUtils.isEmpty(address));
    }

    public List<OrderRequest> getProductList() {
        return productList;
    }

    public void setProductList(List<OrderRequest> productList) {
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }
}
