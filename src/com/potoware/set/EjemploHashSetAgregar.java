package com.potoware.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("siete");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println("hs = " + hs);

        System.out.println(hs.add("tres"));




    }
}
