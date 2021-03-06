package te.app.ossman_elmonkz.pages.home.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.pages.home.models.SliderAdsItem;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.images.PhotoFullPopupWindow;



public class HomeSliderAdapter extends SliderViewAdapter<HomeSliderAdapter.SliderAdapterVH> {
    public List<SliderAdsItem> pagerList;
    private Context context;

    public HomeSliderAdapter() {
        pagerList = new ArrayList<>();
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_slider, null);
        context = parent.getContext();
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        SliderAdsItem introItem = pagerList.get(position);
        Glide.with(context).load(introItem.getImage()).placeholder(R.color.overlayBackground).into(viewHolder.imageViewBackground);
        viewHolder.imageViewBackground.setOnClickListener(v -> new PhotoFullPopupWindow(MyApplication.getInstance(), R.layout.popup_photo_full, viewHolder.imageViewBackground, introItem.getImage(), null));
    }

    @Override
    public int getCount() {
        return pagerList.size();
    }

    public void updateData(@Nullable List<SliderAdsItem> data) {
        this.pagerList.clear();
        this.pagerList.addAll(data);
        notifyDataSetChanged();
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {
        View itemView;
        ImageView imageViewBackground;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            this.itemView = itemView;
        }
    }
}
