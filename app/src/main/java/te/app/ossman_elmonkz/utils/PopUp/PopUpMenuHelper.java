package te.app.ossman_elmonkz.utils.PopUp;

import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.PopupMenu;

import java.util.List;

import te.app.ossman_elmonkz.model.govs.GovsData;

public class PopUpMenuHelper {


    public static PopupMenu showGovsPopUp(Context context, View view, List<GovsData> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
        }
        typesPopUps.show();
        return typesPopUps;
    }
//
//    public static PopupMenu showCitiesPopUp(Context context, View view, List<Cities> types) {
//        PopupMenu typesPopUps;
//        typesPopUps = new PopupMenu(context, view);
//        for (int i = 0; i < types.size(); i++) {
//            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
//        }
//        typesPopUps.show();
//        return typesPopUps;
//    }
//   public static PopupMenu showCountriesPopUp(Context context, View view, List<Countries> types) {
//        PopupMenu typesPopUps;
//        typesPopUps = new PopupMenu(context, view);
//        for (int i = 0; i < types.size(); i++) {
//            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
//        }
//        typesPopUps.show();
//        return typesPopUps;
//    }

}
