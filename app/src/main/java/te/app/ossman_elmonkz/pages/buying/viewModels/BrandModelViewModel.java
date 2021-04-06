package te.app.ossman_elmonkz.pages.buying.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.buying.adapter.BrandModelAdapter;
import te.app.ossman_elmonkz.pages.buying.models.BrandModelsPartionMain;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.pages.buying.models.DataFromSearchRequest;
import te.app.ossman_elmonkz.repository.BuyingRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class BrandModelViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    BuyingRepository buyingRepository;
    BrandModelsPartionMain brandModelsPartionMain;
    BrandModelAdapter brandModelAdapter;
    DataFromSearchRequest dataFromSearchRequest;

    @Inject
    public BrandModelViewModel(BuyingRepository buyingRepository) {
        dataFromSearchRequest = new DataFromSearchRequest();
        brandModelsPartionMain = new BrandModelsPartionMain();
        this.liveData = new MutableLiveData<>();
        this.buyingRepository = buyingRepository;
        this.buyingRepository.setLiveData(this.liveData);
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        getBrandModelAdapter().getFilter().filter(s);
    }

    @Bindable
    public void setBrandModelsPartionMain(BrandModelsPartionMain brandModelsPartionMain) {
        if (getPassingObject().getId() == Constants.PART_REQUEST)
            getBrandModelAdapter().update(brandModelsPartionMain.getPartions());
        else if (getPassingObject().getId() == Constants.BRAND_REQUEST)
            getBrandModelAdapter().update(brandModelsPartionMain.getBrandsModells());
        notifyChange(BR.brandModelAdapter);
        notifyChange(BR.brandModelsPartionMain);
        this.brandModelsPartionMain = brandModelsPartionMain;
    }


    @Bindable
    public BrandModelAdapter getBrandModelAdapter() {
        return this.brandModelAdapter == null ? this.brandModelAdapter = new BrandModelAdapter() : this.brandModelAdapter;
    }

    @Bindable
    public void setDataFromSearchRequest(DataFromSearchRequest dataFromSearchRequest) {
        buyingRepository.getModelsFromSearch(dataFromSearchRequest);
        notifyChange(BR.dataFromSearchRequest);
        this.dataFromSearchRequest = dataFromSearchRequest;
    }

    public BuyingRepository getBuyingRepository() {
        return buyingRepository;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }
}
