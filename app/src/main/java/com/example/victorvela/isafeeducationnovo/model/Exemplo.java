package com.example.victorvela.isafeeducationnovo.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Exemplo {
    @NonNull
    @PrimaryKey
    private String exemploId;
    private String exemploName;

    public Exemplo() {
    }

    @NonNull
    public String getExemploId() {
        return exemploId;
    }

    public void setExemploId(@NonNull String exemploId) {
        this.exemploId = exemploId;
    }

    public String getExemploName() {
        return exemploName;
    }

    public void setExemploName(String exemploName) {
        this.exemploName = exemploName;
    }
}