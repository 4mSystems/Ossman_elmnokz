
package apps.app.altcompany.pages.myWorks.viewModels;


import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.myWorks.adapters.MyWorksAdapter;
import apps.app.altcompany.repository.AuthRepository;
import apps.app.altcompany.repository.OrdersRepository;
import apps.app.altcompany.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class MyWorksViewModel extends BaseViewModel {
    @Inject
    AuthRepository ordersRepository;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MyWorksAdapter worksAdapter;
    ArrayList<FileObject> fileObjectArrayList = new ArrayList<>();

    @Inject
    public MyWorksViewModel(AuthRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
        this.liveData = new MutableLiveData<>();
        ordersRepository.setLiveData(liveData);
    }

    public void companyProfile() {
        compositeDisposable.add(ordersRepository.companyProfile());
    }

    public void addNewWorks() {
        compositeDisposable.add(ordersRepository.updateWorks(getFileObjectArrayList()));
    }

    public void removeWork(int id) {
//        compositeDisposable.add(ordersRepository.removeWork(id));
    }

    @Bindable
    public MyWorksAdapter getWorksAdapter() {
        return this.worksAdapter == null ? this.worksAdapter = new MyWorksAdapter() : this.worksAdapter;
    }

    public void works() {
        liveData.setValue(new Mutable(Constants.ADD_OFFER));
    }

    public ArrayList<FileObject> getFileObjectArrayList() {
        return fileObjectArrayList;
    }

    public AuthRepository getOrdersRepository() {
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
