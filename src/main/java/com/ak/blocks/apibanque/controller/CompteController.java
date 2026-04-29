package com.ak.blocks.apibanque.controller;

import com.ak.blocks.apibanque.model.Compte;
import com.ak.blocks.apibanque.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/comptes")
@CrossOrigin(origins = "http://localhost:5173")
public class CompteController {
    @Autowired
    private CompteService service;

    @GetMapping
    public List<Compte> getComptes() {
        return service.recupererTousLesComptes();
    }

    @PostMapping
    public Compte ajouterCompte(@RequestBody Compte compte) {
        return service.creerCompte(compte);
    }
}