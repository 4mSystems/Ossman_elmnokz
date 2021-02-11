package apps.app.altcompany.pages.myWorks.viewModels;

import androidx.databinding.Bindable;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.pages.companies.CompanyWork;
import apps.app.altcompany.pages.myWorks.models.OffersData;
import apps.app.altcompany.utils.Constants;


public class ItemMyWorksViewModel extends BaseViewModel {
    public CompanyWork companyWork;

    public ItemMyWorksViewModel(CompanyWork companyWork) {
        this.companyWork = companyWork;
    }

    @Bindable
    public CompanyWork getCompanyWork() {
        return companyWork;
    }

    public void removeOffer() {
        getLiveData().setValue(Constants.REMOVE_OFFER);
    }
}
