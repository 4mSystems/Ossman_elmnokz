package apps.app.altcompany.pages.auth.register.models.packages;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class PackageResponse extends StatusMessage {
    @SerializedName("data")
    private List<PackagesData> data;

    public List<PackagesData> getData() {
        return data;
    }
}