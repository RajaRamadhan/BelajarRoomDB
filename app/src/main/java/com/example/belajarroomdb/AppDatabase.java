package com.example.belajarroomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.belajarroomdb.dao.ProdukDao;
import com.example.belajarroomdb.model.Produk;

@Database(entities = {Produk.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ProdukDao ProdukDao();
}
