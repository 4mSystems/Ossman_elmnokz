package apps.app.altcompany.pages.splash.models;

import com.google.gson.annotations.SerializedName;

public class ReasonsItem {

    @SerializedName("id")
    private int id;

    @SerializedName("text")
    private String text;
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}