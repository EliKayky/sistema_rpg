package com.example.sistema_rpg.repository;

import com.example.sistema_rpg.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, String> {
}
