package com.example.projetofinal_clinica_estetica.service.CRUD;

import com.example.projetofinal_clinica_estetica.model.Estoque;
import com.example.projetofinal_clinica_estetica.model.MateriaisMedicos;
import com.example.projetofinal_clinica_estetica.repository.EstoqueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public record EstoqueService (EstoqueRepository estoqueRepository){

    public Estoque findFirstByMateriaisMedicos(MateriaisMedicos materiaisMedicos){
        log.info("Materiais encontrados {}", materiaisMedicos.getNomeProduto());
        return estoqueRepository.findFirstByMateriaisMedicos(materiaisMedicos);
    }

    public Estoque save(Estoque estoque){
        log.info("Movimentação salva do material {}", estoque.getMateriaisMedicos().getNomeProduto());
        return estoqueRepository.save(estoque);
    }
}
