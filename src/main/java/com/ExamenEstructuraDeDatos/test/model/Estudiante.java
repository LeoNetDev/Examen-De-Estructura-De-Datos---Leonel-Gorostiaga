package com.ExamenEstructuraDeDatos.test.model;

public class Estudiante {
    public String nombre; // Requisito: nombre [cite: 58]
    public int puntaje;   // Requisito: puntaje [cite: 59]

    public Estudiante(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }
}
