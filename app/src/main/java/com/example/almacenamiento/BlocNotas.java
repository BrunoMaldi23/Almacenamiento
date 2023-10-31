package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BlocNotas extends AppCompatActivity {

    private EditText et1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloc_notas);

        et1 = findViewById(R.id.txt_notas);
        String archivos [] = fileList();
        if (ArchivoExiste(archivos, "Notas.txt")){
            try {
                InputStreamReader archivo = new InputStreamReader(openFileInput("Notas.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String NotasCompleta = "";
                while (linea != null){
                    NotasCompleta = NotasCompleta + linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                et1.setText(NotasCompleta);
            }catch (IOException e){ }
        }

    }

    private boolean ArchivoExiste(String archivo[], String NombreArchivo){
        for (int i = 0; i<archivo.length; i++)
            if (NombreArchivo.equals(archivo[1])) return true; return false;

    }

    public void GuardarNotas(View view){
        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("Notas.txt", Activity.MODE_PRIVATE));
            archivo.write(et1.getText().toString());
            archivo.flush();
            archivo.close();
        }catch (IOException e){
            Toast.makeText(this, "Notas Guardadas", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}