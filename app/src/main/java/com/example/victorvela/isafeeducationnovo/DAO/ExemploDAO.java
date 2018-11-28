package com.example.victorvela.isafeeducationnovo.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.victorvela.isafeeducationnovo.model.Exemplo;

import java.util.List;

@Dao
public interface ExemploDAO {
    @Insert
    void insertOnlySingleexemplo (Exemplo exemplo);

    @Insert
    void insertMultipleexemplos (List<Exemplo> moviesList);

    @Query("SELECT * FROM Exemplo WHERE exemploId = :exemploId")
    Exemplo fetchOneMoviesbyExemploId (int exemploId);

    @Update
    void updateexemplo (Exemplo exemplo);

    @Delete
    void deleteexemplo (Exemplo exemplo);
}
