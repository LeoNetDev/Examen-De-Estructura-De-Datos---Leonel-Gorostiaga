package com.ExamenEstructuraDeDatos.test.controller;

import com.ExamenEstructuraDeDatos.test.service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notas")
public class NotasController {
    @Autowired
    private CalificacionesService service;

    @GetMapping("/agregar") // Requisito [cite: 35]
    public String agregar(@RequestParam double valor) { return service.agregar(valor); }

    @GetMapping // Requisito [cite: 35]
    public double[] mostrar() { return service.obtenerTodas(); }

    @GetMapping("/promedio") // Requisito [cite: 35]
    public double promedio() { return service.promedio(); }

    @GetMapping("/max") // Requisito [cite: 35]
    public double max() { return service.max(); }

    @GetMapping("/min") // Requisito [cite: 35]
    public double min() { return service.min(); }
}