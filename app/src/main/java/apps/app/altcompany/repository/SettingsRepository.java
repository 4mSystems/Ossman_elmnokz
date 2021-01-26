package apps.app.altcompany.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import apps.app.altcompany.connection.ConnectionHelper;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.auth.models.cities.CitiesResponse;
import apps.app.altcompany.pages.auth.register.models.PrivacyResponse;
import apps.app.altcompany.pages.settings.models.SuggestionsRequest;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class SettingsRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public SettingsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getPrivacy() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.TERMS, new Object(), PrivacyResponse.class,
                Constants.TERMS, true);
    }

    public Disposable getAbout() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.ABOUT, new Object(), PrivacyResponse.class,
                Constants.ABOUT, true);
    }

    public Disposable sendSuggest(SuggestionsRequest suggestionsRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SUPPORT, suggestionsRequest, StatusMessage.class,
                Constants.SUPPORT, true);
    }
}