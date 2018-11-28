package com.example.victorvela.isafeeducationnovo.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.victorvela.isafeeducationnovo.model.Administrador;
import com.example.victorvela.isafeeducationnovo.model.Aluno;
import com.example.victorvela.isafeeducationnovo.model.Professor;

import java.util.List;

@Dao
public interface AdministradorDAO {

    @Insert
    void insert(Administrador administrador);

    @Update
    void update(Administrador administrador);

    @Query("SELECT * FROM TB_administrador WHERE TB_administrador.ID == :id")
    Administrador loadAdministradorByID(Long id);

    @Query("DELETE FROM TB_administrador WHERE TB_administrador.ID == :id")
    void delete(long id);

    @Query("SELECT * FROM TB_administrador ORDER BY id")
    List<Administrador> loadAdministradores();

    @Query("SELECT * FROM TB_administrador ORDER BY id")
    List<AdministradorJoin> loadAdministradorJoin();// nosso projeto não precisa usaar um Join ainda


    static class AdministradorJoin{
        @Embedded
        public Administrador administrador;
        @Embedded(prefix = "professor_")
        public Professor professor;
        @Embedded(prefix = "aluno_")
        public Aluno aluno;
    }
}
