package apps.app.altcompany.utils.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.gson.Gson;

import apps.app.altcompany.pages.chatAdmin.model.ChatAdmin;


public class RealTimeReceiver extends BroadcastReceiver {
    public static MessageReceiverListener messageReceiverListene;
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {

            if (intent.getAction().equals("apps.app.altcompany.receiver")) {
                if (intent.getSerializableExtra("chat") != null) {
                    String details = String.valueOf(intent.getSerializableExtra("chat"));
                    Log.e("onReceive", "onReceive: " + details);
                    ChatAdmin messagesItem = new Gson().fromJson(details, ChatAdmin.class);
                    messageReceiverListene.onMessageChanged(messagesItem);
                }
            }
        } else
            Log.i("onReceive", "onReceive: null");
    }

    public interface MessageReceiverListener {
        void onMessageChanged(ChatAdmin messagesItem);
    }
}
