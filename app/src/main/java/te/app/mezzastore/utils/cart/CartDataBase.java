package te.app.mezzastore.utils.cart;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import te.app.mezzastore.pages.products.models.productDetails.Product;

@Database(entities = {Product.class}, version = 2)
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
