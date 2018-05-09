package com.burger.juls.kassensystem.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Article.class}, version = 1)
public abstract class ArticleDatabase extends RoomDatabase {

    public abstract ArticleDao articleDao();

    private static ArticleDatabase INSTANCE;

    static ArticleDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ArticleDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ArticleDatabase.class, "article_database")
                            .build();

                }
            }
        }
        return INSTANCE;
    }
}
