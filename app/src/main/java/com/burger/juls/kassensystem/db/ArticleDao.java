package com.burger.juls.kassensystem.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.OnConflictStrategy;

import java.util.List;

@Dao
public interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Article article);

    @Delete
    void delete(Article article);

    @Query("SELECT * FROM article")
    List<Article> getAll();


}
