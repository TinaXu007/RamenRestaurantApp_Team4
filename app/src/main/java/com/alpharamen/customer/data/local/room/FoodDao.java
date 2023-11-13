package com.alpharamen.customer.data.local.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.alpharamen.customer.data.local.room.notification.NotificationEntry;
import com.alpharamen.customer.data.models.SearchItemListModel;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface FoodDao {

    @Query("SELECT * FROM notification_tb")
    Single<List<NotificationEntry>> getAllNotification();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(NotificationEntry notification);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMultiple(List<NotificationEntry> notification);

    @Delete
    void remove(NotificationEntry notification);

    @Query("SELECT count(*) FROM notification_tb where id LIKE :id")
    int isNotification(long id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertProduct(SearchItemListModel item);

    @Query("select * from SearchItemListModel")
    Single<List<SearchItemListModel>> fetchItems();
}
