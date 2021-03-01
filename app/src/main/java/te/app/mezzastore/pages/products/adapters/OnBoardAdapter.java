package te.app.mezzastore.pages.products.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

import te.app.mezzastore.R;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.utils.images.PhotoFullPopupWindow;

import static te.app.mezzastore.utils.Constants.IMAGE_BASE_URL;


public class OnBoardAdapter extends SliderViewAdapter<OnBoardAdapter.SliderAdapterVH> {
    public List<String> pagerList;
    private Context context;

    public OnBoardAdapter() {
        pagerList = new ArrayList<>();
    }

    @SuppressLint("InflateParams")
    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_slider, null);
        context = parent.getContext();
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        String introItem = pagerList.get(position);
        Glide.with(context).load(IMAGE_BASE_URL.concat(introItem)).placeholder(R.color.overlayBackground).into(viewHolder.imageViewBackground);
        viewHolder.imageViewBackground.setOnClickListener(v -> new PhotoFullPopupWindow(MyApplication.getInstance(), R.layout.popup_photo_full, viewHolder.imageViewBackground, IMAGE_BASE_URL.concat(introItem), null));
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
