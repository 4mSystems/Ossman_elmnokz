package te.app.mezzastore.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.mezzastore.connection.ConnectionHelper;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.pages.home.models.HomeResponse;
import te.app.mezzastore.pages.subCategories.models.SubCategoriesResponse;
import te.app.mezzastore.utils.Constants;
import te.app.mezzastore.utils.URLS;

@Singleton
public class HomeRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public HomeRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getHomeData() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME, new Object(), HomeResponse.class,
                Constants.HOME, true);
    }

    public Disposable getSubCategories(int catId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SUB_CATEGORIES+catId+"/ar/v1", new Object(), SubCategoriesResponse.class,
                Constants.SUB_CATEGORIES, true);
    }
}