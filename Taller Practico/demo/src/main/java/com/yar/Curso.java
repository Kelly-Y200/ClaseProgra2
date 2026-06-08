package com.yar;

import java.util.Random;

public final class Curso {

    private final String nombre;
    private final int capacidadMaxima;
    private final int inscritos;

    public Curso(String nombre, int inscritos) {
        this.nombre = nombre;

        Random random = new Random();
        int capacidad = random.nextInt(16) + 20; 
        this.capacidadMaxima = capacidad;

        if (inscritos > capacidad) {
            System.out.println("El número de alumnos no puede exceder a " + capacidad);
            this.inscritos = capacidad;
        } else {
            this.inscritos = inscritos;
        }
    }

    @Override
    
    public String toString() {
        return "Curso: " + nombre + ", Inscritos: " + inscritos + ", Capacidad Máxima: " + capacidadMaxima;
    }
}