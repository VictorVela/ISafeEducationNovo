package com.example.victorvela.isafeeducationnovo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.victorvela.isafeeducationnovo.R;
import com.example.victorvela.isafeeducationnovo.model.Exemplo;
import com.example.victorvela.isafeeducationnovo.repository.ExemploRepository;
import com.example.victorvela.isafeeducationnovo.repository.Repository;

public class ExemploCadastroActivity extends AppCompatActivity {

    private EditText editNomeDisciplina;
    private Repository repository;
    private Exemplo exemplo;
    private ExemploRepository exemploRepository;


//    private static final String DATABASE_NAME = "exemplo_db";
//    private ExemploDataBase exemploDataBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_cadastro);

        editNomeDisciplina = findViewById(R.id.edit_nomeDisciplina);
    }

    public void salvarDisciplina(View view){
        exemplo = new Exemplo();
        exemploRepository = new ExemploRepository(getApplicationContext());
        exemplo.setExemploName(editNomeDisciplina.getText().toString());
        exemploRepository.insert(exemplo);
        Toast.makeText(this, exemplo.getExemploName(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "inserido com sucesso", Toast.LENGTH_SHORT).show();
    }

    public void verificar(View view){
        Toast.makeText(this, exemplo.getExemploName(), Toast.LENGTH_SHORT).show();
    }
}
