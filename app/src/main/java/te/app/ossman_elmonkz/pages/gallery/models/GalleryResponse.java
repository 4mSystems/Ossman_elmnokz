package te.app.ossman_elmonkz.pages.gallery.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class GalleryResponse extends StatusMessage {
    @SerializedName("data")
    private List<GalleryData> data;

    public List<GalleryData> getData() {
        return data;
    }

}