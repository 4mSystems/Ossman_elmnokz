package te.app.mezzastore.customViews.actionbar;


import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.databinding.DataBindingUtil;

import te.app.mezzastore.R;
import te.app.mezzastore.databinding.LayoutActionBarBackBinding;
import te.app.mezzastore.utils.session.LanguagesHelper;


public class BackActionBarView extends RelativeLayout {
    public LayoutActionBarBackBinding layoutActionBarBackBinding;
    public BackActionBarView(Context context) {
        super(context);
        init();
    }

    public BackActionBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public BackActionBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarBackBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_back, this, true);
        if (LanguagesHelper.getCurrentLanguage().equals("ar")) {
            layoutActionBarBackBinding.imgActionBarCancel.setRotation(180);
        }
        setEvents();
    }

    private void setEvents() {
        layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(view -> ((Activity) getContext()).finish());

    }

    public void setTitle(String title) {
        layoutActionBarBackBinding.tvActionBarTitle.setText(title);
    }


}
