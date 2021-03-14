package te.app.ossman_elmonkz.pages.gallery.viewModels;

import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.gallery.adapters.GalleryAdapter;
import te.app.ossman_elmonkz.repository.SettingsRepository;

public class GalleryViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository settingsRepository;
    GalleryAdapter galleryAdapter;

    @Inject
    public GalleryViewModel(SettingsRepository settingsRepository) {
        this.settingsRepository = settingsRepository;
        this.liveData = new MutableLiveData<>();
        this.settingsRepository.setLiveData(liveData);
    }

    public void getGallery() {
        compositeDisposable.add(settingsRepository.getGallery());
    }

    public void systemImages() {
        compositeDisposable.add(settingsRepository.getSystemsImages(getPassingObject().getId()));
    }

    @Bindable
    public GalleryAdapter getGalleryAdapter() {
        return this.galleryAdapter == null ? this.galleryAdapter = new GalleryAdapter() : this.galleryAdapter;
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
