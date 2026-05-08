package com.ExamenEstructuraDeDatos.test.estructuras;

import com.ExamenEstructuraDeDatos.test.model.Estudiante; // Importación necesaria

public class Nodo {
    public Estudiante estudiante;
    public Nodo siguiente;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
    }
}