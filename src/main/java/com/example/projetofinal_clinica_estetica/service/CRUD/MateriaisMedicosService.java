package com.example.projetofinal_clinica_estetica.service.CRUD;

import com.example.projetofinal_clinica_estetica.model.Estoque;
import com.example.projetofinal_clinica_estetica.model.MateriaisMedicos;
import com.example.projetofinal_clinica_estetica.repository.EstoqueRepository;
import com.example.projetofinal_clinica_estetica.repository.MateriaisMedicosRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MateriaisMedicosService extends CrudService<MateriaisMedicos, Long>{

    private final MateriaisMedicosRepository materiaisMedicosRepository;
    private final EstoqueRepository estoqueRepository;


    @Override
    public MateriaisMedicosRepository getRepository() {
        return materiaisMedicosRepository;
    }


    public MateriaisMedicos salvar(MateriaisMedicos materiaisMedicos){
        log.info("Salvar material medico {}", materiaisMedicos.getNomeProduto());
        var salvarMaterial = materiaisMedicosRepository.saveAndFlush(materiaisMedicos);
        estoqueRepository.save(Estoque.builder().materiaisMedicos(salvarMaterial).quantidade(0.0).build());

        return salvarMaterial;
    }
}
