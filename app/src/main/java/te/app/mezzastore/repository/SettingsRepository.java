package te.app.mezzastore.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.mezzastore.connection.ConnectionHelper;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.model.base.StatusMessage;
import te.app.mezzastore.pages.settings.models.ContactRequest;
import te.app.mezzastore.utils.Constants;
import te.app.mezzastore.utils.URLS;

@Singleton
public class SettingsRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public SettingsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }


    public Disposable sendContact(ContactRequest contactRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONTACT, contactRequest, StatusMessage.class,
                Constants.CONTACT, true);
    }

}