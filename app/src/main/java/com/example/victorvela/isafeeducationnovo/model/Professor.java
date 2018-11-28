package com.example.victorvela.isafeeducationnovo.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "TB_professor")
public class Professor {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    private String nomeProfessor;
    private String senhaProfessor;

    public Professor() {
    }

    public Professor(long id, String nomeProfessor, String senhaProfessor) {
        this.id = id;
        this.nomeProfessor = nomeProfessor;
        this.senhaProfessor = senhaProfessor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSenhaProfessor() {
        return senhaProfessor;
    }

    public void setSenhaProfessor(String senhaProfessor) {
        this.senhaProfessor = senhaProfessor;
    }
}
