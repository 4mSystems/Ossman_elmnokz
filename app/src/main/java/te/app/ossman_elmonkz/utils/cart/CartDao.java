package te.app.ossman_elmonkz.utils.cart;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;

@Dao
public interface CartDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long addProduct(OrderRequest productDetails);

    @Query("select * from `order`")
    LiveData<List<OrderRequest>> getProducts();

    @Query("DELETE FROM `order` WHERE id=:productId")
    void deleteItem(int productId);


    @Query("UPDATE `order` SET quantity=:quantity where id=:productId")
    void updateProductQuantity(int quantity, int productId);

    @Update
    void updateProduct(OrderRequest product);

//    @Query("select sum(price * quantity) from product")
//    LiveData<String> getCartTotal();

    @Query("DELETE FROM `order`")
    void emptyProductCart();
}
