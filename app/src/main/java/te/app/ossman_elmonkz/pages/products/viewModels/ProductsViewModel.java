package te.app.ossman_elmonkz.pages.products.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.home.models.CategoriesItem;
import te.app.ossman_elmonkz.pages.settings.models.AboutMain;
import te.app.ossman_elmonkz.pages.subCategories.adapters.SubCategoriesAdapter;
import te.app.ossman_elmonkz.repository.SettingsRepository;

public class ProductsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository settingsRepository;
    SubCategoriesAdapter productsAdapter;
    CategoriesItem categoriesItem;
    AboutMain aboutMain;

    @Inject
    public ProductsViewModel(SettingsRepository settingsRepository) {
        this.settingsRepository = settingsRepository;
        this.liveData = new MutableLiveData<>();
        aboutMain = new AboutMain();
    }

    public void about() {
        compositeDisposable.add(settingsRepository.getAbout());
    }

    @Bindable
    public AboutMain getAboutMain() {
        return aboutMain;
    }

    @Bindable
    public void setAboutMain(AboutMain aboutMain) {
        notifyChange(BR.aboutMain);
        this.aboutMain = aboutMain;
    }

    @Bindable
    public SubCategoriesAdapter getProductsAdapter() {
        return this.productsAdapter == null ? this.productsAdapter = new SubCategoriesAdapter() : this.productsAdapter;
    }

    @Bindable
    public void setCategoriesItem(CategoriesItem categoriesItem) {
        getProductsAdapter().update(categoriesItem.getSubCategoriesItems());
        notifyChange(BR.categoriesAdapter);
        this.categoriesItem = categoriesItem;
    }

    public SettingsRepository getSettingsRepository() {
        return settingsRepository;
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
