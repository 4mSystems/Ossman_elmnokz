
package apps.app.altcompany.pages.chatAdmin.viewmodel;

import android.text.TextUtils;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.chatAdmin.adapter.ChatAdminAdapter;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdminRequest;
import apps.app.altcompany.repository.ChatRepository;
import apps.app.altcompany.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class ChatAdminViewModel extends BaseViewModel {
    public
    MutableLiveData<Mutable> liveData;
    @Inject
    public ChatRepository repository;
    public ChatAdminAdapter adapter = new ChatAdminAdapter();
    public ChatAdminRequest request = new ChatAdminRequest();
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Inject
    public ChatAdminViewModel(ChatRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void chatAdmin() {
        compositeDisposable.add(repository.getAdminChat());
    }

    public void chatOrder() {
        compositeDisposable.add(repository.getOrderChat(getPassingObject().getId()));
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public void sendMessage() {
        if (!TextUtils.isEmpty(request.getMessage())) {
            if (getPassingObject().getObject().equals(Constants.CHAT_ADMIN))
                repository.sendAdminChat(request);
            else {
                request.setOrder_id(String.valueOf(getPassingObject().getId()));
                repository.sendChat(request);
            }
        }
    }
}
