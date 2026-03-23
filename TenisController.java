package com.runli.labarotariotematico.controller;

import com.runli.labarotariotematico.ModeloRepository;
import com.runli.labarotariotematico.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TenisController {

    @Autowired
    private ModeloRepository modeloRepository;

    // ESTO ARREGLA EL GET (3 puntos)
    @GetMapping("/modelos")
    public List<Modelo> listarTodos() {
        return modeloRepository.findAll();
    }

    // ESTO ARREGLA EL POST (3 puntos) - ¡AQUÍ ESTABA EL ERROR!
    @PostMapping("/modelos")
    public Modelo guardar(@RequestBody Modelo nuevoModelo) {
        return modeloRepository.save(nuevoModelo);
    }
}
