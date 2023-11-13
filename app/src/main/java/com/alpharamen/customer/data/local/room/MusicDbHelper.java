package com.alpharamen.customer.data.local.room;

import androidx.room.Room;
import android.content.Context;

import com.alpharamen.customer.dagger.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MusicDbHelper {

    private Context mContext;

    @Inject
    public MusicDbHelper(@ApplicationContext Context context) {
        mContext = context;
    }

    public FoodDatabase provideMusicDatabase() {
        return Room.databaseBuilder(mContext,
                FoodDatabase.class, FoodDatabase.DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

    public FoodDao provideMusicDao(FoodDatabase musicDatabase) {
        return musicDatabase.musicDao();
    }
}
