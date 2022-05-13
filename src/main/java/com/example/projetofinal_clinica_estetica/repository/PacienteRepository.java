package com.example.projetofinal_clinica_estetica.repository;

import com.example.projetofinal_clinica_estetica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, UUID> {
}
