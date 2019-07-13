package com.example.principal;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<persona> personas = new ArrayList();
    public static void guardar(persona p){
        personas.add(p);
    }
    public static ArrayList<persona> obtener(){
        return personas;
    }
}
