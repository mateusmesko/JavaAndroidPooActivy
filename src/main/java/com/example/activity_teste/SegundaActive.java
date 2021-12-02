package com.example.activity_teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActive extends AppCompatActivity {


   private TextView txtnome;
   private TextView txtidade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_active);

        txtnome= findViewById(R.id.textNome);
        txtidade= findViewById(R.id.textIdade);
        //
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade=dados.getInt("idade");

        Usuario usuario = (Usuario) dados.getSerializable("objeto");


        //configurar valores recuperados
        txtnome.setText(usuario.getEmail());
        txtidade.setText(String.valueOf(idade));

    }
}
