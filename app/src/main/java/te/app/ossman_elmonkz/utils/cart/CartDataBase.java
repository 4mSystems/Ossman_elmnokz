package te.app.ossman_elmonkz.utils.cart;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;

@Database(entities = {OrderRequest.class}, version = 3)
public abstract class CartDataBase extends RoomDatabase {
    private static CartDataBase instance;

    public abstract CartDao cartDao();

    public static synchronized CartDataBase getInstance(Context context) {
        if (instance == null)
            instance = Room.databaseBuilder(context.getApplicationContext(), CartDataBase.class, "cart_db")
                    .fallbackToDestructiveMigration() // we do it for increase db version
                    .build();
        return instance;
    }
}
