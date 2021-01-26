package apps.app.altcompany.pages.auth.models;


import android.util.Log;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.validation.Validate;

public class LoginRequest {
    @SerializedName("loginkey")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("firebase_token")
    @Expose
    private String firebase_token;
    public transient ObservableField<String> emailError = new ObservableField<>();
    public transient ObservableField<String> passwordError = new ObservableField<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirebase_token() {
        return firebase_token;
    }

    public void setFirebase_token(String firebase_token) {
        this.firebase_token = firebase_token;
    }

    private static final String TAG = "LoginRequest";

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(email, Constants.FIELD)) {
            emailError.set(Validate.error);
            valid = false;
        }
        if (!Validate.isValid(password)) {
            passwordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }
}
