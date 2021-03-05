package te.app.ossman_elmonkz.pages.home.models;

import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {

    @SerializedName("data")
    private HomeData homeData;


    public HomeData getHomeData() {
        return homeData;
    }

}