package te.app.ossman_elmonkz.pages.gallery.models;

import com.google.gson.annotations.SerializedName;

public class GalleryData {

    @SerializedName("image")
    private String image;
    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}