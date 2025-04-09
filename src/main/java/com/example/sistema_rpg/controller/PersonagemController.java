package com.example.sistema_rpg.controller;

import com.example.sistema_rpg.model.Personagem;
import com.example.sistema_rpg.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {

    @Autowired
    private PersonagemRepository personagemRepository;

    @PostMapping
    public Personagem createPersonagem(@RequestBody Personagem personagem) {
        return personagemRepository.save(personagem);
    }

    @GetMapping
    public List<Personagem> getAllPersonagens() {
        return personagemRepository.findAll();
    }

    @PutMapping("/{id}")
    public Personagem updatePersonagem(@PathVariable Long id, @RequestBody Personagem personagemDetails) {
        Personagem personagem = personagemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Personagem não encontrado"));

        personagem.setNome(personagemDetails.getNome());
        personagem.setLevel(personagemDetails.getLevel());

    }
}
