package com.aluracursos.screenmatch_frases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO getFrases() {
        return service.getRandomFrase();
    }
}
