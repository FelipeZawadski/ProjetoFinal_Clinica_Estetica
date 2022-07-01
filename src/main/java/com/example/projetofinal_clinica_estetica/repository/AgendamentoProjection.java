package com.example.projetofinal_clinica_estetica.repository;

import java.time.LocalDate;

public interface AgendamentoProjection {

    LocalDate getDataConsulta();
    String getNomeMedico();
    String getNomePaciente();
}
