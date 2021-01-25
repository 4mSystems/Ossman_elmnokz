package apps.app.altcompany.customViews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;

import androidx.appcompat.widget.AppCompatTextView;

import apps.app.altcompany.R;


/**
 * Created by mohamedatef on 1/8/19.
 */

public class CustomTextViewBold extends AppCompatTextView {
    public CustomTextViewBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public CustomTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomTextViewBold(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        Typeface tf = Typeface.createFromAsset(context.getAssets(),
                "fonts/font_bold.ttf");
        setTypeface(tf);
    }

}