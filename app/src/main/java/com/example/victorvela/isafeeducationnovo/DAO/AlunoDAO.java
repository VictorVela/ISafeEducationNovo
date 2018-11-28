package com.example.victorvela.isafeeducationnovo.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.victorvela.isafeeducationnovo.model.Aluno;

import java.util.List;

@Dao
public interface AlunoDAO {

    @Insert
    void insert(Aluno aluno);

    @Update
    void update(Aluno aluno);

    @Query("SELECT * FROM TB_aluno ORDER BY nomeAluno DESC")
    List<Aluno> loadAlunos();
}
