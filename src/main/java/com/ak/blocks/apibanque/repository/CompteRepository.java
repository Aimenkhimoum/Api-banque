package com.ak.blocks.apibanque.repository;

import com.ak.blocks.apibanque.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
    // JpaRepository contient déjà toutes les méthodes : save(), findAll(), delete()...
}