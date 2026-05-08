package com.ExamenEstructuraDeDatos.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula")
public class AulaController {
    private int[][] asientos = new int[5][5]; // Requisito: 5x5 [cite: 38]

    @GetMapping // Requisito [cite: 54]
    public int[][] mostrar() { return asientos; }

    @GetMapping("/ocupar") // Requisito [cite: 54]
    public String ocupar(@RequestParam int fila, @RequestParam int columna) {
        asientos[fila][columna] = 1;
        return "Asiento [" + fila + "," + columna + "] ocupado";
    }

    @GetMapping("/liberar") // Requisito [cite: 54]
    public String liberar(@RequestParam int fila, @RequestParam int columna) {
        asientos[fila][columna] = 0;
        return "Asiento [" + fila + "," + columna + "] liberado";
    }

    @GetMapping("/ocupados") // Requisito [cite: 54]
    public int ocupados() {
        int c = 0;
        for (int[] f : asientos) for (int a : f) if (a == 1) c++;
        return c;
    }
}