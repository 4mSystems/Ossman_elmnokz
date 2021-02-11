package apps.app.altcompany.pages.myWorks.models;

import com.google.gson.annotations.SerializedName;

public class AddOfferRequest {
    @SerializedName("offer_type")
    private String offer_type;
    @SerializedName("payment_status")
    private String payment_status;
    @SerializedName("offer_id")
    private String offer_id;

    public AddOfferRequest(String offer_type, String payment_status) {
        this.offer_type = offer_type;
        this.payment_status = payment_status;
    }

    public AddOfferRequest(String offer_id) {
        this.offer_id = offer_id;
    }

    public String getOffer_type() {
        return offer_type;
    }

    public void setOffer_type(String offer_type) {
        this.offer_type = offer_type;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }
}
