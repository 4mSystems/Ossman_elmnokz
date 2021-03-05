package te.app.ossman_elmonkz.base;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.utils.helper.AppHelper;

import static te.app.ossman_elmonkz.utils.Constants.IMAGE_BASE_URL;

public class ApplicationBinding {
    private static final String TAG = "ApplicationBinding";

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView, Object image) {
        Log.e(TAG, "loadImage: " + IMAGE_BASE_URL.concat((String) image));
        if (image instanceof String && !TextUtils.isEmpty((String) image)) {
            Log.e(TAG, "loadImage: " + IMAGE_BASE_URL.concat((String) image));
            Picasso.get().load(IMAGE_BASE_URL.concat((String) image)).placeholder(R.color.overlayBackground).into(imageView);
        } else if (image instanceof Integer) {
            imageView.setImageResource((Integer) image);
        }
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
