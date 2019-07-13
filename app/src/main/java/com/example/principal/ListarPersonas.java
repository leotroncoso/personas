package com.example.principal;

import android.service.autofill.TextValueSanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {
// traer el table layout o la tabla
    private TableLayout tabla;
    private ArrayList<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);
        //aqui la tabla
        tabla = findViewById(R.id.Tabla);
        //traer personas
        personas = Datos.obtener();
        for (int i =0; i<personas.size(); i++){
            //CREA el objeto fila
            TableRow fila = new TableRow(this);
            //creo los objetoPersonas columnas
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);


            //en la primera columna se llena con autoincrementar
            c1.setText(""+i+1);
            //la segunda columna se llena con cedula de la persona
            c2.setText(personas.get(i).getCedula());
            //la tecer acolumna el nombre de la persona
            c3.setText(personas.get(i).getNombre());
            //la tecer acolumna el apellido de la persona
            c4.setText(personas.get(i).getApellido());

            //pasar las columnas a las filas para llenar
            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            // pasar la filas a la tabla
            tabla.addView(fila);
        }
    }
}
