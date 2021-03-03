package te.app.mezzastore.utils.cart;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import te.app.mezzastore.pages.products.models.productDetails.Product;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CartDao_Impl implements CartDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Product> __insertionAdapterOfProduct;

  private final EntityDeletionOrUpdateAdapter<Product> __updateAdapterOfProduct;

  private final SharedSQLiteStatement __preparedStmtOfDeleteItem;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductQuantity;

  private final SharedSQLiteStatement __preparedStmtOfEmptyProductCart;

  public CartDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProduct = new EntityInsertionAdapter<Product>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `product` (`main_image`,`title`,`price`,`quantity`,`id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Product value) {
        if (value.getMain_image() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMain_image());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPrice());
        }
        stmt.bindLong(4, value.getQuantity());
        stmt.bindLong(5, value.getId());
      }
    };
    this.__updateAdapterOfProduct = new EntityDeletionOrUpdateAdapter<Product>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `product` SET `main_image` = ?,`title` = ?,`price` = ?,`quantity` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Product value) {
        if (value.getMain_image() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMain_image());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPrice());
        }
        stmt.bindLong(4, value.getQuantity());
        stmt.bindLong(5, value.getId());
        stmt.bindLong(6, value.getId());
      }
    };
    this.__preparedStmtOfDeleteItem = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM PRODUCT WHERE id=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductQuantity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE PRODUCT SET quantity=? where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfEmptyProductCart = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM PRODUCT";
        return _query;
      }
    };
  }

  @Override
  public long addProduct(final Product productDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfProduct.insertAndReturnId(productDetails);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateProduct(final Product product) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfProduct.handle(product);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteItem(final int productId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteItem.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, productId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteItem.release(_stmt);
    }
  }

  @Override
  public void updateProductQuantity(final int quantity, final int productId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductQuantity.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, quantity);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, productId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateProductQuantity.release(_stmt);
    }
  }

  @Override
  public void emptyProductCart() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfEmptyProductCart.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfEmptyProductCart.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Product>> getProducts() {
    final String _sql = "select * from product";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"product"}, false, new Callable<List<Product>>() {
      @Override
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMainImage = CursorUtil.getColumnIndexOrThrow(_cursor, "main_image");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Product _item;
            _item = new Product();
            final String _tmpMain_image;
            _tmpMain_image = _cursor.getString(_cursorIndexOfMainImage);
            _item.setMain_image(_tmpMain_image);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            final String _tmpPrice;
            _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
            _item.setPrice(_tmpPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            _item.setQuantity(_tmpQuantity);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<String> getCartTotal() {
    final String _sql = "select sum(price * quantity) from product";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"product"}, false, new Callable<String>() {
      @Override
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if(_cursor.moveToFirst()) {
            final String _tmp;
            _tmp = _cursor.getString(0);
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
