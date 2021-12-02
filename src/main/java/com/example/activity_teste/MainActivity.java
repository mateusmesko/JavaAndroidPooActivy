package com.example.activity_teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoenviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoenviar = findViewById(R.id.passarDados);

        botaoenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SegundaActive.class);
                //objetos
                Usuario usuario = new Usuario("mateus","mateusmesko@gmail.com");


                //passar dados
                intent.putExtra("nome","jamilton");
                intent.putExtra("idade",30);
                intent.putExtra("objeto", usuario);

                startActivity( intent );

            }
        });
    }
}
