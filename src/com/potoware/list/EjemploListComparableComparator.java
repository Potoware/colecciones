package com.potoware.list;

import com.potoware.set.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

       List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Juan",10));
        sa.add(new Alumno("Alexandre",10));
        sa.add(new Alumno("Pato",30));
        sa.add(new Alumno("Armando",10));
        sa.add(new Alumno("Zeuz",50));
        sa.add(new Alumno("Armando",10));
        sa.add(new Alumno("Armando",4));
        System.out.println("sa = " + sa);
        //Formas de ordenar
        //Collections.sort(sa, (a,b)-> b.getNota().compareTo(a.getNota()));
        //sa.sort((a,b)-> b.getNota().compareTo(a.getNota()));
        //sa.sort(Comparator.comparing((Alumno a)-> a.getNombre()).reversed());
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println("Iterando usando stream forecch lamda");
        sa.forEach(System.out::println);
    }
}
