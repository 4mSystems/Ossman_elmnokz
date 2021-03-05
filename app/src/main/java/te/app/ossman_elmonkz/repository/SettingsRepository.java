package te.app.ossman_elmonkz.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.ossman_elmonkz.connection.ConnectionHelper;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.model.base.StatusMessage;
import te.app.ossman_elmonkz.pages.settings.models.ContactRequest;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.URLS;

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