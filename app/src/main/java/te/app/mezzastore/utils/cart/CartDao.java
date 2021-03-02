package te.app.mezzastore.utils.cart;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import te.app.mezzastore.pages.products.models.productDetails.Product;

@Dao
public interface CartDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long addProduct(Product productDetails);

    @Query("select * from product")
    LiveData<List<Product>> getProducts();

    @Query("DELETE FROM PRODUCT WHERE id=:productId")
    void deleteItem(int productId);


    @Query("UPDATE PRODUCT SET quantity=:quantity where id=:productId")
    void updateProductQuantity(int quantity, int productId);

    @Update
    void updateProduct(Product product);

    @Query("select sum(price * quantity) from product")
    LiveData<String> getCartTotal();

    @Query("DELETE FROM PRODUCT")
    void emptyProductCart();
}
