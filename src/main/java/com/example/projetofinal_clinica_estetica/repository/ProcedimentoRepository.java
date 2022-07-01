package com.example.projetofinal_clinica_estetica.repository;

import com.example.projetofinal_clinica_estetica.model.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {

    @Query(nativeQuery = true, value = "select procedimento_tipo from procedimento where data between (:dataini) and (:datafim)")
    List<ProcedimentoProjection> listaProcedimento(LocalDate dataini, LocalDate datafim);
}
