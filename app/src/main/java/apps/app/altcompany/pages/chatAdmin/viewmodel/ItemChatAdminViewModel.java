package apps.app.altcompany.pages.chatAdmin.viewmodel;

import android.util.Log;
import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdmin;

public class ItemChatAdminViewModel extends BaseViewModel {
    ChatAdmin chat;
    public ItemChatAdminViewModel(ChatAdmin chat) {
        Log.e("ItemChatAdminViewModel", "ItemChatAdminViewModel: "+chat.getMessage() );
        this.chat = chat;
    }

    @Bindable
    public ChatAdmin getChat() {
        return chat;
    }

    @BindingAdapter("android:layoutDirection")
    public static void chatAdminDirection(ConstraintLayout constraintLayout, int senderType) {
        Log.e("chatAdminDirection", "chatAdminDirection: "+senderType );
        if (senderType == 1) {
            constraintLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        } else
            constraintLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
    }
}
