package com.bojorqueanabel.miprimerappconandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText textoNombre;
    TextView etiqueta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etiqueta=findViewById(R.id.textView3);
//cannot find symbol variable textView
    }

    public void onClick(View view) {



    }
}