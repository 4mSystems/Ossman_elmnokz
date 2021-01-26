package apps.app.altcompany.pages.home.viewModels;

import androidx.databinding.Bindable;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.pages.home.models.OrdersData;
import apps.app.altcompany.utils.Constants;


public class ItemHomeViewModel extends BaseViewModel {
    public OrdersData ordersData;

    public ItemHomeViewModel(OrdersData ordersData) {
        this.ordersData = ordersData;
    }

    @Bindable
    public OrdersData getOrdersData() {
        return ordersData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.ORDER_DETAILS);
    }
}
