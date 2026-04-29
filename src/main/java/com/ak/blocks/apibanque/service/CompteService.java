package com.ak.blocks.apibanque.service;

import com.ak.blocks.apibanque.model.Compte;
import com.ak.blocks.apibanque.repository.CompteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompteService {
    
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> recupererTousLesComptes() {
        return compteRepository.findAll();
    }

    
    public Compte creerCompte(Compte compte) {
        return compteRepository.save(compte);
    }
}