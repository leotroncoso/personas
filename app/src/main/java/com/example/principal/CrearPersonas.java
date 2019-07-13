package com.example.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CrearPersonas extends AppCompatActivity {

    //declara variables

    private EditText cedula, nombre, apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        //traer los objetos
        setContentView(R.layout.activity_crear_personas);
        cedula = findViewById(R.id.txtCedula);
        nombre = findViewById(R.id.txtNombre);
        apellido = findViewById(R.id.txtApellido);
    }
    //opcion para el boton
    public void guardar(View v){
        String nom, apell, ced;
        //crea objeto persona
        Persona p;
        ced = cedula.getText().toString();
        apell = apellido.getText().toString();
        nom = nombre.getText().toString();
        p = new Persona(ced,nom,apell);
        p.guardar();
    }
    //para limpiar
    public void limpiar(View V){
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        cedula.requestFocus();

    }
}
