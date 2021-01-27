package apps.app.altcompany.repository;


import androidx.lifecycle.MutableLiveData;


import javax.inject.Inject;
import javax.inject.Singleton;

import apps.app.altcompany.connection.ConnectionHelper;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdminRequest;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdminResponse;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdminSendResponse;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class ChatRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public ChatRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getOrderChat(int orderId) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHAT , new ChatAdminRequest("1", String.valueOf(orderId)), ChatAdminResponse.class,
                Constants.CHAT, true);
    }

    public Disposable getAdminChat() {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHAT_ADMIN, new ChatAdminRequest("1"), ChatAdminResponse.class,
                Constants.CHAT_ADMIN, true);
    }

    public Disposable sendAdminChat(ChatAdminRequest request) {
        request.setType("1");
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_MESSAGE, request, ChatAdminSendResponse.class,
                Constants.SEND_MESSAGE, true);
    }

    public Disposable sendChat(ChatAdminRequest request) {
        request.setType("1");
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_ORDER_MESSAGE, request, ChatAdminSendResponse.class,
                Constants.SEND_MESSAGE, true);
    }


}