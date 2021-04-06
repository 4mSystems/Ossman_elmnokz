package te.app.ossman_elmonkz.customViews.actionbar;


import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.databinding.DataBindingUtil;

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.databinding.LayoutActionBarBackBinding;
import te.app.ossman_elmonkz.pages.settings.AboutAppFragment;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;
import te.app.ossman_elmonkz.utils.session.LanguagesHelper;


public class BackActionBarView extends RelativeLayout {
    public LayoutActionBarBackBinding layoutActionBarBackBinding;
    Context context;

    public BackActionBarView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public BackActionBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();

    }

    public BackActionBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        this.context = context;
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
        layoutActionBarBackBinding.imgActionBarFilter.setOnClickListener(view -> MovementHelper.startActivity(context, AboutAppFragment.class.getName(), getResources().getString(R.string.about), null));

    }

    public void setTitle(String title) {
        layoutActionBarBackBinding.tvActionBarTitle.setText(title);
    }

}
