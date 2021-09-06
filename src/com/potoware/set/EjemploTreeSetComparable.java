package com.potoware.set;

import com.potoware.set.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>((a,b) -> a.getNombre().compareTo(b.getNombre()));
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNombre).reversed());
        sa.add(new Alumno("Juan",10));
        sa.add(new Alumno("Alexandre",10));
        sa.add(new Alumno("Pato",30));
        sa.add(new Alumno("Armando",10));
        sa.add(new Alumno("Zeuz",50));
        sa.add(new Alumno("Armando2",50));

        System.out.println("sa = " + sa);
    }
}
