package apps.app.altcompany.pages.settings.viewModels;

import androidx.databinding.Bindable;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.pages.settings.models.SocialsItem;
import apps.app.altcompany.utils.Constants;


public class ItemContactViewModel extends BaseViewModel {
    public SocialsItem socialsItem;

    public ItemContactViewModel(SocialsItem socialsItem) {
        this.socialsItem = socialsItem;
    }

    @Bindable
    public SocialsItem getSocialsItem() {
        return socialsItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.ORDER_DETAILS);
    }
}
