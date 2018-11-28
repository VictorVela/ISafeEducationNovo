package com.example.victorvela.isafeeducationnovo.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "TB_aluno")

public class Aluno {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    private String nomeAluno;
    private String senhaString;
    private int    matricula;

    public Aluno() {
    }

    public Aluno(long id, String nomeAluno, String senhaString, int matricula) {
        this.id = id;
        this.nomeAluno = nomeAluno;
        this.senhaString = senhaString;
        this.matricula = matricula;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSenhaString() {
        return senhaString;
    }

    public void setSenhaString(String senhaString) {
        this.senhaString = senhaString;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
