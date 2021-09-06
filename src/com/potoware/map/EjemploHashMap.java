package com.potoware.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String,Object> persona = new HashMap<>();
        System.out.println("total: " + persona.size());
        persona.put(null,"1234");
        persona.put(null,"12345");
        persona.put("nombre", "Juan");
        persona.put("apellido", "Doe");
        persona.put("email","apotosi@uninpahu.edu.co");
        persona.put("edad", 38);
        persona.put("apellido", "rueda");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "colombia");
        direccion.put("ciudad", "bogota");
        direccion.put("departamento", "cundinamarca");
        direccion.put("barrio", "Villa Diana");

        persona.put("direccion",direccion);
        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String calle = direccionPersona.getOrDefault("numero","La playa");

        System.out.println("El pais de Juan es:  " + pais);
        System.out.println("La calle de juan es: " + calle);
        System.out.println("La ciudad de juan es:  " + ciudad);


        //String apellidoPaterno = persona.remove("apellido");
        boolean apellidoPaterno = persona.remove("apellido","rueda");
        System.out.println("persona = " + persona);
        
        boolean b2 = persona.containsKey("apellido");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("38");
        System.out.println("b2 = " + b2);

        Collection<Object> valores = persona.values();
        for (Object valor: valores) {
            System.out.println("valor = " + valor);
            
        }
        System.out.println("====== = ======");
        Set<String> llaves = persona.keySet();
        for (String llave: llaves 
             ) {
            System.out.println("llave = " + llave);
            
        }
        System.out.println("====== =ENTRYSET ======");
        for(Map.Entry<String, Object> par: persona.entrySet()){
            System.out.println("par = " + par.getKey());
        }
        System.out.println("====== =Lamda ======");
        persona.forEach((llave,valor)->
                System.out.println("llave = " + llave + "| valor " +valor));

        System.out.println("total: " + persona.size());
        persona.replace("nombre","Armando");

        System.out.println("Persona = " + persona);

        persona.replace("nombre","Armando", "Armero");
        System.out.println("persona = " + persona);

    }

}
