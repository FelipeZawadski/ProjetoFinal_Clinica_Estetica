package com.example.projetofinal_clinica_estetica.repository;

import com.example.projetofinal_clinica_estetica.model.Estoque;
import com.example.projetofinal_clinica_estetica.model.MateriaisMedicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository  extends JpaRepository<Estoque, Long> {
    Estoque findFirstByMateriaisMedicos(MateriaisMedicos materiaisMedicos);
}
