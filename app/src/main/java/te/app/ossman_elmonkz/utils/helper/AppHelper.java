package te.app.ossman_elmonkz.utils.helper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.R;

public class AppHelper {

    public static Bitmap resizeIcon(Drawable drawable) {
        int height = 50;
        int width = 50;
//        BitmapDrawable bitmapDrawable = (BitmapDrawable) convertVectorToBitMap(drawable);
        Bitmap b = convertVectorToBitMap(drawable);
        return Bitmap.createScaledBitmap(b, width, height, false);
    }

    public static Bitmap convertVectorToBitMap(Drawable drawable) {
        try {
            Bitmap bitmap;

            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);

            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);

            return bitmap;
        } catch (OutOfMemoryError e) {
            // Handle the error
            Log.e("convertVectorToBitMap", "convertVectorToBitMap: " + e.getMessage());
            return null;
        }
    }

    public static void shareApp(Activity activity) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareSub = activity.getString(R.string.app_name);
        String shareBody = getPlayStoreLink(activity);
        intent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        intent.putExtra(Intent.EXTRA_TEXT, shareBody);
//        activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share)));
        activity.startActivity(Intent.createChooser(intent, "share"));
    }

    public static String getPlayStoreLink(Context context) {
        final String appPackageName = context.getPackageName();
        return "https://play.google.com/store/apps/details?id=" + appPackageName;
    }
    public static void rateApp(Context context) {
        Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            context.startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
        }
    }

    public static void shareCustom(Activity activity, String title, String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        final String appPackageName = MyApplication.getInstance().getPackageName();
        message += "\n\nhttps://play.google.com/store/te/details?id=" + appPackageName;
        intent.putExtra(Intent.EXTRA_SUBJECT, title);
        intent.putExtra(Intent.EXTRA_TEXT, message);
//        activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share)));
        activity.startActivity(Intent.createChooser(intent, "share"));

    }

    public static void openWhats(Activity activity, String number) {
        Uri uri = Uri.parse("smsto:" + number);
        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
        i.setPackage("com.whatsapp");
        activity.startActivity(Intent.createChooser(i, ""));
    }

    public static void openDialNumber(Context context, String number) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        context.startActivity(intent);
    }

    public static void openBrowser(Context context, String url) {
        try {
            if (!url.startsWith("http://") && !url.startsWith("https://"))
                url = "http://" + url;
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            context.startActivity(browserIntent);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void openEmail(Context context, String email) {

        String mailto = "mailto:" + email + "?" +
//                "?cc=" + "sales@2grand.net" +
                "&subject=" + context.getString(R.string.app_name) +
                "&body=";

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse(mailto));

        try {
            context.startActivity(emailIntent);
        } catch (ActivityNotFoundException e) {
            //TODO: Handle case where no email app is available
            Toast.makeText(context, "No Server Mail Application Found", Toast.LENGTH_SHORT).show();
        }


    }

    @SuppressLint("WrongConstant")
    public static void initVerticalRV(RecyclerView recyclerView, Context context, int spanCount) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(30);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(new GridLayoutManager(context, spanCount, LinearLayoutManager.VERTICAL, false));
    }

    @SuppressLint("WrongConstant")
    public static void initHorizontalRV(RecyclerView recyclerView, Context context, int spanCount) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(30);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(new GridLayoutManager(context, spanCount, LinearLayoutManager.HORIZONTAL, false));
    }

    public static String numberToDecimal(int number) {
        String number2Decimal = String.valueOf(number);
        if (number < 10) {
            number2Decimal = "0" + number2Decimal;
        }
        return number2Decimal;
    }


    public static void hideKeyboard(Activity activity) {
        View view = activity.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

}
