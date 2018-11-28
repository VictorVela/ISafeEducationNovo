package com.example.victorvela.isafeeducationnovo.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.victorvela.isafeeducationnovo.model.Professor;

import java.util.List;

@Dao
public interface ProfessorDAO {
    @Insert
    void insert(Professor professor);

    @Update
    void update(Professor professor);

    @Query("SELECT * FROM TB_professor ORDER BY nomeProfessor DESC")
    List<Professor> loadProfessores();

}
