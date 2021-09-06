package com.potoware.map;

import java.util.*;

public class EjemploTreeMap {

    public static void main(String[] args) {

        Map<String,Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        System.out.println("total: " + persona.size());
        persona.put("nombre", "Juan");
        persona.put("apellido", "Doe");
        persona.put("email","apotosi@uninpahu.edu.co");
        persona.put("edad", 38);
        persona.put("apellido", "rueda");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "colombia");
        direccion.put("ciudad", "bogota");
        direccion.put("departamento", "cundinamarca");
        direccion.put("barrio", "Villa Diana");

        persona.put("direccion",direccion);
        System.out.println("persona = " + persona);


    }

}
