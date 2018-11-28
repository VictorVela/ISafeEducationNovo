package com.example.victorvela.isafeeducationnovo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.victorvela.isafeeducationnovo.R;

public class ExemploActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo);
    }
    public void novoExemplo(View view){
        Intent novoAdministrador = new Intent(ExemploActivity.this,ExemploCadastroActivity.class);
        startActivity(novoAdministrador);
    }

}
