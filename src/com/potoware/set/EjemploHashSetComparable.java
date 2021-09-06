package com.potoware.set;

import com.potoware.set.modelo.Alumno;

import java.util.*;

public class EjemploHashSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();

        //List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Juan",10));
        sa.add(new Alumno("Alexandre",10));
        sa.add(new Alumno("Pato",30));
        sa.add(new Alumno("Armando",10));
        sa.add(new Alumno("Zeuz",50));
        sa.add(new Alumno("Armando",10));
        sa.add(new Alumno("Armando",4));
        System.out.println("sa = " + sa);

        System.out.println("Iterando usando for each");
        for(Alumno a: sa){
            System.out.println(a);
        }

        System.out.println("Iterando usando while e iterator");
        Iterator<Alumno> it = sa.iterator();

        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }
        System.out.println("Iterando usando stream forecch lamda");
        sa.forEach(System.out::println);
    }
}
