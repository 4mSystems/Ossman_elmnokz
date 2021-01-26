package apps.app.altcompany.pages.auth.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.validation.Validate;

public class ForgetPasswordRequest {
    @SerializedName("workers_phone_number")
    @Expose
    private String phone;
    public transient ObservableField<String> phoneError = new ObservableField<>();

    public ForgetPasswordRequest() {
    }

    public ForgetPasswordRequest(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(phone, Constants.PHONE)) {
            phoneError.set(Validate.error);
            valid = false;
        }
        return valid;
    }
}
