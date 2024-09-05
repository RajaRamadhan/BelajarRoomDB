package com.example.belajarroomdb.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.example.belajarroomdb.model.Produk;

import java.util.List;

@Dao
public interface ProdukDao {
    @Insert
    void insert (Produk produk);

    @Update
    void update (Produk produk);

    @Delete
    void delete (Produk produk);

    @Query("SELECT * FROM produk")
    List<Produk> getAll();

}