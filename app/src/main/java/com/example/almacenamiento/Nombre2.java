package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Nombre2 extends AppCompatActivity {

    private TextView tv1, tv2;

    RatingBar ratingBar;
    Button Calificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre2);

        tv1 = findViewById(R.id.et_nombre2);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Bienvenido" + dato);
        ratingBar = findViewById(R.id.ratingBar);
        Calificar = findViewById(R.id.calificar);

        Calificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(), s + "Start", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void Menu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void Regresar(View view){
        Intent i = new Intent(this, Nombre1.class);
        startActivity(i);
    }

}