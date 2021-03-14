package te.app.ossman_elmonkz.model.govs;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class GovsResponse extends StatusMessage {

    @SerializedName("data")
    private List<GovsData> data;

    public List<GovsData> getData() {
        return data;
    }

}