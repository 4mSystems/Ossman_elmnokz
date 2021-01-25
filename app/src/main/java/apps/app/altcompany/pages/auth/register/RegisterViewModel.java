package apps.app.altcompany.pages.auth.register;

import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.models.RegisterRequest;
import apps.app.altcompany.pages.auth.models.cities.Cities;
import apps.app.altcompany.pages.auth.register.adapters.CategoriesAdapter;
import apps.app.altcompany.pages.auth.register.adapters.PackagesAdapter;
import apps.app.altcompany.pages.auth.register.models.categories.DepartmentsItem;
import apps.app.altcompany.repository.AuthRepository;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    private List<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private RegisterRequest request;
    private List<Cities> citiesList;
    private List<DepartmentsItem> departmentsItems;
    private boolean checked;
    private CategoriesAdapter categoriesAdapter;
    private PackagesAdapter packagesAdapter;

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        citiesList = new ArrayList<>();
        departmentsItems = new ArrayList<>();
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
    }

    public void register() {
        getRequest().setFirebase_token(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        getRequest().setStep("1");
        if (getRequest().isValidStep1()) {
            if (isChecked())
                compositeDisposable.add(repository.register(request, fileObject));
            else
                liveData.setValue(new Mutable(Constants.TERMS_WARNING));
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void registerStep2() {
        getRequest().setStep("2");
        if (getRequest().isValidStep2()) {
            Log.e("registerStep2", "registerStep2: " + getCategoriesAdapter().getSelectedCategories().size());
            if (getCategoriesAdapter().getSelectedCategories() != null && getCategoriesAdapter().getSelectedCategories().size() > 0) {
                getRequest().setSub_categories(getCategoriesAdapter().getSelectedCategories());
                compositeDisposable.add(repository.register(request, fileObject));
            } else
                liveData.setValue(new Mutable(Constants.TERMS_WARNING));
        }
    }

    public void registerStep3() {
        getRequest().setStep("3");
        getRequest().setPackage_id(String.valueOf(getPackagesAdapter().getPackagesDataList().get(getPackagesAdapter().lastPosition).getPackagesId()));
        compositeDisposable.add(repository.registerStep3(request));
    }

    public void registerStep4() {
        getRequest().setStep("4");
        getRequest().setPayment_success("1");
        compositeDisposable.add(repository.registerStep4(request));
    }

    public void getCities() {
        compositeDisposable.add(repository.getCities());
    }

    public void getCategories() {
        compositeDisposable.add(repository.categories());
    }

    public void getPackages() {
        compositeDisposable.add(repository.packages());
    }

    public void terms() {
        compositeDisposable.add(repository.terms());
    }

    public void check() {
        setChecked(!isChecked());
    }

    public void cities() {
        liveData.setValue(new Mutable(Constants.SHOW_CITIES));
    }

    public void address() {
        liveData.setValue(new Mutable(Constants.CURRENT_LOCATION));
    }


    public void imageSubmit() {
        liveData.setValue(new Mutable(Constants.IMAGE));
    }

    public void toBusinessRegister() {
        liveData.setValue(new Mutable(Constants.IMAGE_BUSINESS));
    }

    public void toSelectDepartment() {
        liveData.setValue(new Mutable(Constants.DEPARTMENT));
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

    public RegisterRequest getRequest() {
        return request;
    }

    public List<FileObject> getFileObject() {
        return fileObject;
    }

    @Bindable
    public List<Cities> getCitiesList() {
        return citiesList;
    }

    @Bindable
    public void setCitiesList(List<Cities> citiesList) {
        notifyChange(BR.citiesList);
        this.citiesList = citiesList;
    }

    @Bindable
    public List<DepartmentsItem> getDepartmentsItems() {
        return departmentsItems;
    }

    @Bindable
    public void setDepartmentsItems(List<DepartmentsItem> departmentsItems) {
        notifyChange(BR.departmentsItems);
        this.departmentsItems = departmentsItems;
    }

    @Bindable
    public boolean isChecked() {
        return checked;
    }

    @Bindable
    public void setChecked(boolean checked) {
        notifyChange(BR.checked);
        this.checked = checked;
    }

    @Bindable
    public CategoriesAdapter getCategoriesAdapter() {
        return this.categoriesAdapter == null ? this.categoriesAdapter = new CategoriesAdapter() : this.categoriesAdapter;
    }

    @Bindable
    public PackagesAdapter getPackagesAdapter() {
        return this.packagesAdapter == null ? this.packagesAdapter = new PackagesAdapter() : this.packagesAdapter;
    }
}
