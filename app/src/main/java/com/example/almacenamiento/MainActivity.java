package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SharedPreference(View view){
        Intent i = new Intent(this, SharedPreference.class);
        startActivity(i);
    }

    public void Agenda(View view){
        Intent i = new Intent(this, agenda.class);
        startActivity(i);
    }

    public void notas(View view){
        Intent i = new Intent(this, BlocNotas.class);
        startActivity(i);
    }

    public void Nombre(View view){
        Intent i = new Intent(this, Nombre1.class);
        startActivity(i);
    }



}