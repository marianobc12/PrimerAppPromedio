package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText matematica;
    private EditText lengua;
    private EditText historia;
    private TextView promedio;
    private ImageView desaprobar;
    private ImageView aprobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        matematica= (EditText)findViewById(R.id.matematica);
        lengua=(EditText)findViewById(R.id.lengua);
        historia=(EditText)findViewById(R.id.historia);
        promedio=(TextView)findViewById(R.id.txt_promedio);
        desaprobar=(ImageView)findViewById(R.id.imageDesaprobar);
        aprobar=(ImageView)findViewById(R.id.imageAprobar);
    }

    public void calcularPromedio(View view){
        String mateString=matematica.getText().toString();
        String lenguaString=lengua.getText().toString();
        String historiaString=historia.getText().toString();

        double mateInt=Double.parseDouble(mateString);
        double lenguaInt=Double.parseDouble(lenguaString);
        double historiaInt=Double.parseDouble(historiaString);

        double prom=(mateInt+lenguaInt+historiaInt)/3;

        String promString=String.format("%.2f", prom);

        if (prom>=6){
            promedio.setText("Aprobado, promedio: "+promString);
            aprobar.setVisibility(View.VISIBLE);
            desaprobar.setVisibility(View.INVISIBLE);
        }else{
            promedio.setText("Desaprobado, promedio: "+promString);
            desaprobar.setVisibility(View.VISIBLE);
            aprobar.setVisibility(View.INVISIBLE);
        }
    }



}
