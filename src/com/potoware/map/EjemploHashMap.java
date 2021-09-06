package com.potoware.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String,String> persona = new HashMap<>();
        System.out.println("total: " + persona.size());
        persona.put(null,"1234");
        persona.put(null,"12345");
        persona.put("nombre", "Juan");
        persona.put("apellido", "Doe");
        persona.put("email","apotosi@uninpahu.edu.co");
        persona.put("edad", "38");
        persona.put("apellido", "rueda");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        //String apellidoPaterno = persona.remove("apellido");
        boolean apellidoPaterno = persona.remove("apellido","rueda");
        System.out.println("persona = " + persona);
        
        boolean b2 = persona.containsKey("apellido");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("38");
        System.out.println("b2 = " + b2);

        Collection<String> valores = persona.values();
        for (String valor: valores) {
            System.out.println("valor = " + valor);
            
        }
        System.out.println("====== = ======");
        Set<String> llaves = persona.keySet();
        for (String llave: llaves 
             ) {
            System.out.println("llave = " + llave);
            
        }
        System.out.println("====== =ENTRYSET ======");
        for(Map.Entry<String,String> par: persona.entrySet()){
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
