package apps.app.altcompany.customViews.menu;

import androidx.databinding.Bindable;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.utils.Constants;

public class ItemMenuViewModel extends BaseViewModel {
    public MenuModel menuModel;

    public ItemMenuViewModel(MenuModel menuModel) {
        this.menuModel = menuModel;
    }

    @Bindable
    public MenuModel getMenuModel() {
        return menuModel;
    }

    public void itemAction() {
        //TODO Item Action with liveData
        getLiveData().setValue(Constants.MENu);
    }

}
