package com.alpharamen.customer.data.local.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.alpharamen.customer.data.local.room.notification.NotificationEntry;
import com.alpharamen.customer.data.models.SearchItemListModel;

@Database(entities = {NotificationEntry.class, SearchItemListModel.class}, version = 1, exportSchema = false)
public abstract class FoodDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "musicapp.db";

    public abstract FoodDao musicDao();
}
