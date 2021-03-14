package te.app.ossman_elmonkz.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.ossman_elmonkz.connection.ConnectionHelper;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.model.base.StatusMessage;
import te.app.ossman_elmonkz.model.govs.GovsResponse;
import te.app.ossman_elmonkz.pages.agentsAndClients.models.AgentsResponse;
import te.app.ossman_elmonkz.pages.agentsAndClients.models.clients.ClientsResponse;
import te.app.ossman_elmonkz.pages.gallery.models.GalleryResponse;
import te.app.ossman_elmonkz.pages.settings.models.AboutResponse;
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

    public Disposable getGallery() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GALLERY, new Object(), GalleryResponse.class,
                Constants.GALLERY, true);
    }

    public Disposable getSystemsImages(int subCatId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SYSTEM_IMAGES + subCatId, new Object(), GalleryResponse.class,
                Constants.GALLERY, true);
    }

    public Disposable getAgents() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.AGENTS, new Object(), AgentsResponse.class,
                Constants.AGENTS, true);
    }

    public Disposable getGovs() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GOVS, new Object(), GovsResponse.class,
                Constants.GOVS, true);
    }

    public Disposable getClients(int clientId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CLIENTS + clientId, new Object(), ClientsResponse.class,
                Constants.CLIENTS, true);
    }

    public Disposable getAbout() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.ABOUT, new Object(), AboutResponse.class,
                Constants.ABOUT, true);
    }

}