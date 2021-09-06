package com.potoware.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHasSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces ={"Corvina","Globo","Mojarra","Delfin","Tiburon","Globo"};

        Set<String> unicos = new HashSet<>();

        for(String pez:peces){
            if(!unicos.add(pez)){
                System.out.println("Elemento Duplicado: " +pez);
            }
        }

        System.out.println("unicos no duplicados = " + unicos.size()+ unicos);

    }
}
