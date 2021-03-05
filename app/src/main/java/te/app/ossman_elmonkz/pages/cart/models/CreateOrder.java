package te.app.ossman_elmonkz.pages.cart.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.ossman_elmonkz.pages.products.models.productDetails.Product;

public class CreateOrder {
    @SerializedName("data")
    private List<Product> productList;
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("address")
    private String address;
    @SerializedName("notes")
    private String notes;


    public CreateOrder() {
    }

    public CreateOrder(List<Product> productList) {
        this.productList = productList;
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(phone) && !TextUtils.isEmpty(address));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
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
}
