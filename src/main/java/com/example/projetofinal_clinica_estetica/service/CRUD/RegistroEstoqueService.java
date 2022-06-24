package com.example.projetofinal_clinica_estetica.service.CRUD;


import com.example.projetofinal_clinica_estetica.model.RegistroEstoque;
import com.example.projetofinal_clinica_estetica.repository.RegistroEstoqueRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service @Slf4j
public record RegistroEstoqueService (RegistroEstoqueRepository registroEstoqueRepository){

    public RegistroEstoque save(RegistroEstoque registroEstoque){
        log.info("Salvando movimentação do estoque do item {}", registroEstoque.getMateriaisMedicos().getNomeProduto(),registroEstoque.getMateriaisMedicos().getQtd());
        return registroEstoqueRepository.save(registroEstoque);
    }
}
