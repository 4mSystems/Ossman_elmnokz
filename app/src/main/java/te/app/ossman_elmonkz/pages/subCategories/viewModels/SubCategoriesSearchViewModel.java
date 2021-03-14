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
import te.app.ossman_elmonkz.pages.home.adapters.CategoriesAdapter;
import te.app.ossman_elmonkz.pages.subCategories.adapters.SearchAdapter;
import te.app.ossman_elmonkz.repository.HomeRepository;

public class SubCategoriesSearchViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    SearchAdapter searchAdapter;
    private int searchProgressVisible = View.GONE;
    public String search;

    @Inject
    public SubCategoriesSearchViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void search() {
        compositeDisposable.add(homeRepository.search(getPassingObject().getId(),getPassingObject().getObject(),search));
    }
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (!TextUtils.isEmpty(s)) {
            setSearchProgressVisible(View.VISIBLE);
            search = s.toString();
            search();
        } else
            setSearchProgressVisible(View.GONE);
    }
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
