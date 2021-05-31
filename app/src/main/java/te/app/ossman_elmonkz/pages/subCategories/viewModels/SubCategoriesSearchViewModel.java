package te.app.ossman_elmonkz.pages.subCategories.viewModels;

import android.text.TextUtils;
import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.buying.models.BrandModelsPartionMain;
import te.app.ossman_elmonkz.pages.buying.models.DataFromSearchRequest;
import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;
import te.app.ossman_elmonkz.pages.subCategories.adapters.SearchAdapter;
import te.app.ossman_elmonkz.repository.HomeRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class SubCategoriesSearchViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    SearchAdapter searchAdapter;
    private int searchProgressVisible = View.GONE;
    public String search;
    OrderRequest orderRequest;
    public DataFromSearchRequest dataFromSearchRequest;
    BrandModelsPartionMain brandModelsPartionMain;
    private String desc;

    @Inject
    public SubCategoriesSearchViewModel(HomeRepository homeRepository) {
        dataFromSearchRequest = new DataFromSearchRequest();
        orderRequest = new OrderRequest();
        brandModelsPartionMain = new BrandModelsPartionMain();
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void getBrands() {
        compositeDisposable.add(homeRepository.getBrands(Integer.parseInt(getPassingObject().getObject())));
    }

    public void toBrand() {
        if (getBrandModelsPartionMain().getBrandsModells() != null)
//            if (getPassingObject().getObject().equals(Constants.INTERNAL_ACCESSORIES) || getPassingObject().getObject().equals(Constants.EXTERNAL_ACCESSORIES))
//                if (!TextUtils.isEmpty(getOrderRequest().getPartId()))
            liveData.setValue(new Mutable(Constants.SELECT_BRAND));
//                else
//                    liveData.setValue(new Mutable(Constants.SELECT_PART_WARNING));
//            else
//                liveData.setValue(new Mutable(Constants.SELECT_BRAND));
    }


    public void toModel() {
        if (getOrderRequest().getBrandName() != null) {
            dataFromSearchRequest.setBrand_id(getOrderRequest().getBrandId());
            dataFromSearchRequest.setCategory_id(String.valueOf(getPassingObject().getId()));
            dataFromSearchRequest.setSub_category_id(String.valueOf(getPassingObject().getObject()));
            dataFromSearchRequest.setPartion_id(getOrderRequest().getPartId());
            liveData.setValue(new Mutable(Constants.SELECT_MODELS));
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void search() {
        if (!TextUtils.isEmpty(search)) {
            if (search.contains("+")) {
                search = search.replace("+", "-");
            }
            setSearchProgressVisible(View.VISIBLE);
            compositeDisposable.add(homeRepository.search(getPassingObject().getId(), getPassingObject().getObject(), search));
        } else
            setSearchProgressVisible(View.GONE);

    }

//    public void onTextChanged(CharSequence s, int start, int before, int count) {
//        if (!TextUtils.isEmpty(s)) {
//            setSearchProgressVisible(View.VISIBLE);
//            search = s.toString();
//            search();
//        } else
//            setSearchProgressVisible(View.GONE);
//    }

    @Bindable
    public int getSearchProgressVisible() {
        return searchProgressVisible;
    }

    @Bindable
    public void setSearchProgressVisible(int searchProgressVisible) {
        notifyChange(BR.searchProgressVisible);
        this.searchProgressVisible = searchProgressVisible;
    }

    @Bindable
    public SearchAdapter getSearchAdapter() {
        return this.searchAdapter == null ? this.searchAdapter = new SearchAdapter() : this.searchAdapter;
    }

    @Bindable
    public BrandModelsPartionMain getBrandModelsPartionMain() {
        return brandModelsPartionMain;
    }


    @Bindable
    public String getDesc() {
        return desc;
    }

    @Bindable
    public void setDesc(String desc) {
        notifyChange(BR.desc);
        this.desc = desc;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public HomeRepository getHomeRepository() {
        return homeRepository;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }
}
