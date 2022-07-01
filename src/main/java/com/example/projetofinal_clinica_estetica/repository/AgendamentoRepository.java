package com.example.projetofinal_clinica_estetica.repository;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    public List<Agendamento> findyByAgendamento(LocalDate data);
}
