package com.potoware.set;

import com.potoware.set.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Juan",10));
        sa.add(new Alumno("Alexandre",10));
        sa.add(new Alumno("Pato",30));
        sa.add(new Alumno("Armando",10));
        sa.add(new Alumno("Zeuz",50));
        sa.add(new Alumno("Armando",10));
        sa.add(new Alumno("Armando",4));
        System.out.println("sa = " + sa);
    }
}
