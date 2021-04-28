package te.app.ossman_elmonkz.pages.buying.models;

import com.google.gson.annotations.SerializedName;

public class ProductColors {
    @SerializedName("id")
    private int id;
    @SerializedName("color_id")
    private int color_id;
    @SerializedName("color_name")
    private String color_name;
    @SerializedName("color_color")
    private String color_color;

    public int getId() {
        return id;
    }

    public int getColor_id() {
        return color_id;
    }

    public String getColor_name() {
        return color_name;
    }

    public String getColor_color() {
        return color_color;
    }
}
