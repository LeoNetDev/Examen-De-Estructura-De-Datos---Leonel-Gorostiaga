package com.ExamenEstructuraDeDatos.test.service;
import org.springframework.stereotype.Service;
@Service
public class CalificacionesService {
    private double[] notas = new double[10]; // Requisito: arreglo de 10 [cite: 23]
    private int contador = 0;
    public String agregar(double valor) { // Requisito [cite: 25]
        if (contador < 10) {
            notas[contador++] = valor;
            return "Nota agregada";
        }
        return "Arreglo lleno";
    }
    public double[] obtenerTodas() { return notas; } // Requisito [cite: 26]
    public double promedio() { // Requisito [cite: 27]
        if (contador == 0) return 0;
        double suma = 0;
        for (int i = 0; i < contador; i++) suma += notas[i];
        return suma / contador;
    }
    public double max() { // Requisito [cite: 28]
        if (contador == 0) return 0;
        double m = notas[0];
        for (int i = 1; i < contador; i++) if (notas[i] > m) m = notas[i];
        return m;
    }
    public double min() { // Requisito [cite: 29]
        if (contador == 0) return 0;
        double m = notas[0];
        for (int i = 1; i < contador; i++) if (notas[i] < m) m = notas[i];
        return m;
    }
}