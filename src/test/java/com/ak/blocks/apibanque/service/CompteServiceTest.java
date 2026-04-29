package com.ak.blocks.apibanque.service;

import com.ak.blocks.apibanque.model.Compte;
import com.ak.blocks.apibanque.repository.CompteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CompteServiceTest {

    @Mock 
    private CompteRepository repository;
    
    @InjectMocks 
    private CompteService service;

    @Test
    void shouldReturnAllComptes() {
        // Arrange
        Compte c = new Compte(); 
        c.setTitulaire("Aimen");
        when(repository.findAll()).thenReturn(List.of(c));

        // Act
        List<Compte> result = service.recupererTousLesComptes();

        // Assert
        assertEquals(1, result.size());
        assertEquals("Aimen", result.get(0).getTitulaire());
    }
}