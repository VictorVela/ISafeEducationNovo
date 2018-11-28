package com.example.victorvela.isafeeducationnovo.repository;

import android.content.Context;

import com.example.victorvela.isafeeducationnovo.DAO.ExemploDAO;
import com.example.victorvela.isafeeducationnovo.databese.ISafeEducationDataBase;
import com.example.victorvela.isafeeducationnovo.model.Exemplo;

import java.util.List;

public class ExemploRepository {
    private Exemplo exemplo;
    private ExemploDAO mExemploDAO;
    private List<Exemplo> mExemplos;

    public ExemploRepository(Context context){
        ISafeEducationDataBase db = ISafeEducationDataBase.getDatabase(context);
        mExemploDAO = db.exemploDAO();
    }

    public void insert(Exemplo exemplo){
        mExemploDAO.insertOnlySingleexemplo(exemplo);
    }
}
