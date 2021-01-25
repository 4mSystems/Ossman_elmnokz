package apps.app.altcompany.utils.PopUp;

import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.PopupMenu;

import java.util.List;

import apps.app.altcompany.pages.auth.models.cities.Cities;
import apps.app.altcompany.pages.auth.register.models.categories.DepartmentsItem;

public class PopUpMenuHelper {


    public static PopupMenu showDepartmentsPopUp(Context context, View view, List<DepartmentsItem> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getCategoriesName());
        }
        typesPopUps.show();
        return typesPopUps;
    }

    public static PopupMenu showCitiesPopUp(Context context, View view, List<Cities> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
        }
        typesPopUps.show();
        return typesPopUps;
    }

}
