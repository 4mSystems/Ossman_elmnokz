package apps.app.altcompany.customViews.menu;


import java.util.ArrayList;

import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.pages.auth.login.models.UserData;
import apps.app.altcompany.utils.resources.ResourceManager;
import apps.app.altcompany.utils.session.UserHelper;

public class MenuViewModel extends BaseViewModel {
    MenuAdapter menuAdapter = new MenuAdapter();
    public UserData userData;


    public MenuViewModel() {
        userData = UserHelper.getInstance(MyApplication.getInstance()).getUserData();
        ArrayList<MenuModel> list = new ArrayList<>();
        list.add(new MenuModel(1, ResourceManager.getString(R.string.label_home), R.drawable.ic_home_black));
        list.add(new MenuModel(2, ResourceManager.getString(R.string.profile), R.drawable.ic_profile_black));
        list.add(new MenuModel(3, ResourceManager.getString(R.string.orders), R.drawable.ic_orders_black));
        list.add(new MenuModel(4, ResourceManager.getString(R.string.offers), R.drawable.ic_requests_black));
        list.add(new MenuModel(5, ResourceManager.getString(R.string.notifications), R.drawable.ic_notification_black));
        list.add(new MenuModel(6, ResourceManager.getString(R.string.admin_chat), R.drawable.ic_chat_black));
        list.add(new MenuModel(7, ResourceManager.getString(R.string.label_privacy_policy), R.drawable.ic_privacy_black));
        list.add(new MenuModel(8, ResourceManager.getString(R.string.label_suggestions), R.drawable.ic_suggestion_black));
        list.add(new MenuModel(12, ResourceManager.getString(R.string.contact_us), R.drawable.ic_contact_black));
        list.add(new MenuModel(9, ResourceManager.getString(R.string.label_language), R.drawable.ic_lang));
        list.add(new MenuModel(10, ResourceManager.getString(R.string.label_about_us), R.drawable.ic_about_us_black));
        list.add(new MenuModel(11, ResourceManager.getString(R.string.label_logout), R.drawable.ic_logout_black));
        menuAdapter.update(list);
    }

    public MenuAdapter getMenuAdapter() {
        return menuAdapter;
    }
}
