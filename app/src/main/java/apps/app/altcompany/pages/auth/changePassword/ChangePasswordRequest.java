package apps.app.altcompany.pages.auth.changePassword;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class ChangePasswordRequest {
    @SerializedName("old_password")
    private String oldPassword;
    @SerializedName("new_password")
    private String newPassword;
    private transient String confirmPassword;

    public boolean isPasswordsValid() {
        return (!TextUtils.isEmpty(newPassword) && !TextUtils.isEmpty(confirmPassword));
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
