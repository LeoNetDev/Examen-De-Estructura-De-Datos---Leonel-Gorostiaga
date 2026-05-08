package com.ExamenEstructuraDeDatos.test.estructuras;

import com.ExamenEstructuraDeDatos.test.model.Estudiante; // Importación necesaria

public class ListaEstudiantes {
    private Nodo cabeza;

    public void insertar(Estudiante e) { // Requisito: insertar [cite: 65]
        Nodo nuevo = new Nodo(e);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public String mostrar() { // Requisito: mostrar [cite: 66]
        if (cabeza == null) return "Lista vacía";
        StringBuilder sb = new StringBuilder();
        Nodo temp = cabeza;
        while (temp != null) {
            sb.append("Estudiante: ").append(temp.estudiante.nombre)
                    .append(" - Puntaje: ").append(temp.estudiante.puntaje).append(" | ");
            temp = temp.siguiente;
        }
        return sb.toString();
    }

    public void ordenarPorPuntaje() { // Requisito: Ordenar mayor a menor [cite: 67]
        if (cabeza == null || cabeza.siguiente == null) return;
        boolean huboCambio;
        do {
            huboCambio = false;
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                if (actual.estudiante.puntaje < actual.siguiente.estudiante.puntaje) {
                    Estudiante temp = actual.estudiante;
                    actual.estudiante = actual.siguiente.estudiante;
                    actual.siguiente.estudiante = temp;
                    huboCambio = true;
                }
                actual = actual.siguiente;
            }
        } while (huboCambio);
    }

    public String buscar(String nombre) { // Requisito: buscar por nombre [cite: 68]
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.estudiante.nombre.equalsIgnoreCase(nombre)) {
                return "Encontrado: " + temp.estudiante.nombre + " (Puntaje: " + temp.estudiante.puntaje + ")";
            }
            temp = temp.siguiente;
        }
        return "Estudiante no encontrado";
    }
}
