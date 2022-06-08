package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.Procedimento;
import com.example.projetofinal_clinica_estetica.repository.ProcedimentoRepository;
import org.springframework.stereotype.Service;

@Service
public record ProcedimentoService (ProcedimentoRepository repository){

    public void salvar(Procedimento procedimento){
        repository.save(procedimento);
    }
}
