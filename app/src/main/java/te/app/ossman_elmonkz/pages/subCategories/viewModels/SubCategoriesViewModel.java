package te.app.ossman_elmonkz.pages.subCategories.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.home.adapters.CategoriesAdapter;
import te.app.ossman_elmonkz.pages.home.models.CategoriesItem;
import te.app.ossman_elmonkz.pages.subCategories.adapters.SubCategoriesAdapter;
import te.app.ossman_elmonkz.repository.HomeRepository;

public class SubCategoriesViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    SubCategoriesAdapter categoriesAdapter;
    CategoriesItem categoriesItem;

    @Inject
    public SubCategoriesViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void subCategories() {
        compositeDisposable.add(homeRepository.getSubCategories(getPassingObject().getId()));
    }

    @Bindable
    public SubCategoriesAdapter getCategoriesAdapter() {
        return this.categoriesAdapter == null ? this.categoriesAdapter = new SubCategoriesAdapter() : this.categoriesAdapter;
    }

    @Bindable
    public void setCategoriesItem(CategoriesItem categoriesItem) {
        getCategoriesAdapter().update(categoriesItem.getSubCategoriesItems());
        notifyChange(BR.categoriesAdapter);
        this.categoriesItem = categoriesItem;
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
