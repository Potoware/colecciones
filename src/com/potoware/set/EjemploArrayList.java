package com.potoware.set;

import com.potoware.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al +", size =" + al.size());
        System.out.println("esta vacia " +al.isEmpty());
        al.add(new Alumno("Juan", 10));
        al.add(new Alumno("Alexandre", 10));
        al.add(new Alumno("Pato", 30));
        al.add(2, new Alumno("Armando", 10));
        al.set( 3, new Alumno("Zeuz", 50));
        System.out.println(al +", size =" + al.size());

        al.remove(new Alumno("Alexandre",10));
        //al.remove(3);
        System.out.println(al +", size =" + al.size());

        boolean b = al.contains(new Alumno("Alexandre",10));
        System.out.println("La lista contiene Zeuz " +b);

        Object a[] = al.toArray();

        for(int i = 0 ; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
