package te.app.ossman_elmonkz.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import te.app.ossman_elmonkz.connection.ConnectionHelper;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.model.govs.GovsResponse;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.URLS;


public class BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;
    MutableLiveData<Mutable> liveData;

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getGovs() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GOVS, new Object(), GovsResponse.class,
                Constants.GOVS, true);
    }

}
