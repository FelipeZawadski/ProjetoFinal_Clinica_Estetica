package com.example.projetofinal_clinica_estetica.repository;

import com.example.projetofinal_clinica_estetica.model.ControleEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ControleEstoqueRepository extends JpaRepository<ControleEstoque, UUID> {
}
