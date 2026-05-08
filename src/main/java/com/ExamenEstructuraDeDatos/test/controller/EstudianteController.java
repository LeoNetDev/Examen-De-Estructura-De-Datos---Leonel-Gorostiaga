package com.ExamenEstructuraDeDatos.test.controller;

import com.ExamenEstructuraDeDatos.test.model.Estudiante;
import com.ExamenEstructuraDeDatos.test.estructuras.ListaEstudiantes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    private ListaEstudiantes lista = new ListaEstudiantes();

    @GetMapping("/agregar") // Requisito [cite: 74]
    public String agregar(@RequestParam String nombre, @RequestParam int puntaje) {
        lista.insertar(new Estudiante(nombre, puntaje));
        return "Estudiante " + nombre + " agregado";
    }

    @GetMapping // Requisito [cite: 74]
    public String mostrar() { return lista.mostrar(); }

    @GetMapping("/ordenados") // Requisito [cite: 74]
    public String ordenados() {
        lista.ordenarPorPuntaje();
        return lista.mostrar();
    }

    @GetMapping("/buscar/{nombre}") // Requisito [cite: 74]
    public String buscar(@PathVariable String nombre) { return lista.buscar(nombre); }
}