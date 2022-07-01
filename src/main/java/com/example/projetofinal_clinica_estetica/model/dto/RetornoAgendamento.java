package com.example.projetofinal_clinica_estetica.model.dto;

import com.example.projetofinal_clinica_estetica.repository.AgendamentoProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
//@RequiredArgsConstructor
public class RetornoAgendamento {

    private String nomePaciente;
    private String nomeMedico;
    private LocalDate data_consulta;

    public RetornoAgendamento (String nomePaciente, String nomeMedico, LocalDate data_consulta){
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.data_consulta = data_consulta;
    }

    public RetornoAgendamento(AgendamentoProjection agendamentoProjection){
        nomePaciente = agendamentoProjection.getNomePaciente();
        nomeMedico = agendamentoProjection.getNomeMedico();
        data_consulta = agendamentoProjection.getDataConsulta();
    }
}
