package te.app.ossman_elmonkz.utils.cart;

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
import te.app.ossman_elmonkz.pages.buying.models.OrderRequest;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CartDao_Impl implements CartDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OrderRequest> __insertionAdapterOfOrderRequest;

  private final EntityDeletionOrUpdateAdapter<OrderRequest> __updateAdapterOfOrderRequest;

  private final SharedSQLiteStatement __preparedStmtOfDeleteItem;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductQuantity;

  private final SharedSQLiteStatement __preparedStmtOfEmptyProductCart;

  public CartDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrderRequest = new EntityInsertionAdapter<OrderRequest>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `order` (`partName`,`partId`,`brandName`,`brandId`,`modelName`,`productName`,`product_id`,`modelId`,`quantity`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderRequest value) {
        if (value.getPartName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPartName());
        }
        if (value.getPartId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPartId());
        }
        if (value.getBrandName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBrandName());
        }
        if (value.getBrandId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBrandId());
        }
        if (value.getModelName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getModelName());
        }
        if (value.getProductName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProductName());
        }
        if (value.getProduct_id() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getProduct_id());
        }
        if (value.getModelId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getModelId());
        }
        if (value.getQuantity() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getQuantity());
        }
        stmt.bindLong(10, value.getId());
      }
    };
    this.__updateAdapterOfOrderRequest = new EntityDeletionOrUpdateAdapter<OrderRequest>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `order` SET `partName` = ?,`partId` = ?,`brandName` = ?,`brandId` = ?,`modelName` = ?,`productName` = ?,`product_id` = ?,`modelId` = ?,`quantity` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderRequest value) {
        if (value.getPartName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPartName());
        }
        if (value.getPartId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPartId());
        }
        if (value.getBrandName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBrandName());
        }
        if (value.getBrandId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBrandId());
        }
        if (value.getModelName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getModelName());
        }
        if (value.getProductName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProductName());
        }
        if (value.getProduct_id() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getProduct_id());
        }
        if (value.getModelId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getModelId());
        }
        if (value.getQuantity() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getQuantity());
        }
        stmt.bindLong(10, value.getId());
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfDeleteItem = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM `order` WHERE id=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductQuantity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE `order` SET quantity=? where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfEmptyProductCart = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM `order`";
        return _query;
      }
    };
  }

  @Override
  public long addProduct(final OrderRequest productDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfOrderRequest.insertAndReturnId(productDetails);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateProduct(final OrderRequest product) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfOrderRequest.handle(product);
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
  public LiveData<List<OrderRequest>> getProducts() {
    final String _sql = "select * from `order`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"order"}, false, new Callable<List<OrderRequest>>() {
      @Override
      public List<OrderRequest> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPartName = CursorUtil.getColumnIndexOrThrow(_cursor, "partName");
          final int _cursorIndexOfPartId = CursorUtil.getColumnIndexOrThrow(_cursor, "partId");
          final int _cursorIndexOfBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "brandName");
          final int _cursorIndexOfBrandId = CursorUtil.getColumnIndexOrThrow(_cursor, "brandId");
          final int _cursorIndexOfModelName = CursorUtil.getColumnIndexOrThrow(_cursor, "modelName");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "productName");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfModelId = CursorUtil.getColumnIndexOrThrow(_cursor, "modelId");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<OrderRequest> _result = new ArrayList<OrderRequest>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final OrderRequest _item;
            _item = new OrderRequest();
            final String _tmpPartName;
            _tmpPartName = _cursor.getString(_cursorIndexOfPartName);
            _item.setPartName(_tmpPartName);
            final String _tmpPartId;
            _tmpPartId = _cursor.getString(_cursorIndexOfPartId);
            _item.setPartId(_tmpPartId);
            final String _tmpBrandName;
            _tmpBrandName = _cursor.getString(_cursorIndexOfBrandName);
            _item.setBrandName(_tmpBrandName);
            final String _tmpBrandId;
            _tmpBrandId = _cursor.getString(_cursorIndexOfBrandId);
            _item.setBrandId(_tmpBrandId);
            final String _tmpModelName;
            _tmpModelName = _cursor.getString(_cursorIndexOfModelName);
            _item.setModelName(_tmpModelName);
            final String _tmpProductName;
            _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            _item.setProductName(_tmpProductName);
            final String _tmpProduct_id;
            _tmpProduct_id = _cursor.getString(_cursorIndexOfProductId);
            _item.setProduct_id(_tmpProduct_id);
            final String _tmpModelId;
            _tmpModelId = _cursor.getString(_cursorIndexOfModelId);
            _item.setModelId(_tmpModelId);
            final String _tmpQuantity;
            _tmpQuantity = _cursor.getString(_cursorIndexOfQuantity);
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
}
