package apps.app.altcompany.pages.offers.viewModels;

import androidx.databinding.Bindable;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.pages.offers.models.OffersData;
import apps.app.altcompany.utils.Constants;


public class ItemOfferViewModel extends BaseViewModel {
    public OffersData offersData;

    public ItemOfferViewModel(OffersData offersData) {
        this.offersData = offersData;
    }

    @Bindable
    public OffersData getOffersData() {
        return offersData;
    }

    public void removeOffer() {
        getLiveData().setValue(Constants.REMOVE_OFFER);
    }
}
