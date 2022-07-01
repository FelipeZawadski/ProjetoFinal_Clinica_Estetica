package com.example.projetofinal_clinica_estetica.repository;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    @Query(nativeQuery = true, value = "select agendamento.data_consulta, paciente.nome, agendamento.medico_id from agendamento, medico, paciente where agendamento.data_consulta =(:data_consulta) and agendamento.paciente_id = paciente.id")
    List<AgendamentoProjection> findFirstData(LocalDate data_consulta);
}
