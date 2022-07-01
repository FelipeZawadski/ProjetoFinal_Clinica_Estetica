package com.example.projetofinal_clinica_estetica.model.dto;


import com.example.projetofinal_clinica_estetica.repository.ProcedimentoProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
public class RetornoProcedimento {

    private LocalDate data;
    private String procedimento_tipo;

    public RetornoProcedimento(LocalDate data, String procedimento_tipo){
        this.data = data;
        this.procedimento_tipo = procedimento_tipo;
    }

    public RetornoProcedimento(ProcedimentoProjection procedimentoProjection){
        data = procedimentoProjection.getData();
        procedimento_tipo = procedimentoProjection.getNome();
    }
}
