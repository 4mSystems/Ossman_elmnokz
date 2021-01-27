
package apps.app.altcompany.pages.offers.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.offers.adapters.OffersAdapter;
import apps.app.altcompany.repository.OrdersRepository;
import apps.app.altcompany.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class OffersViewModel extends BaseViewModel {
    @Inject
    OrdersRepository ordersRepository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OffersAdapter offersAdapter;
    ArrayList<FileObject> fileObjectArrayList = new ArrayList<>();

    @Inject
    public OffersViewModel(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
        this.liveData = new MutableLiveData<>();
        ordersRepository.setLiveData(liveData);
    }

    public void offers() {
        compositeDisposable.add(ordersRepository.offers());
    }

    public void removeOffer(int offerId) {
        compositeDisposable.add(ordersRepository.removeOffer(offerId));
    }

    public void addNewOffer() {
        if (getFileObjectArrayList() != null && getFileObjectArrayList().size() > 0)
            compositeDisposable.add(ordersRepository.addOffer(getFileObjectArrayList()));
    }

    @Bindable
    public OffersAdapter getOffersAdapter() {
        return this.offersAdapter == null ? this.offersAdapter = new OffersAdapter() : this.offersAdapter;
    }

    public void addOffer() {
        liveData.setValue(new Mutable(Constants.ADD_OFFER));
    }

    public void selectImage() {
        liveData.setValue(new Mutable(Constants.IMAGE));
    }

    public ArrayList<FileObject> getFileObjectArrayList() {
        return fileObjectArrayList;
    }

    public OrdersRepository getOrdersRepository() {
        return ordersRepository;
    }

    private void unSubscribeFromObservable() {
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
