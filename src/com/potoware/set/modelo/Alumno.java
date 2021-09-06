package com.potoware.set.modelo;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre+ " nota " + nota;
    }


    @Override
    public int compareTo(Alumno o) {
        if(this.nota ==null) {
            return 0;
        }
        return this.nota.compareTo(o.nota);
    }
}
