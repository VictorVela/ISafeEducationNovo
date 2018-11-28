package com.example.victorvela.isafeeducationnovo.repository;

import android.content.Context;

public class Repository {
    private AdministradorRepository administradorRepository;

    public Repository(Context context){
        administradorRepository = new AdministradorRepository(context);
    }

    public  AdministradorRepository getAdministradorRepository() {return  administradorRepository;}
}

