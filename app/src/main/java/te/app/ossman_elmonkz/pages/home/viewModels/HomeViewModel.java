package te.app.ossman_elmonkz.pages.home.viewModels;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.home.adapters.CategoriesAdapter;
import te.app.ossman_elmonkz.repository.CartRepository;
import te.app.ossman_elmonkz.repository.HomeRepository;
import te.app.ossman_elmonkz.utils.Constants;

public class HomeViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    CategoriesAdapter categoriesAdapter;
    CartRepository cartRepository;
    LiveData<String> cartCount;

    @Inject
    public HomeViewModel(HomeRepository homeRepository) {
        cartRepository = new CartRepository(MyApplication.getInstance());
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
        cartCount = cartRepository.getCartCount();
    }

    public void homeData() {
        compositeDisposable.add(homeRepository.getHomeData());
    }

    public void toCart() {
        liveData.setValue(new Mutable(Constants.CART));
    }

    public void toAbout() {
        liveData.setValue(new Mutable(Constants.ABOUT));
    }

    public LiveData<String> getCartCount() {
        return cartCount;
    }


    @Bindable
    public CategoriesAdapter getCategoriesAdapter() {
        return this.categoriesAdapter == null ? this.categoriesAdapter = new CategoriesAdapter() : this.categoriesAdapter;
    }


    public HomeRepository getHomeRepository() {
        return homeRepository;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @BindingMethods({
            @BindingMethod(
                    type = BottomNavigationView.class,
                    attribute = "app:onNavigationItemSelected",
                    method = "setOnNavigationItemSelectedListener"
            ),
    })
    public class DataBindingAdapter {

    }

    private static final String TAG = "HomeViewModel";

    public boolean onNavigationClick(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuHome:
                liveData.setValue(new Mutable(Constants.MENU_HOME));
                return true;
            case R.id.menuMore:
                liveData.setValue(new Mutable(Constants.MENU_MORE));
                return true;

            default:
                return true;
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }
}
