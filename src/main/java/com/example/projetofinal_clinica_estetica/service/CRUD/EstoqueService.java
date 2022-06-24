package com.example.projetofinal_clinica_estetica.service.CRUD;

import com.example.projetofinal_clinica_estetica.model.Estoque;
import com.example.projetofinal_clinica_estetica.model.MateriaisMedicos;
import com.example.projetofinal_clinica_estetica.repository.EstoqueRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service @Slf4j @RequiredArgsConstructor
public class EstoqueService extends CrudService<Estoque, Long>{

    private final EstoqueRepository estoqueRepository;

    public Estoque findFirstByMateriaisMedicos(MateriaisMedicos materiaisMedicos){
        log.info("Materiais encontrados {}", materiaisMedicos.getNomeProduto());
        return estoqueRepository.findFirstByMateriaisMedicos(materiaisMedicos);
    }

    @Override
    public JpaRepository<Estoque, Long> getRepository() {
        return estoqueRepository;
    }

}
