package te.app.ossman_elmonkz.pages.onBoard;

import android.graphics.drawable.Drawable;

public class IntroItem {
    private String title, desc;
    private Drawable img;

    public IntroItem(String title, String desc, Drawable img) {
        this.title = title;
        this.desc = desc;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }
}
