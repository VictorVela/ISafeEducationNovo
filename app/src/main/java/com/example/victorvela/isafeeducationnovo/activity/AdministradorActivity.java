package com.example.victorvela.isafeeducationnovo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.victorvela.isafeeducationnovo.R;
import com.example.victorvela.isafeeducationnovo.adapter.AdministradorListAdapter;
import com.example.victorvela.isafeeducationnovo.model.Administrador;
import com.example.victorvela.isafeeducationnovo.repository.AdministradorRepository;

public class AdministradorActivity extends AppCompatActivity implements AdapterView.OnClickListener {

    private ListView listaAdministrador;
    private AdministradorRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);


        listaAdministrador = findViewById(R.id.listaAdministradores);
        repository = new AdministradorRepository(getApplicationContext());
        ArrayAdapter<Administrador> adapter = new AdministradorListAdapter(this,R.layout.administrador_item,repository.getAllAdministradores());
        listaAdministrador.setAdapter(adapter);

    }

    public void novoAdministrador(View view){
        Intent novoAdministrador = new Intent(AdministradorActivity.this,AdministradorCadastroActivity.class);
        startActivity(novoAdministrador);
    }

    public void atualizarAdministrador(View view){
        Intent atualizarAdministrador = new Intent(AdministradorActivity.this, AdministradorAtualizarActivity.class);
        startActivity(atualizarAdministrador);
    }

    public void excluirAdministrador(View view){
        Intent excluirAdministrador = new Intent(AdministradorActivity.this, AdministradorExcluirActivity.class);
        startActivity(excluirAdministrador);
    }

    @Override
    public void onClick(View v) {

    }
}
