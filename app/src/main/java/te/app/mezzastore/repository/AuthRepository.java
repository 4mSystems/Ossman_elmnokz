package te.app.mezzastore.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.mezzastore.connection.ConnectionHelper;
import te.app.mezzastore.model.base.Mutable;

@Singleton
public class AuthRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public AuthRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

}