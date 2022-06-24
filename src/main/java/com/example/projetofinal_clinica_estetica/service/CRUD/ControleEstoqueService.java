package com.example.projetofinal_clinica_estetica.service.CRUD;

import com.example.projetofinal_clinica_estetica.model.ControleEstoque;
import com.example.projetofinal_clinica_estetica.repository.ControleEstoqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ControleEstoqueService extends CrudService<ControleEstoque, UUID> {

    private final ControleEstoqueRepository controleEstoqueRepository;

    @Override
    public JpaRepository<ControleEstoque, UUID> getRepository() {
        return controleEstoqueRepository;
    }
}
