package com.example.victorvela.isafeeducationnovo.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

//@Entity(tableName = "TB_administrador", foreignKeys = {@ForeignKey(entity = Professor.class, parentColumns = "ID", childColumns = "professor_id"),
//        @ForeignKey(entity = Aluno.class, parentColumns = "ID", childColumns = "aluno_id")})

@Entity(tableName = "TB_administrador")

public class Administrador {

    /*
    declaração de variaveis
     */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    private String nomeAdministrador;
    private String senhaAdministrador;

//    @ColumnInfo(name = "professor_id")
//    private long professorId;
//
//    @ColumnInfo(name = "aluno_id")
//    private long alunoId;

    public Administrador(long id, String nomeAdministrador, String senhaAdministrador) {
        this.id = id;
        this.nomeAdministrador = nomeAdministrador;
        this.senhaAdministrador = senhaAdministrador;
    }

    public Administrador() {
    }

    /*
    get set
     */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeAdministrador() {
        return nomeAdministrador;
    }

    public void setNomeAdministrador(String nomeAdministrador) {
        this.nomeAdministrador = nomeAdministrador;
    }

    public String getSenhaAdministrador() {
        return senhaAdministrador;
    }

    public void setSenhaAdministrador(String senhaAdministrador) {
        this.senhaAdministrador = senhaAdministrador;
    }

//    public long getProfessorId() {
//        return professorId;
//    }
//
//    public void setProfessorId(long professorId) {
//        this.professorId = professorId;
//    }
//
//    public long getAlunoId() {
//        return alunoId;
//    }
//
//    public void setAlunoId(long alunoId) {
//        this.alunoId = alunoId;
//    }
}
