package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import com.example.projetofinal_clinica_estetica.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

@Service
public record AgendamentoService (AgendamentoRepository repository){

    public void salvar(Agendamento agendamento){
        repository.save(agendamento);
    }
}
