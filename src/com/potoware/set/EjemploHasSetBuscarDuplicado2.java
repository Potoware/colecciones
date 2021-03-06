package com.potoware.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHasSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces ={"Corvina","Globo","Mojarra","Delfin","Tiburon","Globo","Mojarra"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for(String pez:peces){
            if(!unicos.add(pez)){
               duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("unicos: = " + unicos);
        System.out.println("duplicados = " + duplicados);

    }
}
