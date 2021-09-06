package com.potoware.set;

import com.potoware.set.modelo.Alumno;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> linkedListl = new LinkedList<>();
        System.out.println(linkedListl +", size =" + linkedListl.size());
        System.out.println("esta vacia " +linkedListl.isEmpty());
        linkedListl.add(new Alumno("Juan", 10));
        linkedListl.add(new Alumno("Alexandre", 10));
        linkedListl.add(new Alumno("Pato", 30));
        linkedListl.add( new Alumno("Armando", 10));
        linkedListl.add(  new Alumno("Zeuz", 50));

        System.out.println(linkedListl +", size =" + linkedListl.size());
        linkedListl.addFirst(new Alumno("Juan",16));
        linkedListl.addLast(new Alumno("Kula",20));
        System.out.println(linkedListl +", size =" + linkedListl.size());

        System.out.println("Primero "+ linkedListl.getFirst());
        System.out.println("Ultimo "+ linkedListl.getLast());
        System.out.println("Indice 2" + linkedListl.get(2));

        System.out.println("Primero Sin excepcion: " + linkedListl.peekFirst());
        System.out.println("Ultimo Sin excepcion: " + linkedListl.peekLast());

        Alumno primero = linkedListl.removeFirst();
        Alumno segundo = linkedListl.removeLast();

        System.out.println(primero);
        System.out.println(segundo);
        System.out.println(linkedListl);

        linkedListl.remove(new Alumno("Armando", 10));
        System.out.println(linkedListl);
        Alumno paco = new Alumno("Armando", 10);
        System.out.println("Indice de Paco "+ linkedListl.indexOf(paco));
        

    }
}
