package apps.app.altcompany.pages.auth.changePassword;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class ChangePasswordRequest {
    @SerializedName("password")
    private String password;
    private String confirmPassword;
    public boolean isPasswordsValid() {
        return (!TextUtils.isEmpty(password) && !TextUtils.isEmpty(confirmPassword));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
