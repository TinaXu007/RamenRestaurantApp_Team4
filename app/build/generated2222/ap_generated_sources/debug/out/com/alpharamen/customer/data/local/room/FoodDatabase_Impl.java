package com.alpharamen.customer.data.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class FoodDatabase_Impl extends FoodDatabase {
  private volatile FoodDao _foodDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `notification_tb` (`id` INTEGER NOT NULL, `title` TEXT, `entryId` INTEGER, `desc` TEXT, `image` TEXT, `date` TEXT, `time` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SearchItemListModel` (`id` INTEGER, `categoryId` INTEGER, `productTitle` TEXT, `productRate` TEXT, `hotelName` TEXT, `itemType` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"e5c1f48da996d769692a358833bb3146\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `notification_tb`");
        _db.execSQL("DROP TABLE IF EXISTS `SearchItemListModel`");
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNotificationTb = new HashMap<String, TableInfo.Column>(7);
        _columnsNotificationTb.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsNotificationTb.put("title", new TableInfo.Column("title", "TEXT", false, 0));
        _columnsNotificationTb.put("entryId", new TableInfo.Column("entryId", "INTEGER", false, 0));
        _columnsNotificationTb.put("desc", new TableInfo.Column("desc", "TEXT", false, 0));
        _columnsNotificationTb.put("image", new TableInfo.Column("image", "TEXT", false, 0));
        _columnsNotificationTb.put("date", new TableInfo.Column("date", "TEXT", false, 0));
        _columnsNotificationTb.put("time", new TableInfo.Column("time", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNotificationTb = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNotificationTb = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNotificationTb = new TableInfo("notification_tb", _columnsNotificationTb, _foreignKeysNotificationTb, _indicesNotificationTb);
        final TableInfo _existingNotificationTb = TableInfo.read(_db, "notification_tb");
        if (! _infoNotificationTb.equals(_existingNotificationTb)) {
          throw new IllegalStateException("Migration didn't properly handle notification_tb(com.alpharamen.customer.data.local.room.notification.NotificationEntry).\n"
                  + " Expected:\n" + _infoNotificationTb + "\n"
                  + " Found:\n" + _existingNotificationTb);
        }
        final HashMap<String, TableInfo.Column> _columnsSearchItemListModel = new HashMap<String, TableInfo.Column>(6);
        _columnsSearchItemListModel.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsSearchItemListModel.put("categoryId", new TableInfo.Column("categoryId", "INTEGER", false, 0));
        _columnsSearchItemListModel.put("productTitle", new TableInfo.Column("productTitle", "TEXT", false, 0));
        _columnsSearchItemListModel.put("productRate", new TableInfo.Column("productRate", "TEXT", false, 0));
        _columnsSearchItemListModel.put("hotelName", new TableInfo.Column("hotelName", "TEXT", false, 0));
        _columnsSearchItemListModel.put("itemType", new TableInfo.Column("itemType", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSearchItemListModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSearchItemListModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSearchItemListModel = new TableInfo("SearchItemListModel", _columnsSearchItemListModel, _foreignKeysSearchItemListModel, _indicesSearchItemListModel);
        final TableInfo _existingSearchItemListModel = TableInfo.read(_db, "SearchItemListModel");
        if (! _infoSearchItemListModel.equals(_existingSearchItemListModel)) {
          throw new IllegalStateException("Migration didn't properly handle SearchItemListModel(com.alpharamen.customer.data.models.SearchItemListModel).\n"
                  + " Expected:\n" + _infoSearchItemListModel + "\n"
                  + " Found:\n" + _existingSearchItemListModel);
        }
      }
    }, "e5c1f48da996d769692a358833bb3146", "545c4c772c962ca3393ea88fa30cf817");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "notification_tb","SearchItemListModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `notification_tb`");
      _db.execSQL("DELETE FROM `SearchItemListModel`");
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
  public FoodDao musicDao() {
    if (_foodDao != null) {
      return _foodDao;
    } else {
      synchronized(this) {
        if(_foodDao == null) {
          _foodDao = new FoodDao_Impl(this);
        }
        return _foodDao;
      }
    }
  }
}
