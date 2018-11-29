package com.example.victorvela.isafeeducationnovo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.victorvela.isafeeducationnovo.R;
import com.example.victorvela.isafeeducationnovo.model.Administrador;
import com.example.victorvela.isafeeducationnovo.repository.AdministradorRepository;
import com.example.victorvela.isafeeducationnovo.repository.Repository;

public class AdministradorExcluirActivity extends AppCompatActivity {

    private EditText editIdAdministrador;
    private Repository repository;
    private Administrador administrador;
    private AdministradorRepository administradorRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador_excluir);

        /**
         * receber id para excluir
         */
        editIdAdministrador = findViewById(R.id.edit_id);

        administrador = new Administrador();
        administradorRepository = new AdministradorRepository(getApplicationContext());


    }

    public void excluirAdministrador(View view){
        administrador.setId(Integer.parseInt(editIdAdministrador.getText().toString()));//pode ser que esteja errado
        administradorRepository.delete(administrador.getId());
        Toast.makeText(this, "excluido com sucesso", Toast.LENGTH_SHORT).show();
    }
    public void teste(View view){
        Toast.makeText(this, administrador.getId() + " " + administrador.getNomeAdministrador() + " " + administrador.getSenhaAdministrador(), Toast.LENGTH_SHORT).show();
    }
}
