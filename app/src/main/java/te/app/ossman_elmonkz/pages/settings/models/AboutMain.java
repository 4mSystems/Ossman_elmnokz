package te.app.ossman_elmonkz.pages.settings.models;

import com.google.gson.annotations.SerializedName;

public class AboutMain {
    @SerializedName("about")
    private AboutData aboutData;
    @SerializedName("news")
    private News news;

    public AboutData getAboutData() {
        return aboutData;
    }

    public News getNews() {
        return news;
    }
}
