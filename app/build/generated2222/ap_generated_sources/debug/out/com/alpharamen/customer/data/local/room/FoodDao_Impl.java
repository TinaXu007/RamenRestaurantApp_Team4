package com.alpharamen.customer.data.local.room;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.alpharamen.customer.data.local.room.notification.NotificationEntry;
import com.alpharamen.customer.data.models.SearchItemListModel;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class FoodDao_Impl implements FoodDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfNotificationEntry;

  private final EntityInsertionAdapter __insertionAdapterOfSearchItemListModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfNotificationEntry;

  public FoodDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNotificationEntry = new EntityInsertionAdapter<NotificationEntry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `notification_tb`(`id`,`title`,`entryId`,`desc`,`image`,`date`,`time`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NotificationEntry value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getEntryId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getEntryId());
        }
        if (value.getDesc() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDesc());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        if (value.getDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDate());
        }
        if (value.getTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTime());
        }
      }
    };
    this.__insertionAdapterOfSearchItemListModel = new EntityInsertionAdapter<SearchItemListModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SearchItemListModel`(`id`,`categoryId`,`productTitle`,`productRate`,`hotelName`,`itemType`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchItemListModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getCategoryId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCategoryId());
        }
        if (value.getProductTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProductTitle());
        }
        if (value.getProductRate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProductRate());
        }
        if (value.getHotelName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHotelName());
        }
        stmt.bindLong(6, value.getItemType());
      }
    };
    this.__deletionAdapterOfNotificationEntry = new EntityDeletionOrUpdateAdapter<NotificationEntry>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `notification_tb` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NotificationEntry value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(NotificationEntry notification) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNotificationEntry.insert(notification);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertMultiple(List<NotificationEntry> notification) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNotificationEntry.insert(notification);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertProduct(SearchItemListModel item) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSearchItemListModel.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void remove(NotificationEntry notification) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfNotificationEntry.handle(notification);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<NotificationEntry>> getAllNotification() {
    final String _sql = "SELECT * FROM notification_tb";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<NotificationEntry>>() {
      @Override
      public List<NotificationEntry> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfEntryId = _cursor.getColumnIndexOrThrow("entryId");
          final int _cursorIndexOfDesc = _cursor.getColumnIndexOrThrow("desc");
          final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
          final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
          final int _cursorIndexOfTime = _cursor.getColumnIndexOrThrow("time");
          final java.util.List<com.alpharamen.customer.data.local.room.notification.NotificationEntry> _result = new java.util.ArrayList<com.alpharamen.customer.data.local.room.notification.NotificationEntry>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.alpharamen.customer.data.local.room.notification.NotificationEntry _item;
            _item = new com.alpharamen.customer.data.local.room.notification.NotificationEntry();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final java.lang.String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            final java.lang.Integer _tmpEntryId;
            if (_cursor.isNull(_cursorIndexOfEntryId)) {
              _tmpEntryId = null;
            } else {
              _tmpEntryId = _cursor.getInt(_cursorIndexOfEntryId);
            }
            _item.setEntryId(_tmpEntryId);
            final java.lang.String _tmpDesc;
            _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
            _item.setDesc(_tmpDesc);
            final java.lang.String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            _item.setImage(_tmpImage);
            final java.lang.String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            _item.setDate(_tmpDate);
            final java.lang.String _tmpTime;
            _tmpTime = _cursor.getString(_cursorIndexOfTime);
            _item.setTime(_tmpTime);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
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
  public int isNotification(long id) {
    final String _sql = "SELECT count(*) FROM notification_tb where id LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Single<List<SearchItemListModel>> fetchItems() {
    final String _sql = "select * from SearchItemListModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<SearchItemListModel>>() {
      @Override
      public List<SearchItemListModel> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfCategoryId = _cursor.getColumnIndexOrThrow("categoryId");
          final int _cursorIndexOfProductTitle = _cursor.getColumnIndexOrThrow("productTitle");
          final int _cursorIndexOfProductRate = _cursor.getColumnIndexOrThrow("productRate");
          final int _cursorIndexOfHotelName = _cursor.getColumnIndexOrThrow("hotelName");
          final int _cursorIndexOfItemType = _cursor.getColumnIndexOrThrow("itemType");
          final java.util.List<com.alpharamen.customer.data.models.SearchItemListModel> _result = new java.util.ArrayList<com.alpharamen.customer.data.models.SearchItemListModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.alpharamen.customer.data.models.SearchItemListModel _item;
            _item = new com.alpharamen.customer.data.models.SearchItemListModel();
            final java.lang.Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final java.lang.Integer _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            }
            _item.setCategoryId(_tmpCategoryId);
            final java.lang.String _tmpProductTitle;
            _tmpProductTitle = _cursor.getString(_cursorIndexOfProductTitle);
            _item.setProductTitle(_tmpProductTitle);
            final java.lang.String _tmpProductRate;
            _tmpProductRate = _cursor.getString(_cursorIndexOfProductRate);
            _item.setProductRate(_tmpProductRate);
            final java.lang.String _tmpHotelName;
            _tmpHotelName = _cursor.getString(_cursorIndexOfHotelName);
            _item.setHotelName(_tmpHotelName);
            final int _tmpItemType;
            _tmpItemType = _cursor.getInt(_cursorIndexOfItemType);
            _item.setItemType(_tmpItemType);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
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
