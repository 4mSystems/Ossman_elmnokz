package te.app.ossman_elmonkz.pages.gallery.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.gallery.models.GalleryData;
import te.app.ossman_elmonkz.utils.Constants;

public class ItemGalleryViewModel extends BaseViewModel {
    public GalleryData galleryData;

    public ItemGalleryViewModel(GalleryData menuModel) {
        this.galleryData = menuModel;
    }

    @Bindable
    public GalleryData getGalleryData() {
        return galleryData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
