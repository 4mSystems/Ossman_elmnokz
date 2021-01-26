package apps.app.altcompany.pages.home.adapters;

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

import apps.app.altcompany.R;
import apps.app.altcompany.utils.images.PhotoFullPopupWindow;


public class HomeSliderAdapter extends SliderViewAdapter<HomeSliderAdapter.SliderAdapterVH> {
    public List<String> pagerList;
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
        Glide.with(context).load(pagerList.get(position)).placeholder(R.drawable.ic_logo).into(viewHolder.imageViewBackground);
        viewHolder.imageViewBackground.setOnClickListener(v -> new PhotoFullPopupWindow(context, R.layout.popup_photo_full, viewHolder.imageViewBackground, pagerList.get(position), null));
    }

    @Override
    public int getCount() {
        return pagerList.size();
    }

    public void updateData(@Nullable List<String> data) {
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
