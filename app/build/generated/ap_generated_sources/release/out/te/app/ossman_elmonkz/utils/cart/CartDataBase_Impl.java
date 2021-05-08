package te.app.ossman_elmonkz.utils.cart;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CartDataBase_Impl extends CartDataBase {
  private volatile CartDao _cartDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(5) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `order` (`partName` TEXT, `partId` TEXT, `brandName` TEXT, `brandId` TEXT, `modelName` TEXT, `productName` TEXT, `productColorName` TEXT, `product_id` TEXT, `modelId` TEXT, `quantity` TEXT, `colorId` TEXT, `hasColor` INTEGER NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '615d6ca42d4f90704041f8d5f6768fff')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `order`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsOrder = new HashMap<String, TableInfo.Column>(13);
        _columnsOrder.put("partName", new TableInfo.Column("partName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("partId", new TableInfo.Column("partId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("brandName", new TableInfo.Column("brandName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("brandId", new TableInfo.Column("brandId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("modelName", new TableInfo.Column("modelName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("productName", new TableInfo.Column("productName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("productColorName", new TableInfo.Column("productColorName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("product_id", new TableInfo.Column("product_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("modelId", new TableInfo.Column("modelId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("quantity", new TableInfo.Column("quantity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("colorId", new TableInfo.Column("colorId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("hasColor", new TableInfo.Column("hasColor", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrder.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOrder = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOrder = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOrder = new TableInfo("order", _columnsOrder, _foreignKeysOrder, _indicesOrder);
        final TableInfo _existingOrder = TableInfo.read(_db, "order");
        if (! _infoOrder.equals(_existingOrder)) {
          return new RoomOpenHelper.ValidationResult(false, "order(te.app.ossman_elmonkz.pages.buying.models.OrderRequest).\n"
                  + " Expected:\n" + _infoOrder + "\n"
                  + " Found:\n" + _existingOrder);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "615d6ca42d4f90704041f8d5f6768fff", "f926077d4480d65b82d98df74bf281cc");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "order");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `order`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CartDao.class, CartDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public CartDao cartDao() {
    if (_cartDao != null) {
      return _cartDao;
    } else {
      synchronized(this) {
        if(_cartDao == null) {
          _cartDao = new CartDao_Impl(this);
        }
        return _cartDao;
      }
    }
  }
}
