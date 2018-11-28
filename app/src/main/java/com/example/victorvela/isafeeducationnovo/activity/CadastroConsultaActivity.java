package com.example.victorvela.isafeeducationnovo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.victorvela.isafeeducationnovo.R;

public class CadastroConsultaActivity extends AppCompatActivity {

    private Button buttonSair;

    private Button buttonAdministrador;

    private Button buttonExemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_consulta);

        buttonSair          = findViewById(R.id.sair);
        buttonAdministrador = findViewById(R.id.atualizar);
        buttonExemplo       = findViewById(R.id.exemplo);

        /*
        voltar para login
         */
        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        /*
        ir para administrador
         */
        buttonAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), AdministradorActivity.class);

                startActivity(intent);

            }
        });

        /*
        ir para administrador
         */
        buttonExemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ExemploActivity.class);

                startActivity(intent);

            }
        });
    }
}
