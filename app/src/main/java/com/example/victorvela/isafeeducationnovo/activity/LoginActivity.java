package com.example.victorvela.isafeeducationnovo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.victorvela.isafeeducationnovo.R;

public class LoginActivity extends AppCompatActivity {

    private Button buttonEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonEntrar = findViewById(R.id.atualizar);

        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), CadastroConsultaActivity.class);

                startActivity(intent);

            }
        });
    }

}
