package apps.app.altcompany.pages.companies;

import com.google.gson.annotations.SerializedName;

public class CompanyWork {
    @SerializedName("id")
    private int id;
    @SerializedName("img")
    private String img;

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }
}
