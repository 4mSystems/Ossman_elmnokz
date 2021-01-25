package apps.app.altcompany.base;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import apps.app.altcompany.R;
import apps.app.altcompany.utils.helper.AppHelper;

public class ApplicationBinding {
    private static final String TAG = "ApplicationBinding";

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView, Object image) {
        if (image instanceof String && !TextUtils.isEmpty((String) image)) {
            Log.e(TAG, "loadImage: " + image);
            Glide
                    .with(imageView.getContext())
                    .load((String) image)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .centerCrop()
                    .placeholder(R.drawable.ic_logo)
                    .into(imageView);
        } else if (image instanceof Integer) {
            imageView.setImageResource((Integer) image);
        } else if (TextUtils.isEmpty((String) image)) {
            imageView.setImageResource(R.drawable.image_placeholder);
        }
    }


    @BindingAdapter("imageZoomUrl")
    public static void loadZoomImage(ImageView imageView, String image) {
        Glide
                .with(imageView.getContext())
                .load(image)
                .fitCenter()
//                .placeholder(R.drawable.progress_animation)
                .into(imageView);
//        imageView.setOnTouchListener(new ImageMatrixTouchHandler(MyApplication.getInstance()));
    }

    @BindingAdapter("color")
    public static void color(ImageView imageView, String color) {
        if (color != null && !color.equals("") && color.charAt(0) == '#') {
            imageView.setBackgroundColor(Color.parseColor(color));
        }
    }

    @BindingAdapter({"app:adapter", "app:span", "app:orientation"})
    public static void getItemsV2Binding(RecyclerView recyclerView, RecyclerView.Adapter<?> itemsAdapter, String spanCount, String orientation) {
        if (orientation.equals("1"))
            AppHelper.initVerticalRV(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        else
            AppHelper.initHorizontalRV(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        recyclerView.setAdapter(itemsAdapter);
    }


    @BindingAdapter("rate")
    public static void setRate(final RatingBar ratingBar, String rate) {
        if (!TextUtils.isEmpty(rate))
            ratingBar.setRating(Float.parseFloat(rate));
    }

}
