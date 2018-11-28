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

public class AdministradorCadastroActivity extends AppCompatActivity {

    private EditText editNomeAdministrador, editSenhaAdministrador;
    private Repository repository;
    private Administrador administrador;
    private AdministradorRepository administradorRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador_cadastro);

        /**
         * receber nome e senha da tela de cadastro
         */
        editNomeAdministrador = findViewById(R.id.edit_nomeAdministrador);
        editSenhaAdministrador = findViewById(R.id.edit_senhaAdministrador);

        administrador = new Administrador();
        administradorRepository = new AdministradorRepository(getApplicationContext());

    }

    public void salvarAdministrador(View view){
        administrador.setNomeAdministrador(editNomeAdministrador.getText().toString());
        administrador.setSenhaAdministrador(editSenhaAdministrador.getText().toString());
        //neste momento fazenmos uma chamada do repository que por fim chama o repository do administrador executando o insert
        administradorRepository.insert(administrador);
        Toast.makeText(this, administrador.getNomeAdministrador(), Toast.LENGTH_SHORT).show();
    }

    public void teste(View view){
        administrador.setNomeAdministrador("teste");
        administrador.setSenhaAdministrador("teste");
        Toast.makeText(this, "teste de tela", Toast.LENGTH_SHORT).show();
    }
}
