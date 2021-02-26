package te.app.mezzastore.pages.products.viewModels;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.mezzastore.base.BaseViewModel;
import te.app.mezzastore.model.base.Mutable;

public class ProductDetailsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Inject
    public ProductDetailsViewModel() {
        this.liveData = new MutableLiveData<>();
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
