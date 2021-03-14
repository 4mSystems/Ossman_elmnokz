package te.app.ossman_elmonkz.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.ossman_elmonkz.connection.ConnectionHelper;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.home.models.HomeResponse;
import te.app.ossman_elmonkz.pages.onBoard.models.BoardResponse;
import te.app.ossman_elmonkz.pages.subCategories.models.SubCategoriesResponse;
import te.app.ossman_elmonkz.pages.subCategories.models.search.SearchResponse;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.URLS;

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
    public Disposable getBoard() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BOARD, new Object(), BoardResponse.class,
                Constants.BOARD, true);
    }

    public Disposable search(int categoryId, String subCatId, String search) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SEARCH+categoryId+"&sub_category_id="+subCatId+"&search_key="+search, new Object(), SearchResponse.class,
                Constants.SEARCH, true);
    }
}