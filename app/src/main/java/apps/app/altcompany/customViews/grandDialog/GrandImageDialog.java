package apps.app.altcompany.customViews.grandDialog;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;

import apps.app.altcompany.R;
import apps.app.altcompany.databinding.LayoutGrandBinding;


public class GrandImageDialog extends androidx.appcompat.widget.AppCompatImageView
{
    public Context context = null;
    public GrandImageDialog(Context context, AttributeSet attrs) {
        super(context, attrs);
        setImage();
        this.context = context;
    }

    public void setImage(){



        this.setImageResource(R.drawable.by_grand_black);
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                GrandDialog grandDialog = new GrandDialog(context);
                grandDialog.init();
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


}

class GrandDialog extends RelativeLayout {

    private Context context;

    public GrandDialog(Context context) {
        super(context);
        this.context = context;
    }

    public void init() {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        final LayoutGrandBinding layoutGrandBinding  = DataBindingUtil.inflate(layoutInflater, R.layout.layout_grand, null, true);
        View grand = layoutGrandBinding.getRoot();
        final AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.customDialog);
        AlertDialog dialog = builder.create();
        dialog.setView(grand);
        dialog.show();
        layoutGrandBinding.tvGrandUrl.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+layoutGrandBinding.tvGrandUrl.getText().toString()));
                context.startActivity(browserIntent);
            }
        });
        layoutGrandBinding.rlGrandCall.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri call = Uri.parse("tel:" + layoutGrandBinding.tvGrandPhone.getText().toString());
                Intent surf = new Intent(Intent.ACTION_DIAL, call);
                context.startActivity(surf);
            }
        });
        layoutGrandBinding.rlGrandWhats.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=" + layoutGrandBinding.tvGrandPhone.getText().toString() + "&text=" + "");

                    Intent sendIntent = new Intent(Intent.ACTION_VIEW, uri);

                    context.startActivity(sendIntent);

//                    Intent i = new Intent("android.intent.action.MAIN");
//                    i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
//                    i.putExtra("jid", PhoneNumberUtils.stripSeparators(layoutGrandBinding.tvGrandPhone.getText().toString())+"@s.whatsapp.net");
//                    context.startActivity(i);
                } catch (Exception e) {
                    Log.e("exc",e.getMessage().toString());
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.whatsapp&hl=en"));
                    context.startActivity(browserIntent);
                }
            }
        });
        layoutGrandBinding.imgGrandClose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}
