package apps.app.altcompany.utils.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.gson.Gson;



public class RealTimeReceiver extends BroadcastReceiver {
    public static MessageReceiverListener messageReceiverListene;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {

            if (intent.getAction().equals("app.te.receiver")) {
                if (intent.getSerializableExtra("chat") != null) {
                    String details = String.valueOf(intent.getSerializableExtra("chat"));
                    Log.i("onReceive", "onReceive: " + details);
//                    Chat messagesItem = new Gson().fromJson(details, Chat.class);
//                    messageReceiverListene.onMessageChanged(messagesItem);
                }
            }
        } else
            Log.i("onReceive", "onReceive: null");
    }

    public interface MessageReceiverListener {
//        void onMessageChanged(Chat messagesItem);
    }
}
