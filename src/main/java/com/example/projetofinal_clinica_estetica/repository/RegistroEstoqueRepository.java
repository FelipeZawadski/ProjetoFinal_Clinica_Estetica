package com.example.projetofinal_clinica_estetica.repository;

import com.example.projetofinal_clinica_estetica.model.RegistroEstoque;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RegistroEstoqueRepository extends JpaRepository<RegistroEstoque, UUID> {

}
